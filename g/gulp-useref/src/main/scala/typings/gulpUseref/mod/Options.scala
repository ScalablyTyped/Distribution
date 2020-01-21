package typings.gulpUseref.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var additionalStreams: js.UndefOr[js.Array[ReadWriteStream]] = js.undefined
  var base: js.UndefOr[String] = js.undefined
  var noAssets: js.UndefOr[Boolean] = js.undefined
  var noconcat: js.UndefOr[Boolean] = js.undefined
  var searchPath: js.UndefOr[String | js.Array[String]] = js.undefined
  var transformPath: js.UndefOr[js.Function1[/* filePath */ String, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    additionalStreams: js.Array[ReadWriteStream] = null,
    base: String = null,
    noAssets: js.UndefOr[Boolean] = js.undefined,
    noconcat: js.UndefOr[Boolean] = js.undefined,
    searchPath: String | js.Array[String] = null,
    transformPath: /* filePath */ String => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (additionalStreams != null) __obj.updateDynamic("additionalStreams")(additionalStreams.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(noAssets)) __obj.updateDynamic("noAssets")(noAssets.asInstanceOf[js.Any])
    if (!js.isUndefined(noconcat)) __obj.updateDynamic("noconcat")(noconcat.asInstanceOf[js.Any])
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (transformPath != null) __obj.updateDynamic("transformPath")(js.Any.fromFunction1(transformPath))
    __obj.asInstanceOf[Options]
  }
}

