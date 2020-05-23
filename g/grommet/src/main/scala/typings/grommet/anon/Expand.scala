package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expand extends js.Object {
  var expand: js.Array[String]
  var property: String
  def onExpand(args: js.Any*): js.Any
}

object Expand {
  @scala.inline
  def apply(expand: js.Array[String], onExpand: /* repeated */ js.Any => js.Any, property: String): Expand = {
    val __obj = js.Dynamic.literal(expand = expand.asInstanceOf[js.Any], onExpand = js.Any.fromFunction1(onExpand), property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand]
  }
}

