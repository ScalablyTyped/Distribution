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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exporter {
  
  @JSGlobal("MakerJs.exporter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Class to traverse an item 's models or paths and ultimately render each path.
    * @private
    */
  @JSGlobal("MakerJs.exporter.Exporter")
  @js.native
  class Exporter protected ()
    extends StObject
       with typings.makerJs.MakerJs.exporter.Exporter {
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
      fixPoint: Unit,
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
      fixPath: Unit,
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: Unit,
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath],
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: Unit,
      fixPath: Unit,
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath],
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit],
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath],
      beginModel: Unit,
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: Unit,
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit],
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: js.Function1[/* pointToFix */ IPoint, IPoint],
      fixPath: Unit,
      beginModel: Unit,
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: Unit,
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath],
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit],
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: Unit,
      fixPath: js.Function2[/* pathToFix */ IPath, /* origin */ IPoint, IPath],
      beginModel: Unit,
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: Unit,
      fixPath: Unit,
      beginModel: js.Function2[/* id */ String, /* modelContext */ IModel, Unit],
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    def this(
      map: IPathOriginFunctionMap,
      fixPoint: Unit,
      fixPath: Unit,
      beginModel: Unit,
      endModel: js.Function1[/* modelContext */ IModel, Unit]
    ) = this()
    
    /* CompleteClass */
    var beginModel: js.Any = js.native
    
    /* CompleteClass */
    var endModel: js.Any = js.native
    
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
    
    /* CompleteClass */
    var fixPath: js.Any = js.native
    
    /* CompleteClass */
    var fixPoint: js.Any = js.native
    
    /* CompleteClass */
    var map: js.Any = js.native
  }
  
  /**
    * Class for an XML tag.
    * @private
    */
  @JSGlobal("MakerJs.exporter.XmlTag")
  @js.native
  class XmlTag protected ()
    extends StObject
       with typings.makerJs.MakerJs.exporter.XmlTag {
    /**
      * @param name Name of the XML tag.
      * @param attrs Optional attributes for the tag.
      */
    def this(name: String) = this()
    def this(name: String, attrs: IXmlTagAttrs) = this()
    
    /* CompleteClass */
    var attrs: IXmlTagAttrs = js.native
    
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
    
    /**
      * Text between the opening and closing tags.
      */
    /* CompleteClass */
    var innerText: String = js.native
    
    /**
      * Boolean to indicate that the innerText has been escaped.
      */
    /* CompleteClass */
    var innerTextEscaped: Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  object XmlTag {
    
    @JSGlobal("MakerJs.exporter.XmlTag")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Escapes certain characters within a string so that it can appear in a tag or its attribute.
      *
      * @returns Escaped string.
      */
    /* static member */
    @scala.inline
    def escapeString(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /**
    * Convert a chain to SVG path data.
    */
  @scala.inline
  def chainToSVGPathData(chain: IChain, offset: IPoint): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chainToSVGPathData")(chain.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Convert a path to SVG path data.
    */
  @scala.inline
  def pathToSVGPathData(pathToExport: IPath, offset: IPoint, offset2: IPoint): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToSVGPathData")(pathToExport.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], offset2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Map of MakerJs unit system to SVG unit system
    */
  @JSGlobal("MakerJs.exporter.svgUnit")
  @js.native
  def svgUnit: svgUnitConversion = js.native
  @scala.inline
  def svgUnit_=(x: svgUnitConversion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svgUnit")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def toDXF(modelToExport: IModel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDXF")(modelToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toDXF(modelToExport: IModel, options: IDXFRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDXF")(modelToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toDXF(pathToExport: IPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDXF")(pathToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toDXF(pathToExport: IPath, options: IDXFRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDXF")(pathToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toDXF(pathsToExport: js.Array[IPath]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDXF")(pathsToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toDXF(pathsToExport: js.Array[IPath], options: IDXFRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDXF")(pathsToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toOpenJsCad(modelToExport: IModel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toOpenJsCad")(modelToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toOpenJsCad(modelToExport: IModel, options: IOpenJsCadOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toOpenJsCad")(modelToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toOpenJsCad(pathToExport: IPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toOpenJsCad")(pathToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toOpenJsCad(pathToExport: IPath, options: IOpenJsCadOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toOpenJsCad")(pathToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toOpenJsCad(pathsToExport: js.Array[IPath]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toOpenJsCad")(pathsToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toOpenJsCad(pathsToExport: js.Array[IPath], options: IOpenJsCadOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toOpenJsCad")(pathsToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Injects drawing into a PDFKit document.
    *
    * @param modelToExport Model object to export.
    * @param options Export options object.
    * @returns String of PDF file contents.
    */
  @scala.inline
  def toPDF(doc: PDFDocument, modelToExport: IModel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toPDF")(doc.asInstanceOf[js.Any], modelToExport.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def toPDF(doc: PDFDocument, modelToExport: IModel, options: IPDFRenderOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toPDF")(doc.asInstanceOf[js.Any], modelToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Executes a JavaScript string with the OpenJsCad engine - converts 2D to 3D.
    *
    * @param modelToExport Model object to export.
    * @param options Export options object.
    * @param options.extrusion Height of 3D extrusion.
    * @param options.resolution Size of facets.
    * @returns String of STL format of 3D object.
    */
  @scala.inline
  def toSTL(modelToExport: IModel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSTL")(modelToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toSTL(modelToExport: IModel, options: IOpenJsCadOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSTL")(modelToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toSVG(modelToExport: IModel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(modelToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toSVG(modelToExport: IModel, options: ISVGRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(modelToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toSVG(pathToExport: IPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(pathToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toSVG(pathToExport: IPath, options: ISVGRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(pathToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toSVG(pathsToExport: js.Array[IPath]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(pathsToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toSVG(pathsToExport: js.Array[IPath], options: ISVGRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(pathsToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Convert a model to SVG path data.
    *
    * @param modelToExport Model to export.
    * @param byLayers Boolean flag (default true) to return a map of path data by layer.
    * @param origin Optional reference origin.
    * @returns String of SVG path data (if byLayers is false) or an object map of path data by layer .
    */
  @scala.inline
  def toSVGPathData(modelToExport: IModel): IPathDataByLayerMap | String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSVGPathData")(modelToExport.asInstanceOf[js.Any]).asInstanceOf[IPathDataByLayerMap | String]
  @scala.inline
  def toSVGPathData(modelToExport: IModel, byLayers: Boolean): IPathDataByLayerMap | String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVGPathData")(modelToExport.asInstanceOf[js.Any], byLayers.asInstanceOf[js.Any])).asInstanceOf[IPathDataByLayerMap | String]
  @scala.inline
  def toSVGPathData(modelToExport: IModel, byLayers: Boolean, origin: IPoint): IPathDataByLayerMap | String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVGPathData")(modelToExport.asInstanceOf[js.Any], byLayers.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[IPathDataByLayerMap | String]
  @scala.inline
  def toSVGPathData(modelToExport: IModel, byLayers: Unit, origin: IPoint): IPathDataByLayerMap | String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVGPathData")(modelToExport.asInstanceOf[js.Any], byLayers.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[IPathDataByLayerMap | String]
  
  /**
    * Try to get the unit system from a model
    * @private
    */
  @scala.inline
  def tryGetModelUnits(itemToExport: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tryGetModelUnits")(itemToExport.asInstanceOf[js.Any]).asInstanceOf[String]
}
