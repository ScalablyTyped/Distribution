package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizedItemId extends StObject {
  
  /** Serialized ID of the Drive resource */
  var id: js.UndefOr[String] = js.undefined
  
  /** Resource key of the Drive item. This field should be unset if, depending on the context, the item does not have a resource key, or if none was specified. This must never be logged. */
  var resourceKey: js.UndefOr[String] = js.undefined
}
object AuthorizedItemId {
  
  inline def apply(): AuthorizedItemId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizedItemId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizedItemId] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setResourceKey(value: String): Self = StObject.set(x, "resourceKey", value.asInstanceOf[js.Any])
    
    inline def setResourceKeyUndefined: Self = StObject.set(x, "resourceKey", js.undefined)
  }
}
