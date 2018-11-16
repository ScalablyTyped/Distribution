package typings
package markedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Parser extends js.Object {
  var Lexer: ScalablyTyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ markedLib.markedMod.markedNs.MarkedOptions], 
    markedLib.markedMod.markedNs.Lexer
  ] = js.native
  var Renderer: ScalablyTyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ markedLib.markedMod.markedNs.MarkedOptions], 
    markedLib.markedMod.markedNs.Renderer
  ] = js.native
  /**
       * @param src String of markdown source to be compiled
       * @param options Hash of options
       */
  def lexer(src: java.lang.String): markedLib.markedMod.markedNs.TokensList = js.native
  /**
       * @param src String of markdown source to be compiled
       * @param options Hash of options
       */
  def lexer(src: java.lang.String, options: markedLib.markedMod.markedNs.MarkedOptions): markedLib.markedMod.markedNs.TokensList = js.native
  /**
       * Compiles markdown to HTML.
       *
       * @param src String of markdown source to be compiled
       * @param options Hash of options
       * @param callback Function called when the markdownString has been fully parsed when using async highlighting
       * @return String of compiled HTML
       */
  def parse(src: java.lang.String): java.lang.String = js.native
  /**
       * Compiles markdown to HTML.
       *
       * @param src String of markdown source to be compiled
       * @param callback Function called when the markdownString has been fully parsed when using async highlighting
       * @return String of compiled HTML
       */
  def parse(
    src: java.lang.String,
    callback: js.Function2[/* error */ js.UndefOr[_], /* parseResult */ java.lang.String, scala.Unit]
  ): java.lang.String = js.native
  /**
       * Compiles markdown to HTML.
       *
       * @param src String of markdown source to be compiled
       * @param options Hash of options
       * @param callback Function called when the markdownString has been fully parsed when using async highlighting
       * @return String of compiled HTML
       */
  def parse(src: java.lang.String, options: markedLib.markedMod.markedNs.MarkedOptions): java.lang.String = js.native
  /**
       * Compiles markdown to HTML.
       *
       * @param src String of markdown source to be compiled
       * @param options Hash of options
       * @param callback Function called when the markdownString has been fully parsed when using async highlighting
       * @return String of compiled HTML
       */
  def parse(
    src: java.lang.String,
    options: markedLib.markedMod.markedNs.MarkedOptions,
    callback: js.Function2[/* error */ js.UndefOr[_], /* parseResult */ java.lang.String, scala.Unit]
  ): java.lang.String = js.native
  /**
       * @param src Tokenized source as array of tokens
       * @param options Hash of options
       */
  def parser(src: markedLib.markedMod.markedNs.TokensList): java.lang.String = js.native
  /**
       * @param src Tokenized source as array of tokens
       * @param options Hash of options
       */
  def parser(src: markedLib.markedMod.markedNs.TokensList, options: markedLib.markedMod.markedNs.MarkedOptions): java.lang.String = js.native
  /**
       * Sets the default options.
       *
       * @param options Hash of options
       */
  def setOptions(options: markedLib.markedMod.markedNs.MarkedOptions): /* import warning: Failed type conversion: TsTypeQuery(TsQIdent(List(TsIdentLibrarySimple(marked), TsIdentModule(None,List(marked)), TsIdentNamespace(marked)))) */js.Any = js.native
}

