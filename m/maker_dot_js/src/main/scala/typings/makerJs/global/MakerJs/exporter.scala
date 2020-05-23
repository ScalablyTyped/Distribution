package typings.makerJs.global.MakerJs

import typings.makerJs.MakerJs.IChain
import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPath
import typings.makerJs.MakerJs.IPathOriginFunctionMap
import typings.makerJs.MakerJs.IPoint
import typings.makerJs.MakerJs.exporter.IDXFRenderOptions
import typings.makerJs.MakerJs.exporter.IOpenJsCadOptions
import typings.makerJs.MakerJs.exporter.IPDFRenderOptions
import typings.makerJs.MakerJs.exporter.IPathDataByLayerMap
import typings.makerJs.MakerJs.exporter.ISVGRenderOptions
import typings.makerJs.MakerJs.exporter.IXmlTagAttrs
import typings.makerJs.MakerJs.exporter.svgUnitConversion
import typings.pdfkit.PDFKit.PDFDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.exporter")
@js.native
object exporter extends js.Object {
  /**
    * Class to traverse an item 's models or paths and ultimately render each path.
    * @private
    */
  @js.native
  class Exporter protected ()
    extends typings.makerJs.MakerJs.exporter.Exporter {
    /**
      * @param map Object containing properties: property name is the type of path, e.g. "line", "circle"; property value
      * is a function to render a path. Function parameters are path and point.
      * @param fixPoint Optional function to modify a point prior to export. Function parameter is a point; function must return a point.
      * @param fixPath Optional function to modify a path prior to output. Function parameters are path and offset point; function must return a path.
      */
    def this(map: IPathOriginFunctionMap) = this()
    def this(map: IPathOriginFunctionMap, fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint]) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath],
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath],
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit],
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    /* CompleteClass */
    override var beginModel: js.Any = js.native
    /* CompleteClass */
    override var endModel: js.Any = js.native
    /* CompleteClass */
    override var fixPath: js.Any = js.native
    /* CompleteClass */
    override var fixPoint: js.Any = js.native
    /* CompleteClass */
    override var map: js.Any = js.native
    /**
      * Export an object.
      *
      * @param item The object to export. May be a path, an array of paths, a model, or an array of models.
      * @param offset The offset position of the object.
      */
    /* CompleteClass */
    override def exportItem(itemId: String, itemToExport: js.Any, origin: IPoint): Unit = js.native
    /**
      * Export a model.
      *
      * @param modelToExport The model to export.
      * @param offset The offset position of the model.
      */
    /* CompleteClass */
    override def exportModel(modelId: String, modelToExport: IModel, offset: IPoint): Unit = js.native
    /**
      * Export a path.
      *
      * @param pathToExport The path to export.
      * @param offset The offset position of the path.
      */
    /* CompleteClass */
    override def exportPath(id: String, pathToExport: IPath, offset: IPoint, layer: String): Unit = js.native
  }
  
  /**
    * Class for an XML tag.
    * @private
    */
  @js.native
  class XmlTag protected ()
    extends typings.makerJs.MakerJs.exporter.XmlTag {
    /**
      * @param name Name of the XML tag.
      * @param attrs Optional attributes for the tag.
      */
    def this(name: String) = this()
    def this(name: String, attrs: IXmlTagAttrs) = this()
    /* CompleteClass */
    override var attrs: IXmlTagAttrs = js.native
    /**
      * Text between the opening and closing tags.
      */
    /* CompleteClass */
    override var innerText: String = js.native
    /**
      * Boolean to indicate that the innerText has been escaped.
      */
    /* CompleteClass */
    override var innerTextEscaped: Boolean = js.native
    /* CompleteClass */
    override var name: String = js.native
    /**
      * Get the closing tag.
      */
    /* CompleteClass */
    override def getClosingTag(): String = js.native
    /**
      * Get the inner text.
      */
    /* CompleteClass */
    override def getInnerText(): String = js.native
    /**
      * Get the opening tag.
      *
      * @param selfClose Flag to determine if opening tag should be self closing.
      */
    /* CompleteClass */
    override def getOpeningTag(selfClose: Boolean): String = js.native
  }
  
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
  /* static members */
  @js.native
  object XmlTag extends js.Object {
    /**
      * Escapes certain characters within a string so that it can appear in a tag or its attribute.
      *
      * @returns Escaped string.
      */
    def escapeString(value: String): String = js.native
  }
  
}

