package typings
package htmlDashWebpackDashTemplateLib.htmlDashWebpackDashTemplateMod.HtmlWebpackTemplateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPluginNs.Options {
  /** The <div> element id on which you plan to mount a JavaScript app. */
  var appMountId: js.UndefOr[java.lang.String] = js.undefined
  /** An array of application element ids. */
  var appMountIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  		 * Adjust the URL for relative URLs in the document (MDN).
  		 * https://developer.mozilla.org/en/docs/Web/HTML/Element/base
  		 */
  var baseHref: js.UndefOr[java.lang.String] = js.undefined
  /** Insert the webpack-dev-server hot reload script at this host:port/path; e.g., http://localhost:3000. */
  var devServer: js.UndefOr[java.lang.String] = js.undefined
  /** Track usage of your site via Google Analytics. */
  var googleAnalytics: js.UndefOr[GoogleAnalyticsOptions] = js.undefined
  /** Set to false. Controls asset addition to the template. This template takes care of that. */
  @JSName("inject")
  var inject_Options: htmlDashWebpackDashTemplateLib.htmlDashWebpackDashTemplateLibNumbers.`false`
  /**
  		 * For use with inline-manifest-webpack-plugin.
  		 * https://github.com/szrenwei/inline-manifest-webpack-plugin
  		 */
  var inlineManifestWebpackName: js.UndefOr[java.lang.String] = js.undefined
  /** Array of <link> elements. */
  var links: js.UndefOr[js.Array[Link]] = js.undefined
  /** Array of objects containing key value pairs to be included as meta tags. */
  @JSName("meta")
  var meta_Options: js.UndefOr[js.Array[Attributes]] = js.undefined
  /** Sets appropriate meta tag for page scaling. */
  var mobile: js.UndefOr[scala.Boolean] = js.undefined
  /** Array of external script imports to include on page. */
  var scripts: js.UndefOr[js.Array[Script]] = js.undefined
  /** Specify this module's index.ejs file. */
  @JSName("template")
  var template_Options: java.lang.String
  /** Object that defines data you need to bootstrap a JavaScript app. */
  var window: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    inject: htmlDashWebpackDashTemplateLib.htmlDashWebpackDashTemplateLibNumbers.`false`,
    template: java.lang.String,
    appMountId: java.lang.String = null,
    appMountIds: js.Array[java.lang.String] = null,
    baseHref: java.lang.String = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    chunks: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibStrings.all | js.Array[java.lang.String] = null,
    chunksSortMode: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibStrings.none | htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibStrings.auto | htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibStrings.dependency | htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibStrings.manual | (js.Function2[
      /* a */ webpackLib.webpackMod.compilationNs.Chunk, 
      /* b */ webpackLib.webpackMod.compilationNs.Chunk, 
      scala.Double
    ]) = null,
    devServer: java.lang.String = null,
    excludeChunks: js.Array[java.lang.String] = null,
    favicon: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibNumbers.`false` | java.lang.String = null,
    filename: java.lang.String = null,
    googleAnalytics: GoogleAnalyticsOptions = null,
    hash: js.UndefOr[scala.Boolean] = js.undefined,
    inlineManifestWebpackName: java.lang.String = null,
    links: js.Array[Link] = null,
    meta: js.Array[Attributes] = null,
    minify: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibNumbers.`false` | htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPluginNs.MinifyOptions = null,
    mobile: js.UndefOr[scala.Boolean] = js.undefined,
    scripts: js.Array[Script] = null,
    showErrors: js.UndefOr[scala.Boolean] = js.undefined,
    templateContent: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibNumbers.`false` | java.lang.String | js.Promise[java.lang.String] = null,
    templateParameters: htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibNumbers.`false` | (js.Function3[
      /* compilation */ webpackLib.webpackMod.compilationNs.Compilation, 
      /* assets */ htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPluginNs.TemplateParametersAssets, 
      Options, 
      _
    ]) | org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    title: java.lang.String = null,
    window: js.Object = null,
    xhtml: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inject")(inject)
    __obj.updateDynamic("template")(template)
    if (appMountId != null) __obj.updateDynamic("appMountId")(appMountId)
    if (appMountIds != null) __obj.updateDynamic("appMountIds")(appMountIds)
    if (baseHref != null) __obj.updateDynamic("baseHref")(baseHref)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    if (chunksSortMode != null) __obj.updateDynamic("chunksSortMode")(chunksSortMode.asInstanceOf[js.Any])
    if (devServer != null) __obj.updateDynamic("devServer")(devServer)
    if (excludeChunks != null) __obj.updateDynamic("excludeChunks")(excludeChunks)
    if (favicon != null) __obj.updateDynamic("favicon")(favicon.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (googleAnalytics != null) __obj.updateDynamic("googleAnalytics")(googleAnalytics)
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash)
    if (inlineManifestWebpackName != null) __obj.updateDynamic("inlineManifestWebpackName")(inlineManifestWebpackName)
    if (links != null) __obj.updateDynamic("links")(links)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (minify != null) __obj.updateDynamic("minify")(minify.asInstanceOf[js.Any])
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    if (!js.isUndefined(showErrors)) __obj.updateDynamic("showErrors")(showErrors)
    if (templateContent != null) __obj.updateDynamic("templateContent")(templateContent.asInstanceOf[js.Any])
    if (templateParameters != null) __obj.updateDynamic("templateParameters")(templateParameters.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (window != null) __obj.updateDynamic("window")(window)
    if (!js.isUndefined(xhtml)) __obj.updateDynamic("xhtml")(xhtml)
    __obj.asInstanceOf[Options]
  }
}

