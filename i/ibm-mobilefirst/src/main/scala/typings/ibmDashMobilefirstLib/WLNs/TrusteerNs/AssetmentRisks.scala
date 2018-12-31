package typings
package ibmDashMobilefirstLib.WLNs.TrusteerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetmentRisks extends js.Object {
  var device_key: java.lang.String
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

