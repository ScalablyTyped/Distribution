package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.WebPropertyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntityAdWordsLink extends StObject {
  
  /**
    * A list of Google Ads client accounts. These cannot be MCC accounts. This field is required when creating a Google Ads link. It cannot be empty.
    */
  var adWordsAccounts: js.UndefOr[js.Array[SchemaAdWordsAccount]] = js.undefined
  
  /**
    * Web property being linked.
    */
  var entity: js.UndefOr[WebPropertyRef | Null] = js.undefined
  
  /**
    * Entity Google Ads link ID
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for entity Google Ads link.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the link. This field is required when creating a Google Ads link.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IDs of linked Views (Profiles) represented as strings.
    */
  var profileIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * URL link for this Google Analytics - Google Ads link.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaEntityAdWordsLink {
  
  inline def apply(): SchemaEntityAdWordsLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityAdWordsLink]
  }
  
  extension [Self <: SchemaEntityAdWordsLink](x: Self) {
    
    inline def setAdWordsAccounts(value: js.Array[SchemaAdWordsAccount]): Self = StObject.set(x, "adWordsAccounts", value.asInstanceOf[js.Any])
    
    inline def setAdWordsAccountsUndefined: Self = StObject.set(x, "adWordsAccounts", js.undefined)
    
    inline def setAdWordsAccountsVarargs(value: SchemaAdWordsAccount*): Self = StObject.set(x, "adWordsAccounts", js.Array(value*))
    
    inline def setEntity(value: WebPropertyRef): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityNull: Self = StObject.set(x, "entity", null)
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfileIds(value: js.Array[String]): Self = StObject.set(x, "profileIds", value.asInstanceOf[js.Any])
    
    inline def setProfileIdsNull: Self = StObject.set(x, "profileIds", null)
    
    inline def setProfileIdsUndefined: Self = StObject.set(x, "profileIds", js.undefined)
    
    inline def setProfileIdsVarargs(value: String*): Self = StObject.set(x, "profileIds", js.Array(value*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
