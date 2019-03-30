package typings
package html5DashToDashPdfLib.html5DashToDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML5ToPDF extends js.Object {
  def build(): js.Promise[nodeLib.Buffer]
  def close(): js.Promise[scala.Unit]
  def includeAssets(): js.Promise[scala.Unit]
  def parseOptions(options: html5DashToDashPdfLib.html5DashToDashPdfMod.HTML5ToPDFNs.Options): html5DashToDashPdfLib.html5DashToDashPdfMod.HTML5ToPDFNs.ParsedOptions
  def start(): js.Promise[puppeteerLib.puppeteerMod.Page]
}

object HTML5ToPDF {
  @scala.inline
  def apply(
    build: () => js.Promise[nodeLib.Buffer],
    close: () => js.Promise[scala.Unit],
    includeAssets: () => js.Promise[scala.Unit],
    parseOptions: html5DashToDashPdfLib.html5DashToDashPdfMod.HTML5ToPDFNs.Options => html5DashToDashPdfLib.html5DashToDashPdfMod.HTML5ToPDFNs.ParsedOptions,
    start: () => js.Promise[puppeteerLib.puppeteerMod.Page]
  ): HTML5ToPDF = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), close = js.Any.fromFunction0(close), includeAssets = js.Any.fromFunction0(includeAssets), parseOptions = js.Any.fromFunction1(parseOptions), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[HTML5ToPDF]
  }
}

