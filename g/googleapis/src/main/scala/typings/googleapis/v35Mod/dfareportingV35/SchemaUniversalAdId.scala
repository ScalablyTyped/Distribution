package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUniversalAdId extends StObject {
  
  /**
    * Registry used for the Ad ID value.
    */
  var registry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID value for this creative. Only alphanumeric characters and the following symbols are valid: "_/\-". Maximum length is 64 characters. Read only when registry is DCM.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaUniversalAdId {
  
  inline def apply(): SchemaUniversalAdId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUniversalAdId]
  }
  
  extension [Self <: SchemaUniversalAdId](x: Self) {
    
    inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryNull: Self = StObject.set(x, "registry", null)
    
    inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
