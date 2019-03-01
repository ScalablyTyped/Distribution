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
    enter: js.Function1[java.lang.String, scala.Unit],
    exit: js.Function1[java.lang.String, istanbulDashLibDashInstrumentLib.Anon_FileCoverage]
  ): Visitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enter")(enter)
    __obj.updateDynamic("exit")(exit)
    __obj.asInstanceOf[Visitor]
  }
}

