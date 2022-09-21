package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunMobileFriendlyTestResponse extends StObject {
  
  /**
    * Test verdict, whether the page is mobile friendly or not.
    */
  var mobileFriendliness: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of mobile-usability issues.
    */
  var mobileFriendlyIssues: js.UndefOr[js.Array[SchemaMobileFriendlyIssue]] = js.undefined
  
  /**
    * Information about embedded resources issues.
    */
  var resourceIssues: js.UndefOr[js.Array[SchemaResourceIssue]] = js.undefined
  
  /**
    * Screenshot of the requested URL.
    */
  var screenshot: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * Final state of the test, can be either complete or an error.
    */
  var testStatus: js.UndefOr[SchemaTestStatus] = js.undefined
}
object SchemaRunMobileFriendlyTestResponse {
  
  inline def apply(): SchemaRunMobileFriendlyTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunMobileFriendlyTestResponse]
  }
  
  extension [Self <: SchemaRunMobileFriendlyTestResponse](x: Self) {
    
    inline def setMobileFriendliness(value: String): Self = StObject.set(x, "mobileFriendliness", value.asInstanceOf[js.Any])
    
    inline def setMobileFriendlinessNull: Self = StObject.set(x, "mobileFriendliness", null)
    
    inline def setMobileFriendlinessUndefined: Self = StObject.set(x, "mobileFriendliness", js.undefined)
    
    inline def setMobileFriendlyIssues(value: js.Array[SchemaMobileFriendlyIssue]): Self = StObject.set(x, "mobileFriendlyIssues", value.asInstanceOf[js.Any])
    
    inline def setMobileFriendlyIssuesUndefined: Self = StObject.set(x, "mobileFriendlyIssues", js.undefined)
    
    inline def setMobileFriendlyIssuesVarargs(value: SchemaMobileFriendlyIssue*): Self = StObject.set(x, "mobileFriendlyIssues", js.Array(value*))
    
    inline def setResourceIssues(value: js.Array[SchemaResourceIssue]): Self = StObject.set(x, "resourceIssues", value.asInstanceOf[js.Any])
    
    inline def setResourceIssuesUndefined: Self = StObject.set(x, "resourceIssues", js.undefined)
    
    inline def setResourceIssuesVarargs(value: SchemaResourceIssue*): Self = StObject.set(x, "resourceIssues", js.Array(value*))
    
    inline def setScreenshot(value: SchemaImage): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
    
    inline def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
    
    inline def setTestStatus(value: SchemaTestStatus): Self = StObject.set(x, "testStatus", value.asInstanceOf[js.Any])
    
    inline def setTestStatusUndefined: Self = StObject.set(x, "testStatus", js.undefined)
  }
}
