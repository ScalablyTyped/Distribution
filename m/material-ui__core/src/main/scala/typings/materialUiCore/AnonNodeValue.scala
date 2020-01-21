package typings.materialUiCore

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNodeValue extends js.Object {
  var node: HTMLInputElement = js.native
  var value: String | Double | Boolean | (js.Array[String | Double | Boolean]) = js.native
}

object AnonNodeValue {
  @scala.inline
  def apply(node: HTMLInputElement, value: String | Double | Boolean | (js.Array[String | Double | Boolean])): AnonNodeValue = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNodeValue]
  }
}

