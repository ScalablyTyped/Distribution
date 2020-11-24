package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileFilterLink extends js.Object {
  
  /** Filter for this link. */
  var filterRef: js.UndefOr[FilterRef] = js.native
  
  /** Profile filter link ID. */
  var id: js.UndefOr[String] = js.native
  
  /** Resource type for Analytics filter. */
  var kind: js.UndefOr[String] = js.native
  
  /** View (Profile) for this link. */
  var profileRef: js.UndefOr[ProfileRef] = js.native
  
  /**
    * The rank of this profile filter link relative to the other filters linked to the same profile.
    * For readonly (i.e., list and get) operations, the rank always starts at 1.
    * For write (i.e., create, update, or delete) operations, you may specify a value between 0 and 255 inclusively, [0, 255]. In order to insert a link at the end of the list, either
    * don't specify a rank or set a rank to a number greater than the largest rank in the list. In order to insert a link to the beginning of the list specify a rank that is less than or
    * equal to 1. The new link will move all existing filters with the same or lower rank down the list. After the link is inserted/updated/deleted all profile filter links will be
    * renumbered starting at 1.
    */
  var rank: js.UndefOr[Double] = js.native
  
  /** Link for this profile filter link. */
  var selfLink: js.UndefOr[String] = js.native
}
object ProfileFilterLink {
  
  @scala.inline
  def apply(): ProfileFilterLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileFilterLink]
  }
  
  @scala.inline
  implicit class ProfileFilterLinkOps[Self <: ProfileFilterLink] (val x: Self) extends AnyVal {
    
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
    def setFilterRef(value: FilterRef): Self = this.set("filterRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterRef: Self = this.set("filterRef", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProfileRef(value: ProfileRef): Self = this.set("profileRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileRef: Self = this.set("profileRef", js.undefined)
    
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
}
