package typings.htmlWebpackTagsPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptTagOptions extends BaseTagOptions {
  var attributes: js.UndefOr[AttributesObject] = js.undefined
  var external: js.UndefOr[ExternalObject] = js.undefined
  var path: String
}

object ScriptTagOptions {
  @scala.inline
  def apply(
    path: String,
    addHash: (/* assetPath */ String, /* hash */ String) => String = null,
    addPublicPath: (/* assetPath */ String, /* publicPath */ String) => String = null,
    append: js.UndefOr[Boolean] = js.undefined,
    attributes: AttributesObject = null,
    external: ExternalObject = null,
    glob: String = null,
    globFlatten: js.UndefOr[Boolean] = js.undefined,
    globPath: String = null,
    hash: Boolean | String | AddHashFunction = null,
    publicPath: Boolean | String | AddPublicPathFunction = null,
    sourcePath: String = null,
    useHash: js.UndefOr[Boolean] = js.undefined,
    usePublicPath: js.UndefOr[Boolean] = js.undefined
  ): ScriptTagOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (addHash != null) __obj.updateDynamic("addHash")(js.Any.fromFunction2(addHash))
    if (addPublicPath != null) __obj.updateDynamic("addPublicPath")(js.Any.fromFunction2(addPublicPath))
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.get.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (external != null) __obj.updateDynamic("external")(external.asInstanceOf[js.Any])
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (!js.isUndefined(globFlatten)) __obj.updateDynamic("globFlatten")(globFlatten.get.asInstanceOf[js.Any])
    if (globPath != null) __obj.updateDynamic("globPath")(globPath.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (sourcePath != null) __obj.updateDynamic("sourcePath")(sourcePath.asInstanceOf[js.Any])
    if (!js.isUndefined(useHash)) __obj.updateDynamic("useHash")(useHash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePublicPath)) __obj.updateDynamic("usePublicPath")(usePublicPath.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptTagOptions]
  }
}

