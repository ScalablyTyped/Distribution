package typings.loadableWebpackPlugin.mod

import typings.loadableWebpackPlugin.anon.Filename
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
  var writeToDisk: js.UndefOr[Boolean | Filename] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(
    filename: String = null,
    outputAsset: js.UndefOr[Boolean] = js.undefined,
    writeToDisk: Boolean | Filename = null
  ): PluginOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(outputAsset)) __obj.updateDynamic("outputAsset")(outputAsset.get.asInstanceOf[js.Any])
    if (writeToDisk != null) __obj.updateDynamic("writeToDisk")(writeToDisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginOptions]
  }
}

