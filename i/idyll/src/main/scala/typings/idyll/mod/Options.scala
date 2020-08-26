package typings.idyll.mod

import typings.idyll.anon.Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Compiler options
    */
  var compiler: js.UndefOr[typings.idyllCompiler.mod.Options] = js.native
  /**
    * The components directory
    */
  var components: js.UndefOr[Boolean] = js.native
  /**
    * Custom CSS file to include in output
    */
  var css: js.UndefOr[String] = js.native
  /**
    * The datasets directory
    */
  var datasets: js.UndefOr[String] = js.native
  /**
    * The default component directory
    * This corresponds to where the idyll-components package stays
    */
  var defaultComponents: js.UndefOr[Boolean] = js.native
  /**
    * used internally by IdyllInstance
    */
  var inputConfig: js.UndefOr[Compiler] = js.native
  /**
    * the idyll file to be compiled into
    */
  var inputFile: js.UndefOr[String] = js.native
  /**
    * The layout defined in idyll-layouts package
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * Whether to minify output build
    */
  var minify: js.UndefOr[Boolean] = js.native
  /**
    * The output directory for compiled documents
    */
  var output: js.UndefOr[String] = js.native
  /**
    * Custom port to bind the local server to.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    *
    * Pre-render HTML as part of the build
    */
  var ssr: js.UndefOr[Boolean] = js.native
  /**
    * Temporary directory used by idyll
    */
  var temp: js.UndefOr[String] = js.native
  /**
    * path to HTML template
    *
    */
  var template: js.UndefOr[String] = js.native
  /**
    * The theme defined in idyll-theme package
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * Custom browserify transforms to apply.
    */
  var transform: js.UndefOr[js.Array[String]] = js.native
  /**
    * Monitor input files and rebuild on changes
    */
  var watch: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompiler(value: typings.idyllCompiler.mod.Options): Self = this.set("compiler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompiler: Self = this.set("compiler", js.undefined)
    @scala.inline
    def setComponents(value: Boolean): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setDatasets(value: String): Self = this.set("datasets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasets: Self = this.set("datasets", js.undefined)
    @scala.inline
    def setDefaultComponents(value: Boolean): Self = this.set("defaultComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultComponents: Self = this.set("defaultComponents", js.undefined)
    @scala.inline
    def setInputConfig(value: Compiler): Self = this.set("inputConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputConfig: Self = this.set("inputConfig", js.undefined)
    @scala.inline
    def setInputFile(value: String): Self = this.set("inputFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputFile: Self = this.set("inputFile", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMinify(value: Boolean): Self = this.set("minify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSsr(value: Boolean): Self = this.set("ssr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsr: Self = this.set("ssr", js.undefined)
    @scala.inline
    def setTemp(value: String): Self = this.set("temp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemp: Self = this.set("temp", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTransformVarargs(value: String*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(value: js.Array[String]): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
  
}

