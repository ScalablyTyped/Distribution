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
    flat: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap => istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Tree[istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node],
    nested: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap => istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Tree[istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node],
    pkg: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap => istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Tree[istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node]
  ): Anon_CoverageMap = {
    val __obj = js.Dynamic.literal(flat = js.Any.fromFunction1(flat), nested = js.Any.fromFunction1(nested), pkg = js.Any.fromFunction1(pkg))
  
    __obj.asInstanceOf[Anon_CoverageMap]
  }
}

