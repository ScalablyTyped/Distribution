package typings.iscroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fn extends js.Object {
  var style: String
  def fn(k: js.Any): js.Any
}

object Anon_Fn {
  @scala.inline
  def apply(fn: js.Any => js.Any, style: String): Anon_Fn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), style = style)
  
    __obj.asInstanceOf[Anon_Fn]
  }
}

