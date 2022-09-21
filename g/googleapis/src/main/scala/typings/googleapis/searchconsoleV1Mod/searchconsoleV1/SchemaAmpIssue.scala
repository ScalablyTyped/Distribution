package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAmpIssue extends StObject {
  
  /**
    * Brief description of this issue.
    */
  var issueMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Severity of this issue: WARNING or ERROR.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
}
object SchemaAmpIssue {
  
  inline def apply(): SchemaAmpIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAmpIssue]
  }
  
  extension [Self <: SchemaAmpIssue](x: Self) {
    
    inline def setIssueMessage(value: String): Self = StObject.set(x, "issueMessage", value.asInstanceOf[js.Any])
    
    inline def setIssueMessageNull: Self = StObject.set(x, "issueMessage", null)
    
    inline def setIssueMessageUndefined: Self = StObject.set(x, "issueMessage", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
