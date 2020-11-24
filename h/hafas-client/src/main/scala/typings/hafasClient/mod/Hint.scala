package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.`foreign-id`
import typings.hafasClient.hafasClientStrings.`local-fare-zone`
import typings.hafasClient.hafasClientStrings.`stop-dhid`
import typings.hafasClient.hafasClientStrings.`stop-website`
import typings.hafasClient.hafasClientStrings.`transit-authority`
import typings.hafasClient.hafasClientStrings.hint
import typings.hafasClient.hafasClientStrings.status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hint extends js.Object {
  
  var code: js.UndefOr[String] = js.native
  
  var summary: js.UndefOr[String] = js.native
  
  var text: String = js.native
  
  var tripId: js.UndefOr[String] = js.native
  
  var `type`: hint | status | `foreign-id` | `local-fare-zone` | `stop-website` | `stop-dhid` | `transit-authority` = js.native
}
object Hint {
  
  @scala.inline
  def apply(
    text: String,
    `type`: hint | status | `foreign-id` | `local-fare-zone` | `stop-website` | `stop-dhid` | `transit-authority`
  ): Hint = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hint]
  }
  
  @scala.inline
  implicit class HintOps[Self <: Hint] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: hint | status | `foreign-id` | `local-fare-zone` | `stop-website` | `stop-dhid` | `transit-authority`
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setTripId(value: String): Self = this.set("tripId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTripId: Self = this.set("tripId", js.undefined)
  }
}
