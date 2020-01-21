package typings.html5ToPdf.mod

import typings.node.Buffer
import typings.puppeteer.mod.LaunchOptions
import typings.puppeteer.mod.PDFOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * A list of CSS or JS assets to include.
    */
  var include: js.UndefOr[js.Array[String | FileDef]] = js.undefined
  /**
    * Path to the input html as a String, or Buffer. If specified this will override inputPath.
    */
  var inputBody: js.UndefOr[String | Buffer] = js.undefined
  /**
    * Path to the input HTML.
    */
  var inputPath: js.UndefOr[String] = js.undefined
  /**
    * This object will be passed directly to `puppeteer`.
    */
  var launchOptions: js.UndefOr[LaunchOptions] = js.undefined
  /**
    * @deprecated Legacy Options.
    * See `options.pdf` for pdf options. Since some of these options are converted over to work with `puppeteer`,
    * this is automatically done if `options.pdf` is left empty.
    */
  var options: js.UndefOr[LegacyOptions] = js.undefined
  /**
    * Path to the output pdf file.
    */
  var outputPath: js.UndefOr[String] = js.undefined
  /**
    * This object will be passed directly to `puppeteer`.
    */
  var pdf: js.UndefOr[PDFOptions] = js.undefined
  /**
    * Delay in milliseconds before rendering the PDF (give HTML and CSS a chance to load).
    */
  var rendererDelay: js.UndefOr[Double] = js.undefined
  /**
    * The template to use when rendering the html.
    */
  var template: js.UndefOr[String] = js.undefined
  /**
    * The template to use for rendering the html. If this is set, it will use this instead of the template path.
    */
  var templateUrl: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    include: js.Array[String | FileDef] = null,
    inputBody: String | Buffer = null,
    inputPath: String = null,
    launchOptions: LaunchOptions = null,
    options: LegacyOptions = null,
    outputPath: String = null,
    pdf: PDFOptions = null,
    rendererDelay: Int | Double = null,
    template: String = null,
    templateUrl: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (inputBody != null) __obj.updateDynamic("inputBody")(inputBody.asInstanceOf[js.Any])
    if (inputPath != null) __obj.updateDynamic("inputPath")(inputPath.asInstanceOf[js.Any])
    if (launchOptions != null) __obj.updateDynamic("launchOptions")(launchOptions.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (rendererDelay != null) __obj.updateDynamic("rendererDelay")(rendererDelay.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

