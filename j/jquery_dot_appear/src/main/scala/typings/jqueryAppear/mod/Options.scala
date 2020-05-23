package typings.jqueryAppear.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  /**
    * X accuracy
    */
  var accX: js.UndefOr[Double] = js.undefined
  /**
    * Y accuracy
    */
  var accY: js.UndefOr[Double] = js.undefined
  /**
    * Data to pass into callback
    */
  var data: js.UndefOr[T] = js.undefined
  /**
    * Callback is called only in first appear
    */
  var one: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    accX: js.UndefOr[Double] = js.undefined,
    accY: js.UndefOr[Double] = js.undefined,
    data: T = null,
    one: js.UndefOr[Boolean] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accX)) __obj.updateDynamic("accX")(accX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(accY)) __obj.updateDynamic("accY")(accY.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(one)) __obj.updateDynamic("one")(one.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

