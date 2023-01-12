package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoCallMetadata extends StObject {
  
  var meetingUrl: js.UndefOr[String] = js.undefined
}
object VideoCallMetadata {
  
  inline def apply(): VideoCallMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoCallMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoCallMetadata] (val x: Self) extends AnyVal {
    
    inline def setMeetingUrl(value: String): Self = StObject.set(x, "meetingUrl", value.asInstanceOf[js.Any])
    
    inline def setMeetingUrlUndefined: Self = StObject.set(x, "meetingUrl", js.undefined)
  }
}
