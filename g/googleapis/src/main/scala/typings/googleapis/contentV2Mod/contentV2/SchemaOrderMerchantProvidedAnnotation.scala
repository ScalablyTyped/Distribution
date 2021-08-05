package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderMerchantProvidedAnnotation extends StObject {
  
  /**
    * Key for additional merchant provided (as key-value pairs) annotation
    * about the line item.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Value for additional merchant provided (as key-value pairs) annotation
    * about the line item.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaOrderMerchantProvidedAnnotation {
  
  inline def apply(): SchemaOrderMerchantProvidedAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderMerchantProvidedAnnotation]
  }
  
  extension [Self <: SchemaOrderMerchantProvidedAnnotation](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
