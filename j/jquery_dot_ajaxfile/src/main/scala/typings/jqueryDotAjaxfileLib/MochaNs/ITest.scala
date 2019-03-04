package typings
package jqueryDotAjaxfileLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Test` class. */
trait ITest extends IRunnable {
  var parent: ISuite
  var pending: scala.Boolean
  def fullTitle(): java.lang.String
}

object ITest {
  @scala.inline
  def apply(
    async: scala.Boolean,
    fn: js.Function,
    fullTitle: js.Function0[java.lang.String],
    parent: ISuite,
    pending: scala.Boolean,
    sync: scala.Boolean,
    timedOut: scala.Boolean,
    title: java.lang.String
  ): ITest = {
    val __obj = js.Dynamic.literal(async = async, fn = fn, fullTitle = fullTitle, parent = parent, pending = pending, sync = sync, timedOut = timedOut, title = title)
  
    __obj.asInstanceOf[ITest]
  }
}

