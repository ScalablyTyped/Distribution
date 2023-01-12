package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainWideTakeoutInitiated extends StObject {
  
  /** The email of the admin who initiated the takeout. */
  var email: js.UndefOr[String] = js.undefined
  
  /** The takeout request ID. */
  var takeoutRequestId: js.UndefOr[String] = js.undefined
}
object DomainWideTakeoutInitiated {
  
  inline def apply(): DomainWideTakeoutInitiated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainWideTakeoutInitiated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainWideTakeoutInitiated] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setTakeoutRequestId(value: String): Self = StObject.set(x, "takeoutRequestId", value.asInstanceOf[js.Any])
    
    inline def setTakeoutRequestIdUndefined: Self = StObject.set(x, "takeoutRequestId", js.undefined)
  }
}
