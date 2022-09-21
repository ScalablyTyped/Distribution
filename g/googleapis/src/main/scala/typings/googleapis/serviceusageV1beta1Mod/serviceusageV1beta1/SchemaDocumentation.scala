package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDocumentation extends StObject {
  
  /**
    * The URL to the root of documentation.
    */
  var documentationRootUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Declares a single overview page. For example: documentation: summary: ... overview: (== include overview.md ==) This is a shortcut for the following declaration (using pages style): documentation: summary: ... pages: - name: Overview content: (== include overview.md ==) Note: you cannot specify both `overview` field and `pages` field.
    */
  var overview: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The top level pages for the documentation set.
    */
  var pages: js.UndefOr[js.Array[SchemaPage]] = js.undefined
  
  /**
    * A list of documentation rules that apply to individual API elements. **NOTE:** All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[SchemaDocumentationRule]] = js.undefined
  
  /**
    * Specifies the service root url if the default one (the service name from the yaml file) is not suitable. This can be seen in any fully specified service urls as well as sections that show a base that other urls are relative to.
    */
  var serviceRootUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A short description of what the service does. The summary must be plain text. It becomes the overview of the service displayed in Google Cloud Console. NOTE: This field is equivalent to the standard field `description`.
    */
  var summary: js.UndefOr[String | Null] = js.undefined
}
object SchemaDocumentation {
  
  inline def apply(): SchemaDocumentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentation]
  }
  
  extension [Self <: SchemaDocumentation](x: Self) {
    
    inline def setDocumentationRootUrl(value: String): Self = StObject.set(x, "documentationRootUrl", value.asInstanceOf[js.Any])
    
    inline def setDocumentationRootUrlNull: Self = StObject.set(x, "documentationRootUrl", null)
    
    inline def setDocumentationRootUrlUndefined: Self = StObject.set(x, "documentationRootUrl", js.undefined)
    
    inline def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewNull: Self = StObject.set(x, "overview", null)
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setPages(value: js.Array[SchemaPage]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: SchemaPage*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setRules(value: js.Array[SchemaDocumentationRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaDocumentationRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setServiceRootUrl(value: String): Self = StObject.set(x, "serviceRootUrl", value.asInstanceOf[js.Any])
    
    inline def setServiceRootUrlNull: Self = StObject.set(x, "serviceRootUrl", null)
    
    inline def setServiceRootUrlUndefined: Self = StObject.set(x, "serviceRootUrl", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
