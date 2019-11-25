package typings.gulpDashConcat.gulpDashConcatMod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVinylOptions extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var contents: js.UndefOr[ReadableStream | Buffer] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var stat: js.UndefOr[IFsStats] = js.undefined
}

object IVinylOptions {
  @scala.inline
  def apply(
    base: String = null,
    contents: ReadableStream | Buffer = null,
    cwd: String = null,
    path: String = null,
    stat: IFsStats = null
  ): IVinylOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (stat != null) __obj.updateDynamic("stat")(stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVinylOptions]
  }
}

