package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityAdWordsLink extends StObject {
  
  /** A list of Google Ads client accounts. These cannot be MCC accounts. This field is required when creating a Google Ads link. It cannot be empty. */
  var adWordsAccounts: js.UndefOr[js.Array[AdWordsAccount]] = js.undefined
  
  /** Web property being linked. */
  var entity: js.UndefOr[typings.maximMazurokGapiClientAnalytics.anon.WebPropertyRef] = js.undefined
  
  /** Entity Google Ads link ID */
  var id: js.UndefOr[String] = js.undefined
  
  /** Resource type for entity Google Ads link. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of the link. This field is required when creating a Google Ads link. */
  var name: js.UndefOr[String] = js.undefined
  
  /** IDs of linked Views (Profiles) represented as strings. */
  var profileIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** URL link for this Google Analytics - Google Ads link. */
  var selfLink: js.UndefOr[String] = js.undefined
}
object EntityAdWordsLink {
  
  inline def apply(): EntityAdWordsLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityAdWordsLink]
  }
  
  extension [Self <: EntityAdWordsLink](x: Self) {
    
    inline def setAdWordsAccounts(value: js.Array[AdWordsAccount]): Self = StObject.set(x, "adWordsAccounts", value.asInstanceOf[js.Any])
    
    inline def setAdWordsAccountsUndefined: Self = StObject.set(x, "adWordsAccounts", js.undefined)
    
    inline def setAdWordsAccountsVarargs(value: AdWordsAccount*): Self = StObject.set(x, "adWordsAccounts", js.Array(value*))
    
    inline def setEntity(value: typings.maximMazurokGapiClientAnalytics.anon.WebPropertyRef): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfileIds(value: js.Array[String]): Self = StObject.set(x, "profileIds", value.asInstanceOf[js.Any])
    
    inline def setProfileIdsUndefined: Self = StObject.set(x, "profileIds", js.undefined)
    
    inline def setProfileIdsVarargs(value: String*): Self = StObject.set(x, "profileIds", js.Array(value*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
