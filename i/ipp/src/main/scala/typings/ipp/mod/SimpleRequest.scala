package typings.ipp.mod

import typings.ipp.anon.Attributescharset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleRequest extends StObject {
  
  var `operation-attributes-tag`: Attributescharset
}
object SimpleRequest {
  
  inline def apply(`operation-attributes-tag`: Attributescharset): SimpleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleRequest] (val x: Self) extends AnyVal {
    
    inline def `setOperation-attributes-tag`(value: Attributescharset): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
