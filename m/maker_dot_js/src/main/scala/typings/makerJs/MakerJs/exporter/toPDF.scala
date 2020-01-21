package typings.makerJs.MakerJs.exporter

import typings.makerJs.MakerJs.IModel
import typings.pdfkit.PDFKit.PDFDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.exporter.toPDF")
@js.native
object toPDF extends js.Object {
  /**
    * Injects drawing into a PDFKit document.
    *
    * @param modelToExport Model object to export.
    * @param options Export options object.
    * @returns String of PDF file contents.
    */
  def apply(doc: PDFDocument, modelToExport: IModel): Unit = js.native
  def apply(doc: PDFDocument, modelToExport: IModel, options: IPDFRenderOptions): Unit = js.native
}

