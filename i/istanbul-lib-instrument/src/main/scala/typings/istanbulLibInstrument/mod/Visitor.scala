package typings.istanbulLibInstrument.mod

import typings.istanbulLibInstrument.AnonFileCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  def enter(path: String): Unit
  def exit(path: String): AnonFileCoverage
}

object Visitor {
  @scala.inline
  def apply(enter: String => Unit, exit: String => AnonFileCoverage): Visitor = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit))
    __obj.asInstanceOf[Visitor]
  }
}

