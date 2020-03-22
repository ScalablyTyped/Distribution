package typings.jupyterlabUiComponents.labiconMod.LabIcon

import typings.luminoVirtualdom.mod.ElementAttrs
import typings.luminoVirtualdom.mod.VirtualNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRendererOptions extends js.Object {
  var attrs: js.UndefOr[ElementAttrs] = js.undefined
  var children: js.UndefOr[js.Array[VirtualNode]] = js.undefined
  var props: js.UndefOr[IProps] = js.undefined
}

object IRendererOptions {
  @scala.inline
  def apply(attrs: ElementAttrs = null, children: js.Array[VirtualNode] = null, props: IProps = null): IRendererOptions = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRendererOptions]
  }
}

