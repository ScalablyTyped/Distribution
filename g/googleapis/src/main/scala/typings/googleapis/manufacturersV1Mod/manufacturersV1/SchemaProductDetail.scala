package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A product detail of the product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#productdetail.
  */
trait SchemaProductDetail extends StObject {
  
  /**
    * The name of the attribute.
    */
  var attributeName: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the attribute.
    */
  var attributeValue: js.UndefOr[String] = js.undefined
  
  /**
    * A short section name that can be reused between multiple product details.
    */
  var sectionName: js.UndefOr[String] = js.undefined
}
object SchemaProductDetail {
  
  @scala.inline
  def apply(): SchemaProductDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductDetail]
  }
  
  @scala.inline
  implicit class SchemaProductDetailMutableBuilder[Self <: SchemaProductDetail] (val x: Self) extends AnyVal {
    
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
