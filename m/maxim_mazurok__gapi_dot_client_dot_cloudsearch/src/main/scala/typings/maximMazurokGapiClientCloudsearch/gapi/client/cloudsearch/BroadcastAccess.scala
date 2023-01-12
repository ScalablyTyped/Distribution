package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastAccess extends StObject {
  
  /** The policy that controls the broadcast's viewer access. */
  var accessPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * A URL that can be used to access the broadcast of the meeting. This field will be empty if broadcast is not enabled. It will be populated by the backend. Clients cannot modify the
    * value.
    */
  var viewUrl: js.UndefOr[String] = js.undefined
}
object BroadcastAccess {
  
  inline def apply(): BroadcastAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BroadcastAccess] (val x: Self) extends AnyVal {
    
    inline def setAccessPolicy(value: String): Self = StObject.set(x, "accessPolicy", value.asInstanceOf[js.Any])
    
    inline def setAccessPolicyUndefined: Self = StObject.set(x, "accessPolicy", js.undefined)
    
    inline def setViewUrl(value: String): Self = StObject.set(x, "viewUrl", value.asInstanceOf[js.Any])
    
    inline def setViewUrlUndefined: Self = StObject.set(x, "viewUrl", js.undefined)
  }
}
