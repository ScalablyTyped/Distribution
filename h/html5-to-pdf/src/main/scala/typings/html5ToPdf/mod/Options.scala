package typings.html5ToPdf.mod

import typings.node.Buffer
import typings.puppeteer.mod.LaunchOptions
import typings.puppeteer.mod.PDFOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A list of CSS or JS assets to include.
    */
  var include: js.UndefOr[js.Array[String | FileDef]] = js.native
  /**
    * Path to the input html as a String, or Buffer. If specified this will override inputPath.
    */
  var inputBody: js.UndefOr[String | Buffer] = js.native
  /**
    * Path to the input HTML.
    */
  var inputPath: js.UndefOr[String] = js.native
  /**
    * This object will be passed directly to `puppeteer`.
    */
  var launchOptions: js.UndefOr[LaunchOptions] = js.native
  /**
    * @deprecated Legacy Options.
    * See `options.pdf` for pdf options. Since some of these options are converted over to work with `puppeteer`,
    * this is automatically done if `options.pdf` is left empty.
    */
  var options: js.UndefOr[LegacyOptions] = js.native
  /**
    * Path to the output pdf file.
    */
  var outputPath: js.UndefOr[String] = js.native
  /**
    * This object will be passed directly to `puppeteer`.
    */
  var pdf: js.UndefOr[PDFOptions] = js.native
  /**
    * Delay in milliseconds before rendering the PDF (give HTML and CSS a chance to load).
    */
  var rendererDelay: js.UndefOr[Double] = js.native
  /**
    * The template to use when rendering the html.
    */
  var template: js.UndefOr[String] = js.native
  /**
    * The template to use for rendering the html. If this is set, it will use this instead of the template path.
    */
  var templateUrl: js.UndefOr[String] = js.native
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
    def setIncludeVarargs(value: (String | FileDef)*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: js.Array[String | FileDef]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setInputBody(value: String | Buffer): Self = this.set("inputBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputBody: Self = this.set("inputBody", js.undefined)
    @scala.inline
    def setInputPath(value: String): Self = this.set("inputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputPath: Self = this.set("inputPath", js.undefined)
    @scala.inline
    def setLaunchOptions(value: LaunchOptions): Self = this.set("launchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchOptions: Self = this.set("launchOptions", js.undefined)
    @scala.inline
    def setOptions(value: LegacyOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setOutputPath(value: String): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputPath: Self = this.set("outputPath", js.undefined)
    @scala.inline
    def setPdf(value: PDFOptions): Self = this.set("pdf", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    @scala.inline
    def setRendererDelay(value: Double): Self = this.set("rendererDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRendererDelay: Self = this.set("rendererDelay", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
  }
  
}

