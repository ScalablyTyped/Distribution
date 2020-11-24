package typings.marked.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.marked.mod.MarkedOptions
import typings.marked.mod.Token
import typings.marked.mod.TokensList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmarked extends js.Object {
  
  /**
    * Compiles markdown to HTML synchronously.
    *
    * @param src String of markdown source to be compiled
    * @param options Optional hash of options
    * @return String of compiled HTML
    */
  def apply(src: String): String = js.native
  /**
    * Compiles markdown to HTML asynchronously.
    *
    * @param src String of markdown source to be compiled
    * @param callback Function called when the markdownString has been fully parsed when using async highlighting
    */
  def apply(
    src: String,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
  ): Unit = js.native
  def apply(src: String, options: MarkedOptions): String = js.native
  /**
    * Compiles markdown to HTML asynchronously.
    *
    * @param src String of markdown source to be compiled
    * @param options Hash of options
    * @param callback Function called when the markdownString has been fully parsed when using async highlighting
    */
  def apply(
    src: String,
    options: MarkedOptions,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
  ): Unit = js.native
  
  var InlineLexer: TypeofInlineLexer = js.native
  
  var Lexer: TypeofLexer = js.native
  
  var Parser: TypeofParser = js.native
  
  var Renderer: Instantiable1[/* options */ js.UndefOr[MarkedOptions], typings.marked.mod.Renderer] = js.native
  
  var Slugger: Instantiable0[typings.marked.mod.Slugger] = js.native
  
  var TextRenderer: Instantiable0[typings.marked.mod.TextRenderer] = js.native
  
  var Tokenizer: Instantiable1[/* options */ js.UndefOr[MarkedOptions], typings.marked.mod.Tokenizer] = js.native
  
  val Tokens: js.Any = js.native
  
  val defaults: MarkedOptions = js.native
  
  /**
    * Gets the original marked default options.
    */
  def getDefaults(): MarkedOptions = js.native
  
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
    * Sets the default options.
    *
    * @param options Hash of options
    */
  def options(options: MarkedOptions): /* import warning: importer.ImportType#apply Failed type conversion: typeof marked */ js.Any = js.native
  
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
  def parse(
    src: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
  ): String = js.native
  def parse(src: String, options: MarkedOptions): String = js.native
  def parse(
    src: String,
    options: MarkedOptions,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
  ): String = js.native
  
  /**
    * Compiles markdown to HTML without enclosing `p` tag.
    *
    * @param src String of markdown source to be compiled
    * @param options Hash of options
    * @return String of compiled HTML
    */
  def parseInline(src: String): String = js.native
  def parseInline(src: String, options: MarkedOptions): String = js.native
  
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
  def setOptions(options: MarkedOptions): /* import warning: importer.ImportType#apply Failed type conversion: typeof marked */ js.Any = js.native
  
  /**
    * Use Extension
    * @param Renderer
    */
  def use(options: MarkedOptions): Unit = js.native
  
  def walkTokens(tokens: TokensList, callback: js.Function1[/* token */ Token, Unit]): /* import warning: importer.ImportType#apply Failed type conversion: typeof marked */ js.Any = js.native
}
