package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccountStatusAccountLevelIssue extends StObject {
  
  /**
    * Country for which this issue is reported.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The destination the issue applies to.
    */
  var destination: js.UndefOr[String] = js.native
  
  /**
    * Additional details about the issue.
    */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * The URL of a web page to help resolving this issue.
    */
  var documentation: js.UndefOr[String] = js.native
  
  /**
    * Issue identifier.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Severity of the issue.
    */
  var severity: js.UndefOr[String] = js.native
  
  /**
    * Short description of the issue.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaAccountStatusAccountLevelIssue {
  
  @scala.inline
  def apply(): SchemaAccountStatusAccountLevelIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatusAccountLevelIssue]
  }
  
  @scala.inline
  implicit class SchemaAccountStatusAccountLevelIssueMutableBuilder[Self <: SchemaAccountStatusAccountLevelIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
