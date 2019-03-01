package typings
package jqueryDotAppearLib.jqueryDotAppearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  /**
    * X accuracy
    */
  var accX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Y accuracy
    */
  var accY: js.UndefOr[scala.Double] = js.undefined
  /**
    * Data to pass into callback
    */
  var data: js.UndefOr[T] = js.undefined
  /**
    * Callback is called only in first appear
    */
  var one: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    accX: scala.Int | scala.Double = null,
    accY: scala.Int | scala.Double = null,
    data: T = null,
    one: js.UndefOr[scala.Boolean] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (accX != null) __obj.updateDynamic("accX")(accX.asInstanceOf[js.Any])
    if (accY != null) __obj.updateDynamic("accY")(accY.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(one)) __obj.updateDynamic("one")(one)
    __obj.asInstanceOf[Options[T]]
  }
}

