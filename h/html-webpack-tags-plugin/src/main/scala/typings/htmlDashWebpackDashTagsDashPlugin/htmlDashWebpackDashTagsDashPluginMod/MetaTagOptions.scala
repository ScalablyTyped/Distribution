package typings.htmlDashWebpackDashTagsDashPlugin.htmlDashWebpackDashTagsDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaTagOptions extends BaseTagOptions {
  var attributes: AttributesObject
  var path: js.UndefOr[String] = js.undefined
}

object MetaTagOptions {
  @scala.inline
  def apply(
    attributes: AttributesObject,
    addHash: (/* assetPath */ String, /* hash */ String) => String = null,
    addPublicPath: (/* assetPath */ String, /* publicPath */ String) => String = null,
    append: js.UndefOr[Boolean] = js.undefined,
    glob: String = null,
    globFlatten: js.UndefOr[Boolean] = js.undefined,
    globPath: String = null,
    hash: Boolean | String | AddHashFunction = null,
    path: String = null,
    publicPath: Boolean | String | AddPublicPathFunction = null,
    sourcePath: String = null,
    useHash: js.UndefOr[Boolean] = js.undefined,
    usePublicPath: js.UndefOr[Boolean] = js.undefined
  ): MetaTagOptions = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    if (addHash != null) __obj.updateDynamic("addHash")(js.Any.fromFunction2(addHash))
    if (addPublicPath != null) __obj.updateDynamic("addPublicPath")(js.Any.fromFunction2(addPublicPath))
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (!js.isUndefined(globFlatten)) __obj.updateDynamic("globFlatten")(globFlatten.asInstanceOf[js.Any])
    if (globPath != null) __obj.updateDynamic("globPath")(globPath.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (sourcePath != null) __obj.updateDynamic("sourcePath")(sourcePath.asInstanceOf[js.Any])
    if (!js.isUndefined(useHash)) __obj.updateDynamic("useHash")(useHash.asInstanceOf[js.Any])
    if (!js.isUndefined(usePublicPath)) __obj.updateDynamic("usePublicPath")(usePublicPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaTagOptions]
  }
}

