package typings
package istanbulDashLibDashReportLib.istanbulDashLibDashReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReportNode extends Node {
  var children: js.Array[ReportNode]
  var fileCoverage: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.FileCoverage
  var parent: ReportNode | scala.Null
  var path: java.lang.String
  def addChild(child: ReportNode): scala.Unit
  def asRelative(p: java.lang.String): java.lang.String
}

