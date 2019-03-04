package typings
package jqueryDotCycle2Lib.JQueryCycle2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  def before(opts: Options, curr: stdLib.Element, next: stdLib.Element, fwd: scala.Boolean): scala.Unit
}

object Transition {
  @scala.inline
  def apply(before: js.Function4[Options, stdLib.Element, stdLib.Element, scala.Boolean, scala.Unit]): Transition = {
    val __obj = js.Dynamic.literal(before = before)
  
    __obj.asInstanceOf[Transition]
  }
}

