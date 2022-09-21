package typings.highcharts

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable7
import typings.highcharts.mod.AST
import typings.highcharts.mod.ASTNode
import typings.highcharts.mod.AnimationOptionsObject
import typings.highcharts.mod.AnnotationControlPointOptionsObject
import typings.highcharts.mod.AnnotationControlPointPositionerFunction
import typings.highcharts.mod.AnnotationControllable
import typings.highcharts.mod.AnnotationDraggableValue
import typings.highcharts.mod.AnnotationsAnimationOptions
import typings.highcharts.mod.AnnotationsControlPointStyleOptions
import typings.highcharts.mod.AnnotationsCrookedLineOptions
import typings.highcharts.mod.AnnotationsElliottWaveOptions
import typings.highcharts.mod.AnnotationsEventsOptions
import typings.highcharts.mod.AnnotationsFibonacciOptions
import typings.highcharts.mod.AnnotationsFibonacciTimeZonesOptions
import typings.highcharts.mod.AnnotationsInfinityLineOptions
import typings.highcharts.mod.AnnotationsLabelOptions
import typings.highcharts.mod.AnnotationsLabelsOptions
import typings.highcharts.mod.AnnotationsMeasureOptions
import typings.highcharts.mod.AnnotationsOptions
import typings.highcharts.mod.AnnotationsPitchforkOptions
import typings.highcharts.mod.AnnotationsShapeOptions
import typings.highcharts.mod.AnnotationsShapesOptions
import typings.highcharts.mod.AnnotationsTimeCyclesOptions
import typings.highcharts.mod.AnnotationsTunnelOptions
import typings.highcharts.mod.AnnotationsVerticalLineOptions
import typings.highcharts.mod.Axis
import typings.highcharts.mod.AxisOptions
import typings.highcharts.mod.AxisPlotBandsOptions
import typings.highcharts.mod.AxisPlotLinesOptions
import typings.highcharts.mod.CSSObject
import typings.highcharts.mod.ChartCallbackFunction
import typings.highcharts.mod.Chart_
import typings.highcharts.mod.Class
import typings.highcharts.mod.ColorAxisOptions
import typings.highcharts.mod.ColorString
import typings.highcharts.mod.ColorType
import typings.highcharts.mod.Color_
import typings.highcharts.mod.Dictionary
import typings.highcharts.mod.EventCallbackFunction
import typings.highcharts.mod.EventOptionsObject
import typings.highcharts.mod.GradientColorObject
import typings.highcharts.mod.HTMLAttributes
import typings.highcharts.mod.HTMLDOMElement
import typings.highcharts.mod.LegendOptions
import typings.highcharts.mod.LonLatArray
import typings.highcharts.mod.MapViewInsetOptions
import typings.highcharts.mod.MapViewInsetsOptions
import typings.highcharts.mod.MapViewProjectionOptions
import typings.highcharts.mod.NavigationAnnotationsControlPointStyleOptions
import typings.highcharts.mod.ObjectEachCallbackFunction
import typings.highcharts.mod.OffsetObject
import typings.highcharts.mod.Options
import typings.highcharts.mod.PatternObject
import typings.highcharts.mod.RelativeSize
import typings.highcharts.mod.SVGAttributes
import typings.highcharts.mod.SVGDOMElement
import typings.highcharts.mod.SVGElement
import typings.highcharts.mod.SVGPathArray
import typings.highcharts.mod.SVGPathCommand
import typings.highcharts.mod.SVGRenderer
import typings.highcharts.mod.Series
import typings.highcharts.mod.SeriesOptionsType
import typings.highcharts.mod.TimeFormatCallbackFunction
import typings.highcharts.mod.TimeOptions
import typings.highcharts.mod.Time_
import typings.highcharts.mod.TooltipOptions
import typings.highcharts.mod.WrapProceedFunction
import typings.std.Element
import typings.std.Event
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<highcharts.highcharts.AnimationOptionsObject> */
  trait PartialAnimationOptionsOb extends StObject {
    
    var complete: js.UndefOr[js.Function] = js.undefined
    
    var defer: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[String | js.Function] = js.undefined
    
    var step: js.UndefOr[js.Function] = js.undefined
  }
  object PartialAnimationOptionsOb {
    
    inline def apply(): PartialAnimationOptionsOb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAnimationOptionsOb]
    }
    
    extension [Self <: PartialAnimationOptionsOb](x: Self) {
      
      inline def setComplete(value: js.Function): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: String | js.Function): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setStep(value: js.Function): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  /* Inlined std.Partial<highcharts.highcharts.AnnotationControlPointOptionsObject> */
  trait PartialAnnotationControlP extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var positioner: js.UndefOr[AnnotationControlPointPositionerFunction] = js.undefined
    
    var style: js.UndefOr[
        AnnotationsControlPointStyleOptions | NavigationAnnotationsControlPointStyleOptions
      ] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PartialAnnotationControlP {
    
    inline def apply(): PartialAnnotationControlP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAnnotationControlP]
    }
    
    extension [Self <: PartialAnnotationControlP](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPositioner(value: AnnotationControlPointPositionerFunction): Self = StObject.set(x, "positioner", value.asInstanceOf[js.Any])
      
      inline def setPositionerUndefined: Self = StObject.set(x, "positioner", js.undefined)
      
      inline def setStyle(value: AnnotationsControlPointStyleOptions | NavigationAnnotationsControlPointStyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined std.Partial<highcharts.highcharts.AnnotationsOptions> */
  trait PartialAnnotationsOptions extends StObject {
    
    var animation: js.UndefOr[Boolean | AnnotationsAnimationOptions | PartialAnimationOptionsOb] = js.undefined
    
    var controlPointOptions: js.UndefOr[AnnotationControlPointOptionsObject] = js.undefined
    
    var crookedLine: js.UndefOr[AnnotationsCrookedLineOptions] = js.undefined
    
    var crop: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[AnnotationDraggableValue] = js.undefined
    
    var elliottWave: js.UndefOr[AnnotationsElliottWaveOptions] = js.undefined
    
    var events: js.UndefOr[AnnotationsEventsOptions] = js.undefined
    
    var fibonacci: js.UndefOr[AnnotationsFibonacciOptions] = js.undefined
    
    var fibonacciTimeZones: js.UndefOr[AnnotationsFibonacciTimeZonesOptions] = js.undefined
    
    var id: js.UndefOr[Double | String] = js.undefined
    
    var infinityLine: js.UndefOr[AnnotationsInfinityLineOptions] = js.undefined
    
    var labelOptions: js.UndefOr[AnnotationsLabelOptions] = js.undefined
    
    var labels: js.UndefOr[js.Array[AnnotationsLabelsOptions]] = js.undefined
    
    var measure: js.UndefOr[AnnotationsMeasureOptions] = js.undefined
    
    var pitchfork: js.UndefOr[AnnotationsPitchforkOptions] = js.undefined
    
    var shapeOptions: js.UndefOr[AnnotationsShapeOptions] = js.undefined
    
    var shapes: js.UndefOr[js.Array[AnnotationsShapesOptions]] = js.undefined
    
    var timeCycles: js.UndefOr[AnnotationsTimeCyclesOptions] = js.undefined
    
    var tunnel: js.UndefOr[AnnotationsTunnelOptions] = js.undefined
    
    var verticalLine: js.UndefOr[AnnotationsVerticalLineOptions] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PartialAnnotationsOptions {
    
    inline def apply(): PartialAnnotationsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAnnotationsOptions]
    }
    
    extension [Self <: PartialAnnotationsOptions](x: Self) {
      
      inline def setAnimation(value: Boolean | AnnotationsAnimationOptions | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setControlPointOptions(value: AnnotationControlPointOptionsObject): Self = StObject.set(x, "controlPointOptions", value.asInstanceOf[js.Any])
      
      inline def setControlPointOptionsUndefined: Self = StObject.set(x, "controlPointOptions", js.undefined)
      
      inline def setCrookedLine(value: AnnotationsCrookedLineOptions): Self = StObject.set(x, "crookedLine", value.asInstanceOf[js.Any])
      
      inline def setCrookedLineUndefined: Self = StObject.set(x, "crookedLine", js.undefined)
      
      inline def setCrop(value: Boolean): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      inline def setDraggable(value: AnnotationDraggableValue): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setElliottWave(value: AnnotationsElliottWaveOptions): Self = StObject.set(x, "elliottWave", value.asInstanceOf[js.Any])
      
      inline def setElliottWaveUndefined: Self = StObject.set(x, "elliottWave", js.undefined)
      
      inline def setEvents(value: AnnotationsEventsOptions): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setFibonacci(value: AnnotationsFibonacciOptions): Self = StObject.set(x, "fibonacci", value.asInstanceOf[js.Any])
      
      inline def setFibonacciTimeZones(value: AnnotationsFibonacciTimeZonesOptions): Self = StObject.set(x, "fibonacciTimeZones", value.asInstanceOf[js.Any])
      
      inline def setFibonacciTimeZonesUndefined: Self = StObject.set(x, "fibonacciTimeZones", js.undefined)
      
      inline def setFibonacciUndefined: Self = StObject.set(x, "fibonacci", js.undefined)
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInfinityLine(value: AnnotationsInfinityLineOptions): Self = StObject.set(x, "infinityLine", value.asInstanceOf[js.Any])
      
      inline def setInfinityLineUndefined: Self = StObject.set(x, "infinityLine", js.undefined)
      
      inline def setLabelOptions(value: AnnotationsLabelOptions): Self = StObject.set(x, "labelOptions", value.asInstanceOf[js.Any])
      
      inline def setLabelOptionsUndefined: Self = StObject.set(x, "labelOptions", js.undefined)
      
      inline def setLabels(value: js.Array[AnnotationsLabelsOptions]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: AnnotationsLabelsOptions*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setMeasure(value: AnnotationsMeasureOptions): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
      
      inline def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
      
      inline def setPitchfork(value: AnnotationsPitchforkOptions): Self = StObject.set(x, "pitchfork", value.asInstanceOf[js.Any])
      
      inline def setPitchforkUndefined: Self = StObject.set(x, "pitchfork", js.undefined)
      
      inline def setShapeOptions(value: AnnotationsShapeOptions): Self = StObject.set(x, "shapeOptions", value.asInstanceOf[js.Any])
      
      inline def setShapeOptionsUndefined: Self = StObject.set(x, "shapeOptions", js.undefined)
      
      inline def setShapes(value: js.Array[AnnotationsShapesOptions]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
      
      inline def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
      
      inline def setShapesVarargs(value: AnnotationsShapesOptions*): Self = StObject.set(x, "shapes", js.Array(value*))
      
      inline def setTimeCycles(value: AnnotationsTimeCyclesOptions): Self = StObject.set(x, "timeCycles", value.asInstanceOf[js.Any])
      
      inline def setTimeCyclesUndefined: Self = StObject.set(x, "timeCycles", js.undefined)
      
      inline def setTunnel(value: AnnotationsTunnelOptions): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
      
      inline def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
      
      inline def setVerticalLine(value: AnnotationsVerticalLineOptions): Self = StObject.set(x, "verticalLine", value.asInstanceOf[js.Any])
      
      inline def setVerticalLineUndefined: Self = StObject.set(x, "verticalLine", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Inlined std.Partial<highcharts.highcharts.MapViewOptions> */
  trait PartialMapViewOptions extends StObject {
    
    var center: js.UndefOr[LonLatArray] = js.undefined
    
    var insetOptions: js.UndefOr[MapViewInsetOptions] = js.undefined
    
    var insets: js.UndefOr[MapViewInsetsOptions | js.Array[js.Object]] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
    
    var projection: js.UndefOr[js.Object | MapViewProjectionOptions] = js.undefined
    
    var zoom: js.UndefOr[Double] = js.undefined
  }
  object PartialMapViewOptions {
    
    inline def apply(): PartialMapViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMapViewOptions]
    }
    
    extension [Self <: PartialMapViewOptions](x: Self) {
      
      inline def setCenter(value: LonLatArray): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
      
      inline def setInsetOptions(value: MapViewInsetOptions): Self = StObject.set(x, "insetOptions", value.asInstanceOf[js.Any])
      
      inline def setInsetOptionsUndefined: Self = StObject.set(x, "insetOptions", js.undefined)
      
      inline def setInsets(value: MapViewInsetsOptions | js.Array[js.Object]): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
      
      inline def setInsetsUndefined: Self = StObject.set(x, "insets", js.undefined)
      
      inline def setInsetsVarargs(value: js.Object*): Self = StObject.set(x, "insets", js.Array(value*))
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setPadding(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: (Double | String)*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setProjection(value: js.Object | MapViewProjectionOptions): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<highcharts.highcharts.SVGAttributes> */
  trait ReadonlySVGAttributes extends StObject {
    
    val d: js.UndefOr[String | SVGPathArray] = js.undefined
    
    val dx: js.UndefOr[Double] = js.undefined
    
    val dy: js.UndefOr[Double] = js.undefined
    
    val fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
    
    val inverted: js.UndefOr[Boolean] = js.undefined
    
    val matrix: js.UndefOr[js.Array[Double]] = js.undefined
    
    val rotation: js.UndefOr[Double] = js.undefined
    
    val rotationOriginX: js.UndefOr[Double] = js.undefined
    
    val rotationOriginY: js.UndefOr[Double] = js.undefined
    
    val scaleX: js.UndefOr[Double] = js.undefined
    
    val scaleY: js.UndefOr[Double] = js.undefined
    
    val stroke: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
    
    val style: js.UndefOr[String | CSSObject] = js.undefined
    
    val translateX: js.UndefOr[Double] = js.undefined
    
    val translateY: js.UndefOr[Double] = js.undefined
    
    val zIndex: js.UndefOr[Double] = js.undefined
  }
  object ReadonlySVGAttributes {
    
    inline def apply(): ReadonlySVGAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlySVGAttributes]
    }
    
    extension [Self <: ReadonlySVGAttributes](x: Self) {
      
      inline def setD(value: String | SVGPathArray): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setDVarargs(
        value: (js.Array[SVGPathCommand] | (js.Tuple2[SVGPathCommand, Double]) | (js.Tuple3[SVGPathCommand, Double, Double]) | (js.Tuple5[SVGPathCommand, Double, Double, Double, Double]) | (js.Tuple7[SVGPathCommand, Double, Double, Double, Double, Double, Double]) | (js.Tuple8[SVGPathCommand, Double, Double, Double, Double, Double, Double, Double]))*
      ): Self = StObject.set(x, "d", js.Array(value*))
      
      inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setFill(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      inline def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value*))
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationOriginX(value: Double): Self = StObject.set(x, "rotationOriginX", value.asInstanceOf[js.Any])
      
      inline def setRotationOriginXUndefined: Self = StObject.set(x, "rotationOriginX", js.undefined)
      
      inline def setRotationOriginY(value: Double): Self = StObject.set(x, "rotationOriginY", value.asInstanceOf[js.Any])
      
      inline def setRotationOriginYUndefined: Self = StObject.set(x, "rotationOriginY", js.undefined)
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      inline def setStroke(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStyle(value: String | CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
      
      inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
      
      inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait TypeofAST
    extends StObject
       with Instantiable1[(/* source */ js.Array[ASTNode]) | (/* source */ String), AST] {
    
    /**
      * The list of allowed SVG or HTML attributes, used for sanitizing
      * potentially harmful content from the chart configuration before adding to
      * the DOM.
      */
    var allowedAttributes: Any = js.native
    
    /**
      * The list of allowed references for referring attributes like `href` and
      * `src`. Attribute values will only be allowed if they start with one of
      * these strings.
      */
    var allowedReferences: Any = js.native
    
    /**
      * The list of allowed SVG or HTML tags, used for sanitizing potentially
      * harmful content from the chart configuration before adding to the DOM.
      */
    var allowedTags: Any = js.native
    
    /**
      * Allow all custom SVG and HTML attributes, references and tags (together
      * with potentially harmful ones) to be added to the DOM from the chart
      * configuration. In other words, disable the the allow-listing which is the
      * primary functionality of the AST.
      *
      * WARNING: Setting this property to `true` while allowing untrusted user
      * data in the chart configuration will expose your application to XSS
      * security risks!
      *
      * Note that in case you want to allow a known set of tags or attributes,
      * you should allow-list them instead of disabling the filtering totally.
      * See allowedAttributes, allowedReferences and allowedTags. The
      * `bypassHTMLFiltering` setting is intended only for those cases where
      * allow-listing is not practical, and the chart configuration already comes
      * from a secure source.
      */
    var bypassHTMLFiltering: Any = js.native
  }
  
  @js.native
  trait TypeofColor
    extends StObject
       with Instantiable1[/* input */ ColorType, Color_] {
    
    /**
      * Creates a color instance out of a color string or object.
      *
      * @param input
      *        The input color in either rbga or hex format.
      *
      * @return Color instance.
      */
    def parse(): Color_ = js.native
    def parse(input: ColorType): Color_ = js.native
  }
  
  @js.native
  trait TypeofHighcharts extends StObject {
    
    var AST: TypeofAST = js.native
    
    var Annotation: Instantiable2[
        /* chart */ Chart_, 
        /* userOptions */ AnnotationsOptions, 
        typings.highcharts.mod.Annotation
      ] = js.native
    
    var AnnotationControlPoint: Instantiable4[
        /* chart */ Chart_, 
        /* target */ AnnotationControllable, 
        /* options */ AnnotationControlPointOptionsObject, 
        /* index */ js.UndefOr[Double], 
        typings.highcharts.mod.AnnotationControlPoint
      ] = js.native
    
    var Axis: Instantiable2[/* chart */ Chart_, /* userOptions */ AxisOptions, typings.highcharts.mod.Axis] = js.native
    
    var Chart: Instantiable2[/* options */ Options, /* callback */ js.UndefOr[ChartCallbackFunction], Chart_] = js.native
    
    var Color: TypeofColor = js.native
    
    var ColorAxis: Instantiable2[
        /* chart */ Chart_, 
        /* userOptions */ ColorAxisOptions, 
        typings.highcharts.mod.ColorAxis
      ] = js.native
    
    var Legend: Instantiable2[/* chart */ Chart_, /* options */ LegendOptions, typings.highcharts.mod.Legend] = js.native
    
    var PlotLineOrBand: Instantiable2[
        /* axis */ Axis, 
        /* options */ js.UndefOr[AxisPlotBandsOptions | AxisPlotLinesOptions], 
        typings.highcharts.mod.PlotLineOrBand
      ] = js.native
    
    var Point: Instantiable0[typings.highcharts.mod.Point] = js.native
    
    var Pointer: Instantiable2[/* chart */ Chart_, /* options */ Options, typings.highcharts.mod.Pointer] = js.native
    
    var SVGElement: Instantiable0[typings.highcharts.mod.SVGElement] = js.native
    
    var SVGRenderer: Instantiable7[
        /* container */ HTMLDOMElement, 
        /* width */ Double, 
        /* height */ Double, 
        /* style */ js.UndefOr[CSSObject], 
        /* forExport */ js.UndefOr[Boolean], 
        /* allowHTML */ js.UndefOr[Boolean], 
        /* styledMode */ js.UndefOr[Boolean], 
        typings.highcharts.mod.SVGRenderer
      ] = js.native
    
    var Series: TypeofSeries = js.native
    
    var SeriesPalettes: Any = js.native
    
    var Tick: Instantiable5[
        /* axis */ Axis, 
        /* pos */ Double, 
        /* type */ js.UndefOr[String], 
        /* noLabel */ js.UndefOr[Boolean], 
        /* parameters */ js.UndefOr[js.Object], 
        typings.highcharts.mod.Tick
      ] = js.native
    
    var Time: Instantiable1[/* options */ TimeOptions, Time_] = js.native
    
    var Tooltip: Instantiable2[/* chart */ Chart_, /* options */ TooltipOptions, typings.highcharts.mod.Tooltip] = js.native
    
    /**
      * 3D axis for z coordinates.
      */
    var ZAxis: Any = js.native
    
    def addEvent[T](el: T, `type`: String, fn: js.Function): js.Function = js.native
    def addEvent[T](el: T, `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
    def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
    def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
    def addEvent[T](el: Class[T], `type`: String, fn: js.Function): js.Function = js.native
    def addEvent[T](el: Class[T], `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
    def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
    def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
    
    def animObject(): AnimationOptionsObject = js.native
    def animObject(animation: Boolean): AnimationOptionsObject = js.native
    def animObject(animation: AnimationOptionsObject): AnimationOptionsObject = js.native
    
    def animate(el: HTMLDOMElement, params: CSSObject): Unit = js.native
    def animate(el: HTMLDOMElement, params: CSSObject, opt: PartialAnimationOptionsOb): Unit = js.native
    def animate(el: HTMLDOMElement, params: SVGAttributes): Unit = js.native
    def animate(el: HTMLDOMElement, params: SVGAttributes, opt: PartialAnimationOptionsOb): Unit = js.native
    def animate(el: SVGElement, params: CSSObject): Unit = js.native
    def animate(el: SVGElement, params: CSSObject, opt: PartialAnimationOptionsOb): Unit = js.native
    def animate(el: SVGElement, params: SVGAttributes): Unit = js.native
    def animate(el: SVGElement, params: SVGAttributes, opt: PartialAnimationOptionsOb): Unit = js.native
    
    def arrayMax(data: js.Array[Any]): Double = js.native
    
    def arrayMin(data: js.Array[Any]): Double = js.native
    
    def attr(elem: HTMLDOMElement): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: String, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: String, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: Unit, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: Unit, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: HTMLAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: SVGAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: String, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: String, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: Unit, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: Unit, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: HTMLAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: SVGAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
    
    def callout(): Unit = js.native
    
    def chart(options: Options): Chart_ = js.native
    def chart(options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    def chart(renderTo: String, options: Options): Chart_ = js.native
    def chart(renderTo: String, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    def chart(renderTo: HTMLDOMElement, options: Options): Chart_ = js.native
    def chart(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    
    var charts: js.Array[js.UndefOr[Chart_]] = js.native
    
    def clearTimeout(): Unit = js.native
    def clearTimeout(id: Double): Unit = js.native
    
    def color(input: ColorType): Color_ = js.native
    
    def correctFloat(num: Double): Double = js.native
    def correctFloat(num: Double, prec: Double): Double = js.native
    
    def createElement(tag: String): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: Unit, parent: Unit, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: Unit, parent: HTMLDOMElement): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: Unit, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: CSSObject): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: CSSObject, parent: Unit, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: CSSObject, parent: HTMLDOMElement): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: CSSObject, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: Unit, parent: Unit, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: Unit, parent: HTMLDOMElement): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: Unit, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: Unit, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
    
    def css(el: HTMLDOMElement, styles: CSSObject): Unit = js.native
    def css(el: SVGDOMElement, styles: CSSObject): Unit = js.native
    
    def dateFormat(format: String, timestamp: Double): String = js.native
    def dateFormat(format: String, timestamp: Double, capitalize: Boolean): String = js.native
    
    var dateFormats: Record[String, TimeFormatCallbackFunction] = js.native
    
    var defaultOptions: Options = js.native
    
    def defined(obj: Any): Boolean = js.native
    
    def destroyObjectProperties(obj: Any): Unit = js.native
    def destroyObjectProperties(obj: Any, except: Any): Unit = js.native
    
    def discardElement(element: HTMLDOMElement): Unit = js.native
    
    def each(arr: js.Array[Any], fn: js.Function): Unit = js.native
    def each(arr: js.Array[Any], fn: js.Function, ctx: Any): Unit = js.native
    
    def erase(arr: js.Array[Any], item: Any): Unit = js.native
    
    def error(code: String): Unit = js.native
    def error(code: String, stop: Boolean): Unit = js.native
    def error(code: String, stop: Boolean, chart: Unit, params: Dictionary[String]): Unit = js.native
    def error(code: String, stop: Boolean, chart: Chart_): Unit = js.native
    def error(code: String, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = js.native
    def error(code: String, stop: Unit, chart: Unit, params: Dictionary[String]): Unit = js.native
    def error(code: String, stop: Unit, chart: Chart_): Unit = js.native
    def error(code: String, stop: Unit, chart: Chart_, params: Dictionary[String]): Unit = js.native
    def error(code: Double): Unit = js.native
    def error(code: Double, stop: Boolean): Unit = js.native
    def error(code: Double, stop: Boolean, chart: Unit, params: Dictionary[String]): Unit = js.native
    def error(code: Double, stop: Boolean, chart: Chart_): Unit = js.native
    def error(code: Double, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = js.native
    def error(code: Double, stop: Unit, chart: Unit, params: Dictionary[String]): Unit = js.native
    def error(code: Double, stop: Unit, chart: Chart_): Unit = js.native
    def error(code: Double, stop: Unit, chart: Chart_, params: Dictionary[String]): Unit = js.native
    
    def extend[T](a: T, b: Partial[T]): T = js.native
    def extend[T](a: Unit, b: Partial[T]): T = js.native
    
    def extendClass[T](parent: Class[T], members: Dictionary[Any]): Class[T] = js.native
    
    def find[T](arr: js.Array[T], callback: js.Function): js.UndefOr[T] = js.native
    
    def fireEvent[T](el: T, `type`: String): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Unit, defaultFunction: js.Function): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Unit, defaultFunction: EventCallbackFunction[T]): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[Any]): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[Any], defaultFunction: js.Function): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[Any], defaultFunction: EventCallbackFunction[T]): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: js.Function): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: EventCallbackFunction[T]): Unit = js.native
    
    def format(str: String, ctx: Record[String, Any]): String = js.native
    def format(str: String, ctx: Record[String, Any], chart: Chart_): String = js.native
    
    def getDeferredAnimation(chart: Chart_, animation: Boolean): Double = js.native
    def getDeferredAnimation(chart: Chart_, animation: Boolean, series: Series): Double = js.native
    def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject): Double = js.native
    def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject, series: Series): Double = js.native
    
    def getMagnitude(num: Double): Double = js.native
    
    def getOptions(): Options = js.native
    
    def getRendererType(): Class[SVGRenderer] = js.native
    def getRendererType(rendererType: String): Class[SVGRenderer] = js.native
    
    def getStyle(el: HTMLDOMElement, prop: String): js.UndefOr[Double | String] = js.native
    def getStyle(el: HTMLDOMElement, prop: String, toInt: Boolean): js.UndefOr[Double | String] = js.native
    
    def grep(arr: js.Array[Any], callback: js.Function): js.Array[Any] = js.native
    
    def inArray(item: Any, arr: js.Array[Any]): Double = js.native
    def inArray(item: Any, arr: js.Array[Any], fromIndex: Double): Double = js.native
    
    def isArray(obj: Any): Boolean = js.native
    
    def isClass(): Boolean = js.native
    def isClass(obj: js.Object): Boolean = js.native
    
    def isDOMElement(obj: Any): Boolean = js.native
    
    def isNumber(n: Any): Boolean = js.native
    
    def isObject(obj: Any): Boolean = js.native
    def isObject(obj: Any, strict: Boolean): Boolean = js.native
    
    def isString(s: Any): Boolean = js.native
    
    def keys(obj: Any): js.Array[String] = js.native
    
    def map(arr: js.Array[Any], fn: js.Function): js.Array[Any] = js.native
    
    def merge[T](a: T, n: js.UndefOr[js.Object]*): T = js.native
    def merge[T](a: Unit, n: js.UndefOr[js.Object]*): T = js.native
    def merge[T](extend: Boolean, a: T, n: js.UndefOr[js.Object]*): T = js.native
    def merge[T](extend: Boolean, a: Unit, n: js.UndefOr[js.Object]*): T = js.native
    
    def normalizeTickInterval(interval: Double): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[Any]): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[Any], magnitude: Double): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[Any], magnitude: Double, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Double,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Double,
      allowDecimals: Unit,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[Any], magnitude: Unit, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Unit,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Unit,
      allowDecimals: Unit,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Double): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Double, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: Unit,
      magnitude: Double,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Double, allowDecimals: Unit, hasTickAmount: Boolean): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Unit, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Unit, allowDecimals: Boolean, hasTickAmount: Boolean): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Unit, allowDecimals: Unit, hasTickAmount: Boolean): Double = js.native
    
    def numberFormat(number: Double, decimals: Double): String = js.native
    def numberFormat(number: Double, decimals: Double, decimalPoint: String): String = js.native
    def numberFormat(number: Double, decimals: Double, decimalPoint: String, thousandsSep: String): String = js.native
    def numberFormat(number: Double, decimals: Double, decimalPoint: Unit, thousandsSep: String): String = js.native
    
    def objectEach[T](obj: Any, fn: ObjectEachCallbackFunction[T]): Unit = js.native
    def objectEach[T](obj: Any, fn: ObjectEachCallbackFunction[T], ctx: T): Unit = js.native
    
    def offset(el: Element): OffsetObject = js.native
    
    def pad(number: Double): String = js.native
    def pad(number: Double, length: Double): String = js.native
    def pad(number: Double, length: Double, padder: String): String = js.native
    def pad(number: Double, length: Unit, padder: String): String = js.native
    
    def pick[T](items: (js.UndefOr[T | Null])*): T = js.native
    
    def reduce(arr: js.Array[Any], fn: js.Function, initialValue: Any): Any = js.native
    
    def registerRendererType(rendererType: String, rendererClass: Class[SVGRenderer], setAsDefault: Boolean): Unit = js.native
    
    def relativeLength(value: RelativeSize, base: Double): Double = js.native
    def relativeLength(value: RelativeSize, base: Double, offset: Double): Double = js.native
    
    def removeEvent[T](el: T): Unit = js.native
    def removeEvent[T](el: T, `type`: String): Unit = js.native
    def removeEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
    def removeEvent[T](el: T, `type`: Unit, fn: EventCallbackFunction[T]): Unit = js.native
    def removeEvent[T](el: Class[T]): Unit = js.native
    def removeEvent[T](el: Class[T], `type`: String): Unit = js.native
    def removeEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
    def removeEvent[T](el: Class[T], `type`: Unit, fn: EventCallbackFunction[T]): Unit = js.native
    
    def seriesType(`type`: String, parent: String, options: Dictionary[Any]): Series = js.native
    def seriesType(`type`: String, parent: String, options: Dictionary[Any], props: Unit, pointProps: Dictionary[Any]): Series = js.native
    def seriesType(`type`: String, parent: String, options: Dictionary[Any], props: Dictionary[Any]): Series = js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: Dictionary[Any],
      props: Dictionary[Any],
      pointProps: Dictionary[Any]
    ): Series = js.native
    def seriesType(`type`: String, parent: String, options: SeriesOptionsType): Series = js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: SeriesOptionsType,
      props: Unit,
      pointProps: Dictionary[Any]
    ): Series = js.native
    def seriesType(`type`: String, parent: String, options: SeriesOptionsType, props: Dictionary[Any]): Series = js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: SeriesOptionsType,
      props: Dictionary[Any],
      pointProps: Dictionary[Any]
    ): Series = js.native
    
    def setAnimation(animation: Boolean, chart: Chart_): Unit = js.native
    def setAnimation(animation: Unit, chart: Chart_): Unit = js.native
    def setAnimation(animation: PartialAnimationOptionsOb, chart: Chart_): Unit = js.native
    
    def setOptions(options: Options): Unit = js.native
    
    def some(arr: js.Array[Any], fn: js.Function, ctx: Any): Boolean = js.native
    
    def splat(obj: Any): js.Array[Any] = js.native
    
    def stableSort(arr: js.Array[Any], sortFunction: js.Function): Unit = js.native
    
    def stop(el: SVGElement): Unit = js.native
    def stop(el: SVGElement, prop: String): Unit = js.native
    
    def syncTimeout(fn: js.Function, delay: Double): Double = js.native
    def syncTimeout(fn: js.Function, delay: Double, context: Any): Double = js.native
    
    var theme: Options = js.native
    
    var time: Time_ = js.native
    
    def uniqueKey(): String = js.native
    
    def useSerialIds(): js.UndefOr[Boolean] = js.native
    def useSerialIds(mode: Boolean): js.UndefOr[Boolean] = js.native
    
    def wrap(obj: Any, method: String, func: WrapProceedFunction): Unit = js.native
  }
  
  @js.native
  trait TypeofHighchartsAST extends StObject {
    
    var AST: TypeofAST = js.native
    
    var Annotation: Instantiable2[
        /* chart */ Chart_, 
        /* userOptions */ AnnotationsOptions, 
        typings.highcharts.mod.Annotation
      ] = js.native
    
    var AnnotationControlPoint: Instantiable4[
        /* chart */ Chart_, 
        /* target */ AnnotationControllable, 
        /* options */ AnnotationControlPointOptionsObject, 
        /* index */ js.UndefOr[Double], 
        typings.highcharts.mod.AnnotationControlPoint
      ] = js.native
    
    var Axis: Instantiable2[/* chart */ Chart_, /* userOptions */ AxisOptions, typings.highcharts.mod.Axis] = js.native
    
    var Chart: Instantiable2[/* options */ Options, /* callback */ js.UndefOr[ChartCallbackFunction], Chart_] = js.native
    
    var Color: TypeofColor = js.native
    
    var ColorAxis: Instantiable2[
        /* chart */ Chart_, 
        /* userOptions */ ColorAxisOptions, 
        typings.highcharts.mod.ColorAxis
      ] = js.native
    
    var Legend: Instantiable2[/* chart */ Chart_, /* options */ LegendOptions, typings.highcharts.mod.Legend] = js.native
    
    var PlotLineOrBand: Instantiable2[
        /* axis */ Axis, 
        /* options */ js.UndefOr[AxisPlotBandsOptions | AxisPlotLinesOptions], 
        typings.highcharts.mod.PlotLineOrBand
      ] = js.native
    
    var Point: Instantiable0[typings.highcharts.mod.Point] = js.native
    
    var Pointer: Instantiable2[/* chart */ Chart_, /* options */ Options, typings.highcharts.mod.Pointer] = js.native
    
    var SVGElement: Instantiable0[typings.highcharts.mod.SVGElement] = js.native
    
    var SVGRenderer: Instantiable7[
        /* container */ HTMLDOMElement, 
        /* width */ Double, 
        /* height */ Double, 
        /* style */ js.UndefOr[CSSObject], 
        /* forExport */ js.UndefOr[Boolean], 
        /* allowHTML */ js.UndefOr[Boolean], 
        /* styledMode */ js.UndefOr[Boolean], 
        typings.highcharts.mod.SVGRenderer
      ] = js.native
    
    var Series: TypeofSeries = js.native
    
    var SeriesPalettes: Any = js.native
    
    var Tick: Instantiable5[
        /* axis */ Axis, 
        /* pos */ Double, 
        /* type */ js.UndefOr[String], 
        /* noLabel */ js.UndefOr[Boolean], 
        /* parameters */ js.UndefOr[js.Object], 
        typings.highcharts.mod.Tick
      ] = js.native
    
    var Time: Instantiable1[/* options */ TimeOptions, Time_] = js.native
    
    var Tooltip: Instantiable2[/* chart */ Chart_, /* options */ TooltipOptions, typings.highcharts.mod.Tooltip] = js.native
    
    def addEvent[T](el: T, `type`: String, fn: js.Function): js.Function = js.native
    def addEvent[T](el: T, `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
    def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
    def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
    def addEvent[T](el: Class[T], `type`: String, fn: js.Function): js.Function = js.native
    def addEvent[T](el: Class[T], `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
    def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
    def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
    
    def animObject(): AnimationOptionsObject = js.native
    def animObject(animation: Boolean): AnimationOptionsObject = js.native
    def animObject(animation: AnimationOptionsObject): AnimationOptionsObject = js.native
    
    def animate(el: HTMLDOMElement, params: CSSObject): Unit = js.native
    def animate(el: HTMLDOMElement, params: CSSObject, opt: PartialAnimationOptionsOb): Unit = js.native
    def animate(el: HTMLDOMElement, params: SVGAttributes): Unit = js.native
    def animate(el: HTMLDOMElement, params: SVGAttributes, opt: PartialAnimationOptionsOb): Unit = js.native
    def animate(el: SVGElement, params: CSSObject): Unit = js.native
    def animate(el: SVGElement, params: CSSObject, opt: PartialAnimationOptionsOb): Unit = js.native
    def animate(el: SVGElement, params: SVGAttributes): Unit = js.native
    def animate(el: SVGElement, params: SVGAttributes, opt: PartialAnimationOptionsOb): Unit = js.native
    
    def arrayMax(data: js.Array[Any]): Double = js.native
    
    def arrayMin(data: js.Array[Any]): Double = js.native
    
    def attr(elem: HTMLDOMElement): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: String, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: String, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: Unit, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: Unit, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: HTMLAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: SVGAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: String, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: String, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: Unit, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: Unit, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: HTMLAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: SVGAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
    
    /**
      * Add logic to pad each axis with the amount of pixels necessary to avoid
      * the bubbles to overflow.
      */
    def axisBeforePadding(): Unit = js.native
    
    def callout(): Unit = js.native
    
    def chart(options: Options): Chart_ = js.native
    def chart(options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    def chart(renderTo: String, options: Options): Chart_ = js.native
    def chart(renderTo: String, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    def chart(renderTo: HTMLDOMElement, options: Options): Chart_ = js.native
    def chart(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    
    /**
      * If ranges are not specified, determine ranges from rendered bubble series
      * and render legend again.
      */
    def chartDrawChartBox(): Unit = js.native
    
    var charts: js.Array[js.UndefOr[Chart_]] = js.native
    
    def clearTimeout(): Unit = js.native
    def clearTimeout(id: Double): Unit = js.native
    
    def color(input: ColorType): Color_ = js.native
    
    def correctFloat(num: Double): Double = js.native
    def correctFloat(num: Double, prec: Double): Double = js.native
    
    def createElement(tag: String): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: Unit, parent: Unit, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: Unit, parent: HTMLDOMElement): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: Unit, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: CSSObject): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: CSSObject, parent: Unit, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: CSSObject, parent: HTMLDOMElement): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: CSSObject, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: Unit, parent: Unit, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: Unit, parent: HTMLDOMElement): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: Unit, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: Unit, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
    
    def css(el: HTMLDOMElement, styles: CSSObject): Unit = js.native
    def css(el: SVGDOMElement, styles: CSSObject): Unit = js.native
    
    def dateFormat(format: String, timestamp: Double): String = js.native
    def dateFormat(format: String, timestamp: Double, capitalize: Boolean): String = js.native
    
    var dateFormats: Record[String, TimeFormatCallbackFunction] = js.native
    
    var defaultOptions: Options = js.native
    
    def defined(obj: Any): Boolean = js.native
    
    def destroyObjectProperties(obj: Any): Unit = js.native
    def destroyObjectProperties(obj: Any, except: Any): Unit = js.native
    
    def discardElement(element: HTMLDOMElement): Unit = js.native
    
    def each(arr: js.Array[Any], fn: js.Function): Unit = js.native
    def each(arr: js.Array[Any], fn: js.Function, ctx: Any): Unit = js.native
    
    def erase(arr: js.Array[Any], item: Any): Unit = js.native
    
    def error(code: String): Unit = js.native
    def error(code: String, stop: Boolean): Unit = js.native
    def error(code: String, stop: Boolean, chart: Unit, params: Dictionary[String]): Unit = js.native
    def error(code: String, stop: Boolean, chart: Chart_): Unit = js.native
    def error(code: String, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = js.native
    def error(code: String, stop: Unit, chart: Unit, params: Dictionary[String]): Unit = js.native
    def error(code: String, stop: Unit, chart: Chart_): Unit = js.native
    def error(code: String, stop: Unit, chart: Chart_, params: Dictionary[String]): Unit = js.native
    def error(code: Double): Unit = js.native
    def error(code: Double, stop: Boolean): Unit = js.native
    def error(code: Double, stop: Boolean, chart: Unit, params: Dictionary[String]): Unit = js.native
    def error(code: Double, stop: Boolean, chart: Chart_): Unit = js.native
    def error(code: Double, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = js.native
    def error(code: Double, stop: Unit, chart: Unit, params: Dictionary[String]): Unit = js.native
    def error(code: Double, stop: Unit, chart: Chart_): Unit = js.native
    def error(code: Double, stop: Unit, chart: Chart_, params: Dictionary[String]): Unit = js.native
    
    def extend[T](a: T, b: Partial[T]): T = js.native
    def extend[T](a: Unit, b: Partial[T]): T = js.native
    
    def extendClass[T](parent: Class[T], members: Dictionary[Any]): Class[T] = js.native
    
    def find[T](arr: js.Array[T], callback: js.Function): js.UndefOr[T] = js.native
    
    def fireEvent[T](el: T, `type`: String): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Unit, defaultFunction: js.Function): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Unit, defaultFunction: EventCallbackFunction[T]): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[Any]): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[Any], defaultFunction: js.Function): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[Any], defaultFunction: EventCallbackFunction[T]): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: js.Function): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: EventCallbackFunction[T]): Unit = js.native
    
    def format(str: String, ctx: Record[String, Any]): String = js.native
    def format(str: String, ctx: Record[String, Any], chart: Chart_): String = js.native
    
    def getDeferredAnimation(chart: Chart_, animation: Boolean): Double = js.native
    def getDeferredAnimation(chart: Chart_, animation: Boolean, series: Series): Double = js.native
    def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject): Double = js.native
    def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject, series: Series): Double = js.native
    
    def getMagnitude(num: Double): Double = js.native
    
    /**
      * Wrap the getOffset method to return zero offset for title or labels in a
      * radial axis.
      */
    def getOffset(): Unit = js.native
    
    def getOptions(): Options = js.native
    
    /**
      * Find the path for plot lines perpendicular to the radial axis.
      */
    def getPlotLinePath(): Unit = js.native
    
    def getRendererType(): Class[SVGRenderer] = js.native
    def getRendererType(rendererType: String): Class[SVGRenderer] = js.native
    
    def getStyle(el: HTMLDOMElement, prop: String): js.UndefOr[Double | String] = js.native
    def getStyle(el: HTMLDOMElement, prop: String, toInt: Boolean): js.UndefOr[Double | String] = js.native
    
    /**
      * Find the position for the axis title, by default inside the gauge.
      */
    def getTitlePosition(): Unit = js.native
    
    def grep(arr: js.Array[Any], callback: js.Function): js.Array[Any] = js.native
    
    def inArray(item: Any, arr: js.Array[Any]): Double = js.native
    def inArray(item: Any, arr: js.Array[Any], fromIndex: Double): Double = js.native
    
    def isArray(obj: Any): Boolean = js.native
    
    def isClass(): Boolean = js.native
    def isClass(obj: js.Object): Boolean = js.native
    
    def isDOMElement(obj: Any): Boolean = js.native
    
    def isNumber(n: Any): Boolean = js.native
    
    def isObject(obj: Any): Boolean = js.native
    def isObject(obj: Any, strict: Boolean): Boolean = js.native
    
    def isString(s: Any): Boolean = js.native
    
    def keys(obj: Any): js.Array[String] = js.native
    
    def map(arr: js.Array[Any], fn: js.Function): js.Array[Any] = js.native
    
    def merge[T](a: T, n: js.UndefOr[js.Object]*): T = js.native
    def merge[T](a: Unit, n: js.UndefOr[js.Object]*): T = js.native
    def merge[T](extend: Boolean, a: T, n: js.UndefOr[js.Object]*): T = js.native
    def merge[T](extend: Boolean, a: Unit, n: js.UndefOr[js.Object]*): T = js.native
    
    def normalizeTickInterval(interval: Double): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[Any]): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[Any], magnitude: Double): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[Any], magnitude: Double, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Double,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Double,
      allowDecimals: Unit,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[Any], magnitude: Unit, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Unit,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Unit,
      allowDecimals: Unit,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Double): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Double, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: Unit,
      magnitude: Double,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Double, allowDecimals: Unit, hasTickAmount: Boolean): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Unit, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Unit, allowDecimals: Boolean, hasTickAmount: Boolean): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Unit, allowDecimals: Unit, hasTickAmount: Boolean): Double = js.native
    
    def numberFormat(number: Double, decimals: Double): String = js.native
    def numberFormat(number: Double, decimals: Double, decimalPoint: String): String = js.native
    def numberFormat(number: Double, decimals: Double, decimalPoint: String, thousandsSep: String): String = js.native
    def numberFormat(number: Double, decimals: Double, decimalPoint: Unit, thousandsSep: String): String = js.native
    
    def objectEach[T](obj: Any, fn: ObjectEachCallbackFunction[T]): Unit = js.native
    def objectEach[T](obj: Any, fn: ObjectEachCallbackFunction[T], ctx: T): Unit = js.native
    
    def offset(el: Element): OffsetObject = js.native
    
    /**
      * Finalize modification of axis instance with radial logic.
      */
    def onAxisAfterInit(): Unit = js.native
    
    /**
      * Wrap auto label align to avoid setting axis-wide rotation on radial axes.
      * (#4920)
      */
    def onAxisAutoLabelAlign(): Unit = js.native
    
    /**
      * Prepare axis translation.
      */
    def onAxisInitialAxisTranslation(): Unit = js.native
    
    /**
      * Start the bubble legend creation process.
      */
    def onLegendAfterGetAllItems(): Unit = js.native
    
    /**
      * Toggle bubble legend depending on the visible status of bubble series.
      */
    def onSeriesLegendItemClick(): Unit = js.native
    
    /**
      * Find the center position of the label based on the distance option.
      */
    def onTickAfterGetLabelPosition(): Unit = js.native
    
    /**
      * Add special cases within the Tick class' methods for radial axes.
      */
    def onTickAfterGetPosition(): Unit = js.native
    
    def pad(number: Double): String = js.native
    def pad(number: Double, length: Double): String = js.native
    def pad(number: Double, length: Double, padder: String): String = js.native
    def pad(number: Double, length: Unit, padder: String): String = js.native
    
    def pick[T](items: (js.UndefOr[T | Null])*): T = js.native
    
    def reduce(arr: js.Array[Any], fn: js.Function, initialValue: Any): Any = js.native
    
    def registerRendererType(rendererType: String, rendererClass: Class[SVGRenderer], setAsDefault: Boolean): Unit = js.native
    
    def relativeLength(value: RelativeSize, base: Double): Double = js.native
    def relativeLength(value: RelativeSize, base: Double, offset: Double): Double = js.native
    
    def removeEvent[T](el: T): Unit = js.native
    def removeEvent[T](el: T, `type`: String): Unit = js.native
    def removeEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
    def removeEvent[T](el: T, `type`: Unit, fn: EventCallbackFunction[T]): Unit = js.native
    def removeEvent[T](el: Class[T]): Unit = js.native
    def removeEvent[T](el: Class[T], `type`: String): Unit = js.native
    def removeEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
    def removeEvent[T](el: Class[T], `type`: Unit, fn: EventCallbackFunction[T]): Unit = js.native
    
    /**
      * Prevent setting Y axis dirty.
      */
    def renderHidden(): Unit = js.native
    
    def seriesType(`type`: String, parent: String, options: Dictionary[Any]): Series = js.native
    def seriesType(`type`: String, parent: String, options: Dictionary[Any], props: Unit, pointProps: Dictionary[Any]): Series = js.native
    def seriesType(`type`: String, parent: String, options: Dictionary[Any], props: Dictionary[Any]): Series = js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: Dictionary[Any],
      props: Dictionary[Any],
      pointProps: Dictionary[Any]
    ): Series = js.native
    def seriesType(`type`: String, parent: String, options: SeriesOptionsType): Series = js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: SeriesOptionsType,
      props: Unit,
      pointProps: Dictionary[Any]
    ): Series = js.native
    def seriesType(`type`: String, parent: String, options: SeriesOptionsType, props: Dictionary[Any]): Series = js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: SeriesOptionsType,
      props: Dictionary[Any],
      pointProps: Dictionary[Any]
    ): Series = js.native
    
    def setAnimation(animation: Boolean, chart: Chart_): Unit = js.native
    def setAnimation(animation: Unit, chart: Chart_): Unit = js.native
    def setAnimation(animation: PartialAnimationOptionsOb, chart: Chart_): Unit = js.native
    
    def setOptions(options: Options): Unit = js.native
    
    def some(arr: js.Array[Any], fn: js.Function, ctx: Any): Boolean = js.native
    
    def splat(obj: Any): js.Array[Any] = js.native
    
    def stableSort(arr: js.Array[Any], sortFunction: js.Function): Unit = js.native
    
    def stop(el: SVGElement): Unit = js.native
    def stop(el: SVGElement, prop: String): Unit = js.native
    
    def syncTimeout(fn: js.Function, delay: Double): Double = js.native
    def syncTimeout(fn: js.Function, delay: Double, context: Any): Double = js.native
    
    var theme: Options = js.native
    
    var time: Time_ = js.native
    
    def uniqueKey(): String = js.native
    
    def useSerialIds(): js.UndefOr[Boolean] = js.native
    def useSerialIds(mode: Boolean): js.UndefOr[Boolean] = js.native
    
    def wrap(obj: Any, method: String, func: WrapProceedFunction): Unit = js.native
    
    /**
      * Wrap the getMarkPath function to return the path of the radial marker.
      */
    def wrapTickGetMarkPath(): Unit = js.native
  }
  
  @js.native
  trait TypeofHighchartsAddEvent extends StObject {
    
    var AST: TypeofAST = js.native
    
    var Annotation: Instantiable2[
        /* chart */ Chart_, 
        /* userOptions */ AnnotationsOptions, 
        typings.highcharts.mod.Annotation
      ] = js.native
    
    var AnnotationControlPoint: Instantiable4[
        /* chart */ Chart_, 
        /* target */ AnnotationControllable, 
        /* options */ AnnotationControlPointOptionsObject, 
        /* index */ js.UndefOr[Double], 
        typings.highcharts.mod.AnnotationControlPoint
      ] = js.native
    
    var Axis: Instantiable2[/* chart */ Chart_, /* userOptions */ AxisOptions, typings.highcharts.mod.Axis] = js.native
    
    var Chart: Instantiable2[/* options */ Options, /* callback */ js.UndefOr[ChartCallbackFunction], Chart_] = js.native
    
    var Color: TypeofColor = js.native
    
    var ColorAxis: Instantiable2[
        /* chart */ Chart_, 
        /* userOptions */ ColorAxisOptions, 
        typings.highcharts.mod.ColorAxis
      ] = js.native
    
    var Legend: Instantiable2[/* chart */ Chart_, /* options */ LegendOptions, typings.highcharts.mod.Legend] = js.native
    
    var PlotLineOrBand: Instantiable2[
        /* axis */ Axis, 
        /* options */ js.UndefOr[AxisPlotBandsOptions | AxisPlotLinesOptions], 
        typings.highcharts.mod.PlotLineOrBand
      ] = js.native
    
    var Point: Instantiable0[typings.highcharts.mod.Point] = js.native
    
    var Pointer: Instantiable2[/* chart */ Chart_, /* options */ Options, typings.highcharts.mod.Pointer] = js.native
    
    var SVGElement: Instantiable0[typings.highcharts.mod.SVGElement] = js.native
    
    var SVGRenderer: Instantiable7[
        /* container */ HTMLDOMElement, 
        /* width */ Double, 
        /* height */ Double, 
        /* style */ js.UndefOr[CSSObject], 
        /* forExport */ js.UndefOr[Boolean], 
        /* allowHTML */ js.UndefOr[Boolean], 
        /* styledMode */ js.UndefOr[Boolean], 
        typings.highcharts.mod.SVGRenderer
      ] = js.native
    
    var Series: TypeofSeries = js.native
    
    var SeriesPalettes: Any = js.native
    
    var Tick: Instantiable5[
        /* axis */ Axis, 
        /* pos */ Double, 
        /* type */ js.UndefOr[String], 
        /* noLabel */ js.UndefOr[Boolean], 
        /* parameters */ js.UndefOr[js.Object], 
        typings.highcharts.mod.Tick
      ] = js.native
    
    var Time: Instantiable1[/* options */ TimeOptions, Time_] = js.native
    
    var Tooltip: Instantiable2[/* chart */ Chart_, /* options */ TooltipOptions, typings.highcharts.mod.Tooltip] = js.native
    
    def addEvent[T](el: T, `type`: String, fn: js.Function): js.Function = js.native
    def addEvent[T](el: T, `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
    def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
    def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
    def addEvent[T](el: Class[T], `type`: String, fn: js.Function): js.Function = js.native
    def addEvent[T](el: Class[T], `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
    def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
    def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
    
    def animObject(): AnimationOptionsObject = js.native
    def animObject(animation: Boolean): AnimationOptionsObject = js.native
    def animObject(animation: AnimationOptionsObject): AnimationOptionsObject = js.native
    
    def animate(el: HTMLDOMElement, params: CSSObject): Unit = js.native
    def animate(el: HTMLDOMElement, params: CSSObject, opt: PartialAnimationOptionsOb): Unit = js.native
    def animate(el: HTMLDOMElement, params: SVGAttributes): Unit = js.native
    def animate(el: HTMLDOMElement, params: SVGAttributes, opt: PartialAnimationOptionsOb): Unit = js.native
    def animate(el: SVGElement, params: CSSObject): Unit = js.native
    def animate(el: SVGElement, params: CSSObject, opt: PartialAnimationOptionsOb): Unit = js.native
    def animate(el: SVGElement, params: SVGAttributes): Unit = js.native
    def animate(el: SVGElement, params: SVGAttributes, opt: PartialAnimationOptionsOb): Unit = js.native
    
    def arrayMax(data: js.Array[Any]): Double = js.native
    
    def arrayMin(data: js.Array[Any]): Double = js.native
    
    def attr(elem: HTMLDOMElement): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: String, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: String, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: Unit, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: Unit, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: HTMLAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: SVGAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, keyOrAttribs: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: String, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: String, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: Unit, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: Unit, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: HTMLAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: SVGAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, keyOrAttribs: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
    
    def callout(): Unit = js.native
    
    def chart(options: Options): Chart_ = js.native
    def chart(options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    def chart(renderTo: String, options: Options): Chart_ = js.native
    def chart(renderTo: String, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    def chart(renderTo: HTMLDOMElement, options: Options): Chart_ = js.native
    def chart(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    
    var charts: js.Array[js.UndefOr[Chart_]] = js.native
    
    def clearTimeout(): Unit = js.native
    def clearTimeout(id: Double): Unit = js.native
    
    def color(input: ColorType): Color_ = js.native
    
    def correctFloat(num: Double): Double = js.native
    def correctFloat(num: Double, prec: Double): Double = js.native
    
    def createElement(tag: String): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: Unit, parent: Unit, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: Unit, parent: HTMLDOMElement): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: Unit, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: CSSObject): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: CSSObject, parent: Unit, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: CSSObject, parent: HTMLDOMElement): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: Unit, styles: CSSObject, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: Unit, parent: Unit, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: Unit, parent: HTMLDOMElement): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: Unit, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: Unit, nopad: Boolean): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement): HTMLDOMElement = js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
    
    def css(el: HTMLDOMElement, styles: CSSObject): Unit = js.native
    def css(el: SVGDOMElement, styles: CSSObject): Unit = js.native
    
    def dateFormat(format: String, timestamp: Double): String = js.native
    def dateFormat(format: String, timestamp: Double, capitalize: Boolean): String = js.native
    
    var dateFormats: Record[String, TimeFormatCallbackFunction] = js.native
    
    var defaultOptions: Options = js.native
    
    def defined(obj: Any): Boolean = js.native
    
    def destroyObjectProperties(obj: Any): Unit = js.native
    def destroyObjectProperties(obj: Any, except: Any): Unit = js.native
    
    def discardElement(element: HTMLDOMElement): Unit = js.native
    
    def each(arr: js.Array[Any], fn: js.Function): Unit = js.native
    def each(arr: js.Array[Any], fn: js.Function, ctx: Any): Unit = js.native
    
    def erase(arr: js.Array[Any], item: Any): Unit = js.native
    
    def error(code: String): Unit = js.native
    def error(code: String, stop: Boolean): Unit = js.native
    def error(code: String, stop: Boolean, chart: Unit, params: Dictionary[String]): Unit = js.native
    def error(code: String, stop: Boolean, chart: Chart_): Unit = js.native
    def error(code: String, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = js.native
    def error(code: String, stop: Unit, chart: Unit, params: Dictionary[String]): Unit = js.native
    def error(code: String, stop: Unit, chart: Chart_): Unit = js.native
    def error(code: String, stop: Unit, chart: Chart_, params: Dictionary[String]): Unit = js.native
    def error(code: Double): Unit = js.native
    def error(code: Double, stop: Boolean): Unit = js.native
    def error(code: Double, stop: Boolean, chart: Unit, params: Dictionary[String]): Unit = js.native
    def error(code: Double, stop: Boolean, chart: Chart_): Unit = js.native
    def error(code: Double, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = js.native
    def error(code: Double, stop: Unit, chart: Unit, params: Dictionary[String]): Unit = js.native
    def error(code: Double, stop: Unit, chart: Chart_): Unit = js.native
    def error(code: Double, stop: Unit, chart: Chart_, params: Dictionary[String]): Unit = js.native
    
    def extend[T](a: T, b: Partial[T]): T = js.native
    def extend[T](a: Unit, b: Partial[T]): T = js.native
    
    def extendClass[T](parent: Class[T], members: Dictionary[Any]): Class[T] = js.native
    
    def find[T](arr: js.Array[T], callback: js.Function): js.UndefOr[T] = js.native
    
    def fireEvent[T](el: T, `type`: String): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Unit, defaultFunction: js.Function): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Unit, defaultFunction: EventCallbackFunction[T]): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[Any]): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[Any], defaultFunction: js.Function): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[Any], defaultFunction: EventCallbackFunction[T]): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: js.Function): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: EventCallbackFunction[T]): Unit = js.native
    
    def format(str: String, ctx: Record[String, Any]): String = js.native
    def format(str: String, ctx: Record[String, Any], chart: Chart_): String = js.native
    
    def getDeferredAnimation(chart: Chart_, animation: Boolean): Double = js.native
    def getDeferredAnimation(chart: Chart_, animation: Boolean, series: Series): Double = js.native
    def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject): Double = js.native
    def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject, series: Series): Double = js.native
    
    def getMagnitude(num: Double): Double = js.native
    
    def getOptions(): Options = js.native
    
    def getRendererType(): Class[SVGRenderer] = js.native
    def getRendererType(rendererType: String): Class[SVGRenderer] = js.native
    
    def getStyle(el: HTMLDOMElement, prop: String): js.UndefOr[Double | String] = js.native
    def getStyle(el: HTMLDOMElement, prop: String, toInt: Boolean): js.UndefOr[Double | String] = js.native
    
    def grep(arr: js.Array[Any], callback: js.Function): js.Array[Any] = js.native
    
    def inArray(item: Any, arr: js.Array[Any]): Double = js.native
    def inArray(item: Any, arr: js.Array[Any], fromIndex: Double): Double = js.native
    
    def isArray(obj: Any): Boolean = js.native
    
    def isClass(): Boolean = js.native
    def isClass(obj: js.Object): Boolean = js.native
    
    def isDOMElement(obj: Any): Boolean = js.native
    
    def isNumber(n: Any): Boolean = js.native
    
    def isObject(obj: Any): Boolean = js.native
    def isObject(obj: Any, strict: Boolean): Boolean = js.native
    
    def isString(s: Any): Boolean = js.native
    
    def keys(obj: Any): js.Array[String] = js.native
    
    def map(arr: js.Array[Any], fn: js.Function): js.Array[Any] = js.native
    
    def merge[T](a: T, n: js.UndefOr[js.Object]*): T = js.native
    def merge[T](a: Unit, n: js.UndefOr[js.Object]*): T = js.native
    def merge[T](extend: Boolean, a: T, n: js.UndefOr[js.Object]*): T = js.native
    def merge[T](extend: Boolean, a: Unit, n: js.UndefOr[js.Object]*): T = js.native
    
    def normalizeTickInterval(interval: Double): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[Any]): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[Any], magnitude: Double): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[Any], magnitude: Double, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Double,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Double,
      allowDecimals: Unit,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[Any], magnitude: Unit, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Unit,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Unit,
      allowDecimals: Unit,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Double): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Double, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: Unit,
      magnitude: Double,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Double, allowDecimals: Unit, hasTickAmount: Boolean): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Unit, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Unit, allowDecimals: Boolean, hasTickAmount: Boolean): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Unit, allowDecimals: Unit, hasTickAmount: Boolean): Double = js.native
    
    def numberFormat(number: Double, decimals: Double): String = js.native
    def numberFormat(number: Double, decimals: Double, decimalPoint: String): String = js.native
    def numberFormat(number: Double, decimals: Double, decimalPoint: String, thousandsSep: String): String = js.native
    def numberFormat(number: Double, decimals: Double, decimalPoint: Unit, thousandsSep: String): String = js.native
    
    def objectEach[T](obj: Any, fn: ObjectEachCallbackFunction[T]): Unit = js.native
    def objectEach[T](obj: Any, fn: ObjectEachCallbackFunction[T], ctx: T): Unit = js.native
    
    def offset(el: Element): OffsetObject = js.native
    
    def pad(number: Double): String = js.native
    def pad(number: Double, length: Double): String = js.native
    def pad(number: Double, length: Double, padder: String): String = js.native
    def pad(number: Double, length: Unit, padder: String): String = js.native
    
    def pick[T](items: (js.UndefOr[T | Null])*): T = js.native
    
    def reduce(arr: js.Array[Any], fn: js.Function, initialValue: Any): Any = js.native
    
    def registerRendererType(rendererType: String, rendererClass: Class[SVGRenderer], setAsDefault: Boolean): Unit = js.native
    
    def relativeLength(value: RelativeSize, base: Double): Double = js.native
    def relativeLength(value: RelativeSize, base: Double, offset: Double): Double = js.native
    
    def removeEvent[T](el: T): Unit = js.native
    def removeEvent[T](el: T, `type`: String): Unit = js.native
    def removeEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
    def removeEvent[T](el: T, `type`: Unit, fn: EventCallbackFunction[T]): Unit = js.native
    def removeEvent[T](el: Class[T]): Unit = js.native
    def removeEvent[T](el: Class[T], `type`: String): Unit = js.native
    def removeEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
    def removeEvent[T](el: Class[T], `type`: Unit, fn: EventCallbackFunction[T]): Unit = js.native
    
    def seriesType(`type`: String, parent: String, options: Dictionary[Any]): Series = js.native
    def seriesType(`type`: String, parent: String, options: Dictionary[Any], props: Unit, pointProps: Dictionary[Any]): Series = js.native
    def seriesType(`type`: String, parent: String, options: Dictionary[Any], props: Dictionary[Any]): Series = js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: Dictionary[Any],
      props: Dictionary[Any],
      pointProps: Dictionary[Any]
    ): Series = js.native
    def seriesType(`type`: String, parent: String, options: SeriesOptionsType): Series = js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: SeriesOptionsType,
      props: Unit,
      pointProps: Dictionary[Any]
    ): Series = js.native
    def seriesType(`type`: String, parent: String, options: SeriesOptionsType, props: Dictionary[Any]): Series = js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: SeriesOptionsType,
      props: Dictionary[Any],
      pointProps: Dictionary[Any]
    ): Series = js.native
    
    def setAnimation(animation: Boolean, chart: Chart_): Unit = js.native
    def setAnimation(animation: Unit, chart: Chart_): Unit = js.native
    def setAnimation(animation: PartialAnimationOptionsOb, chart: Chart_): Unit = js.native
    
    def setOptions(options: Options): Unit = js.native
    
    def some(arr: js.Array[Any], fn: js.Function, ctx: Any): Boolean = js.native
    
    def splat(obj: Any): js.Array[Any] = js.native
    
    def stableSort(arr: js.Array[Any], sortFunction: js.Function): Unit = js.native
    
    def stop(el: SVGElement): Unit = js.native
    def stop(el: SVGElement, prop: String): Unit = js.native
    
    def syncTimeout(fn: js.Function, delay: Double): Double = js.native
    def syncTimeout(fn: js.Function, delay: Double, context: Any): Double = js.native
    
    var theme: Options = js.native
    
    var time: Time_ = js.native
    
    def uniqueKey(): String = js.native
    
    def useSerialIds(): js.UndefOr[Boolean] = js.native
    def useSerialIds(mode: Boolean): js.UndefOr[Boolean] = js.native
    
    def wrap(obj: Any, method: String, func: WrapProceedFunction): Unit = js.native
  }
  
  @js.native
  trait TypeofSeries
    extends StObject
       with Instantiable2[
          /* chart */ Chart_, 
          (/* options */ js.Object) | (/* options */ SeriesOptionsType), 
          Series
        ] {
    
    /**
      * Registers a series class to be accessible via `Series.types`.
      *
      * @param seriesType
      *        The series type as an identifier string in lower case.
      *
      * @param SeriesClass
      *        The series class as a class pattern or a constructor function with
      *        prototype.
      */
    def registerType(seriesType: String, SeriesClass: js.Function): Unit = js.native
    
    /**
      * Registry of all available series types.
      */
    var types: Dictionary[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof Series */ js.Any
      ] = js.native
  }
}
