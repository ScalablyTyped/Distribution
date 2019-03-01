package typings
package jqueryDotAjaxfileLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Runnable` class. */
trait IRunnable extends js.Object {
  var async: scala.Boolean
  var fn: js.Function
  var sync: scala.Boolean
  var timedOut: scala.Boolean
  var title: java.lang.String
}

object IRunnable {
  @scala.inline
  def apply(
    async: scala.Boolean,
    fn: js.Function,
    sync: scala.Boolean,
    timedOut: scala.Boolean,
    title: java.lang.String
  ): IRunnable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("fn")(fn)
    __obj.updateDynamic("sync")(sync)
    __obj.updateDynamic("timedOut")(timedOut)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IRunnable]
  }
}

