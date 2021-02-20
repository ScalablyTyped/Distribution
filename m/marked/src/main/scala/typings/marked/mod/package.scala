package typings.marked

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Compiles markdown to HTML synchronously.
    *
    * @param src String of markdown source to be compiled
    * @param options Optional hash of options
    * @return String of compiled HTML
    */
  @scala.inline
  def apply(src: java.lang.String): java.lang.String = typings.marked.mod.^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  /**
    * Compiles markdown to HTML asynchronously.
    *
    * @param src String of markdown source to be compiled
    * @param callback Function called when the markdownString has been fully parsed when using async highlighting
    */
  @scala.inline
  def apply(
    src: java.lang.String,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ java.lang.String, scala.Unit]
  ): scala.Unit = (typings.marked.mod.^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def apply(src: java.lang.String, options: typings.marked.mod.MarkedOptions): java.lang.String = (typings.marked.mod.^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  /**
    * Compiles markdown to HTML asynchronously.
    *
    * @param src String of markdown source to be compiled
    * @param options Hash of options
    * @param callback Function called when the markdownString has been fully parsed when using async highlighting
    */
  @scala.inline
  def apply(
    src: java.lang.String,
    options: typings.marked.mod.MarkedOptions,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ java.lang.String, scala.Unit]
  ): scala.Unit = (typings.marked.mod.^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def defaults: typings.marked.mod.MarkedOptions = typings.marked.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaults").asInstanceOf[typings.marked.mod.MarkedOptions]
  
  /**
    * Gets the original marked default options.
    */
  @scala.inline
  def getDefaults(): typings.marked.mod.MarkedOptions = typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDefaults")().asInstanceOf[typings.marked.mod.MarkedOptions]
  
  /**
    * @param src String of markdown source to be compiled
    * @param links Array of links
    * @param options Hash of options
    * @return String of compiled HTML
    */
  @scala.inline
  def inlineLexer(src: java.lang.String, links: js.Array[java.lang.String]): java.lang.String = (typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inlineLexer")(src.asInstanceOf[js.Any], links.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def inlineLexer(
    src: java.lang.String,
    links: js.Array[java.lang.String],
    options: typings.marked.mod.MarkedOptions
  ): java.lang.String = (typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inlineLexer")(src.asInstanceOf[js.Any], links.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /**
    * @param src String of markdown source to be compiled
    * @param options Hash of options
    */
  @scala.inline
  def lexer(src: java.lang.String): typings.marked.mod.TokensList = typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lexer")(src.asInstanceOf[js.Any]).asInstanceOf[typings.marked.mod.TokensList]
  @scala.inline
  def lexer(src: java.lang.String, options: typings.marked.mod.MarkedOptions): typings.marked.mod.TokensList = (typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lexer")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.marked.mod.TokensList]
  
  /**
    * Sets the default options.
    *
    * @param options Hash of options
    */
  @scala.inline
  def options(options: typings.marked.mod.MarkedOptions): typings.marked.anon.Typeofmarked = typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("options")(options.asInstanceOf[js.Any]).asInstanceOf[typings.marked.anon.Typeofmarked]
  
  /**
    * Compiles markdown to HTML.
    *
    * @param src String of markdown source to be compiled
    * @param options Hash of options
    * @param callback Function called when the markdownString has been fully parsed when using async highlighting
    * @return String of compiled HTML
    */
  @scala.inline
  def parse(src: java.lang.String): java.lang.String = typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  /**
    * Compiles markdown to HTML.
    *
    * @param src String of markdown source to be compiled
    * @param callback Function called when the markdownString has been fully parsed when using async highlighting
    * @return String of compiled HTML
    */
  @scala.inline
  def parse(
    src: java.lang.String,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ java.lang.String, scala.Unit]
  ): java.lang.String = (typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def parse(
    src: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ java.lang.String, scala.Unit]
  ): java.lang.String = (typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def parse(src: java.lang.String, options: typings.marked.mod.MarkedOptions): java.lang.String = (typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def parse(
    src: java.lang.String,
    options: typings.marked.mod.MarkedOptions,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ java.lang.String, scala.Unit]
  ): java.lang.String = (typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /**
    * Compiles markdown to HTML without enclosing `p` tag.
    *
    * @param src String of markdown source to be compiled
    * @param options Hash of options
    * @return String of compiled HTML
    */
  @scala.inline
  def parseInline(src: java.lang.String): java.lang.String = typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseInline")(src.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def parseInline(src: java.lang.String, options: typings.marked.mod.MarkedOptions): java.lang.String = (typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseInline")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /**
    * @param src Tokenized source as array of tokens
    * @param options Hash of options
    */
  @scala.inline
  def parser(src: typings.marked.mod.TokensList): java.lang.String = typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parser")(src.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def parser(src: typings.marked.mod.TokensList, options: typings.marked.mod.MarkedOptions): java.lang.String = (typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parser")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /**
    * Sets the default options.
    *
    * @param options Hash of options
    */
  @scala.inline
  def setOptions(options: typings.marked.mod.MarkedOptions): typings.marked.anon.Typeofmarked = typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[typings.marked.anon.Typeofmarked]
  
  /**
    * Use Extension
    * @param Renderer
    */
  @scala.inline
  def use(options: typings.marked.mod.MarkedOptions): scala.Unit = typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("use")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def walkTokens(
    tokens: typings.marked.mod.TokensList,
    callback: js.Function1[/* token */ typings.marked.mod.Token, scala.Unit]
  ): typings.marked.anon.Typeofmarked = (typings.marked.mod.^.asInstanceOf[js.Dynamic].applyDynamic("walkTokens")(tokens.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.marked.anon.Typeofmarked]
}
