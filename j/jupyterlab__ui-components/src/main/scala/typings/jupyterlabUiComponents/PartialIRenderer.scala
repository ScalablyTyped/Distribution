package typings.jupyterlabUiComponents

import typings.luminoVirtualdom.AnonAttrs
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@lumino/virtualdom.@lumino/virtualdom.VirtualElement.IRenderer> */
trait PartialIRenderer extends js.Object {
  var render: js.UndefOr[js.Function1[/* host */ HTMLElement, Unit]] = js.undefined
  var unrender: js.UndefOr[js.Function2[/* host */ HTMLElement, /* options */ js.UndefOr[AnonAttrs], Unit]] = js.undefined
}

object PartialIRenderer {
  @scala.inline
  def apply(
    render: /* host */ HTMLElement => Unit = null,
    unrender: (/* host */ HTMLElement, /* options */ js.UndefOr[AnonAttrs]) => Unit = null
  ): PartialIRenderer = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (unrender != null) __obj.updateDynamic("unrender")(js.Any.fromFunction2(unrender))
    __obj.asInstanceOf[PartialIRenderer]
  }
}

