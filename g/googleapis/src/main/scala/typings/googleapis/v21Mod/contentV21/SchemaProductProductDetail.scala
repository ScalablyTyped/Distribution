package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductProductDetail extends StObject {
  
  /**
    * The name of the product detail.
    */
  var attributeName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the product detail.
    */
  var attributeValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The section header used to group a set of product details.
    */
  var sectionName: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductProductDetail {
  
  inline def apply(): SchemaProductProductDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductProductDetail]
  }
  
  extension [Self <: SchemaProductProductDetail](x: Self) {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameNull: Self = StObject.set(x, "attributeName", null)
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    inline def setAttributeValue(value: String): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueNull: Self = StObject.set(x, "attributeValue", null)
    
    inline def setAttributeValueUndefined: Self = StObject.set(x, "attributeValue", js.undefined)
    
    inline def setSectionName(value: String): Self = StObject.set(x, "sectionName", value.asInstanceOf[js.Any])
    
    inline def setSectionNameNull: Self = StObject.set(x, "sectionName", null)
    
    inline def setSectionNameUndefined: Self = StObject.set(x, "sectionName", js.undefined)
  }
}
