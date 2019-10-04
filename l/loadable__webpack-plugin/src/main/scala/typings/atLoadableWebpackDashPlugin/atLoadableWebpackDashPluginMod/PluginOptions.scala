package typings.atLoadableWebpackDashPlugin.atLoadableWebpackDashPluginMod

import typings.atLoadableWebpackDashPlugin.Anon_Filename
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
  var writeToDisk: js.UndefOr[Boolean | Anon_Filename] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(
    filename: String = null,
    outputAsset: js.UndefOr[Boolean] = js.undefined,
    writeToDisk: Boolean | Anon_Filename = null
  ): PluginOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(outputAsset)) __obj.updateDynamic("outputAsset")(outputAsset)
    if (writeToDisk != null) __obj.updateDynamic("writeToDisk")(writeToDisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginOptions]
  }
}

