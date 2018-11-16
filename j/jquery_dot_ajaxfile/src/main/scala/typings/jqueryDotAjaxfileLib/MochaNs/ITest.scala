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

