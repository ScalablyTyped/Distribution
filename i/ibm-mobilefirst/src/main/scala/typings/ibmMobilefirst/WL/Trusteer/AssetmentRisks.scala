package typings.ibmMobilefirst.WL.Trusteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetmentRisks extends js.Object {
  var device_key: String
  @JSName("malware.any")
  var malwareDotany: js.UndefOr[AssesmentRisk] = js.undefined
  @JSName("network.wifi")
  var networkDotwifi: js.UndefOr[AssesmentRisk] = js.undefined
  @JSName("os.rooted")
  var osDotrooted: js.UndefOr[AssesmentRisk] = js.undefined
  @JSName("os.rooted.hiders")
  var osDotrootedDothiders: js.UndefOr[AssesmentRisk] = js.undefined
  @JSName("os.rooted.native")
  var osDotrootedDotnative: js.UndefOr[AssesmentRisk] = js.undefined
  @JSName("os.ver_up_to_date")
  var osDotver_up_to_date: js.UndefOr[AssesmentRisk] = js.undefined
  @JSName("plat.android.apprestrict")
  var platDotandroidDotapprestrict: js.UndefOr[AssesmentRisk] = js.undefined
  @JSName("plat.android.dumpsys")
  var platDotandroidDotdumpsys: js.UndefOr[AssesmentRisk] = js.undefined
  @JSName("tas.config_update")
  var tasDotconfig_update: js.UndefOr[AssesmentRisk] = js.undefined
  @JSName("total.risk.generic")
  var totalDotriskDotgeneric: js.UndefOr[AssesmentRisk] = js.undefined
}

object AssetmentRisks {
  @scala.inline
  def apply(
    device_key: String,
    malwareDotany: AssesmentRisk = null,
    networkDotwifi: AssesmentRisk = null,
    osDotrooted: AssesmentRisk = null,
    osDotrootedDothiders: AssesmentRisk = null,
    osDotrootedDotnative: AssesmentRisk = null,
    osDotver_up_to_date: AssesmentRisk = null,
    platDotandroidDotapprestrict: AssesmentRisk = null,
    platDotandroidDotdumpsys: AssesmentRisk = null,
    tasDotconfig_update: AssesmentRisk = null,
    totalDotriskDotgeneric: AssesmentRisk = null
  ): AssetmentRisks = {
    val __obj = js.Dynamic.literal(device_key = device_key.asInstanceOf[js.Any])
    if (malwareDotany != null) __obj.updateDynamic("malware.any")(malwareDotany.asInstanceOf[js.Any])
    if (networkDotwifi != null) __obj.updateDynamic("network.wifi")(networkDotwifi.asInstanceOf[js.Any])
    if (osDotrooted != null) __obj.updateDynamic("os.rooted")(osDotrooted.asInstanceOf[js.Any])
    if (osDotrootedDothiders != null) __obj.updateDynamic("os.rooted.hiders")(osDotrootedDothiders.asInstanceOf[js.Any])
    if (osDotrootedDotnative != null) __obj.updateDynamic("os.rooted.native")(osDotrootedDotnative.asInstanceOf[js.Any])
    if (osDotver_up_to_date != null) __obj.updateDynamic("os.ver_up_to_date")(osDotver_up_to_date.asInstanceOf[js.Any])
    if (platDotandroidDotapprestrict != null) __obj.updateDynamic("plat.android.apprestrict")(platDotandroidDotapprestrict.asInstanceOf[js.Any])
    if (platDotandroidDotdumpsys != null) __obj.updateDynamic("plat.android.dumpsys")(platDotandroidDotdumpsys.asInstanceOf[js.Any])
    if (tasDotconfig_update != null) __obj.updateDynamic("tas.config_update")(tasDotconfig_update.asInstanceOf[js.Any])
    if (totalDotriskDotgeneric != null) __obj.updateDynamic("total.risk.generic")(totalDotriskDotgeneric.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetmentRisks]
  }
}

