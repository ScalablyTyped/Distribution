package typings.html5ToPdf.mod

import typings.node.Buffer
import typings.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTML5ToPDF extends js.Object {
  def build(): js.Promise[Buffer] = js.native
  def close(): js.Promise[Unit] = js.native
  def includeAssets(): js.Promise[Unit] = js.native
  def parseOptions(options: Options): ParsedOptions = js.native
  def start(): js.Promise[Page] = js.native
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
  @scala.inline
  implicit class HTML5ToPDFOps[Self <: HTML5ToPDF] (val x: Self) extends AnyVal {
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
    def setBuild(value: () => js.Promise[Buffer]): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setIncludeAssets(value: () => js.Promise[Unit]): Self = this.set("includeAssets", js.Any.fromFunction0(value))
    @scala.inline
    def setParseOptions(value: Options => ParsedOptions): Self = this.set("parseOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: () => js.Promise[Page]): Self = this.set("start", js.Any.fromFunction0(value))
  }
  
}

