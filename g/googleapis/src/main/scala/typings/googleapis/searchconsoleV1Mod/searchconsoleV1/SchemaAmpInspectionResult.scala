package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAmpInspectionResult extends StObject {
  
  /**
    * Index status of the AMP URL.
    */
  var ampIndexStatusVerdict: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of the AMP that was inspected. If the submitted URL is a desktop page that refers to an AMP version, the AMP version will be inspected.
    */
  var ampUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether or not the page blocks indexing through a noindex rule.
    */
  var indexingState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of zero or more AMP issues found for the inspected URL.
    */
  var issues: js.UndefOr[js.Array[SchemaAmpIssue]] = js.undefined
  
  /**
    * Last time this AMP version was crawled by Google. Absent if the URL was never crawled successfully.
    */
  var lastCrawlTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether or not Google could fetch the AMP.
    */
  var pageFetchState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether or not the page is blocked to Google by a robots.txt rule.
    */
  var robotsTxtState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of the most severe error on the page. If a page has both warnings and errors, the page status is error. Error status means the page cannot be shown in Search results.
    */
  var verdict: js.UndefOr[String | Null] = js.undefined
}
object SchemaAmpInspectionResult {
  
  inline def apply(): SchemaAmpInspectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAmpInspectionResult]
  }
  
  extension [Self <: SchemaAmpInspectionResult](x: Self) {
    
    inline def setAmpIndexStatusVerdict(value: String): Self = StObject.set(x, "ampIndexStatusVerdict", value.asInstanceOf[js.Any])
    
    inline def setAmpIndexStatusVerdictNull: Self = StObject.set(x, "ampIndexStatusVerdict", null)
    
    inline def setAmpIndexStatusVerdictUndefined: Self = StObject.set(x, "ampIndexStatusVerdict", js.undefined)
    
    inline def setAmpUrl(value: String): Self = StObject.set(x, "ampUrl", value.asInstanceOf[js.Any])
    
    inline def setAmpUrlNull: Self = StObject.set(x, "ampUrl", null)
    
    inline def setAmpUrlUndefined: Self = StObject.set(x, "ampUrl", js.undefined)
    
    inline def setIndexingState(value: String): Self = StObject.set(x, "indexingState", value.asInstanceOf[js.Any])
    
    inline def setIndexingStateNull: Self = StObject.set(x, "indexingState", null)
    
    inline def setIndexingStateUndefined: Self = StObject.set(x, "indexingState", js.undefined)
    
    inline def setIssues(value: js.Array[SchemaAmpIssue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: SchemaAmpIssue*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setLastCrawlTime(value: String): Self = StObject.set(x, "lastCrawlTime", value.asInstanceOf[js.Any])
    
    inline def setLastCrawlTimeNull: Self = StObject.set(x, "lastCrawlTime", null)
    
    inline def setLastCrawlTimeUndefined: Self = StObject.set(x, "lastCrawlTime", js.undefined)
    
    inline def setPageFetchState(value: String): Self = StObject.set(x, "pageFetchState", value.asInstanceOf[js.Any])
    
    inline def setPageFetchStateNull: Self = StObject.set(x, "pageFetchState", null)
    
    inline def setPageFetchStateUndefined: Self = StObject.set(x, "pageFetchState", js.undefined)
    
    inline def setRobotsTxtState(value: String): Self = StObject.set(x, "robotsTxtState", value.asInstanceOf[js.Any])
    
    inline def setRobotsTxtStateNull: Self = StObject.set(x, "robotsTxtState", null)
    
    inline def setRobotsTxtStateUndefined: Self = StObject.set(x, "robotsTxtState", js.undefined)
    
    inline def setVerdict(value: String): Self = StObject.set(x, "verdict", value.asInstanceOf[js.Any])
    
    inline def setVerdictNull: Self = StObject.set(x, "verdict", null)
    
    inline def setVerdictUndefined: Self = StObject.set(x, "verdict", js.undefined)
  }
}
