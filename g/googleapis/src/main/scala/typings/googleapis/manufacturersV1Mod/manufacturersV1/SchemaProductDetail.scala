package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductDetail extends StObject {
  
  /**
    * The name of the attribute.
    */
  var attributeName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the attribute.
    */
  var attributeValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A short section name that can be reused between multiple product details.
    */
  var sectionName: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductDetail {
  
  inline def apply(): SchemaProductDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductDetail]
  }
  
  extension [Self <: SchemaProductDetail](x: Self) {
    
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
