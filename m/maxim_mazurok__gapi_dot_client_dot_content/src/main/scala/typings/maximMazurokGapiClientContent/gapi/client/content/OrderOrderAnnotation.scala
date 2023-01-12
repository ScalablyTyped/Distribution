package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderOrderAnnotation extends StObject {
  
  /** Key for additional google provided (as key-value pairs) annotation. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Value for additional google provided (as key-value pairs) annotation. */
  var value: js.UndefOr[String] = js.undefined
}
object OrderOrderAnnotation {
  
  inline def apply(): OrderOrderAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderOrderAnnotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderOrderAnnotation] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
