package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackingIssue extends StObject {
  
  /** A URL pointing to a related entry in an issue tracking system. Example: `https://github.com/user/project/issues/4` */
  var url: js.UndefOr[String] = js.native
}
object TrackingIssue {
  
  @scala.inline
  def apply(): TrackingIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackingIssue]
  }
  
  @scala.inline
  implicit class TrackingIssueMutableBuilder[Self <: TrackingIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
