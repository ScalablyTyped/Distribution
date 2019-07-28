package typings.jqueryDotAjaxfile.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Test` class. */
trait ITest extends IRunnable {
  var parent: ISuite
  var pending: Boolean
  def fullTitle(): String
}

object ITest {
  @scala.inline
  def apply(
    async: Boolean,
    fn: js.Function,
    fullTitle: () => String,
    parent: ISuite,
    pending: Boolean,
    sync: Boolean,
    timedOut: Boolean,
    title: String
  ): ITest = {
    val __obj = js.Dynamic.literal(async = async, fn = fn, fullTitle = js.Any.fromFunction0(fullTitle), parent = parent, pending = pending, sync = sync, timedOut = timedOut, title = title)
  
    __obj.asInstanceOf[ITest]
  }
}

