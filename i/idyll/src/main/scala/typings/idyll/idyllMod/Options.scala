package typings.idyll.idyllMod

import typings.idyll.Anon_Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Compiler options
    */
  var compiler: js.UndefOr[typings.idyllDashCompiler.idyllDashCompilerMod.Options] = js.undefined
  /**
    * The components directory
    */
  var components: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom CSS file to include in output
    */
  var css: js.UndefOr[String] = js.undefined
  /**
    * The datasets directory
    */
  var datasets: js.UndefOr[String] = js.undefined
  /**
    * The default component directory
    * This corresponds to where the idyll-components package stays
    */
  var defaultComponents: js.UndefOr[Boolean] = js.undefined
  /**
    * used internally by IdyllInstance
    */
  var inputConfig: js.UndefOr[Anon_Compiler] = js.undefined
  /**
    * the idyll file to be compiled into
    */
  var inputFile: js.UndefOr[String] = js.undefined
  /**
    * The layout defined in idyll-layouts package
    */
  var layout: js.UndefOr[String] = js.undefined
  /**
    * Whether to minify output build
    */
  var minify: js.UndefOr[Boolean] = js.undefined
  /**
    * The output directory for compiled documents
    */
  var output: js.UndefOr[String] = js.undefined
  /**
    * Custom port to bind the local server to.
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    *
    * Pre-render HTML as part of the build
    */
  var ssr: js.UndefOr[Boolean] = js.undefined
  /**
    * Temporary directory used by idyll
    */
  var temp: js.UndefOr[String] = js.undefined
  /**
    * path to HTML template
    *
    */
  var template: js.UndefOr[String] = js.undefined
  /**
    * The theme defined in idyll-theme package
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    * Custom browserify transforms to apply.
    */
  var transform: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Monitor input files and rebuild on changes
    */
  var watch: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    compiler: typings.idyllDashCompiler.idyllDashCompilerMod.Options = null,
    components: js.UndefOr[Boolean] = js.undefined,
    css: String = null,
    datasets: String = null,
    defaultComponents: js.UndefOr[Boolean] = js.undefined,
    inputConfig: Anon_Compiler = null,
    inputFile: String = null,
    layout: String = null,
    minify: js.UndefOr[Boolean] = js.undefined,
    output: String = null,
    port: Int | Double = null,
    ssr: js.UndefOr[Boolean] = js.undefined,
    temp: String = null,
    template: String = null,
    theme: String = null,
    transform: js.Array[String] = null,
    watch: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (compiler != null) __obj.updateDynamic("compiler")(compiler)
    if (!js.isUndefined(components)) __obj.updateDynamic("components")(components)
    if (css != null) __obj.updateDynamic("css")(css)
    if (datasets != null) __obj.updateDynamic("datasets")(datasets)
    if (!js.isUndefined(defaultComponents)) __obj.updateDynamic("defaultComponents")(defaultComponents)
    if (inputConfig != null) __obj.updateDynamic("inputConfig")(inputConfig)
    if (inputFile != null) __obj.updateDynamic("inputFile")(inputFile)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify)
    if (output != null) __obj.updateDynamic("output")(output)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    if (temp != null) __obj.updateDynamic("temp")(temp)
    if (template != null) __obj.updateDynamic("template")(template)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[Options]
  }
}

