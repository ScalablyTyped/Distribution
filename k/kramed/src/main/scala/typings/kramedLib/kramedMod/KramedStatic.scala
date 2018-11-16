package typings
package kramedLib.kramedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KramedStatic extends js.Object {
  var Parser: kramedLib.Anon_Options = js.native
  var Renderer: kramedLib.Anon_KramedRenderer = js.native
  /**
       * Compiles kramdown to HTML.
       *
       * @param src String of kramdown source to be compiled
       * @param options Hash of options
       * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
       * @return String of compiled HTML
       */
  def apply(src: java.lang.String): java.lang.String = js.native
  /**
       * Compiles kramdown to HTML.
       *
       * @param src String of kramdown source to be compiled
       * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
       * @return String of compiled HTML
       */
  def apply(src: java.lang.String, callback: js.Function0[scala.Unit]): java.lang.String = js.native
  /**
       * Compiles kramdown to HTML.
       *
       * @param src String of kramdown source to be compiled
       * @param options Hash of options
       * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
       * @return String of compiled HTML
       */
  def apply(src: java.lang.String, options: KramedOptions): java.lang.String = js.native
  /**
       * Compiles kramdown to HTML.
       *
       * @param src String of kramdown source to be compiled
       * @param options Hash of options
       * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
       * @return String of compiled HTML
       */
  def apply(src: java.lang.String, options: KramedOptions, callback: js.Function0[scala.Unit]): java.lang.String = js.native
  /**
       * @param src String of kramdown source to be compiled
       * @param options Hash of options
       */
  def lexer(src: java.lang.String): js.Array[_] = js.native
  /**
       * @param src String of kramdown source to be compiled
       * @param options Hash of options
       */
  def lexer(src: java.lang.String, options: KramedOptions): js.Array[_] = js.native
  /**
       * Compiles kramdown to HTML.
       *
       * @param src String of kramdown source to be compiled
       * @param options Hash of options
       * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
       * @return String of compiled HTML
       */
  def parse(src: java.lang.String): java.lang.String = js.native
  /**
       * Compiles kramdown to HTML.
       *
       * @param src String of kramdown source to be compiled
       * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
       * @return String of compiled HTML
       */
  def parse(src: java.lang.String, callback: js.Function0[scala.Unit]): java.lang.String = js.native
  /**
       * Compiles kramdown to HTML.
       *
       * @param src String of kramdown source to be compiled
       * @param options Hash of options
       * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
       * @return String of compiled HTML
       */
  def parse(src: java.lang.String, options: KramedOptions): java.lang.String = js.native
  /**
       * Compiles kramdown to HTML.
       *
       * @param src String of kramdown source to be compiled
       * @param options Hash of options
       * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
       * @return String of compiled HTML
       */
  def parse(src: java.lang.String, options: KramedOptions, callback: js.Function0[scala.Unit]): java.lang.String = js.native
  /**
       * @param options Hash of options
       */
  def parser(src: js.Array[_]): java.lang.String = js.native
  /**
       * @param options Hash of options
       */
  def parser(src: js.Array[_], options: KramedOptions): java.lang.String = js.native
  /**
       * Sets the default options.
       *
       * @param options Hash of options
       */
  def setOptions(options: KramedOptions): KramedStatic = js.native
}

