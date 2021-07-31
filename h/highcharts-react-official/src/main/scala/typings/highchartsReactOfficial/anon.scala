package typings.highchartsReactOfficial

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.highcharts.anon.PartialAnimationOptionsOb
import typings.highcharts.mod.AnimationOptionsObject
import typings.highcharts.mod.AnnotationControlPointOptionsObject
import typings.highcharts.mod.AnnotationControllable
import typings.highcharts.mod.AnnotationsOptions
import typings.highcharts.mod.Axis
import typings.highcharts.mod.AxisOptions
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
import typings.highcharts.mod.SVGElement
import typings.highcharts.mod.Series
import typings.highcharts.mod.SeriesOptionsType
import typings.highcharts.mod.TimeFormatCallbackFunction
import typings.highcharts.mod.TimeOptions
import typings.highcharts.mod.Time_
import typings.highcharts.mod.TooltipOptions
import typings.highcharts.mod.WrapProceedFunction
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Chart extends StObject {
    
    /**
      * Chart reference
      */
    var chart: Chart_
    
    /**
      * React reference
      */
    var container: RefObject[HTMLDivElement]
  }
  object Chart {
    
    @scala.inline
    def apply(chart: Chart_, container: RefObject[HTMLDivElement]): Chart = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chart]
    }
    
    @scala.inline
    implicit class ChartMutableBuilder[Self <: Chart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: Chart_): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
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
    def parse(input: ColorType): Color_ = js.native
  }
  
  @js.native
  trait TypeofHighcharts extends StObject {
    
    var Annotation: Instantiable2[
        /* chart */ Chart_, 
        /* userOptions */ AnnotationsOptions, 
        typings.highcharts.mod.Annotation
      ] = js.native
    
    var AnnotationControlPoint: Instantiable3[
        /* chart */ Chart_, 
        /* target */ AnnotationControllable, 
        /* options */ AnnotationControlPointOptionsObject, 
        typings.highcharts.mod.AnnotationControlPoint
      ] = js.native
    
    var Axis: Instantiable2[/* chart */ Chart_, /* userOptions */ AxisOptions, typings.highcharts.mod.Axis] = js.native
    
    var Chart: Instantiable1[/* options */ Options, Chart_] = js.native
    
    var Color: TypeofColor = js.native
    
    var ColorAxis: Instantiable2[
        /* chart */ Chart_, 
        /* userOptions */ ColorAxisOptions, 
        typings.highcharts.mod.ColorAxis
      ] = js.native
    
    var Legend: Instantiable2[/* chart */ Chart_, /* options */ LegendOptions, typings.highcharts.mod.Legend] = js.native
    
    var PlotLineOrBand: Instantiable1[/* axis */ Axis, typings.highcharts.mod.PlotLineOrBand] = js.native
    
    var Point: Instantiable0[typings.highcharts.mod.Point] = js.native
    
    var Pointer: Instantiable2[/* chart */ Chart_, /* options */ Options, typings.highcharts.mod.Pointer] = js.native
    
    var SVGElement: Instantiable0[typings.highcharts.mod.SVGElement] = js.native
    
    var SVGRenderer: Instantiable3[
        /* container */ HTMLDOMElement, 
        /* width */ Double, 
        /* height */ Double, 
        typings.highcharts.mod.SVGRenderer
      ] = js.native
    
    var Series: Instantiable2[/* chart */ Chart_, /* options */ js.Object, typings.highcharts.mod.Series] = js.native
    
    var Tick: Instantiable2[/* axis */ Axis, /* pos */ Double, typings.highcharts.mod.Tick] = js.native
    
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
    
    def arrayMax(data: js.Array[js.Any]): Double = js.native
    
    def arrayMin(data: js.Array[js.Any]): Double = js.native
    
    def attr(elem: HTMLDOMElement): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, prop: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, prop: String, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, prop: String, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, prop: Unit, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, prop: Unit, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, prop: HTMLAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, prop: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, prop: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, prop: SVGAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, prop: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: HTMLDOMElement, prop: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, prop: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, prop: String, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, prop: String, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, prop: Unit, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, prop: Unit, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, prop: HTMLAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, prop: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, prop: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, prop: SVGAttributes): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, prop: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
    def attr(elem: SVGDOMElement, prop: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
    
    def chart(options: Options): Chart_ = js.native
    def chart(options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    def chart(renderTo: String, options: Options): Chart_ = js.native
    def chart(renderTo: String, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    def chart(renderTo: HTMLDOMElement, options: Options): Chart_ = js.native
    def chart(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
    
    var charts: js.Array[js.UndefOr[Chart_]] = js.native
    
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
    
    var dateFormats: Dictionary[TimeFormatCallbackFunction] = js.native
    
    var defaultOptions: Options = js.native
    
    def defined(obj: js.Any): Boolean = js.native
    
    def destroyObjectProperties(obj: js.Any): Unit = js.native
    def destroyObjectProperties(obj: js.Any, except: js.Any): Unit = js.native
    
    def discardElement(element: HTMLDOMElement): Unit = js.native
    
    def each(arr: js.Array[js.Any], fn: js.Function): Unit = js.native
    def each(arr: js.Array[js.Any], fn: js.Function, ctx: js.Any): Unit = js.native
    
    def erase(arr: js.Array[js.Any], item: js.Any): Unit = js.native
    
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
    
    def extend[T](a: T, b: js.Object): T = js.native
    def extend[T](a: Unit, b: js.Object): T = js.native
    
    def extendClass[T](parent: Class[T], members: Dictionary[js.Any]): Class[T] = js.native
    
    def find[T](arr: js.Array[T], callback: js.Function): js.UndefOr[T] = js.native
    
    def fireEvent[T](el: T, `type`: String): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Unit, defaultFunction: js.Function): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Unit, defaultFunction: EventCallbackFunction[T]): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[js.Any]): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[js.Any], defaultFunction: js.Function): Unit = js.native
    def fireEvent[T](
      el: T,
      `type`: String,
      eventArguments: Dictionary[js.Any],
      defaultFunction: EventCallbackFunction[T]
    ): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: js.Function): Unit = js.native
    def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: EventCallbackFunction[T]): Unit = js.native
    
    def format(str: String, ctx: Record[String, js.Any]): String = js.native
    def format(str: String, ctx: Record[String, js.Any], chart: Chart_): String = js.native
    
    def getDeferredAnimation(chart: Chart_, animation: Boolean): Double = js.native
    def getDeferredAnimation(chart: Chart_, animation: Boolean, series: Series): Double = js.native
    def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject): Double = js.native
    def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject, series: Series): Double = js.native
    
    def getMagnitude(num: Double): Double = js.native
    
    def getOptions(): Options = js.native
    
    def getStyle(el: HTMLDOMElement, prop: String): Double | String = js.native
    def getStyle(el: HTMLDOMElement, prop: String, toInt: Boolean): Double | String = js.native
    
    def grep(arr: js.Array[js.Any], callback: js.Function): js.Array[js.Any] = js.native
    
    def inArray(item: js.Any, arr: js.Array[js.Any]): Double = js.native
    def inArray(item: js.Any, arr: js.Array[js.Any], fromIndex: Double): Double = js.native
    
    def isArray(obj: js.Any): Boolean = js.native
    
    def isClass(): Boolean = js.native
    def isClass(obj: js.Object): Boolean = js.native
    
    def isDOMElement(obj: js.Any): Boolean = js.native
    
    def isNumber(n: js.Any): Boolean = js.native
    
    def isObject(obj: js.Any): Boolean = js.native
    def isObject(obj: js.Any, strict: Boolean): Boolean = js.native
    
    def isString(s: js.Any): Boolean = js.native
    
    def keys(obj: js.Any): js.Array[String] = js.native
    
    def map(arr: js.Array[js.Any], fn: js.Function): js.Array[js.Any] = js.native
    
    def merge[T](a: T, n: js.UndefOr[js.Object]*): T = js.native
    def merge[T](a: Unit, n: js.UndefOr[js.Object]*): T = js.native
    def merge[T](extend: Boolean, a: T, n: js.UndefOr[js.Object]*): T = js.native
    def merge[T](extend: Boolean, a: Unit, n: js.UndefOr[js.Object]*): T = js.native
    
    def normalizeTickInterval(interval: Double): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[js.Any]): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[js.Any], magnitude: Double): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[js.Any], magnitude: Double, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[js.Any],
      magnitude: Double,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[js.Any],
      magnitude: Double,
      allowDecimals: Unit,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(interval: Double, multiples: js.Array[js.Any], magnitude: Unit, allowDecimals: Boolean): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[js.Any],
      magnitude: Unit,
      allowDecimals: Boolean,
      hasTickAmount: Boolean
    ): Double = js.native
    def normalizeTickInterval(
      interval: Double,
      multiples: js.Array[js.Any],
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
    
    def objectEach[T](obj: js.Any, fn: ObjectEachCallbackFunction[T]): Unit = js.native
    def objectEach[T](obj: js.Any, fn: ObjectEachCallbackFunction[T], ctx: T): Unit = js.native
    
    def offset(el: Element): OffsetObject = js.native
    
    def pad(number: Double): String = js.native
    def pad(number: Double, length: Double): String = js.native
    def pad(number: Double, length: Double, padder: String): String = js.native
    def pad(number: Double, length: Unit, padder: String): String = js.native
    
    def pick[T](items: (js.UndefOr[T | Null])*): T = js.native
    
    def reduce(arr: js.Array[js.Any], fn: js.Function, initialValue: js.Any): js.Any = js.native
    
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
    
    def seriesType(`type`: String, parent: String, options: Dictionary[js.Any]): Series = js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: Dictionary[js.Any],
      props: Unit,
      pointProps: Dictionary[js.Any]
    ): Series = js.native
    def seriesType(`type`: String, parent: String, options: Dictionary[js.Any], props: Dictionary[js.Any]): Series = js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: Dictionary[js.Any],
      props: Dictionary[js.Any],
      pointProps: Dictionary[js.Any]
    ): Series = js.native
    def seriesType(`type`: String, parent: String, options: SeriesOptionsType): Series = js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: SeriesOptionsType,
      props: Unit,
      pointProps: Dictionary[js.Any]
    ): Series = js.native
    def seriesType(`type`: String, parent: String, options: SeriesOptionsType, props: Dictionary[js.Any]): Series = js.native
    def seriesType(
      `type`: String,
      parent: String,
      options: SeriesOptionsType,
      props: Dictionary[js.Any],
      pointProps: Dictionary[js.Any]
    ): Series = js.native
    
    def setAnimation(animation: Boolean, chart: Chart_): Unit = js.native
    def setAnimation(animation: Unit, chart: Chart_): Unit = js.native
    def setAnimation(animation: PartialAnimationOptionsOb, chart: Chart_): Unit = js.native
    
    def setOptions(options: Options): Options = js.native
    
    def some(arr: js.Array[js.Any], fn: js.Function, ctx: js.Any): Boolean = js.native
    
    def splat(obj: js.Any): js.Array[js.Any] = js.native
    
    def stableSort(arr: js.Array[js.Any], sortFunction: js.Function): Unit = js.native
    
    def stop(el: SVGElement): Unit = js.native
    def stop(el: SVGElement, prop: String): Unit = js.native
    
    def syncTimeout(fn: js.Function, delay: Double): Double = js.native
    def syncTimeout(fn: js.Function, delay: Double, context: js.Any): Double = js.native
    
    var theme: Options = js.native
    
    var time: Time_ = js.native
    
    def uniqueKey(): String = js.native
    
    def useSerialIds(): js.UndefOr[Boolean] = js.native
    def useSerialIds(mode: Boolean): js.UndefOr[Boolean] = js.native
    
    def wrap(obj: js.Any, method: String, func: WrapProceedFunction): Unit = js.native
  }
}
