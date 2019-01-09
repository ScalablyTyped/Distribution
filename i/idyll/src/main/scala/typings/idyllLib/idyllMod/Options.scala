package typings
package idyllLib.idyllMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Compiler options
    */
  var compiler: js.UndefOr[idyllDashCompilerLib.idyllDashCompilerMod.Options] = js.undefined
  /**
    * The components directory
    */
  var components: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom CSS file to include in output
    */
  var css: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The datasets directory
    */
  var datasets: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default component directory
    * This corresponds to where the idyll-components package stays
    */
  var defaultComponents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * used internally by IdyllInstance
    */
  var inputConfig: js.UndefOr[idyllLib.Anon_Compiler] = js.undefined
  /**
    * the idyll file to be compiled into
    */
  var inputFile: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The layout defined in idyll-layouts package
    */
  var layout: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to minify output build
    */
  var minify: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The output directory for compiled documents
    */
  var output: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom port to bind the local server to.
    */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Pre-render HTML as part of the build
    */
  var ssr: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Temporary directory used by idyll
    */
  var temp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * path to HTML template
    *
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The theme defined in idyll-theme package
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom browserify transforms to apply.
    */
  var transform: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Monitor input files and rebuild on changes
    */
  var watch: js.UndefOr[scala.Boolean] = js.undefined
}

