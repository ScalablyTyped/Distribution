package typings.jspdf.mod

import typings.jspdf.anon.Filename
import typings.jspdf.anon.FnCall
import typings.jspdf.jspdfStrings.arraybuffer
import typings.jspdf.jspdfStrings.blob
import typings.jspdf.jspdfStrings.bloburi
import typings.jspdf.jspdfStrings.bloburl
import typings.jspdf.jspdfStrings.canvas
import typings.jspdf.jspdfStrings.container
import typings.jspdf.jspdfStrings.context2d
import typings.jspdf.jspdfStrings.datauri
import typings.jspdf.jspdfStrings.datauristring
import typings.jspdf.jspdfStrings.dataurl
import typings.jspdf.jspdfStrings.dataurlnewwindow
import typings.jspdf.jspdfStrings.dataurlstring
import typings.jspdf.jspdfStrings.img
import typings.jspdf.jspdfStrings.pdf
import typings.jspdf.jspdfStrings.pdfjsnewwindow
import typings.jspdf.jspdfStrings.pdfobjectnewwindow
import typings.jspdf.jspdfStrings.string
import typings.std.Blob
import typings.std.HTMLElement
import typings.std.Promise
import typings.std.URL
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLWorker
  extends StObject
     with Promise[Any] {
  
  def doCallback(): js.Promise[Unit] = js.native
  
  def error(msg: String): Unit = js.native
  
  def from(src: String, `type`: container | canvas | img | pdf | context2d): HTMLWorker = js.native
  def from(src: HTMLElement, `type`: container | canvas | img | pdf | context2d): HTMLWorker = js.native
  
  @JSName("get")
  def get_string(key: string): HTMLWorker = js.native
  @JSName("get")
  def get_string(key: string, cbk: js.Function1[/* value */ String, Unit]): String = js.native
  
  def outputImg(`type`: img | datauristring | dataurlstring | datauri | dataurl): js.Promise[String] = js.native
  
  def outputPdf(): String = js.native
  def outputPdf(`type`: datauristring | dataurlstring): String = js.native
  def outputPdf(`type`: datauristring | dataurlstring, options: Filename): String = js.native
  @JSName("outputPdf")
  def outputPdf_Boolean(`type`: dataurl | datauri): Boolean = js.native
  @JSName("outputPdf")
  def outputPdf_Boolean(`type`: dataurl | datauri, options: Filename): Boolean = js.native
  @JSName("outputPdf")
  var outputPdf_Original: FnCall = js.native
  @JSName("outputPdf")
  def outputPdf_URL(`type`: bloburi | bloburl): URL = js.native
  @JSName("outputPdf")
  def outputPdf_Window(`type`: pdfobjectnewwindow | pdfjsnewwindow | dataurlnewwindow): Window = js.native
  @JSName("outputPdf")
  def outputPdf_Window(`type`: pdfobjectnewwindow | pdfjsnewwindow | dataurlnewwindow, options: Filename): Window = js.native
  @JSName("outputPdf")
  def outputPdf_arraybuffer(`type`: arraybuffer): js.typedarray.ArrayBuffer = js.native
  @JSName("outputPdf")
  def outputPdf_blob(`type`: blob): Blob = js.native
  
  var progress: HTMLWorkerProgress = js.native
  
  def save(filename: String): js.Promise[Unit] = js.native
  
  def set(opt: HTMLOptions): HTMLWorker = js.native
}
