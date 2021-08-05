package typings.jestTestResult.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedAssertionResult extends StObject {
  
  var ancestorTitles: js.Array[String]
  
  var failureMessages: js.Array[String] | Null
  
  var fullName: String
  
  var location: js.UndefOr[Callsite | Null] = js.undefined
  
  var status: Status
  
  var title: String
}
object FormattedAssertionResult {
  
  inline def apply(ancestorTitles: js.Array[String], fullName: String, status: Status, title: String): FormattedAssertionResult = {
    val __obj = js.Dynamic.literal(ancestorTitles = ancestorTitles.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], failureMessages = null)
    __obj.asInstanceOf[FormattedAssertionResult]
  }
  
  extension [Self <: FormattedAssertionResult](x: Self) {
    
    inline def setAncestorTitles(value: js.Array[String]): Self = StObject.set(x, "ancestorTitles", value.asInstanceOf[js.Any])
    
    inline def setAncestorTitlesVarargs(value: String*): Self = StObject.set(x, "ancestorTitles", js.Array(value :_*))
    
    inline def setFailureMessages(value: js.Array[String]): Self = StObject.set(x, "failureMessages", value.asInstanceOf[js.Any])
    
    inline def setFailureMessagesNull: Self = StObject.set(x, "failureMessages", null)
    
    inline def setFailureMessagesVarargs(value: String*): Self = StObject.set(x, "failureMessages", js.Array(value :_*))
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Callsite): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
