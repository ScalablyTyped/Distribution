package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserExternalId extends StObject {
  
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the Id.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the id.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserExternalId {
  
  inline def apply(): SchemaUserExternalId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserExternalId]
  }
  
  extension [Self <: SchemaUserExternalId](x: Self) {
    
    inline def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    inline def setCustomTypeNull: Self = StObject.set(x, "customType", null)
    
    inline def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
