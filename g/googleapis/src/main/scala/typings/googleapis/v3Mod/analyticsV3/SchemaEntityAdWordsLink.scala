package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.WebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Analytics Entity Google Ads Link.
  */
@js.native
trait SchemaEntityAdWordsLink extends js.Object {
  
  /**
    * A list of Google Ads client accounts. These cannot be MCC accounts. This
    * field is required when creating a Google Ads link. It cannot be empty.
    */
  var adWordsAccounts: js.UndefOr[js.Array[SchemaAdWordsAccount]] = js.native
  
  /**
    * Web property being linked.
    */
  var entity: js.UndefOr[WebPropertyRef] = js.native
  
  /**
    * Entity Google Ads link ID
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Resource type for entity Google Ads link.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the link. This field is required when creating a Google Ads link.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * IDs of linked Views (Profiles) represented as strings.
    */
  var profileIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * URL link for this Google Analytics - Google Ads link.
    */
  var selfLink: js.UndefOr[String] = js.native
}
object SchemaEntityAdWordsLink {
  
  @scala.inline
  def apply(): SchemaEntityAdWordsLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityAdWordsLink]
  }
  
  @scala.inline
  implicit class SchemaEntityAdWordsLinkOps[Self <: SchemaEntityAdWordsLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdWordsAccountsVarargs(value: SchemaAdWordsAccount*): Self = this.set("adWordsAccounts", js.Array(value :_*))
    
    @scala.inline
    def setAdWordsAccounts(value: js.Array[SchemaAdWordsAccount]): Self = this.set("adWordsAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdWordsAccounts: Self = this.set("adWordsAccounts", js.undefined)
    
    @scala.inline
    def setEntity(value: WebPropertyRef): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProfileIdsVarargs(value: String*): Self = this.set("profileIds", js.Array(value :_*))
    
    @scala.inline
    def setProfileIds(value: js.Array[String]): Self = this.set("profileIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileIds: Self = this.set("profileIds", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
}
