package typings.istanbulLibInstrument.mod

import typings.istanbulLibInstrument.anon.FileCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor extends js.Object {
  def enter(path: String): Unit = js.native
  def exit(path: String): FileCoverage = js.native
}

object Visitor {
  @scala.inline
  def apply(enter: String => Unit, exit: String => FileCoverage): Visitor = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit))
    __obj.asInstanceOf[Visitor]
  }
  @scala.inline
  implicit class VisitorOps[Self <: Visitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnter(value: String => Unit): Self = this.set("enter", js.Any.fromFunction1(value))
    @scala.inline
    def setExit(value: String => FileCoverage): Self = this.set("exit", js.Any.fromFunction1(value))
  }
  
}

