package typings
package htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options
  extends /**
		 * In addition to the options actually used by this plugin, you can use this hash to pass arbitrary data through
		 * to your template.
		 */
/* option */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  		 * Emit the file only if it was changed.
  		 * Default: `true`.
  		 */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Allows you to add only some chunks (e.g. only the unit-test chunk).
  		 * Default: 'all'.
  		 */
  var chunks: js.UndefOr[
    htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibStrings.all | js.Array[java.lang.String]
  ] = js.undefined
  /**
  		 * Allows to control how chunks should be sorted before they are included to the html.
  		 * Default: `'auto'`.
  		 */
  var chunksSortMode: js.UndefOr[
    htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibStrings.none | htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibStrings.auto | htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibStrings.dependency | htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibStrings.manual | (js.Function2[
      /* a */ webpackLib.webpackMod.compilationNs.Chunk, 
      /* b */ webpackLib.webpackMod.compilationNs.Chunk, 
      scala.Double
    ])
  ] = js.undefined
  /**
  		 * Allows you to skip some chunks (e.g. don't add the unit-test chunk).
  		 * Default: `[]`.
  		 */
  var excludeChunks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  		 * Adds the given favicon path to the output html.
  		 * Default: `false`.
  		 */
  var favicon: js.UndefOr[
    htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibNumbers.`false` | java.lang.String
  ] = js.undefined
  /**
  		 * The file to write the HTML to.
  		 * You can specify a subdirectory here too (eg: `assets/admin.html`).
  		 * Default: `'index.html'`.
  		 */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * If true then append a unique webpack compilation hash to all included scripts and CSS files.
  		 * This is useful for cache busting.
  		 * Default: `false`.
  		 */
  var hash: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Inject all assets into the given template or templateContent.
  		 * When passing true or 'body' all javascript resources will be placed at the bottom of the body element.
  		 * 'head' will place the scripts in the head element.
  		 * Default: `true`.
  		 */
  var inject: js.UndefOr[
    htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibStrings.body | htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibStrings.head | scala.Boolean
  ] = js.undefined
  /**
  		 * Allows to inject meta-tags, e.g. meta: `{viewport: 'width=device-width, initial-scale=1, shrink-to-fit=no'}`.
  		 * Default: `{}`.
  		 */
  var meta: js.UndefOr[
    htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibNumbers.`false` | ScalablyTyped.runtime.StringDictionary[js.Any]
  ] = js.undefined
  /**
  		 * Pass a html-minifier options object to minify the output.
  		 * https://github.com/kangax/html-minifier#options-quick-reference
  		 * Default: `false`.
  		 */
  var minify: js.UndefOr[
    htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibNumbers.`false` | MinifyOptions
  ] = js.undefined
  /**
  		 * Errors details will be written into the HTML page.
  		 * Default: `true`.
  		 */
  var showErrors: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * The `webpack` require path to the template.
  		 * @see https://github.com/jantimon/html-webpack-plugin/blob/master/docs/template-option.md
  		 */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Allow to use a html string instead of reading from a file.
  		 * Default: `false`, meaning the `template` option should be used instead.
  		 */
  var templateContent: js.UndefOr[
    htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibNumbers.`false` | java.lang.String | stdLib.Promise[java.lang.String]
  ] = js.undefined
  /**
  		 * Allows to overwrite the parameters used in the template.
  		 */
  var templateParameters: js.UndefOr[
    htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginLibNumbers.`false` | (js.Function3[
      /* compilation */ webpackLib.webpackMod.compilationNs.Compilation, 
      /* assets */ TemplateParametersAssets, 
      /* options */ this.type, 
      _
    ]) | ScalablyTyped.runtime.StringDictionary[js.Any]
  ] = js.undefined
  /**
  		 * The title to use for the generated HTML document.
  		 * Default: `'Webpack App'`.
  		 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * If true render the link tags as self-closing (XHTML compliant).
  		 * Default: `false`.
  		 */
  var xhtml: js.UndefOr[scala.Boolean] = js.undefined
}

