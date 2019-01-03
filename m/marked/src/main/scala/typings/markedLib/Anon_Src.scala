package typings
package markedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Src extends js.Object {
  var Lexer: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ markedLib.markedMod.markedNs.MarkedOptions], 
    markedLib.markedMod.markedNs.Lexer
  ] = js.native
  var Renderer: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ markedLib.markedMod.markedNs.MarkedOptions], 
    markedLib.markedMod.markedNs.Renderer
  ] = js.native
  var Slugger: org.scalablytyped.runtime.Instantiable0[markedLib.markedMod.markedNs.Slugger] = js.native
  def apply(src: java.lang.String): java.lang.String = js.native
  def apply(
    src: java.lang.String,
    callback: js.Function2[/* error */ js.UndefOr[_], /* parseResult */ java.lang.String, scala.Unit]
  ): java.lang.String = js.native
  def apply(src: java.lang.String, options: markedLib.markedMod.markedNs.MarkedOptions): java.lang.String = js.native
  def apply(
    src: java.lang.String,
    options: markedLib.markedMod.markedNs.MarkedOptions,
    callback: js.Function2[/* error */ js.UndefOr[_], /* parseResult */ java.lang.String, scala.Unit]
  ): java.lang.String = js.native
  /**
    * @param src String of markdown source to be compiled
    * @param links Array of links
    * @param options Hash of options
    * @return String of compiled HTML
    */
  def inlineLexer(src: java.lang.String, links: js.Array[java.lang.String]): java.lang.String = js.native
  def inlineLexer(
    src: java.lang.String,
    links: js.Array[java.lang.String],
    options: markedLib.markedMod.markedNs.MarkedOptions
  ): java.lang.String = js.native
  /**
    * @param src String of markdown source to be compiled
    * @param options Hash of options
    */
  def lexer(src: java.lang.String): markedLib.markedMod.markedNs.TokensList = js.native
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
  def parse(src: java.lang.String, options: markedLib.markedMod.markedNs.MarkedOptions): java.lang.String = js.native
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
  def parser(src: markedLib.markedMod.markedNs.TokensList, options: markedLib.markedMod.markedNs.MarkedOptions): java.lang.String = js.native
  /**
    * Sets the default options.
    *
    * @param options Hash of options
    */
  def setOptions(options: markedLib.markedMod.markedNs.MarkedOptions): /* import warning: ImportType.apply Failed type conversion: typeof marked.marked.marked */ js.Any = js.native
}

