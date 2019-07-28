package typings.htmlDashWebpackDashTemplate.htmlDashWebpackDashTemplateMod

import org.scalablytyped.runtime.StringDictionary
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod.MinifyOptions
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod.TemplateParametersAssets
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginStrings.all
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginStrings.auto
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginStrings.dependency
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginStrings.manual
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginStrings.none
import typings.htmlDashWebpackDashTemplate.htmlDashWebpackDashTemplateNumbers.`false`
import typings.webpack.webpackMod.compilationNs.Chunk
import typings.webpack.webpackMod.compilationNs.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod.Options {
  /** The <div> element id on which you plan to mount a JavaScript app. */
  var appMountId: js.UndefOr[String] = js.undefined
  /** An array of application element ids. */
  var appMountIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
  		 * Adjust the URL for relative URLs in the document (MDN).
  		 * https://developer.mozilla.org/en/docs/Web/HTML/Element/base
  		 */
  var baseHref: js.UndefOr[String] = js.undefined
  /** Insert the webpack-dev-server hot reload script at this host:port/path; e.g., http://localhost:3000. */
  var devServer: js.UndefOr[String] = js.undefined
  /** Track usage of your site via Google Analytics. */
  var googleAnalytics: js.UndefOr[GoogleAnalyticsOptions] = js.undefined
  /** Set to false. Controls asset addition to the template. This template takes care of that. */
  @JSName("inject")
  var inject_Options: `false`
  /**
  		 * For use with inline-manifest-webpack-plugin.
  		 * https://github.com/szrenwei/inline-manifest-webpack-plugin
  		 */
  var inlineManifestWebpackName: js.UndefOr[String] = js.undefined
  /** Array of <link> elements. */
  var links: js.UndefOr[js.Array[Link]] = js.undefined
  /** Array of objects containing key value pairs to be included as meta tags. */
  @JSName("meta")
  var meta_Options: js.UndefOr[js.Array[Attributes]] = js.undefined
  /** Sets appropriate meta tag for page scaling. */
  var mobile: js.UndefOr[Boolean] = js.undefined
  /** Array of external script imports to include on page. */
  var scripts: js.UndefOr[js.Array[Script]] = js.undefined
  /** Specify this module's index.ejs file. */
  @JSName("template")
  var template_Options: String
  /** Object that defines data you need to bootstrap a JavaScript app. */
  var window: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    inject: `false`,
    template: String,
    appMountId: String = null,
    appMountIds: js.Array[String] = null,
    baseHref: String = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    chunks: all | js.Array[String] = null,
    chunksSortMode: none | auto | dependency | manual | (js.Function2[/* a */ Chunk, /* b */ Chunk, Double]) = null,
    devServer: String = null,
    excludeChunks: js.Array[String] = null,
    favicon: typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginNumbers.`false` | String = null,
    filename: String = null,
    googleAnalytics: GoogleAnalyticsOptions = null,
    hash: js.UndefOr[Boolean] = js.undefined,
    inlineManifestWebpackName: String = null,
    links: js.Array[Link] = null,
    meta: js.Array[Attributes] = null,
    minify: typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginNumbers.`false` | MinifyOptions = null,
    mobile: js.UndefOr[Boolean] = js.undefined,
    scripts: js.Array[Script] = null,
    showErrors: js.UndefOr[Boolean] = js.undefined,
    templateContent: typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginNumbers.`false` | String | js.Promise[String] = null,
    templateParameters: typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginNumbers.`false` | (js.Function3[/* compilation */ Compilation, /* assets */ TemplateParametersAssets, Options, _]) | StringDictionary[js.Any] = null,
    title: String = null,
    window: js.Object = null,
    xhtml: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(inject = inject, template = template)
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

