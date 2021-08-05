package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderMerchantProvidedAnnotation extends StObject {
  
  /** Key for additional merchant provided (as key-value pairs) annotation about the line item. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Value for additional merchant provided (as key-value pairs) annotation about the line item. */
  var value: js.UndefOr[String] = js.undefined
}
object OrderMerchantProvidedAnnotation {
  
  inline def apply(): OrderMerchantProvidedAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderMerchantProvidedAnnotation]
  }
  
  extension [Self <: OrderMerchantProvidedAnnotation](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
