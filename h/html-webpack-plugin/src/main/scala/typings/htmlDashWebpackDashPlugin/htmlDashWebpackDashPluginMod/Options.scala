package typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod

import org.scalablytyped.runtime.StringDictionary
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginNumbers.`false`
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginStrings.all
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginStrings.auto
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginStrings.body
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginStrings.dependency
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginStrings.head
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginStrings.manual
import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginStrings.none
import typings.webpack.webpackMod.compilation.Chunk
import typings.webpack.webpackMod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /**
		 * In addition to the options actually used by this plugin, you can use this hash to pass arbitrary data through
		 * to your template.
		 */
/* option */ StringDictionary[js.Any] {
  /**
  		 * Emit the file only if it was changed.
  		 * Default: `true`.
  		 */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Allows you to add only some chunks (e.g. only the unit-test chunk).
  		 * Default: 'all'.
  		 */
  var chunks: js.UndefOr[all | js.Array[String]] = js.undefined
  /**
  		 * Allows to control how chunks should be sorted before they are included to the html.
  		 * Default: `'auto'`.
  		 */
  var chunksSortMode: js.UndefOr[
    none | auto | dependency | manual | (js.Function2[/* a */ Chunk, /* b */ Chunk, Double])
  ] = js.undefined
  /**
  		 * Allows you to skip some chunks (e.g. don't add the unit-test chunk).
  		 * Default: `[]`.
  		 */
  var excludeChunks: js.UndefOr[js.Array[String]] = js.undefined
  /**
  		 * Adds the given favicon path to the output html.
  		 * Default: `false`.
  		 */
  var favicon: js.UndefOr[`false` | String] = js.undefined
  /**
  		 * The file to write the HTML to.
  		 * You can specify a subdirectory here too (eg: `assets/admin.html`).
  		 * Default: `'index.html'`.
  		 */
  var filename: js.UndefOr[String] = js.undefined
  /**
  		 * If true then append a unique webpack compilation hash to all included scripts and CSS files.
  		 * This is useful for cache busting.
  		 * Default: `false`.
  		 */
  var hash: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Inject all assets into the given template or templateContent.
  		 * When passing true or 'body' all javascript resources will be placed at the bottom of the body element.
  		 * 'head' will place the scripts in the head element.
  		 * Default: `true`.
  		 */
  var inject: js.UndefOr[body | head | Boolean] = js.undefined
  /**
  		 * Allows to inject meta-tags, e.g. meta: `{viewport: 'width=device-width, initial-scale=1, shrink-to-fit=no'}`.
  		 * Default: `{}`.
  		 */
  var meta: js.UndefOr[`false` | StringDictionary[js.Any]] = js.undefined
  /**
  		 * Pass a html-minifier options object to minify the output.
  		 * https://github.com/kangax/html-minifier#options-quick-reference
  		 * Default: `false`.
  		 */
  var minify: js.UndefOr[`false` | MinifyOptions] = js.undefined
  /**
  		 * Errors details will be written into the HTML page.
  		 * Default: `true`.
  		 */
  var showErrors: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The `webpack` require path to the template.
  		 * @see https://github.com/jantimon/html-webpack-plugin/blob/master/docs/template-option.md
  		 */
  var template: js.UndefOr[String] = js.undefined
  /**
  		 * Allow to use a html string instead of reading from a file.
  		 * Default: `false`, meaning the `template` option should be used instead.
  		 */
  var templateContent: js.UndefOr[`false` | String | js.Promise[String]] = js.undefined
  /**
  		 * Allows to overwrite the parameters used in the template.
  		 */
  var templateParameters: js.UndefOr[
    `false` | (js.Function3[
      /* compilation */ Compilation, 
      /* assets */ TemplateParametersAssets, 
      /* options */ this.type, 
      _
    ]) | StringDictionary[js.Any]
  ] = js.undefined
  /**
  		 * The title to use for the generated HTML document.
  		 * Default: `'Webpack App'`.
  		 */
  var title: js.UndefOr[String] = js.undefined
  /**
  		 * If true render the link tags as self-closing (XHTML compliant).
  		 * Default: `false`.
  		 */
  var xhtml: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /**
  		 * In addition to the options actually used by this plugin, you can use this hash to pass arbitrary data through
  		 * to your template.
  		 */
  /* option */ StringDictionary[js.Any] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    chunks: all | js.Array[String] = null,
    chunksSortMode: none | auto | dependency | manual | (js.Function2[/* a */ Chunk, /* b */ Chunk, Double]) = null,
    excludeChunks: js.Array[String] = null,
    favicon: `false` | String = null,
    filename: String = null,
    hash: js.UndefOr[Boolean] = js.undefined,
    inject: body | head | Boolean = null,
    meta: `false` | StringDictionary[js.Any] = null,
    minify: `false` | MinifyOptions = null,
    showErrors: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    templateContent: `false` | String | js.Promise[String] = null,
    templateParameters: `false` | (js.Function3[/* compilation */ Compilation, /* assets */ TemplateParametersAssets, Options, _]) | StringDictionary[js.Any] = null,
    title: String = null,
    xhtml: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    if (chunksSortMode != null) __obj.updateDynamic("chunksSortMode")(chunksSortMode.asInstanceOf[js.Any])
    if (excludeChunks != null) __obj.updateDynamic("excludeChunks")(excludeChunks)
    if (favicon != null) __obj.updateDynamic("favicon")(favicon.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash)
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (minify != null) __obj.updateDynamic("minify")(minify.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrors)) __obj.updateDynamic("showErrors")(showErrors)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateContent != null) __obj.updateDynamic("templateContent")(templateContent.asInstanceOf[js.Any])
    if (templateParameters != null) __obj.updateDynamic("templateParameters")(templateParameters.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(xhtml)) __obj.updateDynamic("xhtml")(xhtml)
    __obj.asInstanceOf[Options]
  }
}

