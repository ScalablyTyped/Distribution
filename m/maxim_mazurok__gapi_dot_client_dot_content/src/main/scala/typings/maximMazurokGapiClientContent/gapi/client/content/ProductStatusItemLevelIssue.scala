package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductStatusItemLevelIssue extends StObject {
  
  /** List of country codes (ISO 3166-1 alpha-2) where issue applies to the offer. */
  var applicableCountries: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The attribute's name, if the issue is caused by a single attribute. */
  var attributeName: js.UndefOr[String] = js.undefined
  
  /** The error code of the issue. */
  var code: js.UndefOr[String] = js.undefined
  
  /** A short issue description in English. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The destination the issue applies to. */
  var destination: js.UndefOr[String] = js.undefined
  
  /** A detailed issue description in English. */
  var detail: js.UndefOr[String] = js.undefined
  
  /** The URL of a web page to help with resolving this issue. */
  var documentation: js.UndefOr[String] = js.undefined
  
  /** Whether the issue can be resolved by the merchant. */
  var resolution: js.UndefOr[String] = js.undefined
  
  /** How this issue affects serving of the offer. */
  var servability: js.UndefOr[String] = js.undefined
}
object ProductStatusItemLevelIssue {
  
  @scala.inline
  def apply(): ProductStatusItemLevelIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductStatusItemLevelIssue]
  }
  
  @scala.inline
  implicit class ProductStatusItemLevelIssueMutableBuilder[Self <: ProductStatusItemLevelIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicableCountries(value: js.Array[String]): Self = StObject.set(x, "applicableCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicableCountriesUndefined: Self = StObject.set(x, "applicableCountries", js.undefined)
    
    @scala.inline
    def setApplicableCountriesVarargs(value: String*): Self = StObject.set(x, "applicableCountries", js.Array(value :_*))
    
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
    def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setServability(value: String): Self = StObject.set(x, "servability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServabilityUndefined: Self = StObject.set(x, "servability", js.undefined)
  }
}
