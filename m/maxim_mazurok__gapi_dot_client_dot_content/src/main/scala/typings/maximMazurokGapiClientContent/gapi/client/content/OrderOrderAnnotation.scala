package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderOrderAnnotation extends StObject {
  
  /** Key for additional google provided (as key-value pairs) annotation. */
  var key: js.UndefOr[String] = js.native
  
  /** Value for additional google provided (as key-value pairs) annotation. */
  var value: js.UndefOr[String] = js.native
}
object OrderOrderAnnotation {
  
  @scala.inline
  def apply(): OrderOrderAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderOrderAnnotation]
  }
  
  @scala.inline
  implicit class OrderOrderAnnotationMutableBuilder[Self <: OrderOrderAnnotation] (val x: Self) extends AnyVal {
    
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
