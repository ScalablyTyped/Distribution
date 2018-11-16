package typings
package istanbulDashReportsLib.istanbulDashReportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkMapper extends js.Object {
  def assetPath(node: istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node, name: java.lang.String): java.lang.String = js.native
  def getPath(node: istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node): java.lang.String = js.native
  def getPath(node: java.lang.String): java.lang.String = js.native
  def relativePath(
    source: istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node,
    target: istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node
  ): java.lang.String = js.native
  def relativePath(source: istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node, target: java.lang.String): java.lang.String = js.native
  def relativePath(source: java.lang.String, target: istanbulDashLibDashReportLib.istanbulDashLibDashReportMod.Node): java.lang.String = js.native
  def relativePath(source: java.lang.String, target: java.lang.String): java.lang.String = js.native
}

