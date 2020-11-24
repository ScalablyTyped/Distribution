package typings.hubspotPace.HubSpotPaceInterfaces

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaceAjaxOptions extends js.Object {
  
  /**
    * A list of regular expressions or substrings of URLS we should ignore (for both tracking and restarting)
    */
  var ignoreURLs: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  /**
    * Which HTTP methods should we track?
    */
  var trackMethods: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Should we track web socket connections?
    */
  var trackWebSockets: js.UndefOr[Boolean] = js.native
}
object PaceAjaxOptions {
  
  @scala.inline
  def apply(): PaceAjaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaceAjaxOptions]
  }
  
  @scala.inline
  implicit class PaceAjaxOptionsOps[Self <: PaceAjaxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIgnoreURLsVarargs(value: (String | RegExp)*): Self = this.set("ignoreURLs", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreURLs(value: js.Array[String | RegExp]): Self = this.set("ignoreURLs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreURLs: Self = this.set("ignoreURLs", js.undefined)
    
    @scala.inline
    def setTrackMethodsVarargs(value: String*): Self = this.set("trackMethods", js.Array(value :_*))
    
    @scala.inline
    def setTrackMethods(value: js.Array[String]): Self = this.set("trackMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackMethods: Self = this.set("trackMethods", js.undefined)
    
    @scala.inline
    def setTrackWebSockets(value: Boolean): Self = this.set("trackWebSockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackWebSockets: Self = this.set("trackWebSockets", js.undefined)
  }
}
