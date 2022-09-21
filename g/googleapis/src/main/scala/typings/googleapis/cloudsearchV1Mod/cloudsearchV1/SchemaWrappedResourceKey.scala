package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWrappedResourceKey extends StObject {
  
  /**
    * Resource key of the Drive item. This field should be unset if, depending on the context, the item does not have a resource key, or if none was specified. This must never be logged.
    */
  var resourceKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaWrappedResourceKey {
  
  inline def apply(): SchemaWrappedResourceKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWrappedResourceKey]
  }
  
  extension [Self <: SchemaWrappedResourceKey](x: Self) {
    
    inline def setResourceKey(value: String): Self = StObject.set(x, "resourceKey", value.asInstanceOf[js.Any])
    
    inline def setResourceKeyNull: Self = StObject.set(x, "resourceKey", null)
    
    inline def setResourceKeyUndefined: Self = StObject.set(x, "resourceKey", js.undefined)
  }
}
