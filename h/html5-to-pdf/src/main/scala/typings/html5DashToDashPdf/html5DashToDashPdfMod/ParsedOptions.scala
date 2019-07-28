package typings.html5DashToDashPdf.html5DashToDashPdfMod

import typings.node.Buffer
import typings.puppeteer.puppeteerMod.LaunchOptions
import typings.puppeteer.puppeteerMod.PDFOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedOptions extends js.Object {
  var body: String | Buffer
  var include: js.Array[FileDef]
  var launchOptions: LaunchOptions
  var pdf: PDFOptions
  var renderDelay: Double
  var templatePath: String
  var templateUrl: String
}

object ParsedOptions {
  @scala.inline
  def apply(
    body: String | Buffer,
    include: js.Array[FileDef],
    launchOptions: LaunchOptions,
    pdf: PDFOptions,
    renderDelay: Double,
    templatePath: String,
    templateUrl: String
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], include = include, launchOptions = launchOptions, pdf = pdf, renderDelay = renderDelay, templatePath = templatePath, templateUrl = templateUrl)
  
    __obj.asInstanceOf[ParsedOptions]
  }
}

