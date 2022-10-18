package typings.makerjs.global.MakerJs

import org.scalablytyped.runtime.StringDictionary
import typings.danmarshallJscadTypings.typesMod.CAG
import typings.danmarshallJscadTypings.typesMod.CSG
import typings.danmarshallJscadTypings.typesStlSerializerMod.StlSerializer
import typings.makerjs.MakerJs.IChain
import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IPath
import typings.makerjs.MakerJs.IPoint
import typings.makerjs.MakerJs.exporter.IDXFRenderOptions
import typings.makerjs.MakerJs.exporter.IJscadCagOptions
import typings.makerjs.MakerJs.exporter.IJscadCsgOptions
import typings.makerjs.MakerJs.exporter.IJscadScriptOptions
import typings.makerjs.MakerJs.exporter.IJsonExportOptions
import typings.makerjs.MakerJs.exporter.IPDFRenderOptions
import typings.makerjs.MakerJs.exporter.IPathDataByLayerMap
import typings.makerjs.MakerJs.exporter.ISVGPathDataRenderOptions
import typings.makerjs.MakerJs.exporter.ISVGRenderOptions
import typings.makerjs.MakerJs.exporter.IXmlTagAttrs
import typings.makerjs.MakerJs.exporter.svgUnitConversion
import typings.makerjs.anon.TypeofCAG
import typings.pdfkit.PDFKit.PDFDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exporter {
  
  @JSGlobal("MakerJs.exporter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Class for an XML tag.
    * @private
    */
  @JSGlobal("MakerJs.exporter.XmlTag")
  @js.native
  open class XmlTag protected ()
    extends StObject
       with typings.makerjs.MakerJs.exporter.XmlTag {
    /**
      * @param name Name of the XML tag.
      * @param attrs Optional attributes for the tag.
      */
    def this(name: String) = this()
    def this(name: String, attrs: IXmlTagAttrs) = this()
    
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
    inline def escapeString(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /**
    * Convert a chain to SVG path data.
    *
    * @param chain Chain to convert.
    * @param offset IPoint relative offset point.
    * @param accuracy Optional accuracy of SVG path data.
    * @returns String of SVG path data.
    */
  inline def chainToSVGPathData(chain: IChain, offset: IPoint): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chainToSVGPathData")(chain.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def chainToSVGPathData(chain: IChain, offset: IPoint, accuracy: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chainToSVGPathData")(chain.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Named colors, safe for CSS and DXF
    * 17 colors from https://www.w3.org/TR/CSS21/syndata.html#value-def-color mapped to DXF equivalent AutoDesk Color Index
    */
  object colors {
    
    @JSGlobal("MakerJs.exporter.colors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("MakerJs.exporter.colors.aqua")
    @js.native
    def aqua: Double = js.native
    inline def aqua_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aqua")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.black")
    @js.native
    def black: Double = js.native
    inline def black_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("black")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.blue")
    @js.native
    def blue: Double = js.native
    inline def blue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.fuchsia")
    @js.native
    def fuchsia: Double = js.native
    inline def fuchsia_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fuchsia")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.gray")
    @js.native
    def gray: Double = js.native
    inline def gray_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.green")
    @js.native
    def green: Double = js.native
    inline def green_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.lime")
    @js.native
    def lime: Double = js.native
    inline def lime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lime")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.maroon")
    @js.native
    def maroon: Double = js.native
    inline def maroon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maroon")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.navy")
    @js.native
    def navy: Double = js.native
    inline def navy_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navy")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.olive")
    @js.native
    def olive: Double = js.native
    inline def olive_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("olive")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.orange")
    @js.native
    def orange: Double = js.native
    inline def orange_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orange")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.purple")
    @js.native
    def purple: Double = js.native
    inline def purple_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.red")
    @js.native
    def red: Double = js.native
    inline def red_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.silver")
    @js.native
    def silver: Double = js.native
    inline def silver_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("silver")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.teal")
    @js.native
    def teal: Double = js.native
    inline def teal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("teal")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.white")
    @js.native
    def white: Double = js.native
    inline def white_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("white")(x.asInstanceOf[js.Any])
    
    @JSGlobal("MakerJs.exporter.colors.yellow")
    @js.native
    def yellow: Double = js.native
    inline def yellow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Export a path to SVG path data.
    *
    * @param pathToExport IPath to export.
    * @param pathOffset IPoint relative offset of the path object.
    * @param exportOffset IPoint relative offset point of the export.
    * @param accuracy Optional accuracy of SVG path data.
    * @param clockwiseCircle Optional flag to use clockwise winding for circles.
    * @returns String of SVG path data.
    */
  inline def pathToSVGPathData(pathToExport: IPath, pathOffset: IPoint, exportOffset: IPoint): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToSVGPathData")(pathToExport.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], exportOffset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pathToSVGPathData(pathToExport: IPath, pathOffset: IPoint, exportOffset: IPoint, accuracy: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToSVGPathData")(pathToExport.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], exportOffset.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pathToSVGPathData(
    pathToExport: IPath,
    pathOffset: IPoint,
    exportOffset: IPoint,
    accuracy: Double,
    clockwiseCircle: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToSVGPathData")(pathToExport.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], exportOffset.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any], clockwiseCircle.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pathToSVGPathData(
    pathToExport: IPath,
    pathOffset: IPoint,
    exportOffset: IPoint,
    accuracy: Unit,
    clockwiseCircle: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToSVGPathData")(pathToExport.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], exportOffset.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any], clockwiseCircle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Map of MakerJs unit system to SVG unit system
    */
  @JSGlobal("MakerJs.exporter.svgUnit")
  @js.native
  def svgUnit: svgUnitConversion = js.native
  inline def svgUnit_=(x: svgUnitConversion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svgUnit")(x.asInstanceOf[js.Any])
  
  inline def toDXF(modelToExport: IModel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDXF")(modelToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toDXF(modelToExport: IModel, options: IDXFRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDXF")(modelToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toDXF(pathToExport: IPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDXF")(pathToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toDXF(pathToExport: IPath, options: IDXFRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDXF")(pathToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toDXF(pathsToExport: js.Array[IPath]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDXF")(pathsToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toDXF(pathsToExport: js.Array[IPath], options: IDXFRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDXF")(pathsToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Converts a model to a @jscad/csg CAG object - 2D to 2D. See https://en.wikibooks.org/wiki/OpenJSCAD_User_Guide#2D_Paths
    *
    * Example:
    * ```
    * //First, use npm install @jscad/csg from the command line in your jscad project
    * //Create a CAG instance from a model.
    * var { CAG } = require('@jscad/csg');
    * var model = new makerjs.models.Ellipse(70, 40);
    * var cag = makerjs.exporter.toJscadCAG(CAG, model, {maxArcFacet: 1});
    * ```
    *
    * @param jscadCAG @jscad/csg CAG engine, see https://www.npmjs.com/package/@jscad/csg
    * @param modelToExport Model object to export.
    * @param options Optional options object.
    * @param options.byLayers Optional flag to separate chains by layers.
    * @param options.pointMatchingDistance Optional max distance to consider two points as the same.
    * @param options.maxArcFacet The maximum length between points on an arc or circle.
    * @param options.statusCallback Optional callback function to get the percentage complete.
    * @returns jscad CAG object in 2D, or a map (keyed by layer id) of jscad CAG objects - if options.byLayers is true.
    */
  inline def toJscadCAG(jscadCAG: TypeofCAG, modelToExport: IModel): CAG | StringDictionary[CAG] = (^.asInstanceOf[js.Dynamic].applyDynamic("toJscadCAG")(jscadCAG.asInstanceOf[js.Any], modelToExport.asInstanceOf[js.Any])).asInstanceOf[CAG | StringDictionary[CAG]]
  inline def toJscadCAG(jscadCAG: TypeofCAG, modelToExport: IModel, jsCadCagOptions: IJscadCagOptions): CAG | StringDictionary[CAG] = (^.asInstanceOf[js.Dynamic].applyDynamic("toJscadCAG")(jscadCAG.asInstanceOf[js.Any], modelToExport.asInstanceOf[js.Any], jsCadCagOptions.asInstanceOf[js.Any])).asInstanceOf[CAG | StringDictionary[CAG]]
  
  /**
    * Converts a model to a @jscad/csg CSG object - 2D to 3D.
    *
    * Example:
    * ```
    * //First, use npm install @jscad/csg from the command line in your jscad project
    * //Create a CSG instance from a model.
    * var { CAG } = require('@jscad/csg');
    * var model = new makerjs.models.Ellipse(70, 40);
    * var csg = makerjs.exporter.toJscadCSG(CAG, model, {maxArcFacet: 1, extrude: 10});
    * ```
    *
    * @param jscadCAG @jscad/csg CAG engine, see https://www.npmjs.com/package/@jscad/csg
    * @param modelToExport Model object to export.
    * @param options Optional options object.
    * @param options.byLayers Optional flag to separate chains by layers.
    * @param options.pointMatchingDistance Optional max distance to consider two points as the same.
    * @param options.maxArcFacet The maximum length between points on an arc or circle.
    * @param options.statusCallback Optional callback function to get the percentage complete.
    * @param options.extrude Optional default extrusion distance.
    * @param options.layerOptions Optional object map of options per layer, keyed by layer name. Each value for a key is an object with 'extrude' and 'z' properties.
    * @returns jscad CAG object in 2D, or a map (keyed by layer id) of jscad CAG objects - if options.byLayers is true.
    */
  inline def toJscadCSG(jscadCAG: TypeofCAG, modelToExport: IModel): CSG = (^.asInstanceOf[js.Dynamic].applyDynamic("toJscadCSG")(jscadCAG.asInstanceOf[js.Any], modelToExport.asInstanceOf[js.Any])).asInstanceOf[CSG]
  inline def toJscadCSG(jscadCAG: TypeofCAG, modelToExport: IModel, options: IJscadCsgOptions): CSG = (^.asInstanceOf[js.Dynamic].applyDynamic("toJscadCSG")(jscadCAG.asInstanceOf[js.Any], modelToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CSG]
  
  /**
    * Exports a model in STL format - 2D to 3D.
    *
    * @param jscadCAG @jscad/csg CAG engine, see https://www.npmjs.com/package/@jscad/csg
    * @param stlSerializer @jscad/stl-serializer, see https://www.npmjs.com/package/@jscad/stl-serializer
    * @param modelToExport Model object to export.
    * @param options Optional options object.
    * @param options.byLayers Optional flag to separate chains by layers.
    * @param options.pointMatchingDistance Optional max distance to consider two points as the same.
    * @param options.maxArcFacet The maximum length between points on an arc or circle.
    * @param options.statusCallback Optional callback function to get the percentage complete.
    * @param options.extrude Optional default extrusion distance.
    * @param options.layerOptions Optional object map of options per layer, keyed by layer name. Each value for a key is an object with 'extrude' and 'z' properties.
    * @returns String in STL ASCII format.
    */
  inline def toJscadSTL(CAG: TypeofCAG, stlSerializer: StlSerializer, modelToExport: IModel): String | js.Array[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("toJscadSTL")(CAG.asInstanceOf[js.Any], stlSerializer.asInstanceOf[js.Any], modelToExport.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[js.typedarray.ArrayBuffer]]
  inline def toJscadSTL(CAG: TypeofCAG, stlSerializer: StlSerializer, modelToExport: IModel, options: IJscadCsgOptions): String | js.Array[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("toJscadSTL")(CAG.asInstanceOf[js.Any], stlSerializer.asInstanceOf[js.Any], modelToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[js.typedarray.ArrayBuffer]]
  
  /**
    * Creates a string of JavaScript code for execution with a Jscad environment.
    *
    * @param modelToExport Model object to export.
    * @param options Export options object.
    * @param options.byLayers Optional flag to separate chains by layers.
    * @param options.pointMatchingDistance Optional max distance to consider two points as the same.
    * @param options.maxArcFacet The maximum length between points on an arc or circle.
    * @param options.statusCallback Optional callback function to get the percentage complete.
    * @param options.extrude Optional default extrusion distance.
    * @param options.layerOptions Optional object map of options per layer, keyed by layer name. Each value for a key is an object with 'extrude' and 'z' properties.
    * @returns String of JavaScript containing a main() function for Jscad.
    */
  inline def toJscadScript(modelToExport: IModel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJscadScript")(modelToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toJscadScript(modelToExport: IModel, options: IJscadScriptOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJscadScript")(modelToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Renders an item in JSON.
    *
    * @param itemToExport Item to render: may be a path, an array of paths, or a model object.
    * @param options Rendering options object.
    * @param options.accuracy Optional exemplar of number of decimal places.
    * @param options.indentation Optional number of characters to indent after a newline.
    * @returns String of DXF content.
    */
  inline def toJson(itemToExport: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(itemToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toJson(itemToExport: Any, options: IJsonExportOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(itemToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Injects drawing into a PDFKit document.
    *
    * @param doc PDFKit.PDFDocument object. See https://pdfkit.org/
    * @param modelToExport Model object to export.
    * @param options Export options object.
    * @returns String of PDF file contents.
    */
  inline def toPDF(doc: PDFDocument, modelToExport: IModel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toPDF")(doc.asInstanceOf[js.Any], modelToExport.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toPDF(doc: PDFDocument, modelToExport: IModel, options: IPDFRenderOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toPDF")(doc.asInstanceOf[js.Any], modelToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toSVG(modelToExport: IModel): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(modelToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toSVG(modelToExport: IModel, options: ISVGRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(modelToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toSVG(pathToExport: IPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(pathToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toSVG(pathToExport: IPath, options: ISVGRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(pathToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toSVG(pathsToExport: js.Array[IPath]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(pathsToExport.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toSVG(pathsToExport: js.Array[IPath], options: ISVGRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVG")(pathsToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Convert a model to SVG path data.
    *
    * @param modelToExport Model to export.
    * @param options Optional ISVGPathDataRenderOptions object.
    * @param options.accuracy Optional accuracy of SVG decimals.
    * @param options.byLayers Optional boolean flag (default false) to return a map of path data by layer.
    * @param options.fillRule Optional SVG fill rule: 'evenodd' (default) or 'nonzero'.
    * @param options.origin Optional origin. Default x = 0, y = topmost y point in the model. Use [0, 0] to use the same origin as Maker.js, which will translate to negative Y values in SVG.
    * @returns String of SVG path data (if options.byLayers is false) or an object map of path data by layer .
    */
  /**
    * Convert a model to SVG path data.
    *
    * @param modelToExport Model to export.
    * @param byLayers Optional boolean flag to return a map of path data by layer.
    * @param origin Optional origin. Default x = 0, y = topmost y point in the model. Use [0, 0] to use the same origin as Maker.js, which will translate to negative Y values in SVG.
    * @param accuracy Optional accuracy of SVG decimals.
    * @returns String of SVG path data (if byLayers is false) or an object map of path data by layer .
    */
  inline def toSVGPathData(modelToExport: IModel): IPathDataByLayerMap | String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSVGPathData")(modelToExport.asInstanceOf[js.Any]).asInstanceOf[IPathDataByLayerMap | String]
  inline def toSVGPathData(modelToExport: IModel, byLayers: Boolean): IPathDataByLayerMap | String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVGPathData")(modelToExport.asInstanceOf[js.Any], byLayers.asInstanceOf[js.Any])).asInstanceOf[IPathDataByLayerMap | String]
  inline def toSVGPathData(modelToExport: IModel, byLayers: Boolean, origin: Unit, accuracy: Double): IPathDataByLayerMap | String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVGPathData")(modelToExport.asInstanceOf[js.Any], byLayers.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[IPathDataByLayerMap | String]
  inline def toSVGPathData(modelToExport: IModel, byLayers: Boolean, origin: IPoint): IPathDataByLayerMap | String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVGPathData")(modelToExport.asInstanceOf[js.Any], byLayers.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[IPathDataByLayerMap | String]
  inline def toSVGPathData(modelToExport: IModel, byLayers: Boolean, origin: IPoint, accuracy: Double): IPathDataByLayerMap | String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVGPathData")(modelToExport.asInstanceOf[js.Any], byLayers.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[IPathDataByLayerMap | String]
  inline def toSVGPathData(modelToExport: IModel, byLayers: Unit, origin: Unit, accuracy: Double): IPathDataByLayerMap | String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVGPathData")(modelToExport.asInstanceOf[js.Any], byLayers.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[IPathDataByLayerMap | String]
  inline def toSVGPathData(modelToExport: IModel, byLayers: Unit, origin: IPoint): IPathDataByLayerMap | String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVGPathData")(modelToExport.asInstanceOf[js.Any], byLayers.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[IPathDataByLayerMap | String]
  inline def toSVGPathData(modelToExport: IModel, byLayers: Unit, origin: IPoint, accuracy: Double): IPathDataByLayerMap | String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVGPathData")(modelToExport.asInstanceOf[js.Any], byLayers.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[IPathDataByLayerMap | String]
  inline def toSVGPathData(modelToExport: IModel, options: ISVGPathDataRenderOptions): IPathDataByLayerMap | String = (^.asInstanceOf[js.Dynamic].applyDynamic("toSVGPathData")(modelToExport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPathDataByLayerMap | String]
  
  /**
    * Try to get the unit system from a model
    * @private
    */
  inline def tryGetModelUnits(itemToExport: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tryGetModelUnits")(itemToExport.asInstanceOf[js.Any]).asInstanceOf[String]
}
