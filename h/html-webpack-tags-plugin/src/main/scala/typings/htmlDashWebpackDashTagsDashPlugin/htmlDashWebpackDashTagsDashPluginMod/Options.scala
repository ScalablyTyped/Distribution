package typings.htmlDashWebpackDashTagsDashPlugin.htmlDashWebpackDashTagsDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var append: js.UndefOr[Boolean] = js.undefined
  var files: js.UndefOr[String | js.Array[String]] = js.undefined
  var tags: String | js.Array[String]
}

object Options {
  @scala.inline
  def apply(
    tags: String | js.Array[String],
    append: js.UndefOr[Boolean] = js.undefined,
    files: String | js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append)
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

