package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountStatusItemLevelIssue extends StObject {
  
  /** The attribute's name, if the issue is caused by a single attribute. */
  var attributeName: js.UndefOr[String] = js.undefined
  
  /** The error code of the issue. */
  var code: js.UndefOr[String] = js.undefined
  
  /** A short issue description in English. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A detailed issue description in English. */
  var detail: js.UndefOr[String] = js.undefined
  
  /** The URL of a web page to help with resolving this issue. */
  var documentation: js.UndefOr[String] = js.undefined
  
  /** Number of items with this issue. */
  var numItems: js.UndefOr[String] = js.undefined
  
  /** Whether the issue can be resolved by the merchant. */
  var resolution: js.UndefOr[String] = js.undefined
  
  /** How this issue affects serving of the offer. */
  var servability: js.UndefOr[String] = js.undefined
}
object AccountStatusItemLevelIssue {
  
  inline def apply(): AccountStatusItemLevelIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatusItemLevelIssue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountStatusItemLevelIssue] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setNumItems(value: String): Self = StObject.set(x, "numItems", value.asInstanceOf[js.Any])
    
    inline def setNumItemsUndefined: Self = StObject.set(x, "numItems", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setServability(value: String): Self = StObject.set(x, "servability", value.asInstanceOf[js.Any])
    
    inline def setServabilityUndefined: Self = StObject.set(x, "servability", js.undefined)
  }
}
