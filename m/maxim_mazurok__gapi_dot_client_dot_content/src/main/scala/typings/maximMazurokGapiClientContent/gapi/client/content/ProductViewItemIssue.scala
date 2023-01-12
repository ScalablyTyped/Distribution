package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductViewItemIssue extends StObject {
  
  /** Item issue type. */
  var issueType: js.UndefOr[ProductViewItemIssueItemIssueType] = js.undefined
  
  /** Item issue resolution. */
  var resolution: js.UndefOr[String] = js.undefined
  
  /** Item issue severity. */
  var severity: js.UndefOr[ProductViewItemIssueItemIssueSeverity] = js.undefined
}
object ProductViewItemIssue {
  
  inline def apply(): ProductViewItemIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductViewItemIssue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductViewItemIssue] (val x: Self) extends AnyVal {
    
    inline def setIssueType(value: ProductViewItemIssueItemIssueType): Self = StObject.set(x, "issueType", value.asInstanceOf[js.Any])
    
    inline def setIssueTypeUndefined: Self = StObject.set(x, "issueType", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setSeverity(value: ProductViewItemIssueItemIssueSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
