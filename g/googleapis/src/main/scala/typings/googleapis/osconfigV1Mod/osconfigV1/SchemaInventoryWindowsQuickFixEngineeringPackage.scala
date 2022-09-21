package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventoryWindowsQuickFixEngineeringPackage extends StObject {
  
  /**
    * A short textual description of the QFE update.
    */
  var caption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A textual description of the QFE update.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier associated with a particular QFE update.
    */
  var hotFixId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date that the QFE update was installed. Mapped from installed_on field.
    */
  var installTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaInventoryWindowsQuickFixEngineeringPackage {
  
  inline def apply(): SchemaInventoryWindowsQuickFixEngineeringPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryWindowsQuickFixEngineeringPackage]
  }
  
  extension [Self <: SchemaInventoryWindowsQuickFixEngineeringPackage](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionNull: Self = StObject.set(x, "caption", null)
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHotFixId(value: String): Self = StObject.set(x, "hotFixId", value.asInstanceOf[js.Any])
    
    inline def setHotFixIdNull: Self = StObject.set(x, "hotFixId", null)
    
    inline def setHotFixIdUndefined: Self = StObject.set(x, "hotFixId", js.undefined)
    
    inline def setInstallTime(value: String): Self = StObject.set(x, "installTime", value.asInstanceOf[js.Any])
    
    inline def setInstallTimeNull: Self = StObject.set(x, "installTime", null)
    
    inline def setInstallTimeUndefined: Self = StObject.set(x, "installTime", js.undefined)
  }
}
