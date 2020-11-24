package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TechnologyTargeting extends js.Object {
  
  /**
    * Browsers that this ad targets. For each browser either set browserVersionId or dartId along with the version numbers. If both are specified, only browserVersionId will be used. The
    * other fields are populated automatically when the ad is inserted or updated.
    */
  var browsers: js.UndefOr[js.Array[Browser]] = js.native
  
  /** Connection types that this ad targets. For each connection type only id is required. The other fields are populated automatically when the ad is inserted or updated. */
  var connectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.native
  
  /**
    * Mobile carriers that this ad targets. For each mobile carrier only id is required, and the other fields are populated automatically when the ad is inserted or updated. If targeting
    * a mobile carrier, do not set targeting for any zip codes.
    */
  var mobileCarriers: js.UndefOr[js.Array[MobileCarrier]] = js.native
  
  /**
    * Operating system versions that this ad targets. To target all versions, use operatingSystems. For each operating system version, only id is required. The other fields are populated
    * automatically when the ad is inserted or updated. If targeting an operating system version, do not set targeting for the corresponding operating system in operatingSystems.
    */
  var operatingSystemVersions: js.UndefOr[js.Array[OperatingSystemVersion]] = js.native
  
  /**
    * Operating systems that this ad targets. To target specific versions, use operatingSystemVersions. For each operating system only dartId is required. The other fields are populated
    * automatically when the ad is inserted or updated. If targeting an operating system, do not set targeting for operating system versions for the same operating system.
    */
  var operatingSystems: js.UndefOr[js.Array[OperatingSystem]] = js.native
  
  /**
    * Platform types that this ad targets. For example, desktop, mobile, or tablet. For each platform type, only id is required, and the other fields are populated automatically when the
    * ad is inserted or updated.
    */
  var platformTypes: js.UndefOr[js.Array[PlatformType]] = js.native
}
object TechnologyTargeting {
  
  @scala.inline
  def apply(): TechnologyTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TechnologyTargeting]
  }
  
  @scala.inline
  implicit class TechnologyTargetingOps[Self <: TechnologyTargeting] (val x: Self) extends AnyVal {
    
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
    def setBrowsersVarargs(value: Browser*): Self = this.set("browsers", js.Array(value :_*))
    
    @scala.inline
    def setBrowsers(value: js.Array[Browser]): Self = this.set("browsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowsers: Self = this.set("browsers", js.undefined)
    
    @scala.inline
    def setConnectionTypesVarargs(value: ConnectionType*): Self = this.set("connectionTypes", js.Array(value :_*))
    
    @scala.inline
    def setConnectionTypes(value: js.Array[ConnectionType]): Self = this.set("connectionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTypes: Self = this.set("connectionTypes", js.undefined)
    
    @scala.inline
    def setMobileCarriersVarargs(value: MobileCarrier*): Self = this.set("mobileCarriers", js.Array(value :_*))
    
    @scala.inline
    def setMobileCarriers(value: js.Array[MobileCarrier]): Self = this.set("mobileCarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileCarriers: Self = this.set("mobileCarriers", js.undefined)
    
    @scala.inline
    def setOperatingSystemVersionsVarargs(value: OperatingSystemVersion*): Self = this.set("operatingSystemVersions", js.Array(value :_*))
    
    @scala.inline
    def setOperatingSystemVersions(value: js.Array[OperatingSystemVersion]): Self = this.set("operatingSystemVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystemVersions: Self = this.set("operatingSystemVersions", js.undefined)
    
    @scala.inline
    def setOperatingSystemsVarargs(value: OperatingSystem*): Self = this.set("operatingSystems", js.Array(value :_*))
    
    @scala.inline
    def setOperatingSystems(value: js.Array[OperatingSystem]): Self = this.set("operatingSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystems: Self = this.set("operatingSystems", js.undefined)
    
    @scala.inline
    def setPlatformTypesVarargs(value: PlatformType*): Self = this.set("platformTypes", js.Array(value :_*))
    
    @scala.inline
    def setPlatformTypes(value: js.Array[PlatformType]): Self = this.set("platformTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformTypes: Self = this.set("platformTypes", js.undefined)
  }
}
