package typings
package istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  def enter(path: java.lang.String): scala.Unit
  def exit(path: java.lang.String): istanbulDashLibDashInstrumentLib.Anon_FileCoverage
}

object Visitor {
  @scala.inline
  def apply(
    enter: java.lang.String => scala.Unit,
    exit: java.lang.String => istanbulDashLibDashInstrumentLib.Anon_FileCoverage
  ): Visitor = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit))
  
    __obj.asInstanceOf[Visitor]
  }
}

