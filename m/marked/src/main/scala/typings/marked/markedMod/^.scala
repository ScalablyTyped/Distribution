package typings.marked.markedMod

import typings.marked.Fn_Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marked", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def apply(src: String, options: MarkedOptions): String = js.native
  def apply(
    src: String,
    options: MarkedOptions,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
  ): String = js.native
  /**
    * @param src String of markdown source to be compiled
    * @param links Array of links
    * @param options Hash of options
    * @return String of compiled HTML
    */
  def inlineLexer(src: String, links: js.Array[String]): String = js.native
  def inlineLexer(src: String, links: js.Array[String], options: MarkedOptions): String = js.native
  /**
    * @param src String of markdown source to be compiled
    * @param options Hash of options
    */
  def lexer(src: String): TokensList = js.native
  def lexer(src: String, options: MarkedOptions): TokensList = js.native
  /**
    * Compiles markdown to HTML.
    *
    * @param src String of markdown source to be compiled
    * @param options Hash of options
    * @param callback Function called when the markdownString has been fully parsed when using async highlighting
    * @return String of compiled HTML
    */
  def parse(src: String): String = js.native
  /**
    * Compiles markdown to HTML.
    *
    * @param src String of markdown source to be compiled
    * @param callback Function called when the markdownString has been fully parsed when using async highlighting
    * @return String of compiled HTML
    */
  def parse(
    src: String,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
  ): String = js.native
  def parse(src: String, options: MarkedOptions): String = js.native
  def parse(
    src: String,
    options: MarkedOptions,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
  ): String = js.native
  /**
    * @param src Tokenized source as array of tokens
    * @param options Hash of options
    */
  def parser(src: TokensList): String = js.native
  def parser(src: TokensList, options: MarkedOptions): String = js.native
  /**
    * Sets the default options.
    *
    * @param options Hash of options
    */
  def setOptions(options: MarkedOptions): Fn_Callback = js.native
}

