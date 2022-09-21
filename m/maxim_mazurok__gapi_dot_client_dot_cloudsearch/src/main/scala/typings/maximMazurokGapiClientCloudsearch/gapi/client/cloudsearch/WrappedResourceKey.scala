package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrappedResourceKey extends StObject {
  
  /** Resource key of the Drive item. This field should be unset if, depending on the context, the item does not have a resource key, or if none was specified. This must never be logged. */
  var resourceKey: js.UndefOr[String] = js.undefined
}
object WrappedResourceKey {
  
  inline def apply(): WrappedResourceKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrappedResourceKey]
  }
  
  extension [Self <: WrappedResourceKey](x: Self) {
    
    inline def setResourceKey(value: String): Self = StObject.set(x, "resourceKey", value.asInstanceOf[js.Any])
    
    inline def setResourceKeyUndefined: Self = StObject.set(x, "resourceKey", js.undefined)
  }
}
