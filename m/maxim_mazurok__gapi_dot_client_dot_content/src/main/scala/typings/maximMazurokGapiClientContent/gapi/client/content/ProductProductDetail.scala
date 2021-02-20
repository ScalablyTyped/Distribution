package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductProductDetail extends StObject {
  
  /** The name of the product detail. */
  var attributeName: js.UndefOr[String] = js.native
  
  /** The value of the product detail. */
  var attributeValue: js.UndefOr[String] = js.native
  
  /** The section header used to group a set of product details. */
  var sectionName: js.UndefOr[String] = js.native
}
object ProductProductDetail {
  
  @scala.inline
  def apply(): ProductProductDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductProductDetail]
  }
  
  @scala.inline
  implicit class ProductProductDetailMutableBuilder[Self <: ProductProductDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    @scala.inline
    def setAttributeValue(value: String): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValueUndefined: Self = StObject.set(x, "attributeValue", js.undefined)
    
    @scala.inline
    def setSectionName(value: String): Self = StObject.set(x, "sectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionNameUndefined: Self = StObject.set(x, "sectionName", js.undefined)
  }
}
