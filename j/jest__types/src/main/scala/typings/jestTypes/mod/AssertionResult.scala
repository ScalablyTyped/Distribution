package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertionResult extends StObject {
  
  var ancestorTitles: js.Array[String]
  
  var duration: js.UndefOr[Double | Null] = js.undefined
  
  var failureDetails: js.Array[Any]
  
  var failureMessages: js.Array[String]
  
  var fullName: String
  
  var invocations: js.UndefOr[Double] = js.undefined
  
  var location: js.UndefOr[Callsite | Null] = js.undefined
  
  var numPassingAsserts: Double
  
  var retryReasons: js.UndefOr[js.Array[String]] = js.undefined
  
  var status: Status
  
  var title: String
}
object AssertionResult {
  
  inline def apply(
    ancestorTitles: js.Array[String],
    failureDetails: js.Array[Any],
    failureMessages: js.Array[String],
    fullName: String,
    numPassingAsserts: Double,
    status: Status,
    title: String
  ): AssertionResult = {
    val __obj = js.Dynamic.literal(ancestorTitles = ancestorTitles.asInstanceOf[js.Any], failureDetails = failureDetails.asInstanceOf[js.Any], failureMessages = failureMessages.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], numPassingAsserts = numPassingAsserts.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssertionResult] (val x: Self) extends AnyVal {
    
    inline def setAncestorTitles(value: js.Array[String]): Self = StObject.set(x, "ancestorTitles", value.asInstanceOf[js.Any])
    
    inline def setAncestorTitlesVarargs(value: String*): Self = StObject.set(x, "ancestorTitles", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFailureDetails(value: js.Array[Any]): Self = StObject.set(x, "failureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsVarargs(value: Any*): Self = StObject.set(x, "failureDetails", js.Array(value*))
    
    inline def setFailureMessages(value: js.Array[String]): Self = StObject.set(x, "failureMessages", value.asInstanceOf[js.Any])
    
    inline def setFailureMessagesVarargs(value: String*): Self = StObject.set(x, "failureMessages", js.Array(value*))
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setInvocations(value: Double): Self = StObject.set(x, "invocations", value.asInstanceOf[js.Any])
    
    inline def setInvocationsUndefined: Self = StObject.set(x, "invocations", js.undefined)
    
    inline def setLocation(value: Callsite): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNumPassingAsserts(value: Double): Self = StObject.set(x, "numPassingAsserts", value.asInstanceOf[js.Any])
    
    inline def setRetryReasons(value: js.Array[String]): Self = StObject.set(x, "retryReasons", value.asInstanceOf[js.Any])
    
    inline def setRetryReasonsUndefined: Self = StObject.set(x, "retryReasons", js.undefined)
    
    inline def setRetryReasonsVarargs(value: String*): Self = StObject.set(x, "retryReasons", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
