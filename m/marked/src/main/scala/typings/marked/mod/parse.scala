package typings.marked.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", "parse")
@js.native
object parse extends js.Object {
  /**
    * Compiles markdown to HTML.
    *
    * @param src String of markdown source to be compiled
    * @param options Hash of options
    * @param callback Function called when the markdownString has been fully parsed when using async highlighting
    * @return String of compiled HTML
    */
  def apply(src: String): String = js.native
  /**
    * Compiles markdown to HTML.
    *
    * @param src String of markdown source to be compiled
    * @param callback Function called when the markdownString has been fully parsed when using async highlighting
    * @return String of compiled HTML
    */
  def apply(
    src: String,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
  ): String = js.native
  def apply(
    src: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
  ): String = js.native
  def apply(src: String, options: MarkedOptions): String = js.native
  def apply(
    src: String,
    options: MarkedOptions,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
  ): String = js.native
}

