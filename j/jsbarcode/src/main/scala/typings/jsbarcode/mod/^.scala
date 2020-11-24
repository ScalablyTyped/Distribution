package typings.jsbarcode.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsbarcode", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * The Browser version of the library's functionality, which makes use of an HTMLCanvasElement, HTMLImageElement or SVGElement
    * for rendering.
    * @param svg ID string or HTML element of the target to render within.
    * @param barcodeText Text to be rendered.
    * @param barcodeOptions Options used for rendering.
    */
  def apply(svg: String, barcodeText: String): Unit = js.native
  def apply(svg: String, barcodeText: String, barcodeOptions: JsBarcodeOptions): Unit = js.native
  def apply(svg: HTMLCanvasElement, barcodeText: String): Unit = js.native
  def apply(svg: HTMLCanvasElement, barcodeText: String, barcodeOptions: JsBarcodeOptions): Unit = js.native
  def apply(svg: HTMLImageElement, barcodeText: String): Unit = js.native
  def apply(svg: HTMLImageElement, barcodeText: String, barcodeOptions: JsBarcodeOptions): Unit = js.native
  def apply(svg: SVGElement, barcodeText: String): Unit = js.native
  def apply(svg: SVGElement, barcodeText: String, barcodeOptions: JsBarcodeOptions): Unit = js.native
}
