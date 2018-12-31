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

