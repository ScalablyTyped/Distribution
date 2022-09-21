package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRichResultsIssue extends StObject {
  
  /**
    * Rich Results issue type.
    */
  var issueMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Severity of this issue: WARNING, or ERROR. Items with an issue of status ERROR cannot appear with rich result features in Google Search results.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
}
object SchemaRichResultsIssue {
  
  inline def apply(): SchemaRichResultsIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRichResultsIssue]
  }
  
  extension [Self <: SchemaRichResultsIssue](x: Self) {
    
    inline def setIssueMessage(value: String): Self = StObject.set(x, "issueMessage", value.asInstanceOf[js.Any])
    
    inline def setIssueMessageNull: Self = StObject.set(x, "issueMessage", null)
    
    inline def setIssueMessageUndefined: Self = StObject.set(x, "issueMessage", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
