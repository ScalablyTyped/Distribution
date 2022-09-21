package typings.marked.mod.marked

import typings.marked.anon.FnCall
import typings.marked.anon.MarkedOptionsasynctrue
import typings.marked.mod.marked.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(src: String): String = ^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any]).asInstanceOf[String]
inline def apply(src: String, callback: js.Function2[/* error */ Any, /* parseResult */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def apply(src: String, options: MarkedOptionsasynctrue): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def apply(src: String, options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def apply(
  src: String,
  options: MarkedOptions,
  callback: js.Function2[/* error */ Any, /* parseResult */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def defaults: MarkedOptions = ^.asInstanceOf[js.Dynamic].selectDynamic("defaults").asInstanceOf[MarkedOptions]

/**
  * Gets the original marked default options.
  */
inline def getDefaults(): MarkedOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaults")().asInstanceOf[MarkedOptions]

/**
  * @param src String of markdown source to be compiled
  * @param options Hash of options
  */
inline def lexer(src: String): TokensList = ^.asInstanceOf[js.Dynamic].applyDynamic("lexer")(src.asInstanceOf[js.Any]).asInstanceOf[TokensList]
inline def lexer(src: String, options: MarkedOptions): TokensList = (^.asInstanceOf[js.Dynamic].applyDynamic("lexer")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TokensList]

/**
  * Sets the default options.
  *
  * @param options Hash of options
  */
inline def options(options: MarkedOptions): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(options.asInstanceOf[js.Any]).asInstanceOf[FnCall]

/**
  * Compiles markdown to HTML synchronously.
  *
  * @param src String of markdown source to be compiled
  * @param options Optional hash of options
  * @return String of compiled HTML
  */
inline def parse(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[String]
/**
  * Compiles markdown to HTML.
  *
  * @param src String of markdown source to be compiled
  * @param callback Function called when the markdownString has been fully parsed when using async highlighting
  * @return String of compiled HTML
  */
inline def parse(src: String, callback: js.Function2[/* error */ Any, /* parseResult */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
/**
  * Compiles markdown to HTML asynchronously.
  *
  * @param src String of markdown source to be compiled
  * @param options Hash of options having async: true
  * @return Promise of string of compiled HTML
  */
inline def parse(src: String, options: MarkedOptionsasynctrue): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def parse(src: String, options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
/**
  * Compiles markdown to HTML synchronously.
  *
  * @param src String of markdown source to be compiled
  * @param options Optional hash of options
  * @param callback Function called when the markdownString has been fully parsed when using async highlighting
  * @return String of compiled HTML
  */
inline def parse(
  src: String,
  options: MarkedOptions,
  callback: js.Function2[/* error */ Any, /* parseResult */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Compiles markdown to HTML without enclosing `p` tag.
  *
  * @param src String of markdown source to be compiled
  * @param options Hash of options
  * @return String of compiled HTML
  */
inline def parseInline(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInline")(src.asInstanceOf[js.Any]).asInstanceOf[String]
inline def parseInline(src: String, options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseInline")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

/**
  * @param src Tokenized source as array of tokens
  * @param options Hash of options
  */
inline def parser(src: js.Array[Token]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parser")(src.asInstanceOf[js.Any]).asInstanceOf[String]
inline def parser(src: js.Array[Token], options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parser")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def parser(src: TokensList): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parser")(src.asInstanceOf[js.Any]).asInstanceOf[String]
inline def parser(src: TokensList, options: MarkedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parser")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

/**
  * Sets the default options.
  *
  * @param options Hash of options
  */
inline def setOptions(options: MarkedOptions): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[FnCall]

/**
  * Use Extension
  * @param MarkedExtension
  */
inline def use(extensions: MarkedExtension*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(extensions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]

inline def walkTokens(tokens: js.Array[Token], callback: js.Function1[/* token */ Token, Unit]): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("walkTokens")(tokens.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[FnCall]
inline def walkTokens(tokens: TokensList, callback: js.Function1[/* token */ Token, Unit]): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("walkTokens")(tokens.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[FnCall]
