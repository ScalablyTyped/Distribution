package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountId extends StObject {
  
  /** Account ID to which this view (profile) belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Internal ID for the web property to which this view (profile) belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  
  /** View (Profile) ID. */
  var profileId: js.UndefOr[String] = js.undefined
  
  /** View (Profile) name. */
  var profileName: js.UndefOr[String] = js.undefined
  
  /** Table ID for view (profile). */
  var tableId: js.UndefOr[String] = js.undefined
  
  /** Web Property ID to which this view (profile) belongs. */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object AccountId {
  
  @scala.inline
  def apply(): AccountId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountId]
  }
  
  @scala.inline
  implicit class AccountIdMutableBuilder[Self <: AccountId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setProfileName(value: String): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
