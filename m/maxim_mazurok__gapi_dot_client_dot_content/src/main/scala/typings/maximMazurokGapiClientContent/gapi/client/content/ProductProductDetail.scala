package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductProductDetail extends js.Object {
  
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
  implicit class ProductProductDetailOps[Self <: ProductProductDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    
    @scala.inline
    def setAttributeValue(value: String): Self = this.set("attributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeValue: Self = this.set("attributeValue", js.undefined)
    
    @scala.inline
    def setSectionName(value: String): Self = this.set("sectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionName: Self = this.set("sectionName", js.undefined)
  }
}
