package typings.highcharts

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable7
import typings.highcharts.anon.PartialAnimationOptionsOb
import typings.highcharts.anon.TypeofAST
import typings.highcharts.anon.TypeofColor
import typings.highcharts.anon.TypeofHighchartsAddEvent
import typings.highcharts.anon.TypeofSeries
import typings.highcharts.mod.ASTNode
import typings.highcharts.mod.AnimationOptionsObject
import typings.highcharts.mod.AnnotationControlPointOptionsObject
import typings.highcharts.mod.AnnotationControllable
import typings.highcharts.mod.AnnotationsOptions
import typings.highcharts.mod.AxisOptions
import typings.highcharts.mod.AxisPlotBandsOptions
import typings.highcharts.mod.AxisPlotLinesOptions
import typings.highcharts.mod.CSSObject
import typings.highcharts.mod.ChartCallbackFunction
import typings.highcharts.mod.Chart_
import typings.highcharts.mod.Class
import typings.highcharts.mod.ColorAxisOptions
import typings.highcharts.mod.ColorType
import typings.highcharts.mod.Color_
import typings.highcharts.mod.Dictionary
import typings.highcharts.mod.EventCallbackFunction
import typings.highcharts.mod.EventOptionsObject
import typings.highcharts.mod.HTMLAttributes
import typings.highcharts.mod.HTMLDOMElement
import typings.highcharts.mod.LegendOptions
import typings.highcharts.mod.ObjectEachCallbackFunction
import typings.highcharts.mod.OffsetObject
import typings.highcharts.mod.Options
import typings.highcharts.mod.RelativeSize
import typings.highcharts.mod.SVGAttributes
import typings.highcharts.mod.SVGDOMElement
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

object indicatorsAccumulationDistributionMod {
  
  @JSImport("highcharts/indicators/accumulation-distribution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(highcharts: TypeofHighchartsAddEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(highcharts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object Highcharts {
    
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.AST")
    @js.native
    open class AST protected ()
      extends typings.highcharts.mod.AST {
      /**
        * The AST class represents an abstract syntax tree of HTML or SVG content.
        * It can take HTML as an argument, parse it, optionally transform it to
        * SVG, then perform sanitation before inserting it into the DOM.
        *
        * @param source
        *        Either an HTML string or an ASTNode list to populate the tree.
        */
      def this(source: String) = this()
      def this(source: js.Array[ASTNode]) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.AST")
    @js.native
    def AST: TypeofAST = js.native
    inline def AST_=(x: TypeofAST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AST")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Annotation")
    @js.native
    open class Annotation protected ()
      extends typings.highcharts.mod.Annotation {
      /**
        * An annotation class which serves as a container for items like labels or
        * shapes. Created items are positioned on the chart either by linking them
        * to existing points or created mock points
        *
        * @param chart
        *        A chart instance
        *
        * @param userOptions
        *        The annotation options
        */
      def this(chart: Chart_, userOptions: AnnotationsOptions) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Annotation")
    @js.native
    def Annotation: Instantiable2[
        /* chart */ Chart_, 
        /* userOptions */ AnnotationsOptions, 
        typings.highcharts.mod.Annotation
      ] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.AnnotationControlPoint")
    @js.native
    open class AnnotationControlPoint protected ()
      extends typings.highcharts.mod.AnnotationControlPoint {
      /**
        * A control point class which is a connection between controllable
        * transform methods and a user actions.
        *
        * @param chart
        *        A chart instance.
        *
        * @param target
        *        A controllable instance which is a target for a control point.
        *
        * @param options
        *        An options object.
        *
        * @param index
        *        Point index.
        */
      def this(chart: Chart_, target: AnnotationControllable, options: AnnotationControlPointOptionsObject) = this()
      def this(
        chart: Chart_,
        target: AnnotationControllable,
        options: AnnotationControlPointOptionsObject,
        index: Double
      ) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.AnnotationControlPoint")
    @js.native
    def AnnotationControlPoint: Instantiable4[
        /* chart */ Chart_, 
        /* target */ AnnotationControllable, 
        /* options */ AnnotationControlPointOptionsObject, 
        /* index */ js.UndefOr[Double], 
        typings.highcharts.mod.AnnotationControlPoint
      ] = js.native
    inline def AnnotationControlPoint_=(
      x: Instantiable4[
          /* chart */ Chart_, 
          /* target */ AnnotationControllable, 
          /* options */ AnnotationControlPointOptionsObject, 
          /* index */ js.UndefOr[Double], 
          typings.highcharts.mod.AnnotationControlPoint
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnnotationControlPoint")(x.asInstanceOf[js.Any])
    
    inline def Annotation_=(
      x: Instantiable2[
          /* chart */ Chart_, 
          /* userOptions */ AnnotationsOptions, 
          typings.highcharts.mod.Annotation
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Annotation")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Axis")
    @js.native
    open class Axis protected ()
      extends typings.highcharts.mod.Axis {
      /**
        * Create a new axis object. Called internally when instanciating a new
        * chart or adding axes by Highcharts.Chart#addAxis.
        *
        * A chart can have from 0 axes (pie chart) to multiples. In a normal,
        * single series cartesian chart, there is one X axis and one Y axis.
        *
        * The X axis or axes are referenced by Highcharts.Chart.xAxis, which is an
        * array of Axis objects. If there is only one axis, it can be referenced
        * through `chart.xAxis[0]`, and multiple axes have increasing indices. The
        * same pattern goes for Y axes.
        *
        * If you need to get the axes from a series object, use the `series.xAxis`
        * and `series.yAxis` properties. These are not arrays, as one series can
        * only be associated to one X and one Y axis.
        *
        * A third way to reference the axis programmatically is by `id`. Add an
        * `id` in the axis configuration options, and get the axis by
        * Highcharts.Chart#get.
        *
        * Configuration options for the axes are given in options.xAxis and
        * options.yAxis.
        *
        * @param chart
        *        The Chart instance to apply the axis on.
        *
        * @param userOptions
        *        Axis options.
        */
      def this(chart: Chart_, userOptions: AxisOptions) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Axis")
    @js.native
    def Axis: Instantiable2[/* chart */ Chart_, /* userOptions */ AxisOptions, typings.highcharts.mod.Axis] = js.native
    inline def Axis_=(x: Instantiable2[/* chart */ Chart_, /* userOptions */ AxisOptions, typings.highcharts.mod.Axis]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Axis")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Chart")
    @js.native
    open class Chart protected () extends Chart_ {
      /**
        * The Chart class. The recommended constructor is Highcharts#chart.
        *
        * @param options
        *        The chart options structure.
        *
        * @param callback
        *        Function to run when the chart has loaded and and all external
        *        images are loaded. Defining a chart.events.load handler is
        *        equivalent.
        */
      def this(options: Options) = this()
      def this(options: Options, callback: ChartCallbackFunction) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Chart")
    @js.native
    def Chart_ : Instantiable2[
        /* options */ Options, 
        /* callback */ js.UndefOr[ChartCallbackFunction], 
        typings.highcharts.mod.Chart_
      ] = js.native
    
    inline def Chart__=(x: Instantiable2[/* options */ Options, /* callback */ js.UndefOr[ChartCallbackFunction], Chart_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Chart")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Color")
    @js.native
    open class Color protected () extends Color_ {
      /**
        * Handle color operations. Some object methods are chainable.
        *
        * @param input
        *        The input color in either rbga or hex format
        */
      def this(input: ColorType) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.ColorAxis")
    @js.native
    open class ColorAxis protected ()
      extends typings.highcharts.mod.ColorAxis {
      /**
        * The ColorAxis object for inclusion in gradient legends.
        *
        * @param chart
        *        The related chart of the color axis.
        *
        * @param userOptions
        *        The color axis options for initialization.
        */
      def this(chart: Chart_, userOptions: ColorAxisOptions) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.ColorAxis")
    @js.native
    def ColorAxis: Instantiable2[
        /* chart */ Chart_, 
        /* userOptions */ ColorAxisOptions, 
        typings.highcharts.mod.ColorAxis
      ] = js.native
    inline def ColorAxis_=(
      x: Instantiable2[
          /* chart */ Chart_, 
          /* userOptions */ ColorAxisOptions, 
          typings.highcharts.mod.ColorAxis
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ColorAxis")(x.asInstanceOf[js.Any])
    
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Color")
    @js.native
    def Color_ : TypeofColor = js.native
    
    inline def Color__=(x: TypeofColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Color")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Legend")
    @js.native
    open class Legend protected ()
      extends typings.highcharts.mod.Legend {
      /**
        * The overview of the chart's series. The legend object is instanciated
        * internally in the chart constructor, and is available from the
        * `chart.legend` property. Each chart has only one legend.
        *
        * @param chart
        *        The chart instance.
        *
        * @param options
        *        Legend options.
        */
      def this(chart: Chart_, options: LegendOptions) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Legend")
    @js.native
    def Legend: Instantiable2[/* chart */ Chart_, /* options */ LegendOptions, typings.highcharts.mod.Legend] = js.native
    inline def Legend_=(x: Instantiable2[/* chart */ Chart_, /* options */ LegendOptions, typings.highcharts.mod.Legend]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Legend")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.PlotLineOrBand")
    @js.native
    open class PlotLineOrBand protected ()
      extends typings.highcharts.mod.PlotLineOrBand {
      /**
        * The object wrapper for plot lines and plot bands
        *
        * @param axis
        *        Related axis.
        *
        * @param options
        *        Options to use.
        */
      def this(axis: typings.highcharts.mod.Axis) = this()
      def this(axis: typings.highcharts.mod.Axis, options: AxisPlotBandsOptions) = this()
      def this(axis: typings.highcharts.mod.Axis, options: AxisPlotLinesOptions) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.PlotLineOrBand")
    @js.native
    def PlotLineOrBand: Instantiable2[
        /* axis */ typings.highcharts.mod.Axis, 
        /* options */ js.UndefOr[AxisPlotBandsOptions | AxisPlotLinesOptions], 
        typings.highcharts.mod.PlotLineOrBand
      ] = js.native
    inline def PlotLineOrBand_=(
      x: Instantiable2[
          /* axis */ typings.highcharts.mod.Axis, 
          /* options */ js.UndefOr[AxisPlotBandsOptions | AxisPlotLinesOptions], 
          typings.highcharts.mod.PlotLineOrBand
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PlotLineOrBand")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Point")
    @js.native
    open class Point ()
      extends typings.highcharts.mod.Point
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Point")
    @js.native
    def Point: Instantiable0[typings.highcharts.mod.Point] = js.native
    inline def Point_=(x: Instantiable0[typings.highcharts.mod.Point]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Point")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Pointer")
    @js.native
    open class Pointer protected ()
      extends typings.highcharts.mod.Pointer {
      /**
        * The mouse and touch tracker object. Each Chart item has one associated
        * Pointer item that can be accessed from the Chart.pointer property.
        *
        * @param chart
        *        The chart instance.
        *
        * @param options
        *        The root options object. The pointer uses options from the chart
        *        and tooltip structures.
        */
      def this(chart: Chart_, options: Options) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Pointer")
    @js.native
    def Pointer: Instantiable2[/* chart */ Chart_, /* options */ Options, typings.highcharts.mod.Pointer] = js.native
    inline def Pointer_=(x: Instantiable2[/* chart */ Chart_, /* options */ Options, typings.highcharts.mod.Pointer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pointer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.SVGElement")
    @js.native
    open class SVGElement ()
      extends typings.highcharts.mod.SVGElement
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.SVGElement")
    @js.native
    def SVGElement: Instantiable0[typings.highcharts.mod.SVGElement] = js.native
    inline def SVGElement_=(x: Instantiable0[typings.highcharts.mod.SVGElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SVGElement")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.SVGRenderer")
    @js.native
    open class SVGRenderer protected ()
      extends typings.highcharts.mod.SVGRenderer {
      /**
        * Allows direct access to the Highcharts rendering layer in order to draw
        * primitive shapes like circles, rectangles, paths or text directly on a
        * chart, or independent from any chart. The SVGRenderer represents a
        * wrapper object for SVG in modern browsers. Through the VMLRenderer, part
        * of the `oldie.js` module, it also brings vector graphics to IE <= 8.
        *
        * An existing chart's renderer can be accessed through Chart.renderer. The
        * renderer can also be used completely decoupled from a chart.
        *
        * @param container
        *        Where to put the SVG in the web page.
        *
        * @param width
        *        The width of the SVG.
        *
        * @param height
        *        The height of the SVG.
        *
        * @param style
        *        The box style, if not in styleMode
        *
        * @param forExport
        *        Whether the rendered content is intended for export.
        *
        * @param allowHTML
        *        Whether the renderer is allowed to include HTML text, which will
        *        be projected on top of the SVG.
        *
        * @param styledMode
        *        Whether the renderer belongs to a chart that is in styled mode. If
        *        it does, it will avoid setting presentational attributes in some
        *        cases, but not when set explicitly through `.attr` and `.css` etc.
        */
      def this(container: HTMLDOMElement, width: Double, height: Double) = this()
      def this(container: HTMLDOMElement, width: Double, height: Double, style: CSSObject) = this()
      def this(container: HTMLDOMElement, width: Double, height: Double, style: Unit, forExport: Boolean) = this()
      def this(container: HTMLDOMElement, width: Double, height: Double, style: CSSObject, forExport: Boolean) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: Unit,
        forExport: Boolean,
        allowHTML: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: Unit,
        forExport: Unit,
        allowHTML: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: CSSObject,
        forExport: Boolean,
        allowHTML: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: CSSObject,
        forExport: Unit,
        allowHTML: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: Unit,
        forExport: Boolean,
        allowHTML: Boolean,
        styledMode: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: Unit,
        forExport: Boolean,
        allowHTML: Unit,
        styledMode: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: Unit,
        forExport: Unit,
        allowHTML: Boolean,
        styledMode: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: Unit,
        forExport: Unit,
        allowHTML: Unit,
        styledMode: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: CSSObject,
        forExport: Boolean,
        allowHTML: Boolean,
        styledMode: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: CSSObject,
        forExport: Boolean,
        allowHTML: Unit,
        styledMode: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: CSSObject,
        forExport: Unit,
        allowHTML: Boolean,
        styledMode: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: CSSObject,
        forExport: Unit,
        allowHTML: Unit,
        styledMode: Boolean
      ) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.SVGRenderer")
    @js.native
    def SVGRenderer: Instantiable7[
        /* container */ HTMLDOMElement, 
        /* width */ Double, 
        /* height */ Double, 
        /* style */ js.UndefOr[CSSObject], 
        /* forExport */ js.UndefOr[Boolean], 
        /* allowHTML */ js.UndefOr[Boolean], 
        /* styledMode */ js.UndefOr[Boolean], 
        typings.highcharts.mod.SVGRenderer
      ] = js.native
    inline def SVGRenderer_=(
      x: Instantiable7[
          /* container */ HTMLDOMElement, 
          /* width */ Double, 
          /* height */ Double, 
          /* style */ js.UndefOr[CSSObject], 
          /* forExport */ js.UndefOr[Boolean], 
          /* allowHTML */ js.UndefOr[Boolean], 
          /* styledMode */ js.UndefOr[Boolean], 
          typings.highcharts.mod.SVGRenderer
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SVGRenderer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Series")
    @js.native
    open class Series protected ()
      extends typings.highcharts.mod.Series {
      /**
        * This is the base series prototype that all other series types inherit
        * from. A new series is initialized either through the series option
        * structure, or after the chart is initialized, through
        * Highcharts.Chart#addSeries.
        *
        * The object can be accessed in a number of ways. All series and point
        * event handlers give a reference to the `series` object. The chart object
        * has a series property that is a collection of all the chart's series. The
        * point objects and axis objects also have the same reference.
        *
        * Another way to reference the series programmatically is by `id`. Add an
        * id in the series configuration options, and get the series object by
        * Highcharts.Chart#get.
        *
        * Configuration options for the series are given in three levels. Options
        * for all series in a chart are given in the plotOptions.series object.
        * Then options for all series of a specific type are given in the
        * plotOptions of that type, for example `plotOptions.line`. Next, options
        * for one single series are given in the series array, or as arguments to
        * `chart.addSeries`.
        *
        * The data in the series is stored in various arrays.
        *
        * - First, `series.options.data` contains all the original config options
        * for each point whether added by options or methods like
        * `series.addPoint`.
        *
        * - Next, `series.data` contains those values converted to points, but in
        * case the series data length exceeds the `cropThreshold`, or if the data
        * is grouped, `series.data` doesn't contain all the points. It only
        * contains the points that have been created on demand.
        *
        * - Then there's `series.points` that contains all currently visible point
        * objects. In case of cropping, the cropped-away points are not part of
        * this array. The `series.points` array starts at `series.cropStart`
        * compared to `series.data` and `series.options.data`. If however the
        * series data is grouped, these can't be correlated one to one.
        *
        * - `series.xData` and `series.processedXData` contain clean x values,
        * equivalent to `series.data` and `series.points`.
        *
        * - `series.yData` and `series.processedYData` contain clean y values,
        * equivalent to `series.data` and `series.points`.
        *
        * @param chart
        *        The chart instance.
        *
        * @param options
        *        The series options.
        */
      def this(chart: Chart_, options: js.Object) = this()
      def this(chart: Chart_, options: SeriesOptionsType) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Series")
    @js.native
    def Series: TypeofSeries = js.native
    
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.SeriesPalettes")
    @js.native
    def SeriesPalettes: Any = js.native
    inline def SeriesPalettes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SeriesPalettes")(x.asInstanceOf[js.Any])
    
    inline def Series_=(x: TypeofSeries): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Series")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Tick")
    @js.native
    open class Tick protected ()
      extends typings.highcharts.mod.Tick {
      /**
        * The Tick class.
        *
        * @param axis
        *        The axis of the tick.
        *
        * @param pos
        *        The position of the tick on the axis in terms of axis values.
        *
        * @param type
        *        The type of tick, either 'minor' or an empty string
        *
        * @param noLabel
        *        Whether to disable the label or not. Defaults to false.
        *
        * @param parameters
        *        Optional parameters for the tick.
        */
      def this(axis: typings.highcharts.mod.Axis, pos: Double) = this()
      def this(axis: typings.highcharts.mod.Axis, pos: Double, `type`: String) = this()
      def this(axis: typings.highcharts.mod.Axis, pos: Double, `type`: String, noLabel: Boolean) = this()
      def this(axis: typings.highcharts.mod.Axis, pos: Double, `type`: Unit, noLabel: Boolean) = this()
      def this(
        axis: typings.highcharts.mod.Axis,
        pos: Double,
        `type`: String,
        noLabel: Boolean,
        parameters: js.Object
      ) = this()
      def this(
        axis: typings.highcharts.mod.Axis,
        pos: Double,
        `type`: String,
        noLabel: Unit,
        parameters: js.Object
      ) = this()
      def this(
        axis: typings.highcharts.mod.Axis,
        pos: Double,
        `type`: Unit,
        noLabel: Boolean,
        parameters: js.Object
      ) = this()
      def this(axis: typings.highcharts.mod.Axis, pos: Double, `type`: Unit, noLabel: Unit, parameters: js.Object) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Tick")
    @js.native
    def Tick: Instantiable5[
        /* axis */ typings.highcharts.mod.Axis, 
        /* pos */ Double, 
        /* type */ js.UndefOr[String], 
        /* noLabel */ js.UndefOr[Boolean], 
        /* parameters */ js.UndefOr[js.Object], 
        typings.highcharts.mod.Tick
      ] = js.native
    inline def Tick_=(
      x: Instantiable5[
          /* axis */ typings.highcharts.mod.Axis, 
          /* pos */ Double, 
          /* type */ js.UndefOr[String], 
          /* noLabel */ js.UndefOr[Boolean], 
          /* parameters */ js.UndefOr[js.Object], 
          typings.highcharts.mod.Tick
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tick")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Time")
    @js.native
    /**
      * The Time class. Time settings are applied in general for each page using
      * `Highcharts.setOptions`, or individually for each Chart item through the
      * time options set.
      *
      * The Time object is available from Highcharts.Chart#time, which refers to
      * `Highcharts.time` if no individual time settings are applied.
      *
      * @param options
      *        Time options as defined in chart.options.time.
      */
    open class Time () extends Time_ {
      def this(options: TimeOptions) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Time")
    @js.native
    def Time_ : Instantiable1[/* options */ js.UndefOr[TimeOptions], typings.highcharts.mod.Time_] = js.native
    
    inline def Time__=(x: Instantiable1[/* options */ js.UndefOr[TimeOptions], Time_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Time")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Tooltip")
    @js.native
    open class Tooltip protected ()
      extends typings.highcharts.mod.Tooltip {
      /**
        * Tooltip of a chart.
        *
        * @param chart
        *        The chart instance.
        *
        * @param options
        *        Tooltip options.
        */
      def this(chart: Chart_, options: TooltipOptions) = this()
    }
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.Tooltip")
    @js.native
    def Tooltip: Instantiable2[/* chart */ Chart_, /* options */ TooltipOptions, typings.highcharts.mod.Tooltip] = js.native
    inline def Tooltip_=(x: Instantiable2[/* chart */ Chart_, /* options */ TooltipOptions, typings.highcharts.mod.Tooltip]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tooltip")(x.asInstanceOf[js.Any])
    
    inline def addEvent[T](el: T, `type`: String, fn: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def addEvent[T](el: T, `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def addEvent[T](el: Class[T], `type`: String, fn: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def addEvent[T](el: Class[T], `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    inline def animObject(): AnimationOptionsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("animObject")().asInstanceOf[AnimationOptionsObject]
    inline def animObject(animation: Boolean): AnimationOptionsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("animObject")(animation.asInstanceOf[js.Any]).asInstanceOf[AnimationOptionsObject]
    inline def animObject(animation: AnimationOptionsObject): AnimationOptionsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("animObject")(animation.asInstanceOf[js.Any]).asInstanceOf[AnimationOptionsObject]
    
    inline def animate(el: HTMLDOMElement, params: CSSObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def animate(el: HTMLDOMElement, params: CSSObject, opt: PartialAnimationOptionsOb): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def animate(el: HTMLDOMElement, params: SVGAttributes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def animate(el: HTMLDOMElement, params: SVGAttributes, opt: PartialAnimationOptionsOb): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def animate(el: typings.highcharts.mod.SVGElement, params: CSSObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def animate(el: typings.highcharts.mod.SVGElement, params: CSSObject, opt: PartialAnimationOptionsOb): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def animate(el: typings.highcharts.mod.SVGElement, params: SVGAttributes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def animate(el: typings.highcharts.mod.SVGElement, params: SVGAttributes, opt: PartialAnimationOptionsOb): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def arrayMax(data: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayMax")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def arrayMin(data: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayMin")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def attr(elem: HTMLDOMElement): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: HTMLDOMElement, keyOrAttribs: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: HTMLDOMElement, keyOrAttribs: String, value: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: HTMLDOMElement, keyOrAttribs: String, value: Double): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: HTMLDOMElement, keyOrAttribs: Unit, value: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: HTMLDOMElement, keyOrAttribs: Unit, value: Double): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: HTMLDOMElement, keyOrAttribs: HTMLAttributes): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: HTMLDOMElement, keyOrAttribs: HTMLAttributes, value: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: HTMLDOMElement, keyOrAttribs: HTMLAttributes, value: Double): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: HTMLDOMElement, keyOrAttribs: SVGAttributes): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: HTMLDOMElement, keyOrAttribs: SVGAttributes, value: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: HTMLDOMElement, keyOrAttribs: SVGAttributes, value: Double): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: SVGDOMElement): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: SVGDOMElement, keyOrAttribs: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: SVGDOMElement, keyOrAttribs: String, value: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: SVGDOMElement, keyOrAttribs: String, value: Double): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: SVGDOMElement, keyOrAttribs: Unit, value: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: SVGDOMElement, keyOrAttribs: Unit, value: Double): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: SVGDOMElement, keyOrAttribs: HTMLAttributes): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: SVGDOMElement, keyOrAttribs: HTMLAttributes, value: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: SVGDOMElement, keyOrAttribs: HTMLAttributes, value: Double): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: SVGDOMElement, keyOrAttribs: SVGAttributes): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: SVGDOMElement, keyOrAttribs: SVGAttributes, value: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    inline def attr(elem: SVGDOMElement, keyOrAttribs: SVGAttributes, value: Double): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("attr")(elem.asInstanceOf[js.Any], keyOrAttribs.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
    
    inline def callout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callout")().asInstanceOf[Unit]
    
    inline def chart(options: Options): Chart_ = ^.asInstanceOf[js.Dynamic].applyDynamic("chart")(options.asInstanceOf[js.Any]).asInstanceOf[Chart_]
    inline def chart(options: Options, callback: ChartCallbackFunction): Chart_ = (^.asInstanceOf[js.Dynamic].applyDynamic("chart")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Chart_]
    inline def chart(renderTo: String, options: Options): Chart_ = (^.asInstanceOf[js.Dynamic].applyDynamic("chart")(renderTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chart_]
    inline def chart(renderTo: String, options: Options, callback: ChartCallbackFunction): Chart_ = (^.asInstanceOf[js.Dynamic].applyDynamic("chart")(renderTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Chart_]
    inline def chart(renderTo: HTMLDOMElement, options: Options): Chart_ = (^.asInstanceOf[js.Dynamic].applyDynamic("chart")(renderTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chart_]
    inline def chart(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction): Chart_ = (^.asInstanceOf[js.Dynamic].applyDynamic("chart")(renderTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Chart_]
    
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.charts")
    @js.native
    def charts: js.Array[js.UndefOr[Chart_]] = js.native
    inline def charts_=(x: js.Array[js.UndefOr[Chart_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("charts")(x.asInstanceOf[js.Any])
    
    inline def clearTimeout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")().asInstanceOf[Unit]
    inline def clearTimeout(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def color(input: ColorType): Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(input.asInstanceOf[js.Any]).asInstanceOf[Color_]
    
    inline def correctFloat(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("correctFloat")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def correctFloat(num: Double, prec: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("correctFloat")(num.asInstanceOf[js.Any], prec.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def createElement(tag: String): HTMLDOMElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any]).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: Unit, styles: Unit, parent: Unit, nopad: Boolean): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: Unit, styles: Unit, parent: HTMLDOMElement): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: Unit, styles: Unit, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: Unit, styles: CSSObject): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: Unit, styles: CSSObject, parent: Unit, nopad: Boolean): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: Unit, styles: CSSObject, parent: HTMLDOMElement): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: Unit, styles: CSSObject, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: HTMLAttributes): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: HTMLAttributes, styles: Unit, parent: Unit, nopad: Boolean): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: HTMLAttributes, styles: Unit, parent: HTMLDOMElement): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: HTMLAttributes, styles: Unit, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: Unit, nopad: Boolean): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    inline def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], nopad.asInstanceOf[js.Any])).asInstanceOf[HTMLDOMElement]
    
    inline def css(el: HTMLDOMElement, styles: CSSObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("css")(el.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def css(el: SVGDOMElement, styles: CSSObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("css")(el.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def dateFormat(format: String, timestamp: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateFormat")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def dateFormat(format: String, timestamp: Double, capitalize: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateFormat")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], capitalize.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.dateFormats")
    @js.native
    def dateFormats: Record[String, TimeFormatCallbackFunction] = js.native
    inline def dateFormats_=(x: Record[String, TimeFormatCallbackFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.defaultOptions")
    @js.native
    def defaultOptions: Options = js.native
    inline def defaultOptions_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    inline def defined(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defined")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def destroyObjectProperties(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyObjectProperties")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def destroyObjectProperties(obj: Any, except: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyObjectProperties")(obj.asInstanceOf[js.Any], except.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def discardElement(element: HTMLDOMElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("discardElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def each(arr: js.Array[Any], fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def each(arr: js.Array[Any], fn: js.Function, ctx: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def erase(arr: js.Array[Any], item: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def error(code: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def error(code: String, stop: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def error(code: String, stop: Boolean, chart: Unit, params: Dictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def error(code: String, stop: Boolean, chart: Chart_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def error(code: String, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def error(code: String, stop: Unit, chart: Unit, params: Dictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def error(code: String, stop: Unit, chart: Chart_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def error(code: String, stop: Unit, chart: Chart_, params: Dictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def error(code: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def error(code: Double, stop: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def error(code: Double, stop: Boolean, chart: Unit, params: Dictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def error(code: Double, stop: Boolean, chart: Chart_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def error(code: Double, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def error(code: Double, stop: Unit, chart: Unit, params: Dictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def error(code: Double, stop: Unit, chart: Chart_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def error(code: Double, stop: Unit, chart: Chart_, params: Dictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(code.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def extend[T](a: T, b: Partial[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def extend[T](a: Unit, b: Partial[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def extendClass[T](parent: Class[T], members: Dictionary[Any]): Class[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendClass")(parent.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[Class[T]]
    
    inline def find[T](arr: js.Array[T], callback: js.Function): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
    
    inline def fireEvent[T](el: T, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fireEvent[T](el: T, `type`: String, eventArguments: Unit, defaultFunction: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any], defaultFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fireEvent[T](el: T, `type`: String, eventArguments: Unit, defaultFunction: EventCallbackFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any], defaultFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[Any], defaultFunction: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any], defaultFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[Any], defaultFunction: EventCallbackFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any], defaultFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fireEvent[T](el: T, `type`: String, eventArguments: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any], defaultFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: EventCallbackFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventArguments.asInstanceOf[js.Any], defaultFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def format(str: String, ctx: Record[String, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(str.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def format(str: String, ctx: Record[String, Any], chart: Chart_): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(str.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getDeferredAnimation(chart: Chart_, animation: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeferredAnimation")(chart.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def getDeferredAnimation(chart: Chart_, animation: Boolean, series: typings.highcharts.mod.Series): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeferredAnimation")(chart.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], series.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeferredAnimation")(chart.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject, series: typings.highcharts.mod.Series): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeferredAnimation")(chart.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], series.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getMagnitude(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMagnitude")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getOptions(): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")().asInstanceOf[Options]
    
    inline def getRendererType(): Class[typings.highcharts.mod.SVGRenderer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRendererType")().asInstanceOf[Class[typings.highcharts.mod.SVGRenderer]]
    inline def getRendererType(rendererType: String): Class[typings.highcharts.mod.SVGRenderer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRendererType")(rendererType.asInstanceOf[js.Any]).asInstanceOf[Class[typings.highcharts.mod.SVGRenderer]]
    
    inline def getStyle(el: HTMLDOMElement, prop: String): js.UndefOr[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(el.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | String]]
    inline def getStyle(el: HTMLDOMElement, prop: String, toInt: Boolean): js.UndefOr[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(el.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], toInt.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | String]]
    
    inline def grep(arr: js.Array[Any], callback: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("grep")(arr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def inArray(item: Any, arr: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(item.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def inArray(item: Any, arr: js.Array[Any], fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(item.asInstanceOf[js.Any], arr.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def isArray(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isClass(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClass")().asInstanceOf[Boolean]
    inline def isClass(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isDOMElement(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMElement")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNumber(n: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isObject(obj: Any, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isString(s: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def keys(obj: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def map(arr: js.Array[Any], fn: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def merge[T](a: T, n: js.UndefOr[js.Object]*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(scala.List(a.asInstanceOf[js.Any]).`++`(n.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
    inline def merge[T](a: Unit, n: js.UndefOr[js.Object]*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(scala.List(a.asInstanceOf[js.Any]).`++`(n.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
    inline def merge[T](extend: Boolean, a: T, n: js.UndefOr[js.Object]*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")((scala.List(extend.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).`++`(n.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[T]
    inline def merge[T](extend: Boolean, a: Unit, n: js.UndefOr[js.Object]*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")((scala.List(extend.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).`++`(n.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[T]
    
    inline def normalizeTickInterval(interval: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def normalizeTickInterval(interval: Double, multiples: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(interval: Double, multiples: js.Array[Any], magnitude: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(interval: Double, multiples: js.Array[Any], magnitude: Double, allowDecimals: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Double,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Double,
      allowDecimals: Unit,
      hasTickAmount: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(interval: Double, multiples: js.Array[Any], magnitude: Unit, allowDecimals: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Unit,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[Any],
      magnitude: Unit,
      allowDecimals: Unit,
      hasTickAmount: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Double, allowDecimals: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(
      interval: Double,
      multiples: Unit,
      magnitude: Double,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Double, allowDecimals: Unit, hasTickAmount: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Unit, allowDecimals: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Unit, allowDecimals: Boolean, hasTickAmount: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def normalizeTickInterval(interval: Double, multiples: Unit, magnitude: Unit, allowDecimals: Unit, hasTickAmount: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTickInterval")(interval.asInstanceOf[js.Any], multiples.asInstanceOf[js.Any], magnitude.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any], hasTickAmount.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def numberFormat(number: Double, decimals: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(number.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def numberFormat(number: Double, decimals: Double, decimalPoint: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(number.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], decimalPoint.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def numberFormat(number: Double, decimals: Double, decimalPoint: String, thousandsSep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(number.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], decimalPoint.asInstanceOf[js.Any], thousandsSep.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def numberFormat(number: Double, decimals: Double, decimalPoint: Unit, thousandsSep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(number.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], decimalPoint.asInstanceOf[js.Any], thousandsSep.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def objectEach[T](obj: Any, fn: ObjectEachCallbackFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("objectEach")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def objectEach[T](obj: Any, fn: ObjectEachCallbackFunction[T], ctx: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("objectEach")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def offset(el: Element): OffsetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(el.asInstanceOf[js.Any]).asInstanceOf[OffsetObject]
    
    inline def pad(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def pad(number: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pad(number: Double, length: Double, padder: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any], length.asInstanceOf[js.Any], padder.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pad(number: Double, length: Unit, padder: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any], length.asInstanceOf[js.Any], padder.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def pick[T](items: (js.UndefOr[T | Null])*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("pick")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[T]
    
    inline def reduce(arr: js.Array[Any], fn: js.Function, initialValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def registerRendererType(
      rendererType: String,
      rendererClass: Class[typings.highcharts.mod.SVGRenderer],
      setAsDefault: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRendererType")(rendererType.asInstanceOf[js.Any], rendererClass.asInstanceOf[js.Any], setAsDefault.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def relativeLength(value: RelativeSize, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeLength")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def relativeLength(value: RelativeSize, base: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeLength")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def removeEvent[T](el: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeEvent[T](el: T, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEvent[T](el: T, `type`: Unit, fn: EventCallbackFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEvent[T](el: Class[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeEvent[T](el: Class[T], `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEvent[T](el: Class[T], `type`: Unit, fn: EventCallbackFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def seriesType(`type`: String, parent: String, options: Dictionary[Any]): typings.highcharts.mod.Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.highcharts.mod.Series]
    inline def seriesType(`type`: String, parent: String, options: Dictionary[Any], props: Unit, pointProps: Dictionary[Any]): typings.highcharts.mod.Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any], pointProps.asInstanceOf[js.Any])).asInstanceOf[typings.highcharts.mod.Series]
    inline def seriesType(`type`: String, parent: String, options: Dictionary[Any], props: Dictionary[Any]): typings.highcharts.mod.Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typings.highcharts.mod.Series]
    inline def seriesType(
      `type`: String,
      parent: String,
      options: Dictionary[Any],
      props: Dictionary[Any],
      pointProps: Dictionary[Any]
    ): typings.highcharts.mod.Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any], pointProps.asInstanceOf[js.Any])).asInstanceOf[typings.highcharts.mod.Series]
    inline def seriesType(`type`: String, parent: String, options: SeriesOptionsType): typings.highcharts.mod.Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.highcharts.mod.Series]
    inline def seriesType(
      `type`: String,
      parent: String,
      options: SeriesOptionsType,
      props: Unit,
      pointProps: Dictionary[Any]
    ): typings.highcharts.mod.Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any], pointProps.asInstanceOf[js.Any])).asInstanceOf[typings.highcharts.mod.Series]
    inline def seriesType(`type`: String, parent: String, options: SeriesOptionsType, props: Dictionary[Any]): typings.highcharts.mod.Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typings.highcharts.mod.Series]
    inline def seriesType(
      `type`: String,
      parent: String,
      options: SeriesOptionsType,
      props: Dictionary[Any],
      pointProps: Dictionary[Any]
    ): typings.highcharts.mod.Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any], pointProps.asInstanceOf[js.Any])).asInstanceOf[typings.highcharts.mod.Series]
    
    inline def setAnimation(animation: Boolean, chart: Chart_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnimation")(animation.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setAnimation(animation: Unit, chart: Chart_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnimation")(animation.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setAnimation(animation: PartialAnimationOptionsOb, chart: Chart_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnimation")(animation.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setOptions(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def some(arr: js.Array[Any], fn: js.Function, ctx: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def splat(obj: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("splat")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    inline def stableSort(arr: js.Array[Any], sortFunction: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stableSort")(arr.asInstanceOf[js.Any], sortFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def stop(el: typings.highcharts.mod.SVGElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def stop(el: typings.highcharts.mod.SVGElement, prop: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stop")(el.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def syncTimeout(fn: js.Function, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def syncTimeout(fn: js.Function, delay: Double, context: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.theme")
    @js.native
    def theme: Options = js.native
    inline def theme_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
    
    @JSImport("highcharts/indicators/accumulation-distribution", "Highcharts.time")
    @js.native
    def time: Time_ = js.native
    inline def time_=(x: Time_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
    
    inline def uniqueKey(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueKey")().asInstanceOf[String]
    
    inline def useSerialIds(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSerialIds")().asInstanceOf[js.UndefOr[Boolean]]
    inline def useSerialIds(mode: Boolean): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSerialIds")(mode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
    
    inline def wrap(obj: Any, method: String, func: WrapProceedFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(obj.asInstanceOf[js.Any], method.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def factory(highcharts: TypeofHighchartsAddEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("factory")(highcharts.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
