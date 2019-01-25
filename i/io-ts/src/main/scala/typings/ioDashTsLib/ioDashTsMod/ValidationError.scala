package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  /** where the error originated */
  val context: Context
  /** optional custom error message */
  val message: js.UndefOr[java.lang.String] = js.undefined
  /** the offending (sub)value */
  val value: js.Any
}

