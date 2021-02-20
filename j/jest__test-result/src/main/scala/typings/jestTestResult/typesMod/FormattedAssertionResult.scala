package typings.jestTestResult.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormattedAssertionResult extends StObject {
  
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
  implicit class FormattedAssertionResultMutableBuilder[Self <: FormattedAssertionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAncestorTitles(value: js.Array[String]): Self = StObject.set(x, "ancestorTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestorTitlesVarargs(value: String*): Self = StObject.set(x, "ancestorTitles", js.Array(value :_*))
    
    @scala.inline
    def setFailureMessages(value: js.Array[String]): Self = StObject.set(x, "failureMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessagesNull: Self = StObject.set(x, "failureMessages", null)
    
    @scala.inline
    def setFailureMessagesVarargs(value: String*): Self = StObject.set(x, "failureMessages", js.Array(value :_*))
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Callsite): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNull: Self = StObject.set(x, "location", null)
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
