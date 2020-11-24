package typings.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormattedAssertionResult extends js.Object {
  
  var ancestorTitles: js.Array[String] = js.native
  
  var failureMessages: js.Array[String] | Null = js.native
  
  var fullName: String = js.native
  
  var location: js.UndefOr[Callsite | Null] = js.native
  
  var status: Status = js.native
  
  var title: String = js.native
}
object FormattedAssertionResult {
  
  @scala.inline
  def apply(ancestorTitles: js.Array[String], fullName: String, status: Status, title: String): FormattedAssertionResult = {
    val __obj = js.Dynamic.literal(ancestorTitles = ancestorTitles.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedAssertionResult]
  }
  
  @scala.inline
  implicit class FormattedAssertionResultOps[Self <: FormattedAssertionResult] (val x: Self) extends AnyVal {
    
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
    def setAncestorTitlesVarargs(value: String*): Self = this.set("ancestorTitles", js.Array(value :_*))
    
    @scala.inline
    def setAncestorTitles(value: js.Array[String]): Self = this.set("ancestorTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessagesVarargs(value: String*): Self = this.set("failureMessages", js.Array(value :_*))
    
    @scala.inline
    def setFailureMessages(value: js.Array[String]): Self = this.set("failureMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessagesNull: Self = this.set("failureMessages", null)
    
    @scala.inline
    def setLocation(value: Callsite): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
  }
}
