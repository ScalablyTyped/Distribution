package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsExpand extends js.Object {
  var expand: js.Array[String]
  var property: String
  def onExpand(args: js.Any*): js.Any
}

object Anon_ArgsExpand {
  @scala.inline
  def apply(expand: js.Array[String], onExpand: /* repeated */ js.Any => js.Any, property: String): Anon_ArgsExpand = {
    val __obj = js.Dynamic.literal(expand = expand.asInstanceOf[js.Any], onExpand = js.Any.fromFunction1(onExpand), property = property.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArgsExpand]
  }
}

