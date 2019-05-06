package typings
package atIonicCoreLib.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FVNode extends js.Object {
  var isSlotFallback: js.UndefOr[scala.Boolean] = js.undefined
  var isSlotReference: js.UndefOr[scala.Boolean] = js.undefined
  var ishost: js.UndefOr[scala.Boolean] = js.undefined
  var vattrs: js.UndefOr[js.Any] = js.undefined
  var vchildren: js.UndefOr[js.Array[FVNode]] = js.undefined
  var vkey: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var vname: js.UndefOr[java.lang.String] = js.undefined
  // using v prefixes largely so closure has no issue property renaming
  var vtag: js.UndefOr[java.lang.String | scala.Double | js.Function] = js.undefined
  var vtext: js.UndefOr[java.lang.String] = js.undefined
}

object FVNode {
  @scala.inline
  def apply(
    isSlotFallback: js.UndefOr[scala.Boolean] = js.undefined,
    isSlotReference: js.UndefOr[scala.Boolean] = js.undefined,
    ishost: js.UndefOr[scala.Boolean] = js.undefined,
    vattrs: js.Any = null,
    vchildren: js.Array[FVNode] = null,
    vkey: java.lang.String | scala.Double = null,
    vname: java.lang.String = null,
    vtag: java.lang.String | scala.Double | js.Function = null,
    vtext: java.lang.String = null
  ): FVNode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isSlotFallback)) __obj.updateDynamic("isSlotFallback")(isSlotFallback)
    if (!js.isUndefined(isSlotReference)) __obj.updateDynamic("isSlotReference")(isSlotReference)
    if (!js.isUndefined(ishost)) __obj.updateDynamic("ishost")(ishost)
    if (vattrs != null) __obj.updateDynamic("vattrs")(vattrs)
    if (vchildren != null) __obj.updateDynamic("vchildren")(vchildren)
    if (vkey != null) __obj.updateDynamic("vkey")(vkey.asInstanceOf[js.Any])
    if (vname != null) __obj.updateDynamic("vname")(vname)
    if (vtag != null) __obj.updateDynamic("vtag")(vtag.asInstanceOf[js.Any])
    if (vtext != null) __obj.updateDynamic("vtext")(vtext)
    __obj.asInstanceOf[FVNode]
  }
}

