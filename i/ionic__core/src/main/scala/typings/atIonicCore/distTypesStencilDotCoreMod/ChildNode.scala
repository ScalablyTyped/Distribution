package typings.atIonicCore.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildNode extends js.Object {
  var vattrs: js.UndefOr[js.Any] = js.undefined
  var vchildren: js.UndefOr[js.Array[VNode]] = js.undefined
  var vkey: js.UndefOr[String | Double] = js.undefined
  var vname: js.UndefOr[String] = js.undefined
  var vtag: js.UndefOr[String | Double | js.Function] = js.undefined
  var vtext: js.UndefOr[String] = js.undefined
}

object ChildNode {
  @scala.inline
  def apply(
    vattrs: js.Any = null,
    vchildren: js.Array[VNode] = null,
    vkey: String | Double = null,
    vname: String = null,
    vtag: String | Double | js.Function = null,
    vtext: String = null
  ): ChildNode = {
    val __obj = js.Dynamic.literal()
    if (vattrs != null) __obj.updateDynamic("vattrs")(vattrs)
    if (vchildren != null) __obj.updateDynamic("vchildren")(vchildren)
    if (vkey != null) __obj.updateDynamic("vkey")(vkey.asInstanceOf[js.Any])
    if (vname != null) __obj.updateDynamic("vname")(vname)
    if (vtag != null) __obj.updateDynamic("vtag")(vtag.asInstanceOf[js.Any])
    if (vtext != null) __obj.updateDynamic("vtext")(vtext)
    __obj.asInstanceOf[ChildNode]
  }
}

