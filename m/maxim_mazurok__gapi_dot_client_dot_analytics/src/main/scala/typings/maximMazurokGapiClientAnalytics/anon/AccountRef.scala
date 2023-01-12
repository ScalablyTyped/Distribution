package typings.maximMazurokGapiClientAnalytics.anon

import typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.ProfileRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountRef extends StObject {
  
  /** Account for this link. */
  var accountRef: js.UndefOr[typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.AccountRef] = js.undefined
  
  /** View (Profile) for this link. */
  var profileRef: js.UndefOr[ProfileRef] = js.undefined
  
  /** Web property for this link. */
  var webPropertyRef: js.UndefOr[typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.WebPropertyRef] = js.undefined
}
object AccountRef {
  
  inline def apply(): AccountRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountRef] (val x: Self) extends AnyVal {
    
    inline def setAccountRef(value: typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.AccountRef): Self = StObject.set(x, "accountRef", value.asInstanceOf[js.Any])
    
    inline def setAccountRefUndefined: Self = StObject.set(x, "accountRef", js.undefined)
    
    inline def setProfileRef(value: ProfileRef): Self = StObject.set(x, "profileRef", value.asInstanceOf[js.Any])
    
    inline def setProfileRefUndefined: Self = StObject.set(x, "profileRef", js.undefined)
    
    inline def setWebPropertyRef(value: typings.maximMazurokGapiClientAnalytics.gapi.client.analytics.WebPropertyRef): Self = StObject.set(x, "webPropertyRef", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyRefUndefined: Self = StObject.set(x, "webPropertyRef", js.undefined)
  }
}
