package typings.kramed.mod

import typings.kramed.AnonInstantiable
import typings.kramed.AnonInstantiableKramedParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KramedStatic extends js.Object {
  var Parser: AnonInstantiableKramedParser = js.native
  var Renderer: AnonInstantiable = js.native
  /**
    * Compiles kramdown to HTML.
    *
    * @param src String of kramdown source to be compiled
    * @param options Hash of options
    * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
    * @return String of compiled HTML
    */
  def apply(src: String): String = js.native
  /**
    * Compiles kramdown to HTML.
    *
    * @param src String of kramdown source to be compiled
    * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
    * @return String of compiled HTML
    */
  def apply(src: String, callback: js.Function0[Unit]): String = js.native
  def apply(src: String, options: KramedOptions): String = js.native
  def apply(src: String, options: KramedOptions, callback: js.Function0[Unit]): String = js.native
  /**
    * @param src String of kramdown source to be compiled
    * @param options Hash of options
    */
  def lexer(src: String): js.Array[_] = js.native
  def lexer(src: String, options: KramedOptions): js.Array[_] = js.native
  /**
    * Compiles kramdown to HTML.
    *
    * @param src String of kramdown source to be compiled
    * @param options Hash of options
    * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
    * @return String of compiled HTML
    */
  def parse(src: String): String = js.native
  /**
    * Compiles kramdown to HTML.
    *
    * @param src String of kramdown source to be compiled
    * @param callback Function called when the kramdownString has been fully parsed when using async highlighting
    * @return String of compiled HTML
    */
  def parse(src: String, callback: js.Function0[Unit]): String = js.native
  def parse(src: String, options: KramedOptions): String = js.native
  def parse(src: String, options: KramedOptions, callback: js.Function0[Unit]): String = js.native
  /**
    * @param options Hash of options
    */
  def parser(src: js.Array[_]): String = js.native
  def parser(src: js.Array[_], options: KramedOptions): String = js.native
  /**
    * Sets the default options.
    *
    * @param options Hash of options
    */
  def setOptions(options: KramedOptions): KramedStatic = js.native
}

