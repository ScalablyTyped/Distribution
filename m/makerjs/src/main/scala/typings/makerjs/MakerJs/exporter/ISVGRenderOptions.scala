package typings.makerjs.MakerJs.exporter

import org.scalablytyped.runtime.StringDictionary
import typings.makerjs.MakerJs.IPoint
import typings.makerjs.makerjsStrings.evenodd
import typings.makerjs.makerjsStrings.nonzero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SVG rendering options.
  */
trait ISVGRenderOptions
  extends StObject
     with IExportOptions
     with ISVGElementRenderOptions {
  
  /**
    *  Indicate that the id's of paths should be rendered as SVG text elements.
    */
  var annotate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Flag to explicitly close XML tags.
    */
  var closingTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * SVG fill rule.
    */
  var fillRule: js.UndefOr[nonzero | evenodd] = js.undefined
  
  /**
    *  Options to show direction of path flow.
    */
  var flow: js.UndefOr[IFlowAnnotation] = js.undefined
  
  /**
    * SVG font size and font size units.
    */
  var fontSize: js.UndefOr[String] = js.undefined
  
  /**
    * SVG options per layer.
    */
  var layerOptions: js.UndefOr[StringDictionary[ISVGElementRenderOptions]] = js.undefined
  
  /**
    * Rendered reference origin.
    */
  var origin: js.UndefOr[IPoint] = js.undefined
  
  /**
    * Scale of the SVG rendering.
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * Flag to remove the "vector-effect: non-scaling-stroke" attribute.
    */
  var scalingStroke: js.UndefOr[Boolean] = js.undefined
  
  /**
    * SVG stroke linecap.
    */
  var strokeLineCap: js.UndefOr[String] = js.undefined
  
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
  
  inline def apply(): ISVGRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISVGRenderOptions]
  }
  
  extension [Self <: ISVGRenderOptions](x: Self) {
    
    inline def setAnnotate(value: Boolean): Self = StObject.set(x, "annotate", value.asInstanceOf[js.Any])
    
    inline def setAnnotateUndefined: Self = StObject.set(x, "annotate", js.undefined)
    
    inline def setClosingTags(value: Boolean): Self = StObject.set(x, "closingTags", value.asInstanceOf[js.Any])
    
    inline def setClosingTagsUndefined: Self = StObject.set(x, "closingTags", js.undefined)
    
    inline def setFillRule(value: nonzero | evenodd): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    inline def setFlow(value: IFlowAnnotation): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setLayerOptions(value: StringDictionary[ISVGElementRenderOptions]): Self = StObject.set(x, "layerOptions", value.asInstanceOf[js.Any])
    
    inline def setLayerOptionsUndefined: Self = StObject.set(x, "layerOptions", js.undefined)
    
    inline def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScalingStroke(value: Boolean): Self = StObject.set(x, "scalingStroke", value.asInstanceOf[js.Any])
    
    inline def setScalingStrokeUndefined: Self = StObject.set(x, "scalingStroke", js.undefined)
    
    inline def setStrokeLineCap(value: String): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
    
    inline def setStrokeLineCapUndefined: Self = StObject.set(x, "strokeLineCap", js.undefined)
    
    inline def setSvgAttrs(value: IXmlTagAttrs): Self = StObject.set(x, "svgAttrs", value.asInstanceOf[js.Any])
    
    inline def setSvgAttrsUndefined: Self = StObject.set(x, "svgAttrs", js.undefined)
    
    inline def setUseSvgPathOnly(value: Boolean): Self = StObject.set(x, "useSvgPathOnly", value.asInstanceOf[js.Any])
    
    inline def setUseSvgPathOnlyUndefined: Self = StObject.set(x, "useSvgPathOnly", js.undefined)
    
    inline def setViewBox(value: Boolean): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
  }
}
