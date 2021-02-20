package typings.highcharts

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable7
import typings.highcharts.anon.PartialAnimationOptionsOb
import typings.highcharts.anon.TypeofColor
import typings.highcharts.anon.TypeofHighchartsAddEvent
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
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ichimokuKinkoHyoMod {
  
  @JSImport("highcharts/indicators/ichimoku-kinko-hyo", JSImport.Default)
  @js.native
  def default(highcharts: TypeofHighchartsAddEvent): Unit = js.native
  
  object Highcharts {
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Annotation")
    @js.native
    class Annotation protected ()
      extends typings.highcharts.mod.Annotation {
      /**
        * An annotation class which serves as a container for items like labels or
        * shapes. Created items are positioned on the chart either by linking them
        * to existing points or created mock points
        *
        * @param chart
        *        a chart instance
        *
        * @param userOptions
        *        the options object
        */
      def this(chart: Chart_, userOptions: AnnotationsOptions) = this()
    }
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Annotation")
    @js.native
    def Annotation: Instantiable2[
        /* chart */ Chart_, 
        /* userOptions */ AnnotationsOptions, 
        typings.highcharts.mod.Annotation
      ] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.AnnotationControlPoint")
    @js.native
    class AnnotationControlPoint protected ()
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
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.AnnotationControlPoint")
    @js.native
    def AnnotationControlPoint: Instantiable4[
        /* chart */ Chart_, 
        /* target */ AnnotationControllable, 
        /* options */ AnnotationControlPointOptionsObject, 
        /* index */ js.UndefOr[Double], 
        typings.highcharts.mod.AnnotationControlPoint
      ] = js.native
    @scala.inline
    def AnnotationControlPoint_=(
      x: Instantiable4[
          /* chart */ Chart_, 
          /* target */ AnnotationControllable, 
          /* options */ AnnotationControlPointOptionsObject, 
          /* index */ js.UndefOr[Double], 
          typings.highcharts.mod.AnnotationControlPoint
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnnotationControlPoint")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Annotation_=(
      x: Instantiable2[
          /* chart */ Chart_, 
          /* userOptions */ AnnotationsOptions, 
          typings.highcharts.mod.Annotation
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Annotation")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Axis")
    @js.native
    class Axis protected ()
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
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Axis")
    @js.native
    def Axis: Instantiable2[/* chart */ Chart_, /* userOptions */ AxisOptions, typings.highcharts.mod.Axis] = js.native
    @scala.inline
    def Axis_=(x: Instantiable2[/* chart */ Chart_, /* userOptions */ AxisOptions, typings.highcharts.mod.Axis]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Axis")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Chart")
    @js.native
    class Chart protected () extends Chart_ {
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
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Chart")
    @js.native
    def Chart_ : Instantiable2[
        /* options */ Options, 
        /* callback */ js.UndefOr[ChartCallbackFunction], 
        typings.highcharts.mod.Chart_
      ] = js.native
    
    @scala.inline
    def Chart__=(x: Instantiable2[/* options */ Options, /* callback */ js.UndefOr[ChartCallbackFunction], Chart_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Chart")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Color")
    @js.native
    class Color protected () extends Color_ {
      /**
        * Handle color operations. Some object methods are chainable.
        *
        * @param input
        *        The input color in either rbga or hex format
        */
      def this(input: ColorType) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.ColorAxis")
    @js.native
    class ColorAxis protected ()
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
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.ColorAxis")
    @js.native
    def ColorAxis: Instantiable2[
        /* chart */ Chart_, 
        /* userOptions */ ColorAxisOptions, 
        typings.highcharts.mod.ColorAxis
      ] = js.native
    @scala.inline
    def ColorAxis_=(
      x: Instantiable2[
          /* chart */ Chart_, 
          /* userOptions */ ColorAxisOptions, 
          typings.highcharts.mod.ColorAxis
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ColorAxis")(x.asInstanceOf[js.Any])
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Color")
    @js.native
    def Color_ : TypeofColor = js.native
    
    @scala.inline
    def Color__=(x: TypeofColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Color")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Legend")
    @js.native
    class Legend protected ()
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
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Legend")
    @js.native
    def Legend: Instantiable2[/* chart */ Chart_, /* options */ LegendOptions, typings.highcharts.mod.Legend] = js.native
    @scala.inline
    def Legend_=(x: Instantiable2[/* chart */ Chart_, /* options */ LegendOptions, typings.highcharts.mod.Legend]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Legend")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.PlotLineOrBand")
    @js.native
    class PlotLineOrBand protected ()
      extends typings.highcharts.mod.PlotLineOrBand {
      /**
        * The object wrapper for plot lines and plot bands
        */
      def this(axis: typings.highcharts.mod.Axis) = this()
      def this(axis: typings.highcharts.mod.Axis, options: AxisPlotBandsOptions) = this()
      def this(axis: typings.highcharts.mod.Axis, options: AxisPlotLinesOptions) = this()
    }
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.PlotLineOrBand")
    @js.native
    def PlotLineOrBand: Instantiable2[
        /* axis */ typings.highcharts.mod.Axis, 
        /* options */ js.UndefOr[AxisPlotBandsOptions | AxisPlotLinesOptions], 
        typings.highcharts.mod.PlotLineOrBand
      ] = js.native
    @scala.inline
    def PlotLineOrBand_=(
      x: Instantiable2[
          /* axis */ typings.highcharts.mod.Axis, 
          /* options */ js.UndefOr[AxisPlotBandsOptions | AxisPlotLinesOptions], 
          typings.highcharts.mod.PlotLineOrBand
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PlotLineOrBand")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Point")
    @js.native
    class Point ()
      extends typings.highcharts.mod.Point
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Point")
    @js.native
    def Point: Instantiable0[typings.highcharts.mod.Point] = js.native
    @scala.inline
    def Point_=(x: Instantiable0[typings.highcharts.mod.Point]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Point")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Pointer")
    @js.native
    class Pointer protected ()
      extends typings.highcharts.mod.Pointer {
      /**
        * The mouse and touch tracker object. Each Chart item has one assosiated
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
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Pointer")
    @js.native
    def Pointer: Instantiable2[/* chart */ Chart_, /* options */ Options, typings.highcharts.mod.Pointer] = js.native
    @scala.inline
    def Pointer_=(x: Instantiable2[/* chart */ Chart_, /* options */ Options, typings.highcharts.mod.Pointer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pointer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.SVGElement")
    @js.native
    class SVGElement ()
      extends typings.highcharts.mod.SVGElement
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.SVGElement")
    @js.native
    def SVGElement: Instantiable0[typings.highcharts.mod.SVGElement] = js.native
    @scala.inline
    def SVGElement_=(x: Instantiable0[typings.highcharts.mod.SVGElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SVGElement")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.SVGRenderer")
    @js.native
    class SVGRenderer protected ()
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
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: js.UndefOr[scala.Nothing],
        forExport: Boolean
      ) = this()
      def this(container: HTMLDOMElement, width: Double, height: Double, style: CSSObject, forExport: Boolean) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: js.UndefOr[scala.Nothing],
        forExport: js.UndefOr[scala.Nothing],
        allowHTML: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: js.UndefOr[scala.Nothing],
        forExport: Boolean,
        allowHTML: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: CSSObject,
        forExport: js.UndefOr[scala.Nothing],
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
        style: js.UndefOr[scala.Nothing],
        forExport: js.UndefOr[scala.Nothing],
        allowHTML: js.UndefOr[scala.Nothing],
        styledMode: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: js.UndefOr[scala.Nothing],
        forExport: js.UndefOr[scala.Nothing],
        allowHTML: Boolean,
        styledMode: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: js.UndefOr[scala.Nothing],
        forExport: Boolean,
        allowHTML: js.UndefOr[scala.Nothing],
        styledMode: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: js.UndefOr[scala.Nothing],
        forExport: Boolean,
        allowHTML: Boolean,
        styledMode: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: CSSObject,
        forExport: js.UndefOr[scala.Nothing],
        allowHTML: js.UndefOr[scala.Nothing],
        styledMode: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: CSSObject,
        forExport: js.UndefOr[scala.Nothing],
        allowHTML: Boolean,
        styledMode: Boolean
      ) = this()
      def this(
        container: HTMLDOMElement,
        width: Double,
        height: Double,
        style: CSSObject,
        forExport: Boolean,
        allowHTML: js.UndefOr[scala.Nothing],
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
    }
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.SVGRenderer")
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
    @scala.inline
    def SVGRenderer_=(
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
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Series")
    @js.native
    class Series protected ()
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
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Series")
    @js.native
    def Series: Instantiable2[
        /* chart */ Chart_, 
        /* options */ js.Object | SeriesOptionsType, 
        typings.highcharts.mod.Series
      ] = js.native
    @scala.inline
    def Series_=(
      x: Instantiable2[
          /* chart */ Chart_, 
          /* options */ js.Object | SeriesOptionsType, 
          typings.highcharts.mod.Series
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Series")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Tick")
    @js.native
    class Tick protected ()
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
      def this(
        axis: typings.highcharts.mod.Axis,
        pos: Double,
        `type`: js.UndefOr[scala.Nothing],
        noLabel: Boolean
      ) = this()
      def this(axis: typings.highcharts.mod.Axis, pos: Double, `type`: String, noLabel: Boolean) = this()
      def this(
        axis: typings.highcharts.mod.Axis,
        pos: Double,
        `type`: js.UndefOr[scala.Nothing],
        noLabel: js.UndefOr[scala.Nothing],
        parameters: js.Object
      ) = this()
      def this(
        axis: typings.highcharts.mod.Axis,
        pos: Double,
        `type`: js.UndefOr[scala.Nothing],
        noLabel: Boolean,
        parameters: js.Object
      ) = this()
      def this(
        axis: typings.highcharts.mod.Axis,
        pos: Double,
        `type`: String,
        noLabel: js.UndefOr[scala.Nothing],
        parameters: js.Object
      ) = this()
      def this(
        axis: typings.highcharts.mod.Axis,
        pos: Double,
        `type`: String,
        noLabel: Boolean,
        parameters: js.Object
      ) = this()
    }
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Tick")
    @js.native
    def Tick: Instantiable5[
        /* axis */ typings.highcharts.mod.Axis, 
        /* pos */ Double, 
        /* type */ js.UndefOr[String], 
        /* noLabel */ js.UndefOr[Boolean], 
        /* parameters */ js.UndefOr[js.Object], 
        typings.highcharts.mod.Tick
      ] = js.native
    @scala.inline
    def Tick_=(
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
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Time")
    @js.native
    class Time protected () extends Time_ {
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
      def this(options: TimeOptions) = this()
    }
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Time")
    @js.native
    def Time_ : Instantiable1[/* options */ TimeOptions, typings.highcharts.mod.Time_] = js.native
    
    @scala.inline
    def Time__=(x: Instantiable1[/* options */ TimeOptions, Time_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Time")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Tooltip")
    @js.native
    class Tooltip protected ()
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
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.Tooltip")
    @js.native
    def Tooltip: Instantiable2[/* chart */ Chart_, /* options */ TooltipOptions, typings.highcharts.mod.Tooltip] = js.native
    @scala.inline
    def Tooltip_=(x: Instantiable2[/* chart */ Chart_, /* options */ TooltipOptions, typings.highcharts.mod.Tooltip]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.addEvent")
    @js.native
    def addEvent[T](el: T, `type`: String, fn: js.Function): js.Function = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.addEvent")
    @js.native
    def addEvent[T](el: T, `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.addEvent")
    @js.native
    def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.addEvent")
    @js.native
    def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.addEvent")
    @js.native
    def addEvent[T](el: Class[T], `type`: String, fn: js.Function): js.Function = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.addEvent")
    @js.native
    def addEvent[T](el: Class[T], `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.addEvent")
    @js.native
    def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.addEvent")
    @js.native
    def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.animObject")
    @js.native
    def animObject(): AnimationOptionsObject = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.animObject")
    @js.native
    def animObject(animation: Boolean): AnimationOptionsObject = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.animObject")
    @js.native
    def animObject(animation: AnimationOptionsObject): AnimationOptionsObject = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.animate")
    @js.native
    def animate(el: HTMLDOMElement, params: CSSObject): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.animate")
    @js.native
    def animate(el: HTMLDOMElement, params: CSSObject, opt: PartialAnimationOptionsOb): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.animate")
    @js.native
    def animate(el: HTMLDOMElement, params: SVGAttributes): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.animate")
    @js.native
    def animate(el: HTMLDOMElement, params: SVGAttributes, opt: PartialAnimationOptionsOb): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.animate")
    @js.native
    def animate(el: typings.highcharts.mod.SVGElement, params: CSSObject): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.animate")
    @js.native
    def animate(el: typings.highcharts.mod.SVGElement, params: CSSObject, opt: PartialAnimationOptionsOb): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.animate")
    @js.native
    def animate(el: typings.highcharts.mod.SVGElement, params: SVGAttributes): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.animate")
    @js.native
    def animate(el: typings.highcharts.mod.SVGElement, params: SVGAttributes, opt: PartialAnimationOptionsOb): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.arrayMax")
    @js.native
    def arrayMax(data: js.Array[_]): Double = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.arrayMin")
    @js.native
    def arrayMin(data: js.Array[_]): Double = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: HTMLDOMElement): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: HTMLDOMElement, prop: js.UndefOr[scala.Nothing], value: String): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: HTMLDOMElement, prop: js.UndefOr[scala.Nothing], value: Double): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: HTMLDOMElement, prop: String): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: HTMLDOMElement, prop: String, value: String): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: HTMLDOMElement, prop: String, value: Double): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: HTMLDOMElement, prop: HTMLAttributes): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: HTMLDOMElement, prop: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: HTMLDOMElement, prop: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: HTMLDOMElement, prop: SVGAttributes): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: HTMLDOMElement, prop: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: HTMLDOMElement, prop: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: SVGDOMElement): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: SVGDOMElement, prop: js.UndefOr[scala.Nothing], value: String): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: SVGDOMElement, prop: js.UndefOr[scala.Nothing], value: Double): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: SVGDOMElement, prop: String): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: SVGDOMElement, prop: String, value: String): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: SVGDOMElement, prop: String, value: Double): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: SVGDOMElement, prop: HTMLAttributes): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: SVGDOMElement, prop: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: SVGDOMElement, prop: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: SVGDOMElement, prop: SVGAttributes): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: SVGDOMElement, prop: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.attr")
    @js.native
    def attr(elem: SVGDOMElement, prop: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.chart")
    @js.native
    def chart(options: Options): Chart_ = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.chart")
    @js.native
    def chart(options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.chart")
    @js.native
    def chart(renderTo: String, options: Options): Chart_ = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.chart")
    @js.native
    def chart(renderTo: String, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.chart")
    @js.native
    def chart(renderTo: HTMLDOMElement, options: Options): Chart_ = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.chart")
    @js.native
    def chart(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.charts")
    @js.native
    def charts: js.Array[js.UndefOr[Chart_]] = js.native
    @scala.inline
    def charts_=(x: js.Array[js.UndefOr[Chart_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("charts")(x.asInstanceOf[js.Any])
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.clearTimeout")
    @js.native
    def clearTimeout(id: Double): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.color")
    @js.native
    def color(input: ColorType): Color_ = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.correctFloat")
    @js.native
    def correctFloat(num: Double): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.correctFloat")
    @js.native
    def correctFloat(num: Double, prec: Double): Double = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(tag: String): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(
      tag: String,
      attribs: js.UndefOr[scala.Nothing],
      styles: js.UndefOr[scala.Nothing],
      parent: js.UndefOr[scala.Nothing],
      nopad: Boolean
    ): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(
      tag: String,
      attribs: js.UndefOr[scala.Nothing],
      styles: js.UndefOr[scala.Nothing],
      parent: HTMLDOMElement
    ): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(
      tag: String,
      attribs: js.UndefOr[scala.Nothing],
      styles: js.UndefOr[scala.Nothing],
      parent: HTMLDOMElement,
      nopad: Boolean
    ): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(tag: String, attribs: js.UndefOr[scala.Nothing], styles: CSSObject): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(
      tag: String,
      attribs: js.UndefOr[scala.Nothing],
      styles: CSSObject,
      parent: js.UndefOr[scala.Nothing],
      nopad: Boolean
    ): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(tag: String, attribs: js.UndefOr[scala.Nothing], styles: CSSObject, parent: HTMLDOMElement): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(
      tag: String,
      attribs: js.UndefOr[scala.Nothing],
      styles: CSSObject,
      parent: HTMLDOMElement,
      nopad: Boolean
    ): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(tag: String, attribs: HTMLAttributes): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(
      tag: String,
      attribs: HTMLAttributes,
      styles: js.UndefOr[scala.Nothing],
      parent: js.UndefOr[scala.Nothing],
      nopad: Boolean
    ): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: js.UndefOr[scala.Nothing], parent: HTMLDOMElement): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(
      tag: String,
      attribs: HTMLAttributes,
      styles: js.UndefOr[scala.Nothing],
      parent: HTMLDOMElement,
      nopad: Boolean
    ): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(
      tag: String,
      attribs: HTMLAttributes,
      styles: CSSObject,
      parent: js.UndefOr[scala.Nothing],
      nopad: Boolean
    ): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement): HTMLDOMElement = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.createElement")
    @js.native
    def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.css")
    @js.native
    def css(el: HTMLDOMElement, styles: CSSObject): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.css")
    @js.native
    def css(el: SVGDOMElement, styles: CSSObject): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.dateFormat")
    @js.native
    def dateFormat(format: String, timestamp: Double): String = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.dateFormat")
    @js.native
    def dateFormat(format: String, timestamp: Double, capitalize: Boolean): String = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.dateFormats")
    @js.native
    def dateFormats: Dictionary[TimeFormatCallbackFunction] = js.native
    @scala.inline
    def dateFormats_=(x: Dictionary[TimeFormatCallbackFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.defaultOptions")
    @js.native
    def defaultOptions: Options = js.native
    @scala.inline
    def defaultOptions_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.defined")
    @js.native
    def defined(obj: js.Any): Boolean = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.destroyObjectProperties")
    @js.native
    def destroyObjectProperties(obj: js.Any): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.destroyObjectProperties")
    @js.native
    def destroyObjectProperties(obj: js.Any, except: js.Any): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.discardElement")
    @js.native
    def discardElement(element: HTMLDOMElement): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.each")
    @js.native
    def each(arr: js.Array[_], fn: js.Function): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.each")
    @js.native
    def each(arr: js.Array[_], fn: js.Function, ctx: js.Any): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.erase")
    @js.native
    def erase(arr: js.Array[_], item: js.Any): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: String): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(
      code: String,
      stop: js.UndefOr[scala.Nothing],
      chart: js.UndefOr[scala.Nothing],
      params: Dictionary[String]
    ): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: String, stop: js.UndefOr[scala.Nothing], chart: Chart_): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: String, stop: js.UndefOr[scala.Nothing], chart: Chart_, params: Dictionary[String]): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: String, stop: Boolean): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: String, stop: Boolean, chart: js.UndefOr[scala.Nothing], params: Dictionary[String]): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: String, stop: Boolean, chart: Chart_): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: String, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: Double): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(
      code: Double,
      stop: js.UndefOr[scala.Nothing],
      chart: js.UndefOr[scala.Nothing],
      params: Dictionary[String]
    ): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: Double, stop: js.UndefOr[scala.Nothing], chart: Chart_): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: Double, stop: js.UndefOr[scala.Nothing], chart: Chart_, params: Dictionary[String]): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: Double, stop: Boolean): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: Double, stop: Boolean, chart: js.UndefOr[scala.Nothing], params: Dictionary[String]): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: Double, stop: Boolean, chart: Chart_): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.error")
    @js.native
    def error(code: Double, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.extend")
    @js.native
    def extend[T](a: T, b: js.Object): T = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.extend")
    @js.native
    def extend[T](a: js.UndefOr[scala.Nothing], b: js.Object): T = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.extendClass")
    @js.native
    def extendClass[T](parent: Class[T], members: Dictionary[_]): Class[T] = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.find")
    @js.native
    def find[T](arr: js.Array[T], callback: js.Function): js.UndefOr[T] = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.fireEvent")
    @js.native
    def fireEvent[T](el: T, `type`: String): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.fireEvent")
    @js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: js.UndefOr[scala.Nothing], defaultFunction: js.Function): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.fireEvent")
    @js.native
    def fireEvent[T](
      el: T,
      `type`: String,
      eventArguments: js.UndefOr[scala.Nothing],
      defaultFunction: EventCallbackFunction[T]
    ): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.fireEvent")
    @js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_]): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.fireEvent")
    @js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: js.Function): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.fireEvent")
    @js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: EventCallbackFunction[T]): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.fireEvent")
    @js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.fireEvent")
    @js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: js.Function): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.fireEvent")
    @js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: EventCallbackFunction[T]): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.format")
    @js.native
    def format(str: String, ctx: Record[String, _]): String = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.format")
    @js.native
    def format(str: String, ctx: Record[String, _], chart: Chart_): String = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.getDeferredAnimation")
    @js.native
    def getDeferredAnimation(chart: Chart_, animation: Boolean): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.getDeferredAnimation")
    @js.native
    def getDeferredAnimation(chart: Chart_, animation: Boolean, series: typings.highcharts.mod.Series): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.getDeferredAnimation")
    @js.native
    def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.getDeferredAnimation")
    @js.native
    def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject, series: typings.highcharts.mod.Series): Double = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.getMagnitude")
    @js.native
    def getMagnitude(num: Double): Double = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.getOptions")
    @js.native
    def getOptions(): Options = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.getStyle")
    @js.native
    def getStyle(el: HTMLDOMElement, prop: String): Double | String = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.getStyle")
    @js.native
    def getStyle(el: HTMLDOMElement, prop: String, toInt: Boolean): Double | String = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.grep")
    @js.native
    def grep(arr: js.Array[_], callback: js.Function): js.Array[_] = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.inArray")
    @js.native
    def inArray(item: js.Any, arr: js.Array[_]): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.inArray")
    @js.native
    def inArray(item: js.Any, arr: js.Array[_], fromIndex: Double): Double = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.isArray")
    @js.native
    def isArray(obj: js.Any): Boolean = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.isClass")
    @js.native
    def isClass(): Boolean = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.isClass")
    @js.native
    def isClass(obj: js.Object): Boolean = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.isDOMElement")
    @js.native
    def isDOMElement(obj: js.Any): Boolean = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.isNumber")
    @js.native
    def isNumber(n: js.Any): Boolean = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.isObject")
    @js.native
    def isObject(obj: js.Any): Boolean = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.isObject")
    @js.native
    def isObject(obj: js.Any, strict: Boolean): Boolean = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.isString")
    @js.native
    def isString(s: js.Any): Boolean = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.keys")
    @js.native
    def keys(obj: js.Any): js.Array[String] = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.map")
    @js.native
    def map(arr: js.Array[_], fn: js.Function): js.Array[_] = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.merge")
    @js.native
    def merge[T](a: T, n: js.UndefOr[js.Object]*): T = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.merge")
    @js.native
    def merge[T](a: js.UndefOr[scala.Nothing], n: js.UndefOr[js.Object]*): T = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.merge")
    @js.native
    def merge[T](extend: Boolean, a: T, n: js.UndefOr[js.Object]*): T = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.merge")
    @js.native
    def merge[T](extend: Boolean, a: js.UndefOr[scala.Nothing], n: js.UndefOr[js.Object]*): T = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(interval: Double): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.UndefOr[scala.Nothing],
      magnitude: js.UndefOr[scala.Nothing],
      allowDecimals: js.UndefOr[scala.Nothing],
      hasTickAmount: Boolean
    ): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.UndefOr[scala.Nothing],
      magnitude: js.UndefOr[scala.Nothing],
      allowDecimals: Boolean
    ): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.UndefOr[scala.Nothing],
      magnitude: js.UndefOr[scala.Nothing],
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(interval: Double, multiples: js.UndefOr[scala.Nothing], magnitude: Double): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.UndefOr[scala.Nothing],
      magnitude: Double,
      allowDecimals: js.UndefOr[scala.Nothing],
      hasTickAmount: Boolean
    ): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(interval: Double, multiples: js.UndefOr[scala.Nothing], magnitude: Double, allowDecimals: Boolean): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.UndefOr[scala.Nothing],
      magnitude: Double,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[_]): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[_],
      magnitude: js.UndefOr[scala.Nothing],
      allowDecimals: js.UndefOr[scala.Nothing],
      hasTickAmount: Boolean
    ): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[_],
      magnitude: js.UndefOr[scala.Nothing],
      allowDecimals: Boolean
    ): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[_],
      magnitude: js.UndefOr[scala.Nothing],
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[_], magnitude: Double): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[_],
      magnitude: Double,
      allowDecimals: js.UndefOr[scala.Nothing],
      hasTickAmount: Boolean
    ): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[_], magnitude: Double, allowDecimals: Boolean): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.normalizeTickInterval")
    @js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[_],
      magnitude: Double,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.numberFormat")
    @js.native
    def numberFormat(number: Double, decimals: Double): String = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.numberFormat")
    @js.native
    def numberFormat(number: Double, decimals: Double, decimalPoint: js.UndefOr[scala.Nothing], thousandsSep: String): String = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.numberFormat")
    @js.native
    def numberFormat(number: Double, decimals: Double, decimalPoint: String): String = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.numberFormat")
    @js.native
    def numberFormat(number: Double, decimals: Double, decimalPoint: String, thousandsSep: String): String = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.objectEach")
    @js.native
    def objectEach[T](obj: js.Any, fn: ObjectEachCallbackFunction[T]): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.objectEach")
    @js.native
    def objectEach[T](obj: js.Any, fn: ObjectEachCallbackFunction[T], ctx: T): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.offset")
    @js.native
    def offset(el: Element): OffsetObject = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.pad")
    @js.native
    def pad(number: Double): String = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.pad")
    @js.native
    def pad(number: Double, length: js.UndefOr[scala.Nothing], padder: String): String = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.pad")
    @js.native
    def pad(number: Double, length: Double): String = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.pad")
    @js.native
    def pad(number: Double, length: Double, padder: String): String = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.pick")
    @js.native
    def pick[T](items: (js.UndefOr[T | Null])*): T = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.reduce")
    @js.native
    def reduce(arr: js.Array[_], fn: js.Function, initialValue: js.Any): js.Any = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.relativeLength")
    @js.native
    def relativeLength(value: RelativeSize, base: Double): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.relativeLength")
    @js.native
    def relativeLength(value: RelativeSize, base: Double, offset: Double): Double = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.removeEvent")
    @js.native
    def removeEvent[T](el: T): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.removeEvent")
    @js.native
    def removeEvent[T](el: T, `type`: js.UndefOr[scala.Nothing], fn: EventCallbackFunction[T]): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.removeEvent")
    @js.native
    def removeEvent[T](el: T, `type`: String): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.removeEvent")
    @js.native
    def removeEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.removeEvent")
    @js.native
    def removeEvent[T](el: Class[T]): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.removeEvent")
    @js.native
    def removeEvent[T](el: Class[T], `type`: js.UndefOr[scala.Nothing], fn: EventCallbackFunction[T]): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.removeEvent")
    @js.native
    def removeEvent[T](el: Class[T], `type`: String): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.removeEvent")
    @js.native
    def removeEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.seriesType")
    @js.native
    def seriesType(`type`: String, parent: String, options: Dictionary[_]): typings.highcharts.mod.Series = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.seriesType")
    @js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: Dictionary[_],
      props: js.UndefOr[scala.Nothing],
      pointProps: Dictionary[_]
    ): typings.highcharts.mod.Series = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.seriesType")
    @js.native
    def seriesType(`type`: String, parent: String, options: Dictionary[_], props: Dictionary[_]): typings.highcharts.mod.Series = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.seriesType")
    @js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: Dictionary[_],
      props: Dictionary[_],
      pointProps: Dictionary[_]
    ): typings.highcharts.mod.Series = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.seriesType")
    @js.native
    def seriesType(`type`: String, parent: String, options: SeriesOptionsType): typings.highcharts.mod.Series = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.seriesType")
    @js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: SeriesOptionsType,
      props: js.UndefOr[scala.Nothing],
      pointProps: Dictionary[_]
    ): typings.highcharts.mod.Series = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.seriesType")
    @js.native
    def seriesType(`type`: String, parent: String, options: SeriesOptionsType, props: Dictionary[_]): typings.highcharts.mod.Series = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.seriesType")
    @js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: SeriesOptionsType,
      props: Dictionary[_],
      pointProps: Dictionary[_]
    ): typings.highcharts.mod.Series = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.setAnimation")
    @js.native
    def setAnimation(animation: js.UndefOr[scala.Nothing], chart: Chart_): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.setAnimation")
    @js.native
    def setAnimation(animation: Boolean, chart: Chart_): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.setAnimation")
    @js.native
    def setAnimation(animation: PartialAnimationOptionsOb, chart: Chart_): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.setOptions")
    @js.native
    def setOptions(options: Options): Options = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.some")
    @js.native
    def some(arr: js.Array[_], fn: js.Function, ctx: js.Any): Boolean = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.splat")
    @js.native
    def splat(obj: js.Any): js.Array[_] = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.stableSort")
    @js.native
    def stableSort(arr: js.Array[_], sortFunction: js.Function): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.stop")
    @js.native
    def stop(el: typings.highcharts.mod.SVGElement): Unit = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.stop")
    @js.native
    def stop(el: typings.highcharts.mod.SVGElement, prop: String): Unit = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.syncTimeout")
    @js.native
    def syncTimeout(fn: js.Function, delay: Double): Double = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.syncTimeout")
    @js.native
    def syncTimeout(fn: js.Function, delay: Double, context: js.Any): Double = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.theme")
    @js.native
    def theme: Options = js.native
    @scala.inline
    def theme_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.time")
    @js.native
    def time: Time_ = js.native
    @scala.inline
    def time_=(x: Time_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.uniqueKey")
    @js.native
    def uniqueKey(): String = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.useSerialIds")
    @js.native
    def useSerialIds(): js.UndefOr[Boolean] = js.native
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.useSerialIds")
    @js.native
    def useSerialIds(mode: Boolean): js.UndefOr[Boolean] = js.native
    
    @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "Highcharts.wrap")
    @js.native
    def wrap(obj: js.Any, method: String, func: WrapProceedFunction): Unit = js.native
  }
  
  @JSImport("highcharts/indicators/ichimoku-kinko-hyo", "factory")
  @js.native
  def factory(highcharts: TypeofHighchartsAddEvent): Unit = js.native
  
  /* augmented module */
  object highchartsAugmentingMod
}
