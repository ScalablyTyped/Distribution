package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrepaidPlan extends StObject {
  
  /** After this time, the subscription is allowed for a new top-up purchase. Not present if the subscription is already extended by a top-up purchase. */
  var allowExtendAfterTime: js.UndefOr[String] = js.undefined
}
object PrepaidPlan {
  
  inline def apply(): PrepaidPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrepaidPlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrepaidPlan] (val x: Self) extends AnyVal {
    
    inline def setAllowExtendAfterTime(value: String): Self = StObject.set(x, "allowExtendAfterTime", value.asInstanceOf[js.Any])
    
    inline def setAllowExtendAfterTimeUndefined: Self = StObject.set(x, "allowExtendAfterTime", js.undefined)
  }
}
