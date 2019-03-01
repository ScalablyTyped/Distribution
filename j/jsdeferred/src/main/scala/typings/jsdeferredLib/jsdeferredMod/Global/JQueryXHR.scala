package typings
package jsdeferredLib.jsdeferredMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryXHR extends js.Object {
  def next(fun: js.Function): Deferred
}

object JQueryXHR {
  @scala.inline
  def apply(next: js.Function1[js.Function, Deferred]): JQueryXHR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[JQueryXHR]
  }
}

