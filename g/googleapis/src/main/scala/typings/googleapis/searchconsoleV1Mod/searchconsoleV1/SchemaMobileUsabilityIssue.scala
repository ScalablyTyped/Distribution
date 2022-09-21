package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMobileUsabilityIssue extends StObject {
  
  /**
    * Mobile-usability issue type.
    */
  var issueType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional information regarding the issue.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Not returned; reserved for future use.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
}
object SchemaMobileUsabilityIssue {
  
  inline def apply(): SchemaMobileUsabilityIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileUsabilityIssue]
  }
  
  extension [Self <: SchemaMobileUsabilityIssue](x: Self) {
    
    inline def setIssueType(value: String): Self = StObject.set(x, "issueType", value.asInstanceOf[js.Any])
    
    inline def setIssueTypeNull: Self = StObject.set(x, "issueType", null)
    
    inline def setIssueTypeUndefined: Self = StObject.set(x, "issueType", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
