package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderMerchantProvidedAnnotation extends StObject {
  
  /**
    * Key for additional merchant provided (as key-value pairs) annotation
    * about the line item.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Value for additional merchant provided (as key-value pairs) annotation
    * about the line item.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaOrderMerchantProvidedAnnotation {
  
  @scala.inline
  def apply(): SchemaOrderMerchantProvidedAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderMerchantProvidedAnnotation]
  }
  
  @scala.inline
  implicit class SchemaOrderMerchantProvidedAnnotationMutableBuilder[Self <: SchemaOrderMerchantProvidedAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
