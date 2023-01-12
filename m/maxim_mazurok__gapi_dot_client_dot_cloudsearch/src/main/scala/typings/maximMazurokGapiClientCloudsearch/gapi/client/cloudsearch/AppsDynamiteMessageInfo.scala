package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteMessageInfo extends StObject {
  
  /** The content of a matching message. */
  var message: js.UndefOr[AppsDynamiteMessage] = js.undefined
  
  /** Searcher's membership state in the space where the message is posted. */
  var searcherMembershipState: js.UndefOr[String] = js.undefined
}
object AppsDynamiteMessageInfo {
  
  inline def apply(): AppsDynamiteMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteMessageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteMessageInfo] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: AppsDynamiteMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSearcherMembershipState(value: String): Self = StObject.set(x, "searcherMembershipState", value.asInstanceOf[js.Any])
    
    inline def setSearcherMembershipStateUndefined: Self = StObject.set(x, "searcherMembershipState", js.undefined)
  }
}
