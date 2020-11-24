package typings.ibmMobilefirst.WL.Trusteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetmentRisks extends js.Object {
  
  var device_key: String = js.native
  
  @JSName("malware.any")
  var malwareDotany: js.UndefOr[AssesmentRisk] = js.native
  
  @JSName("network.wifi")
  var networkDotwifi: js.UndefOr[AssesmentRisk] = js.native
  
  @JSName("os.rooted")
  var osDotrooted: js.UndefOr[AssesmentRisk] = js.native
  
  @JSName("os.rooted.hiders")
  var osDotrootedDothiders: js.UndefOr[AssesmentRisk] = js.native
  
  @JSName("os.rooted.native")
  var osDotrootedDotnative: js.UndefOr[AssesmentRisk] = js.native
  
  @JSName("os.ver_up_to_date")
  var osDotver_up_to_date: js.UndefOr[AssesmentRisk] = js.native
  
  @JSName("plat.android.apprestrict")
  var platDotandroidDotapprestrict: js.UndefOr[AssesmentRisk] = js.native
  
  @JSName("plat.android.dumpsys")
  var platDotandroidDotdumpsys: js.UndefOr[AssesmentRisk] = js.native
  
  @JSName("tas.config_update")
  var tasDotconfig_update: js.UndefOr[AssesmentRisk] = js.native
  
  @JSName("total.risk.generic")
  var totalDotriskDotgeneric: js.UndefOr[AssesmentRisk] = js.native
}
object AssetmentRisks {
  
  @scala.inline
  def apply(device_key: String): AssetmentRisks = {
    val __obj = js.Dynamic.literal(device_key = device_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetmentRisks]
  }
  
  @scala.inline
  implicit class AssetmentRisksOps[Self <: AssetmentRisks] (val x: Self) extends AnyVal {
    
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
    def setDevice_key(value: String): Self = this.set("device_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMalwareDotany(value: AssesmentRisk): Self = this.set("malware.any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMalwareDotany: Self = this.set("malware.any", js.undefined)
    
    @scala.inline
    def setNetworkDotwifi(value: AssesmentRisk): Self = this.set("network.wifi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkDotwifi: Self = this.set("network.wifi", js.undefined)
    
    @scala.inline
    def setOsDotrooted(value: AssesmentRisk): Self = this.set("os.rooted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsDotrooted: Self = this.set("os.rooted", js.undefined)
    
    @scala.inline
    def setOsDotrootedDothiders(value: AssesmentRisk): Self = this.set("os.rooted.hiders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsDotrootedDothiders: Self = this.set("os.rooted.hiders", js.undefined)
    
    @scala.inline
    def setOsDotrootedDotnative(value: AssesmentRisk): Self = this.set("os.rooted.native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsDotrootedDotnative: Self = this.set("os.rooted.native", js.undefined)
    
    @scala.inline
    def setOsDotver_up_to_date(value: AssesmentRisk): Self = this.set("os.ver_up_to_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsDotver_up_to_date: Self = this.set("os.ver_up_to_date", js.undefined)
    
    @scala.inline
    def setPlatDotandroidDotapprestrict(value: AssesmentRisk): Self = this.set("plat.android.apprestrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatDotandroidDotapprestrict: Self = this.set("plat.android.apprestrict", js.undefined)
    
    @scala.inline
    def setPlatDotandroidDotdumpsys(value: AssesmentRisk): Self = this.set("plat.android.dumpsys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatDotandroidDotdumpsys: Self = this.set("plat.android.dumpsys", js.undefined)
    
    @scala.inline
    def setTasDotconfig_update(value: AssesmentRisk): Self = this.set("tas.config_update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTasDotconfig_update: Self = this.set("tas.config_update", js.undefined)
    
    @scala.inline
    def setTotalDotriskDotgeneric(value: AssesmentRisk): Self = this.set("total.risk.generic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalDotriskDotgeneric: Self = this.set("total.risk.generic", js.undefined)
  }
}
