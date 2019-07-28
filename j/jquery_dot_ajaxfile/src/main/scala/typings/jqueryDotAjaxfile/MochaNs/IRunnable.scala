package typings.jqueryDotAjaxfile.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Runnable` class. */
trait IRunnable extends js.Object {
  var async: Boolean
  var fn: js.Function
  var sync: Boolean
  var timedOut: Boolean
  var title: String
}

object IRunnable {
  @scala.inline
  def apply(async: Boolean, fn: js.Function, sync: Boolean, timedOut: Boolean, title: String): IRunnable = {
    val __obj = js.Dynamic.literal(async = async, fn = fn, sync = sync, timedOut = timedOut, title = title)
  
    __obj.asInstanceOf[IRunnable]
  }
}

