package typings.ibmDashMobilefirst.WL.Trusteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetmentRisks extends js.Object {
  var device_key: String
  var `malware.any`: js.UndefOr[AssesmentRisk] = js.undefined
  var `network.wifi`: js.UndefOr[AssesmentRisk] = js.undefined
  var `os.rooted`: js.UndefOr[AssesmentRisk] = js.undefined
  var `os.rooted.hiders`: js.UndefOr[AssesmentRisk] = js.undefined
  var `os.rooted.native`: js.UndefOr[AssesmentRisk] = js.undefined
  var `os.ver_up_to_date`: js.UndefOr[AssesmentRisk] = js.undefined
  var `plat.android.apprestrict`: js.UndefOr[AssesmentRisk] = js.undefined
  var `plat.android.dumpsys`: js.UndefOr[AssesmentRisk] = js.undefined
  var `tas.config_update`: js.UndefOr[AssesmentRisk] = js.undefined
  var `total.risk.generic`: js.UndefOr[AssesmentRisk] = js.undefined
}

object AssetmentRisks {
  @scala.inline
  def apply(
    device_key: String,
    `malware.any`: AssesmentRisk = null,
    `network.wifi`: AssesmentRisk = null,
    `os.rooted`: AssesmentRisk = null,
    `os.rooted.hiders`: AssesmentRisk = null,
    `os.rooted.native`: AssesmentRisk = null,
    `os.ver_up_to_date`: AssesmentRisk = null,
    `plat.android.apprestrict`: AssesmentRisk = null,
    `plat.android.dumpsys`: AssesmentRisk = null,
    `tas.config_update`: AssesmentRisk = null,
    `total.risk.generic`: AssesmentRisk = null
  ): AssetmentRisks = {
    val __obj = js.Dynamic.literal(device_key = device_key.asInstanceOf[js.Any])
    if (`malware.any` != null) __obj.updateDynamic("malware.any")(`malware.any`.asInstanceOf[js.Any])
    if (`network.wifi` != null) __obj.updateDynamic("network.wifi")(`network.wifi`.asInstanceOf[js.Any])
    if (`os.rooted` != null) __obj.updateDynamic("os.rooted")(`os.rooted`.asInstanceOf[js.Any])
    if (`os.rooted.hiders` != null) __obj.updateDynamic("os.rooted.hiders")(`os.rooted.hiders`.asInstanceOf[js.Any])
    if (`os.rooted.native` != null) __obj.updateDynamic("os.rooted.native")(`os.rooted.native`.asInstanceOf[js.Any])
    if (`os.ver_up_to_date` != null) __obj.updateDynamic("os.ver_up_to_date")(`os.ver_up_to_date`.asInstanceOf[js.Any])
    if (`plat.android.apprestrict` != null) __obj.updateDynamic("plat.android.apprestrict")(`plat.android.apprestrict`.asInstanceOf[js.Any])
    if (`plat.android.dumpsys` != null) __obj.updateDynamic("plat.android.dumpsys")(`plat.android.dumpsys`.asInstanceOf[js.Any])
    if (`tas.config_update` != null) __obj.updateDynamic("tas.config_update")(`tas.config_update`.asInstanceOf[js.Any])
    if (`total.risk.generic` != null) __obj.updateDynamic("total.risk.generic")(`total.risk.generic`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetmentRisks]
  }
}

