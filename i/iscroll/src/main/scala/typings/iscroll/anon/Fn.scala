package typings.iscroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fn extends js.Object {
  var style: String
  def fn(k: js.Any): js.Any
}

object Fn {
  @scala.inline
  def apply(fn: js.Any => js.Any, style: String): Fn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fn]
  }
}

