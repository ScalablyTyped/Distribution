package typings.harmon.harmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Select extends js.Object {
  var query: String
  def func(node: js.Any): js.Any
}

object Select {
  @scala.inline
  def apply(func: js.Any => js.Any, query: String): Select = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction1(func), query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Select]
  }
}

