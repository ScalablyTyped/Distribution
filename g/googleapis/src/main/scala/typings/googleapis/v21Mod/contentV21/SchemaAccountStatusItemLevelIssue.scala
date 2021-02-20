package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccountStatusItemLevelIssue extends StObject {
  
  /**
    * The attribute&#39;s name, if the issue is caused by a single attribute.
    */
  var attributeName: js.UndefOr[String] = js.native
  
  /**
    * The error code of the issue.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * A short issue description in English.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A detailed issue description in English.
    */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * The URL of a web page to help with resolving this issue.
    */
  var documentation: js.UndefOr[String] = js.native
  
  /**
    * Number of items with this issue.
    */
  var numItems: js.UndefOr[String] = js.native
  
  /**
    * Whether the issue can be resolved by the merchant.
    */
  var resolution: js.UndefOr[String] = js.native
  
  /**
    * How this issue affects serving of the offer.
    */
  var servability: js.UndefOr[String] = js.native
}
object SchemaAccountStatusItemLevelIssue {
  
  @scala.inline
  def apply(): SchemaAccountStatusItemLevelIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatusItemLevelIssue]
  }
  
  @scala.inline
  implicit class SchemaAccountStatusItemLevelIssueMutableBuilder[Self <: SchemaAccountStatusItemLevelIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setNumItems(value: String): Self = StObject.set(x, "numItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumItemsUndefined: Self = StObject.set(x, "numItems", js.undefined)
    
    @scala.inline
    def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setServability(value: String): Self = StObject.set(x, "servability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServabilityUndefined: Self = StObject.set(x, "servability", js.undefined)
  }
}
