package typings.jqueryDotAjaxfile.Mocha

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
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], fullTitle = js.Any.fromFunction0(fullTitle), parent = parent.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITest]
  }
}

