package typings
package html5DashToDashPdfLib.html5DashToDashPdfMod.HTML5ToPDFNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * A list of CSS or JS assets to include.
    */
  var include: js.UndefOr[js.Array[java.lang.String | FileDef]] = js.undefined
  /**
    * Path to the input html as a String, or Buffer. If specified this will override inputPath.
    */
  var inputBody: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /**
    * Path to the input HTML.
    */
  var inputPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This object will be passed directly to `puppeteer`.
    */
  var launchOptions: js.UndefOr[puppeteerLib.puppeteerMod.LaunchOptions] = js.undefined
  /**
    * @deprecated Legacy Options.
    * See `options.pdf` for pdf options. Since some of these options are converted over to work with `puppeteer`,
    * this is automatically done if `options.pdf` is left empty.
    */
  var options: js.UndefOr[LegacyOptions] = js.undefined
  /**
    * Path to the output pdf file.
    */
  var outputPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This object will be passed directly to `puppeteer`.
    */
  var pdf: js.UndefOr[puppeteerLib.puppeteerMod.PDFOptions] = js.undefined
  /**
    * Delay in milliseconds before rendering the PDF (give HTML and CSS a chance to load).
    */
  var rendererDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * The template to use when rendering the html.
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The template to use for rendering the html. If this is set, it will use this instead of the template path.
    */
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    include: js.Array[java.lang.String | FileDef] = null,
    inputBody: java.lang.String | nodeLib.Buffer = null,
    inputPath: java.lang.String = null,
    launchOptions: puppeteerLib.puppeteerMod.LaunchOptions = null,
    options: LegacyOptions = null,
    outputPath: java.lang.String = null,
    pdf: puppeteerLib.puppeteerMod.PDFOptions = null,
    rendererDelay: scala.Int | scala.Double = null,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (include != null) __obj.updateDynamic("include")(include)
    if (inputBody != null) __obj.updateDynamic("inputBody")(inputBody.asInstanceOf[js.Any])
    if (inputPath != null) __obj.updateDynamic("inputPath")(inputPath)
    if (launchOptions != null) __obj.updateDynamic("launchOptions")(launchOptions)
    if (options != null) __obj.updateDynamic("options")(options)
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath)
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (rendererDelay != null) __obj.updateDynamic("rendererDelay")(rendererDelay.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    __obj.asInstanceOf[Options]
  }
}

