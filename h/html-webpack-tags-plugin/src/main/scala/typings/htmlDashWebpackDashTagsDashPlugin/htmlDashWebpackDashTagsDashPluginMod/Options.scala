package typings.htmlDashWebpackDashTagsDashPlugin.htmlDashWebpackDashTagsDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends CommonOptions {
  var cssExtensions: js.UndefOr[String | js.Array[String]] = js.undefined
  var files: js.UndefOr[js.Array[String]] = js.undefined
  var jsExtensions: js.UndefOr[String | js.Array[String]] = js.undefined
  var links: js.UndefOr[String | LinkTagOptions | (js.Array[String | LinkTagOptions])] = js.undefined
  var metas: js.UndefOr[String | MetaTagOptions | (js.Array[String | MetaTagOptions])] = js.undefined
  var prependExternals: js.UndefOr[Boolean] = js.undefined
  var scripts: js.UndefOr[String | ScriptTagOptions | (js.Array[String | ScriptTagOptions])] = js.undefined
  var tags: js.UndefOr[
    String | MaybeLinkTagOptions | MaybeScriptTagOptions | (js.Array[String | MaybeLinkTagOptions | MaybeScriptTagOptions])
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    addHash: (/* assetPath */ String, /* hash */ String) => String = null,
    addPublicPath: (/* assetPath */ String, /* publicPath */ String) => String = null,
    append: js.UndefOr[Boolean] = js.undefined,
    cssExtensions: String | js.Array[String] = null,
    files: js.Array[String] = null,
    hash: Boolean | String | AddHashFunction = null,
    jsExtensions: String | js.Array[String] = null,
    links: String | LinkTagOptions | (js.Array[String | LinkTagOptions]) = null,
    metas: String | MetaTagOptions | (js.Array[String | MetaTagOptions]) = null,
    prependExternals: js.UndefOr[Boolean] = js.undefined,
    publicPath: Boolean | String | AddPublicPathFunction = null,
    scripts: String | ScriptTagOptions | (js.Array[String | ScriptTagOptions]) = null,
    tags: String | MaybeLinkTagOptions | MaybeScriptTagOptions | (js.Array[String | MaybeLinkTagOptions | MaybeScriptTagOptions]) = null,
    useHash: js.UndefOr[Boolean] = js.undefined,
    usePublicPath: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (addHash != null) __obj.updateDynamic("addHash")(js.Any.fromFunction2(addHash))
    if (addPublicPath != null) __obj.updateDynamic("addPublicPath")(js.Any.fromFunction2(addPublicPath))
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (cssExtensions != null) __obj.updateDynamic("cssExtensions")(cssExtensions.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (jsExtensions != null) __obj.updateDynamic("jsExtensions")(jsExtensions.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (metas != null) __obj.updateDynamic("metas")(metas.asInstanceOf[js.Any])
    if (!js.isUndefined(prependExternals)) __obj.updateDynamic("prependExternals")(prependExternals.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(useHash)) __obj.updateDynamic("useHash")(useHash.asInstanceOf[js.Any])
    if (!js.isUndefined(usePublicPath)) __obj.updateDynamic("usePublicPath")(usePublicPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

