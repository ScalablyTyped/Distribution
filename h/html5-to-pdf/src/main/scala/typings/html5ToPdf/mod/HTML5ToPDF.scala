package typings.html5ToPdf.mod

import typings.node.Buffer
import typings.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML5ToPDF extends js.Object {
  def build(): js.Promise[Buffer]
  def close(): js.Promise[Unit]
  def includeAssets(): js.Promise[Unit]
  def parseOptions(options: Options): ParsedOptions
  def start(): js.Promise[Page]
}

object HTML5ToPDF {
  @scala.inline
  def apply(
    build: () => js.Promise[Buffer],
    close: () => js.Promise[Unit],
    includeAssets: () => js.Promise[Unit],
    parseOptions: Options => ParsedOptions,
    start: () => js.Promise[Page]
  ): HTML5ToPDF = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), close = js.Any.fromFunction0(close), includeAssets = js.Any.fromFunction0(includeAssets), parseOptions = js.Any.fromFunction1(parseOptions), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[HTML5ToPDF]
  }
}

