package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpiryDetail extends StObject {
  
  /** The time at which the `MembershipRole` will expire. */
  var expireTime: js.UndefOr[String] = js.undefined
}
object ExpiryDetail {
  
  inline def apply(): ExpiryDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpiryDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpiryDetail] (val x: Self) extends AnyVal {
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
  }
}
