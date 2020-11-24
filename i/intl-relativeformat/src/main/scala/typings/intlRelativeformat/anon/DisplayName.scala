package typings.intlRelativeformat.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayName extends js.Object {
  
  var displayName: String = js.native
  
  var relative: Record[String, String] = js.native
  
  var relativePeriod: js.UndefOr[String] = js.native
  
  var relativeTime: Future = js.native
}
object DisplayName {
  
  @scala.inline
  def apply(displayName: String, relative: Record[String, String], relativeTime: Future): DisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
  
  @scala.inline
  implicit class DisplayNameOps[Self <: DisplayName] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelative(value: Record[String, String]): Self = this.set("relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeTime(value: Future): Self = this.set("relativeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativePeriod(value: String): Self = this.set("relativePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativePeriod: Self = this.set("relativePeriod", js.undefined)
  }
}
