package typings.jqueryAjaxfile.Mocha_

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
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRunnable]
  }
}

