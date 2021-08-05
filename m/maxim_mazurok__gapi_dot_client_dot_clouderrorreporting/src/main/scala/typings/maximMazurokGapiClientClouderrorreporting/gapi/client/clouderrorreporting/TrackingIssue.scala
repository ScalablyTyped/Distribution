package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackingIssue extends StObject {
  
  /** A URL pointing to a related entry in an issue tracking system. Example: `https://github.com/user/project/issues/4` */
  var url: js.UndefOr[String] = js.undefined
}
object TrackingIssue {
  
  inline def apply(): TrackingIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackingIssue]
  }
  
  extension [Self <: TrackingIssue](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
