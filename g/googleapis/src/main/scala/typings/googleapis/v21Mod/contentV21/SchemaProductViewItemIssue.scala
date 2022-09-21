package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductViewItemIssue extends StObject {
  
  /**
    * Item issue type.
    */
  var issueType: js.UndefOr[SchemaProductViewItemIssueItemIssueType] = js.undefined
  
  /**
    * Item issue resolution.
    */
  var resolution: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Item issue severity.
    */
  var severity: js.UndefOr[SchemaProductViewItemIssueItemIssueSeverity] = js.undefined
}
object SchemaProductViewItemIssue {
  
  inline def apply(): SchemaProductViewItemIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductViewItemIssue]
  }
  
  extension [Self <: SchemaProductViewItemIssue](x: Self) {
    
    inline def setIssueType(value: SchemaProductViewItemIssueItemIssueType): Self = StObject.set(x, "issueType", value.asInstanceOf[js.Any])
    
    inline def setIssueTypeUndefined: Self = StObject.set(x, "issueType", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionNull: Self = StObject.set(x, "resolution", null)
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setSeverity(value: SchemaProductViewItemIssueItemIssueSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
