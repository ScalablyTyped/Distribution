package typings
package atIonicCoreLib.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildNode extends js.Object {
  var vattrs: js.UndefOr[js.Any] = js.undefined
  var vchildren: js.UndefOr[js.Array[ChildNode]] = js.undefined
  var vkey: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var vname: js.UndefOr[java.lang.String] = js.undefined
  var vtag: js.UndefOr[java.lang.String | scala.Double | js.Function] = js.undefined
  var vtext: js.UndefOr[java.lang.String] = js.undefined
}

object ChildNode {
  @scala.inline
  def apply(
    vattrs: js.Any = null,
    vchildren: js.Array[ChildNode] = null,
    vkey: java.lang.String | scala.Double = null,
    vname: java.lang.String = null,
    vtag: java.lang.String | scala.Double | js.Function = null,
    vtext: java.lang.String = null
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

