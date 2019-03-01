package typings
package istanbulDashLibDashReportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoverageMap extends js.Object {
  def flat(coverageMap: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap): istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Tree[istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node]
  def nested(coverageMap: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap): istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Tree[istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node]
  def pkg(coverageMap: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap): istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Tree[istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node]
}

object Anon_CoverageMap {
  @scala.inline
  def apply(
    flat: js.Function1[
      istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap, 
      istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Tree[istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node]
    ],
    nested: js.Function1[
      istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap, 
      istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Tree[istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node]
    ],
    pkg: js.Function1[
      istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap, 
      istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Tree[istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node]
    ]
  ): Anon_CoverageMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flat")(flat)
    __obj.updateDynamic("nested")(nested)
    __obj.updateDynamic("pkg")(pkg)
    __obj.asInstanceOf[Anon_CoverageMap]
  }
}

