package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGuestAttributes extends StObject {
  
  /**
    * The path to be queried. This can be the default namespace ('/') or a nested namespace ('/\/') or a specified key ('/\/\')
    */
  var queryPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the requested queried path.
    */
  var queryValue: js.UndefOr[SchemaGuestAttributesValue] = js.undefined
}
object SchemaGuestAttributes {
  
  inline def apply(): SchemaGuestAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestAttributes]
  }
  
  extension [Self <: SchemaGuestAttributes](x: Self) {
    
    inline def setQueryPath(value: String): Self = StObject.set(x, "queryPath", value.asInstanceOf[js.Any])
    
    inline def setQueryPathNull: Self = StObject.set(x, "queryPath", null)
    
    inline def setQueryPathUndefined: Self = StObject.set(x, "queryPath", js.undefined)
    
    inline def setQueryValue(value: SchemaGuestAttributesValue): Self = StObject.set(x, "queryValue", value.asInstanceOf[js.Any])
    
    inline def setQueryValueUndefined: Self = StObject.set(x, "queryValue", js.undefined)
  }
}
