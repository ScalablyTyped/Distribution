package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expand extends js.Object {
  var expand: js.Array[String]
  var property: String
  def onExpand(expandedKeys: js.Array[String]): Unit
}

object Expand {
  @scala.inline
  def apply(expand: js.Array[String], onExpand: js.Array[String] => Unit, property: String): Expand = {
    val __obj = js.Dynamic.literal(expand = expand.asInstanceOf[js.Any], onExpand = js.Any.fromFunction1(onExpand), property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand]
  }
}

