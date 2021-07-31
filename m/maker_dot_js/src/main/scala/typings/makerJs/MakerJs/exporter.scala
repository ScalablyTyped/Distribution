package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StringDictionary
import typings.makerJs.anon.ScaleConversion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exporter {
  
  /**
    * Class to traverse an item 's models or paths and ultimately render each path.
    * @private
    */
  trait Exporter extends StObject {
    
    var beginModel: js.Any
    
    var endModel: js.Any
    
    /**
      * Export an object.
      *
      * @param item The object to export. May be a path, an array of paths, a model, or an array of models.
      * @param offset The offset position of the object.
      */
    def exportItem(itemId: String, itemToExport: js.Any, origin: IPoint): Unit
    
    /**
      * Export a model.
      *
      * @param modelToExport The model to export.
      * @param offset The offset position of the model.
      */
    def exportModel(modelId: String, modelToExport: IModel, offset: IPoint): Unit
    
    /**
      * Export a path.
      *
      * @param pathToExport The path to export.
      * @param offset The offset position of the path.
      */
    def exportPath(id: String, pathToExport: IPath, offset: IPoint, layer: String): Unit
    
    var fixPath: js.Any
    
    var fixPoint: js.Any
    
    var map: js.Any
  }
  object Exporter {
    
    @scala.inline
    def apply(
      beginModel: js.Any,
      endModel: js.Any,
      exportItem: (String, js.Any, IPoint) => Unit,
      exportModel: (String, IModel, IPoint) => Unit,
      exportPath: (String, IPath, IPoint, String) => Unit,
      fixPath: js.Any,
      fixPoint: js.Any,
      map: js.Any
    ): Exporter = {
      val __obj = js.Dynamic.literal(beginModel = beginModel.asInstanceOf[js.Any], endModel = endModel.asInstanceOf[js.Any], exportItem = js.Any.fromFunction3(exportItem), exportModel = js.Any.fromFunction3(exportModel), exportPath = js.Any.fromFunction4(exportPath), fixPath = fixPath.asInstanceOf[js.Any], fixPoint = fixPoint.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exporter]
    }
    
    @scala.inline
    implicit class ExporterMutableBuilder[Self <: Exporter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeginModel(value: js.Any): Self = StObject.set(x, "beginModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndModel(value: js.Any): Self = StObject.set(x, "endModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportItem(value: (String, js.Any, IPoint) => Unit): Self = StObject.set(x, "exportItem", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExportModel(value: (String, IModel, IPoint) => Unit): Self = StObject.set(x, "exportModel", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExportPath(value: (String, IPath, IPoint, String) => Unit): Self = StObject.set(x, "exportPath", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFixPath(value: js.Any): Self = StObject.set(x, "fixPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixPoint(value: js.Any): Self = StObject.set(x, "fixPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * DXF rendering options.
    */
  type IDXFRenderOptions = IExportOptions
  
  /**
    * @private
    */
  trait IExportOptions extends StObject {
    
    /**
      * Unit system to embed in exported file.
      */
    var units: js.UndefOr[String] = js.undefined
  }
  object IExportOptions {
    
    @scala.inline
    def apply(): IExportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IExportOptions]
    }
    
    @scala.inline
    implicit class IExportOptionsMutableBuilder[Self <: IExportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  /**
    * OpenJsCad export options.
    */
  trait IOpenJsCadOptions
    extends StObject
       with IFindLoopsOptions {
    
    /**
      * Optional depth of 3D extrusion.
      */
    var extrusion: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional size of curve facets.
      */
    var facetSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional override of function name, default is "main".
      */
    var functionName: js.UndefOr[String] = js.undefined
    
    /**
      * Optional options applied to specific first-child models by model id.
      */
    var modelMap: js.UndefOr[IOpenJsCadOptionsMap] = js.undefined
  }
  object IOpenJsCadOptions {
    
    @scala.inline
    def apply(): IOpenJsCadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOpenJsCadOptions]
    }
    
    @scala.inline
    implicit class IOpenJsCadOptionsMutableBuilder[Self <: IOpenJsCadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtrusion(value: Double): Self = StObject.set(x, "extrusion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtrusionUndefined: Self = StObject.set(x, "extrusion", js.undefined)
      
      @scala.inline
      def setFacetSize(value: Double): Self = StObject.set(x, "facetSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacetSizeUndefined: Self = StObject.set(x, "facetSize", js.undefined)
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      @scala.inline
      def setModelMap(value: IOpenJsCadOptionsMap): Self = StObject.set(x, "modelMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelMapUndefined: Self = StObject.set(x, "modelMap", js.undefined)
    }
  }
  
  type IOpenJsCadOptionsMap = StringDictionary[IOpenJsCadOptions]
  
  /**
    * PDF rendering options.
    */
  trait IPDFRenderOptions
    extends StObject
       with IExportOptions {
    
    /**
      * Rendered reference origin.
      */
    var origin: js.UndefOr[IPoint] = js.undefined
    
    /**
      * SVG color of the rendered paths.
      */
    var stroke: js.UndefOr[String] = js.undefined
  }
  object IPDFRenderOptions {
    
    @scala.inline
    def apply(): IPDFRenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPDFRenderOptions]
    }
    
    @scala.inline
    implicit class IPDFRenderOptionsMutableBuilder[Self <: IPDFRenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  /**
    * Map of SVG Path Data by layer name.
    */
  type IPathDataByLayerMap = StringDictionary[String]
  
  /**
    * SVG rendering options.
    */
  trait ISVGRenderOptions
    extends StObject
       with IExportOptions {
    
    /**
      *  Indicate that the id's of paths should be rendered as SVG text elements.
      */
    var annotate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * SVG fill color.
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /**
      * SVG font size and font size units.
      */
    var fontSize: js.UndefOr[String] = js.undefined
    
    /**
      * Rendered reference origin.
      */
    var origin: js.UndefOr[IPoint] = js.undefined
    
    /**
      * Scale of the SVG rendering.
      */
    var scale: js.UndefOr[Double] = js.undefined
    
    /**
      * SVG color of the rendered paths.
      */
    var stroke: js.UndefOr[String] = js.undefined
    
    /**
      * SVG stroke width of paths. This may have a unit type suffix, if not, the value will be in the same unit system as the units property.
      */
    var strokeWidth: js.UndefOr[String] = js.undefined
    
    /**
      * Optional attributes to add to the root svg tag.
      */
    var svgAttrs: js.UndefOr[IXmlTagAttrs] = js.undefined
    
    /**
      * Use SVG < path > elements instead of < line >, < circle > etc.
      */
    var useSvgPathOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Flag to use SVG viewbox.
      */
    var viewBox: js.UndefOr[Boolean] = js.undefined
  }
  object ISVGRenderOptions {
    
    @scala.inline
    def apply(): ISVGRenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISVGRenderOptions]
    }
    
    @scala.inline
    implicit class ISVGRenderOptionsMutableBuilder[Self <: ISVGRenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotate(value: Boolean): Self = StObject.set(x, "annotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotateUndefined: Self = StObject.set(x, "annotate", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setSvgAttrs(value: IXmlTagAttrs): Self = StObject.set(x, "svgAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgAttrsUndefined: Self = StObject.set(x, "svgAttrs", js.undefined)
      
      @scala.inline
      def setUseSvgPathOnly(value: Boolean): Self = StObject.set(x, "useSvgPathOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSvgPathOnlyUndefined: Self = StObject.set(x, "useSvgPathOnly", js.undefined)
      
      @scala.inline
      def setViewBox(value: Boolean): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
  
  /**
    * Attributes for an XML tag.
    * @private
    */
  type IXmlTagAttrs = StringDictionary[js.Any]
  
  /**
    * Class for an XML tag.
    * @private
    */
  trait XmlTag extends StObject {
    
    var attrs: IXmlTagAttrs
    
    /**
      * Get the closing tag.
      */
    def getClosingTag(): String
    
    /**
      * Get the inner text.
      */
    def getInnerText(): String
    
    /**
      * Get the opening tag.
      *
      * @param selfClose Flag to determine if opening tag should be self closing.
      */
    def getOpeningTag(selfClose: Boolean): String
    
    /**
      * Text between the opening and closing tags.
      */
    var innerText: String
    
    /**
      * Boolean to indicate that the innerText has been escaped.
      */
    var innerTextEscaped: Boolean
    
    var name: String
  }
  object XmlTag {
    
    @scala.inline
    def apply(
      attrs: IXmlTagAttrs,
      getClosingTag: () => String,
      getInnerText: () => String,
      getOpeningTag: Boolean => String,
      innerText: String,
      innerTextEscaped: Boolean,
      name: String
    ): XmlTag = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], getClosingTag = js.Any.fromFunction0(getClosingTag), getInnerText = js.Any.fromFunction0(getInnerText), getOpeningTag = js.Any.fromFunction1(getOpeningTag), innerText = innerText.asInstanceOf[js.Any], innerTextEscaped = innerTextEscaped.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlTag]
    }
    
    @scala.inline
    implicit class XmlTagMutableBuilder[Self <: XmlTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: IXmlTagAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetClosingTag(value: () => String): Self = StObject.set(x, "getClosingTag", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInnerText(value: () => String): Self = StObject.set(x, "getInnerText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOpeningTag(value: Boolean => String): Self = StObject.set(x, "getOpeningTag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerText(value: String): Self = StObject.set(x, "innerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerTextEscaped(value: Boolean): Self = StObject.set(x, "innerTextEscaped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Map of MakerJs unit system to SVG unit system
    */
  type svgUnitConversion = StringDictionary[ScaleConversion]
}
