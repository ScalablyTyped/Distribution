package typings.materialUiCore

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNode extends js.Object {
  var node: HTMLInputElement = js.native
  var value: js.UndefOr[(js.Array[String | Double | Boolean]) | String | Double | Boolean] = js.native
}

object AnonNode {
  @scala.inline
  def apply(
    node: HTMLInputElement,
    value: (js.Array[String | Double | Boolean]) | String | Double | Boolean = null
  ): AnonNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNode]
  }
}

