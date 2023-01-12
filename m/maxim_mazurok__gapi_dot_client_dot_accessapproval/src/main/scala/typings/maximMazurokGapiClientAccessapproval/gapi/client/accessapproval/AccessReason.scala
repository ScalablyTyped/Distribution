package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReason extends StObject {
  
  /** More detail about certain reason types. See comments for each type above. */
  var detail: js.UndefOr[String] = js.undefined
  
  /** Type of access justification. */
  var `type`: js.UndefOr[String] = js.undefined
}
object AccessReason {
  
  inline def apply(): AccessReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessReason] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
