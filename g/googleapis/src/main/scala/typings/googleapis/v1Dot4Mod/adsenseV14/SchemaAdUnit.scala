package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleapis.anon.AdPosition
import typings.googleapis.anon.BackupOption
import typings.googleapis.anon.MarkupLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAdUnit extends js.Object {
  
  /**
    * Identity code of this ad unit, not necessarily unique across ad clients.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * Settings specific to content ads (AFC) and highend mobile content ads
    * (AFMC - deprecated).
    */
  var contentAdsSettings: js.UndefOr[BackupOption] = js.native
  
  /**
    * Custom style information specific to this ad unit.
    */
  var customStyle: js.UndefOr[SchemaAdStyle] = js.native
  
  /**
    * Settings specific to feed ads (AFF) - deprecated.
    */
  var feedAdsSettings: js.UndefOr[AdPosition] = js.native
  
  /**
    * Unique identifier of this ad unit. This should be considered an opaque
    * identifier; it is not safe to rely on it being in any particular format.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is, in this case adsense#adUnit.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Settings specific to WAP mobile content ads (AFMC) - deprecated.
    */
  var mobileContentAdsSettings: js.UndefOr[MarkupLanguage] = js.native
  
  /**
    * Name of this ad unit.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * ID of the saved ad style which holds this ad unit&#39;s style
    * information.
    */
  var savedStyleId: js.UndefOr[String] = js.native
  
  /**
    * Status of this ad unit. Possible values are: NEW: Indicates that the ad
    * unit was created within the last seven days and does not yet have any
    * activity associated with it.  ACTIVE: Indicates that there has been
    * activity on this ad unit in the last seven days.  INACTIVE: Indicates
    * that there has been no activity on this ad unit in the last seven days.
    */
  var status: js.UndefOr[String] = js.native
}
object SchemaAdUnit {
  
  @scala.inline
  def apply(): SchemaAdUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdUnit]
  }
  
  @scala.inline
  implicit class SchemaAdUnitOps[Self <: SchemaAdUnit] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setContentAdsSettings(value: BackupOption): Self = this.set("contentAdsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentAdsSettings: Self = this.set("contentAdsSettings", js.undefined)
    
    @scala.inline
    def setCustomStyle(value: SchemaAdStyle): Self = this.set("customStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomStyle: Self = this.set("customStyle", js.undefined)
    
    @scala.inline
    def setFeedAdsSettings(value: AdPosition): Self = this.set("feedAdsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedAdsSettings: Self = this.set("feedAdsSettings", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMobileContentAdsSettings(value: MarkupLanguage): Self = this.set("mobileContentAdsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileContentAdsSettings: Self = this.set("mobileContentAdsSettings", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSavedStyleId(value: String): Self = this.set("savedStyleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavedStyleId: Self = this.set("savedStyleId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
