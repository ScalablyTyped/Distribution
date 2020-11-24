package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteCompanionSetting extends js.Object {
  
  /** Whether companions are disabled for this site template. */
  var companionsDisabled: js.UndefOr[Boolean] = js.native
  
  /** Allowlist of companion sizes to be served via this site template. Set this list to null or empty to serve all companion sizes. */
  var enabledSizes: js.UndefOr[js.Array[Size]] = js.native
  
  /** Whether to serve only static images as companions. */
  var imageOnly: js.UndefOr[Boolean] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#siteCompanionSetting". */
  var kind: js.UndefOr[String] = js.native
}
object SiteCompanionSetting {
  
  @scala.inline
  def apply(): SiteCompanionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteCompanionSetting]
  }
  
  @scala.inline
  implicit class SiteCompanionSettingOps[Self <: SiteCompanionSetting] (val x: Self) extends AnyVal {
    
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
    def setCompanionsDisabled(value: Boolean): Self = this.set("companionsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanionsDisabled: Self = this.set("companionsDisabled", js.undefined)
    
    @scala.inline
    def setEnabledSizesVarargs(value: Size*): Self = this.set("enabledSizes", js.Array(value :_*))
    
    @scala.inline
    def setEnabledSizes(value: js.Array[Size]): Self = this.set("enabledSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledSizes: Self = this.set("enabledSizes", js.undefined)
    
    @scala.inline
    def setImageOnly(value: Boolean): Self = this.set("imageOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageOnly: Self = this.set("imageOnly", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
