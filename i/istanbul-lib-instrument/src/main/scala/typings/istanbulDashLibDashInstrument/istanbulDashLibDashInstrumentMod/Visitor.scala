package typings.istanbulDashLibDashInstrument.istanbulDashLibDashInstrumentMod

import typings.istanbulDashLibDashInstrument.Anon_FileCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  def enter(path: String): Unit
  def exit(path: String): Anon_FileCoverage
}

object Visitor {
  @scala.inline
  def apply(enter: String => Unit, exit: String => Anon_FileCoverage): Visitor = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit))
  
    __obj.asInstanceOf[Visitor]
  }
}

