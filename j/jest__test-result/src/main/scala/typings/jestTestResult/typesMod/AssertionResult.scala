package typings.jestTestResult.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertionResult extends StObject {
  
  var ancestorTitles: js.Array[String] = js.native
  
  var duration: js.UndefOr[Milliseconds | Null] = js.native
  
  var failureMessages: js.Array[String] = js.native
  
  var fullName: String = js.native
  
  var invocations: js.UndefOr[Double] = js.native
  
  var location: js.UndefOr[Callsite | Null] = js.native
  
  var numPassingAsserts: Double = js.native
  
  var status: Status = js.native
  
  var title: String = js.native
}
object AssertionResult {
  
  @scala.inline
  def apply(
    ancestorTitles: js.Array[String],
    failureMessages: js.Array[String],
    fullName: String,
    numPassingAsserts: Double,
    status: Status,
    title: String
  ): AssertionResult = {
    val __obj = js.Dynamic.literal(ancestorTitles = ancestorTitles.asInstanceOf[js.Any], failureMessages = failureMessages.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], numPassingAsserts = numPassingAsserts.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionResult]
  }
  
  @scala.inline
  implicit class AssertionResultMutableBuilder[Self <: AssertionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAncestorTitles(value: js.Array[String]): Self = StObject.set(x, "ancestorTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestorTitlesVarargs(value: String*): Self = StObject.set(x, "ancestorTitles", js.Array(value :_*))
    
    @scala.inline
    def setDuration(value: Milliseconds): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationNull: Self = StObject.set(x, "duration", null)
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFailureMessages(value: js.Array[String]): Self = StObject.set(x, "failureMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessagesVarargs(value: String*): Self = StObject.set(x, "failureMessages", js.Array(value :_*))
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocations(value: Double): Self = StObject.set(x, "invocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationsUndefined: Self = StObject.set(x, "invocations", js.undefined)
    
    @scala.inline
    def setLocation(value: Callsite): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNull: Self = StObject.set(x, "location", null)
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setNumPassingAsserts(value: Double): Self = StObject.set(x, "numPassingAsserts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
