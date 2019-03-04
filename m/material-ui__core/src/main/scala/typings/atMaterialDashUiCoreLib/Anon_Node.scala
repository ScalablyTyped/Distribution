package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends js.Object {
  var node: reactLib.HTMLInputElement
  var value: js.UndefOr[
    (js.Array[java.lang.String | scala.Double | scala.Boolean]) | java.lang.String | scala.Double | scala.Boolean
  ]
}

object Anon_Node {
  @scala.inline
  def apply(
    node: reactLib.HTMLInputElement,
    value: (js.Array[java.lang.String | scala.Double | scala.Boolean]) | java.lang.String | scala.Double | scala.Boolean = null
  ): Anon_Node = {
    val __obj = js.Dynamic.literal(node = node)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Node]
  }
}

