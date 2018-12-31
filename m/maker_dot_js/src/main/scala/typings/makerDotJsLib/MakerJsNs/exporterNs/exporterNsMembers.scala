package typings
package makerDotJsLib.MakerJsNs.exporterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.exporter")
@js.native
object exporterNsMembers extends js.Object {
  /**
    * Map of MakerJs unit system to SVG unit system
    */
  var svgUnit: svgUnitConversion = js.native
  /**
    * Convert a chain to SVG path data.
    */
  def chainToSVGPathData(chain: makerDotJsLib.MakerJsNs.IChain, offset: makerDotJsLib.MakerJsNs.IPoint): java.lang.String = js.native
  /**
    * Convert a path to SVG path data.
    */
  def pathToSVGPathData(
    pathToExport: makerDotJsLib.MakerJsNs.IPath,
    offset: makerDotJsLib.MakerJsNs.IPoint,
    offset2: makerDotJsLib.MakerJsNs.IPoint
  ): java.lang.String = js.native
  def toDXF(modelToExport: makerDotJsLib.MakerJsNs.IModel): java.lang.String = js.native
  def toDXF(modelToExport: makerDotJsLib.MakerJsNs.IModel, options: IDXFRenderOptions): java.lang.String = js.native
  def toDXF(pathToExport: makerDotJsLib.MakerJsNs.IPath): java.lang.String = js.native
  def toDXF(pathToExport: makerDotJsLib.MakerJsNs.IPath, options: IDXFRenderOptions): java.lang.String = js.native
  def toDXF(pathsToExport: js.Array[makerDotJsLib.MakerJsNs.IPath]): java.lang.String = js.native
  def toDXF(pathsToExport: js.Array[makerDotJsLib.MakerJsNs.IPath], options: IDXFRenderOptions): java.lang.String = js.native
  def toOpenJsCad(modelToExport: makerDotJsLib.MakerJsNs.IModel): java.lang.String = js.native
  def toOpenJsCad(modelToExport: makerDotJsLib.MakerJsNs.IModel, options: IOpenJsCadOptions): java.lang.String = js.native
  def toOpenJsCad(pathToExport: makerDotJsLib.MakerJsNs.IPath): java.lang.String = js.native
  def toOpenJsCad(pathToExport: makerDotJsLib.MakerJsNs.IPath, options: IOpenJsCadOptions): java.lang.String = js.native
  def toOpenJsCad(pathsToExport: js.Array[makerDotJsLib.MakerJsNs.IPath]): java.lang.String = js.native
  def toOpenJsCad(pathsToExport: js.Array[makerDotJsLib.MakerJsNs.IPath], options: IOpenJsCadOptions): java.lang.String = js.native
  /**
    * Injects drawing into a PDFKit document.
    *
    * @param modelToExport Model object to export.
    * @param options Export options object.
    * @returns String of PDF file contents.
    */
  def toPDF(doc: pdfkitLib.PDFKitNs.PDFDocument, modelToExport: makerDotJsLib.MakerJsNs.IModel): scala.Unit = js.native
  def toPDF(
    doc: pdfkitLib.PDFKitNs.PDFDocument,
    modelToExport: makerDotJsLib.MakerJsNs.IModel,
    options: IPDFRenderOptions
  ): scala.Unit = js.native
  /**
    * Executes a JavaScript string with the OpenJsCad engine - converts 2D to 3D.
    *
    * @param modelToExport Model object to export.
    * @param options Export options object.
    * @param options.extrusion Height of 3D extrusion.
    * @param options.resolution Size of facets.
    * @returns String of STL format of 3D object.
    */
  def toSTL(modelToExport: makerDotJsLib.MakerJsNs.IModel): java.lang.String = js.native
  def toSTL(modelToExport: makerDotJsLib.MakerJsNs.IModel, options: IOpenJsCadOptions): java.lang.String = js.native
  def toSVG(modelToExport: makerDotJsLib.MakerJsNs.IModel): java.lang.String = js.native
  def toSVG(modelToExport: makerDotJsLib.MakerJsNs.IModel, options: ISVGRenderOptions): java.lang.String = js.native
  def toSVG(pathToExport: makerDotJsLib.MakerJsNs.IPath): java.lang.String = js.native
  def toSVG(pathToExport: makerDotJsLib.MakerJsNs.IPath, options: ISVGRenderOptions): java.lang.String = js.native
  def toSVG(pathsToExport: js.Array[makerDotJsLib.MakerJsNs.IPath]): java.lang.String = js.native
  def toSVG(pathsToExport: js.Array[makerDotJsLib.MakerJsNs.IPath], options: ISVGRenderOptions): java.lang.String = js.native
  /**
    * Convert a model to SVG path data.
    *
    * @param modelToExport Model to export.
    * @param byLayers Boolean flag (default true) to return a map of path data by layer.
    * @param origin Optional reference origin.
    * @returns String of SVG path data (if byLayers is false) or an object map of path data by layer .
    */
  def toSVGPathData(modelToExport: makerDotJsLib.MakerJsNs.IModel): IPathDataByLayerMap | java.lang.String = js.native
  def toSVGPathData(modelToExport: makerDotJsLib.MakerJsNs.IModel, byLayers: scala.Boolean): IPathDataByLayerMap | java.lang.String = js.native
  def toSVGPathData(
    modelToExport: makerDotJsLib.MakerJsNs.IModel,
    byLayers: scala.Boolean,
    origin: makerDotJsLib.MakerJsNs.IPoint
  ): IPathDataByLayerMap | java.lang.String = js.native
  /**
    * Try to get the unit system from a model
    * @private
    */
  def tryGetModelUnits(itemToExport: js.Any): java.lang.String = js.native
}

