package typings
package gulpDashUserefLib.gulpDashUserefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var additionalStreams: js.UndefOr[js.Array[nodeLib.NodeJSNs.ReadWriteStream]] = js.undefined
  var base: js.UndefOr[java.lang.String] = js.undefined
  var noAssets: js.UndefOr[scala.Boolean] = js.undefined
  var noconcat: js.UndefOr[scala.Boolean] = js.undefined
  var searchPath: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var transformPath: js.UndefOr[js.Function1[/* filePath */ java.lang.String, scala.Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    additionalStreams: js.Array[nodeLib.NodeJSNs.ReadWriteStream] = null,
    base: java.lang.String = null,
    noAssets: js.UndefOr[scala.Boolean] = js.undefined,
    noconcat: js.UndefOr[scala.Boolean] = js.undefined,
    searchPath: java.lang.String | js.Array[java.lang.String] = null,
    transformPath: /* filePath */ java.lang.String => scala.Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (additionalStreams != null) __obj.updateDynamic("additionalStreams")(additionalStreams)
    if (base != null) __obj.updateDynamic("base")(base)
    if (!js.isUndefined(noAssets)) __obj.updateDynamic("noAssets")(noAssets)
    if (!js.isUndefined(noconcat)) __obj.updateDynamic("noconcat")(noconcat)
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (transformPath != null) __obj.updateDynamic("transformPath")(js.Any.fromFunction1(transformPath))
    __obj.asInstanceOf[Options]
  }
}

