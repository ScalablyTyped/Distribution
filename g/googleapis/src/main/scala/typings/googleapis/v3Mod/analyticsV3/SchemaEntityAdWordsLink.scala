package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.WebPropertyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Analytics Entity Google Ads Link.
  */
trait SchemaEntityAdWordsLink extends StObject {
  
  /**
    * A list of Google Ads client accounts. These cannot be MCC accounts. This
    * field is required when creating a Google Ads link. It cannot be empty.
    */
  var adWordsAccounts: js.UndefOr[js.Array[SchemaAdWordsAccount]] = js.undefined
  
  /**
    * Web property being linked.
    */
  var entity: js.UndefOr[WebPropertyRef] = js.undefined
  
  /**
    * Entity Google Ads link ID
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type for entity Google Ads link.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the link. This field is required when creating a Google Ads link.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * IDs of linked Views (Profiles) represented as strings.
    */
  var profileIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * URL link for this Google Analytics - Google Ads link.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaEntityAdWordsLink {
  
  @scala.inline
  def apply(): SchemaEntityAdWordsLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityAdWordsLink]
  }
  
  @scala.inline
  implicit class SchemaEntityAdWordsLinkMutableBuilder[Self <: SchemaEntityAdWordsLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdWordsAccounts(value: js.Array[SchemaAdWordsAccount]): Self = StObject.set(x, "adWordsAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdWordsAccountsUndefined: Self = StObject.set(x, "adWordsAccounts", js.undefined)
    
    @scala.inline
    def setAdWordsAccountsVarargs(value: SchemaAdWordsAccount*): Self = StObject.set(x, "adWordsAccounts", js.Array(value :_*))
    
    @scala.inline
    def setEntity(value: WebPropertyRef): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProfileIds(value: js.Array[String]): Self = StObject.set(x, "profileIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdsUndefined: Self = StObject.set(x, "profileIds", js.undefined)
    
    @scala.inline
    def setProfileIdsVarargs(value: String*): Self = StObject.set(x, "profileIds", js.Array(value :_*))
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
