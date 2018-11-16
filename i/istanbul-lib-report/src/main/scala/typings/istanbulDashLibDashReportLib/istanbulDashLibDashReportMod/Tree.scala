package typings
package istanbulDashLibDashReportLib.istanbulDashLibDashReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Tree[N /* <: Node */] extends js.Object {
  def getRoot(): N
  def visit(visitor: stdLib.Partial[Visitor[N]], state: js.Any): scala.Unit
}

