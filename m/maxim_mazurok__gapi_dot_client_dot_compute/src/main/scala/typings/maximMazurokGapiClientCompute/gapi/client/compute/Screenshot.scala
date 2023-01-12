package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Screenshot extends StObject {
  
  /** [Output Only] The Base64-encoded screenshot data. */
  var contents: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of the resource. Always compute#screenshot for the screenshots. */
  var kind: js.UndefOr[String] = js.undefined
}
object Screenshot {
  
  inline def apply(): Screenshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Screenshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Screenshot] (val x: Self) extends AnyVal {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
