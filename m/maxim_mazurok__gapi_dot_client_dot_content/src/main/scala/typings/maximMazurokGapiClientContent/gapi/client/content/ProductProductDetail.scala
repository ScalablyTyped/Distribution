package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductProductDetail extends StObject {
  
  /** The name of the product detail. */
  var attributeName: js.UndefOr[String] = js.undefined
  
  /** The value of the product detail. */
  var attributeValue: js.UndefOr[String] = js.undefined
  
  /** The section header used to group a set of product details. */
  var sectionName: js.UndefOr[String] = js.undefined
}
object ProductProductDetail {
  
  inline def apply(): ProductProductDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductProductDetail]
  }
  
  extension [Self <: ProductProductDetail](x: Self) {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    inline def setAttributeValue(value: String): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueUndefined: Self = StObject.set(x, "attributeValue", js.undefined)
    
    inline def setSectionName(value: String): Self = StObject.set(x, "sectionName", value.asInstanceOf[js.Any])
    
    inline def setSectionNameUndefined: Self = StObject.set(x, "sectionName", js.undefined)
  }
}
