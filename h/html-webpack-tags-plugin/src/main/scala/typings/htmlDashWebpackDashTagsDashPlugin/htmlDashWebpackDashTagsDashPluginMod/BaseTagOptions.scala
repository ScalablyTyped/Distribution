package typings.htmlDashWebpackDashTagsDashPlugin.htmlDashWebpackDashTagsDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTagOptions extends CommonOptions {
  var glob: js.UndefOr[String] = js.undefined
  var globFlatten: js.UndefOr[Boolean] = js.undefined
  var globPath: js.UndefOr[String] = js.undefined
  var sourcePath: js.UndefOr[String] = js.undefined
}

object BaseTagOptions {
  @scala.inline
  def apply(
    addHash: (/* assetPath */ String, /* hash */ String) => String = null,
    addPublicPath: (/* assetPath */ String, /* publicPath */ String) => String = null,
    append: js.UndefOr[Boolean] = js.undefined,
    glob: String = null,
    globFlatten: js.UndefOr[Boolean] = js.undefined,
    globPath: String = null,
    hash: Boolean | String | AddHashFunction = null,
    publicPath: Boolean | String | AddPublicPathFunction = null,
    sourcePath: String = null,
    useHash: js.UndefOr[Boolean] = js.undefined,
    usePublicPath: js.UndefOr[Boolean] = js.undefined
  ): BaseTagOptions = {
    val __obj = js.Dynamic.literal()
    if (addHash != null) __obj.updateDynamic("addHash")(js.Any.fromFunction2(addHash))
    if (addPublicPath != null) __obj.updateDynamic("addPublicPath")(js.Any.fromFunction2(addPublicPath))
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append)
    if (glob != null) __obj.updateDynamic("glob")(glob)
    if (!js.isUndefined(globFlatten)) __obj.updateDynamic("globFlatten")(globFlatten)
    if (globPath != null) __obj.updateDynamic("globPath")(globPath)
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (sourcePath != null) __obj.updateDynamic("sourcePath")(sourcePath)
    if (!js.isUndefined(useHash)) __obj.updateDynamic("useHash")(useHash)
    if (!js.isUndefined(usePublicPath)) __obj.updateDynamic("usePublicPath")(usePublicPath)
    __obj.asInstanceOf[BaseTagOptions]
  }
}

