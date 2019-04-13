package typings
package html5DashToDashPdfLib.html5DashToDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedOptions extends js.Object {
  var body: java.lang.String | nodeLib.Buffer
  var include: js.Array[FileDef]
  var launchOptions: puppeteerLib.puppeteerMod.LaunchOptions
  var pdf: puppeteerLib.puppeteerMod.PDFOptions
  var renderDelay: scala.Double
  var templatePath: java.lang.String
  var templateUrl: java.lang.String
}

object ParsedOptions {
  @scala.inline
  def apply(
    body: java.lang.String | nodeLib.Buffer,
    include: js.Array[FileDef],
    launchOptions: puppeteerLib.puppeteerMod.LaunchOptions,
    pdf: puppeteerLib.puppeteerMod.PDFOptions,
    renderDelay: scala.Double,
    templatePath: java.lang.String,
    templateUrl: java.lang.String
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], include = include, launchOptions = launchOptions, pdf = pdf, renderDelay = renderDelay, templatePath = templatePath, templateUrl = templateUrl)
  
    __obj.asInstanceOf[ParsedOptions]
  }
}

