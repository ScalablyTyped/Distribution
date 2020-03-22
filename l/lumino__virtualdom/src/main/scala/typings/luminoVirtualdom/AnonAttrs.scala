package typings.luminoVirtualdom

import typings.luminoVirtualdom.mod.ElementAttrs
import typings.luminoVirtualdom.mod.VirtualNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttrs extends js.Object {
  var attrs: js.UndefOr[ElementAttrs] = js.undefined
  var children: js.UndefOr[js.Array[VirtualNode]] = js.undefined
}

object AnonAttrs {
  @scala.inline
  def apply(attrs: ElementAttrs = null, children: js.Array[VirtualNode] = null): AnonAttrs = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttrs]
  }
}

