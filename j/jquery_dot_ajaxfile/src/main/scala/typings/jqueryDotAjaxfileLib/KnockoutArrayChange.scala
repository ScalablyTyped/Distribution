package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutArrayChange[T] extends js.Object {
  var index: scala.Double
  var moved: js.UndefOr[scala.Double] = js.undefined
  var status: java.lang.String
  var value: T
}

object KnockoutArrayChange {
  @scala.inline
  def apply[T](index: scala.Double, status: java.lang.String, value: T, moved: scala.Int | scala.Double = null): KnockoutArrayChange[T] = {
    val __obj = js.Dynamic.literal(index = index, status = status, value = value.asInstanceOf[js.Any])
    if (moved != null) __obj.updateDynamic("moved")(moved.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutArrayChange[T]]
  }
}

