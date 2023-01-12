package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentTransform extends StObject {
  
  /** Dataflow service generated name for this source. */
  var name: js.UndefOr[String] = js.undefined
  
  /** User name for the original user transform with which this transform is most closely associated. */
  var originalTransform: js.UndefOr[String] = js.undefined
  
  /** Human-readable name for this transform; may be user or system generated. */
  var userName: js.UndefOr[String] = js.undefined
}
object ComponentTransform {
  
  inline def apply(): ComponentTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentTransform] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalTransform(value: String): Self = StObject.set(x, "originalTransform", value.asInstanceOf[js.Any])
    
    inline def setOriginalTransformUndefined: Self = StObject.set(x, "originalTransform", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
