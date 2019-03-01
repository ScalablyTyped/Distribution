package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerUIParam extends js.Object {
  var value: scala.Double
}

object SpinnerUIParam {
  @scala.inline
  def apply(value: scala.Double): SpinnerUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SpinnerUIParam]
  }
}

