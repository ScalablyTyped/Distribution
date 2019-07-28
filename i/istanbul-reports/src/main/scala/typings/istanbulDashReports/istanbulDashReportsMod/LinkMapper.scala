package typings.istanbulDashReports.istanbulDashReportsMod

import typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkMapper extends js.Object {
  def assetPath(node: Node, name: String): String = js.native
  def getPath(node: String): String = js.native
  def getPath(node: Node): String = js.native
  def relativePath(source: String, target: String): String = js.native
  def relativePath(source: String, target: Node): String = js.native
  def relativePath(source: Node, target: String): String = js.native
  def relativePath(source: Node, target: Node): String = js.native
}

