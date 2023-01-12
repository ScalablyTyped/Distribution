package typings.jestTestResult.mod

import typings.jestTypes.mod.Callsite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@jest/test-result.@jest/test-result.AssertionResult, 'ancestorTitles' | 'fullName' | 'location' | 'status' | 'title' | 'duration'> & {  failureMessages :@jest/test-result.@jest/test-result.AssertionResult['failureMessages'] | null} */
trait FormattedAssertionResult extends StObject {
  
  var ancestorTitles: js.Array[String]
  
  var duration: js.UndefOr[Double | Null] = js.undefined
  
  var failureMessages: js.Array[String] | Null
  
  var fullName: String
  
  var location: js.UndefOr[Callsite | Null] = js.undefined
  
  var status: typings.jestTypes.mod.Status
  
  var title: String
}
object FormattedAssertionResult {
  
  inline def apply(
    ancestorTitles: js.Array[String],
    fullName: String,
    status: typings.jestTypes.mod.Status,
    title: String
  ): FormattedAssertionResult = {
    val __obj = js.Dynamic.literal(ancestorTitles = ancestorTitles.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], failureMessages = null)
    __obj.asInstanceOf[FormattedAssertionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormattedAssertionResult] (val x: Self) extends AnyVal {
    
    inline def setAncestorTitles(value: js.Array[String]): Self = StObject.set(x, "ancestorTitles", value.asInstanceOf[js.Any])
    
    inline def setAncestorTitlesVarargs(value: String*): Self = StObject.set(x, "ancestorTitles", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFailureMessages(value: js.Array[String]): Self = StObject.set(x, "failureMessages", value.asInstanceOf[js.Any])
    
    inline def setFailureMessagesNull: Self = StObject.set(x, "failureMessages", null)
    
    inline def setFailureMessagesVarargs(value: String*): Self = StObject.set(x, "failureMessages", js.Array(value*))
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Callsite): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setStatus(value: typings.jestTypes.mod.Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
