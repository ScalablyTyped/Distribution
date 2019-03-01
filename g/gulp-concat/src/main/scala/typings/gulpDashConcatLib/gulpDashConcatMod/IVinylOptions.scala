package typings
package gulpDashConcatLib.gulpDashConcatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVinylOptions extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var contents: js.UndefOr[nodeLib.NodeJSNs.ReadableStream | nodeLib.Buffer] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var stat: js.UndefOr[IFsStats] = js.undefined
}

object IVinylOptions {
  @scala.inline
  def apply(
    base: java.lang.String = null,
    contents: nodeLib.NodeJSNs.ReadableStream | nodeLib.Buffer = null,
    cwd: java.lang.String = null,
    path: java.lang.String = null,
    stat: IFsStats = null
  ): IVinylOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (path != null) __obj.updateDynamic("path")(path)
    if (stat != null) __obj.updateDynamic("stat")(stat)
    __obj.asInstanceOf[IVinylOptions]
  }
}

