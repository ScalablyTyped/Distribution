package typings.makerDotJs.MakerJsNs.exporterNs

import typings.makerDotJs.MakerJsNs.IChain
import typings.makerDotJs.MakerJsNs.IModel
import typings.makerDotJs.MakerJsNs.IPath
import typings.makerDotJs.MakerJsNs.IPoint
import typings.pdfkit.PDFKitNs.PDFDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.exporter")
@js.native
object ^ extends js.Object {
  /**
    * Map of MakerJs unit system to SVG unit system
    */
  var svgUnit: svgUnitConversion = js.native
  /**
    * Convert a chain to SVG path data.
    */
  def chainToSVGPathData(chain: IChain, offset: IPoint): String = js.native
  /**
    * Convert a path to SVG path data.
    */
  def pathToSVGPathData(pathToExport: IPath, offset: IPoint, offset2: IPoint): String = js.native
  def toDXF(modelToExport: IModel): String = js.native
  def toDXF(modelToExport: IModel, options: IDXFRenderOptions): String = js.native
  def toDXF(pathToExport: IPath): String = js.native
  def toDXF(pathToExport: IPath, options: IDXFRenderOptions): String = js.native
  def toDXF(pathsToExport: js.Array[IPath]): String = js.native
  def toDXF(pathsToExport: js.Array[IPath], options: IDXFRenderOptions): String = js.native
  def toOpenJsCad(modelToExport: IModel): String = js.native
  def toOpenJsCad(modelToExport: IModel, options: IOpenJsCadOptions): String = js.native
  def toOpenJsCad(pathToExport: IPath): String = js.native
  def toOpenJsCad(pathToExport: IPath, options: IOpenJsCadOptions): String = js.native
  def toOpenJsCad(pathsToExport: js.Array[IPath]): String = js.native
  def toOpenJsCad(pathsToExport: js.Array[IPath], options: IOpenJsCadOptions): String = js.native
  /**
    * Injects drawing into a PDFKit document.
    *
    * @param modelToExport Model object to export.
    * @param options Export options object.
    * @returns String of PDF file contents.
    */
  def toPDF(doc: PDFDocument, modelToExport: IModel): Unit = js.native
  def toPDF(doc: PDFDocument, modelToExport: IModel, options: IPDFRenderOptions): Unit = js.native
  /**
    * Executes a JavaScript string with the OpenJsCad engine - converts 2D to 3D.
    *
    * @param modelToExport Model object to export.
    * @param options Export options object.
    * @param options.extrusion Height of 3D extrusion.
    * @param options.resolution Size of facets.
    * @returns String of STL format of 3D object.
    */
  def toSTL(modelToExport: IModel): String = js.native
  def toSTL(modelToExport: IModel, options: IOpenJsCadOptions): String = js.native
  def toSVG(modelToExport: IModel): String = js.native
  def toSVG(modelToExport: IModel, options: ISVGRenderOptions): String = js.native
  def toSVG(pathToExport: IPath): String = js.native
  def toSVG(pathToExport: IPath, options: ISVGRenderOptions): String = js.native
  def toSVG(pathsToExport: js.Array[IPath]): String = js.native
  def toSVG(pathsToExport: js.Array[IPath], options: ISVGRenderOptions): String = js.native
  /**
    * Convert a model to SVG path data.
    *
    * @param modelToExport Model to export.
    * @param byLayers Boolean flag (default true) to return a map of path data by layer.
    * @param origin Optional reference origin.
    * @returns String of SVG path data (if byLayers is false) or an object map of path data by layer .
    */
  def toSVGPathData(modelToExport: IModel): IPathDataByLayerMap | String = js.native
  def toSVGPathData(modelToExport: IModel, byLayers: Boolean): IPathDataByLayerMap | String = js.native
  def toSVGPathData(modelToExport: IModel, byLayers: Boolean, origin: IPoint): IPathDataByLayerMap | String = js.native
  /**
    * Try to get the unit system from a model
    * @private
    */
  def tryGetModelUnits(itemToExport: js.Any): String = js.native
}

