package typings.loadableWebpackPlugin.mod

import typings.loadableWebpackPlugin.AnonFilename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  /**
    * The stats filename.
    *
    * @default loadable-stats.json
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * @default true
    */
  var outputAsset: js.UndefOr[Boolean] = js.undefined
  /**
    * Always write stats file to disk.
    *
    * @default false
    */
  var writeToDisk: js.UndefOr[Boolean | AnonFilename] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(
    filename: String = null,
    outputAsset: js.UndefOr[Boolean] = js.undefined,
    writeToDisk: Boolean | AnonFilename = null
  ): PluginOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(outputAsset)) __obj.updateDynamic("outputAsset")(outputAsset.asInstanceOf[js.Any])
    if (writeToDisk != null) __obj.updateDynamic("writeToDisk")(writeToDisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginOptions]
  }
}

