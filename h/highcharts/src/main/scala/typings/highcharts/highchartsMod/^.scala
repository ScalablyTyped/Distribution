package typings.highcharts.highchartsMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var charts: js.Array[js.UndefOr[Chart]] = js.native
  var dateFormats: Dictionary[TimeFormatCallbackFunction] = js.native
  var defaultOptions: Options = js.native
  var time: Time = js.native
  def addEvent[T](el: T, `type`: String, fn: js.Function): js.Function = js.native
  def addEvent[T](el: T, `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
  def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
  def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
  def animObject(): AnimationOptionsObject = js.native
  def animObject(animation: Boolean): AnimationOptionsObject = js.native
  def animObject(animation: AnimationOptionsObject): AnimationOptionsObject = js.native
  def animate(el: HTMLDOMElement, params: CSSObject): Unit = js.native
  def animate(el: HTMLDOMElement, params: CSSObject, opt: AnimationOptionsObject): Unit = js.native
  def animate(el: HTMLDOMElement, params: SVGAttributes): Unit = js.native
  def animate(el: HTMLDOMElement, params: SVGAttributes, opt: AnimationOptionsObject): Unit = js.native
  def animate(el: SVGElement, params: CSSObject): Unit = js.native
  def animate(el: SVGElement, params: CSSObject, opt: AnimationOptionsObject): Unit = js.native
  def animate(el: SVGElement, params: SVGAttributes): Unit = js.native
  def animate(el: SVGElement, params: SVGAttributes, opt: AnimationOptionsObject): Unit = js.native
  def arrayMax(data: js.Array[_]): Double = js.native
  def arrayMin(data: js.Array[_]): Double = js.native
  def attr(elem: HTMLDOMElement): js.Any = js.native
  def attr(elem: HTMLDOMElement, prop: String): js.Any = js.native
  def attr(elem: HTMLDOMElement, prop: String, value: String): js.Any = js.native
  def attr(elem: HTMLDOMElement, prop: String, value: Double): js.Any = js.native
  def attr(elem: HTMLDOMElement, prop: HTMLAttributes): js.Any = js.native
  def attr(elem: HTMLDOMElement, prop: HTMLAttributes, value: String): js.Any = js.native
  def attr(elem: HTMLDOMElement, prop: HTMLAttributes, value: Double): js.Any = js.native
  def attr(elem: HTMLDOMElement, prop: SVGAttributes): js.Any = js.native
  def attr(elem: HTMLDOMElement, prop: SVGAttributes, value: String): js.Any = js.native
  def attr(elem: HTMLDOMElement, prop: SVGAttributes, value: Double): js.Any = js.native
  def attr(elem: SVGDOMElement): js.Any = js.native
  def attr(elem: SVGDOMElement, prop: String): js.Any = js.native
  def attr(elem: SVGDOMElement, prop: String, value: String): js.Any = js.native
  def attr(elem: SVGDOMElement, prop: String, value: Double): js.Any = js.native
  def attr(elem: SVGDOMElement, prop: HTMLAttributes): js.Any = js.native
  def attr(elem: SVGDOMElement, prop: HTMLAttributes, value: String): js.Any = js.native
  def attr(elem: SVGDOMElement, prop: HTMLAttributes, value: Double): js.Any = js.native
  def attr(elem: SVGDOMElement, prop: SVGAttributes): js.Any = js.native
  def attr(elem: SVGDOMElement, prop: SVGAttributes, value: String): js.Any = js.native
  def attr(elem: SVGDOMElement, prop: SVGAttributes, value: Double): js.Any = js.native
  def chart(options: Options): Chart = js.native
  def chart(options: Options, callback: ChartCallbackFunction): Chart = js.native
  def chart(renderTo: String, options: Options): Chart = js.native
  def chart(renderTo: String, options: Options, callback: ChartCallbackFunction): Chart = js.native
  def chart(renderTo: HTMLDOMElement, options: Options): Chart = js.native
  def chart(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction): Chart = js.native
  def clearTimeout(id: Double): Unit = js.native
  def color(input: ColorString): Color = js.native
  def correctFloat(num: Double): Double = js.native
  def correctFloat(num: Double, prec: Double): Double = js.native
  def createElement(tag: String): HTMLDOMElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes): HTMLDOMElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject): HTMLDOMElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement): HTMLDOMElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLDOMElement, nopad: Boolean): HTMLDOMElement = js.native
  def css(el: HTMLDOMElement, styles: CSSObject): Unit = js.native
  def css(el: SVGDOMElement, styles: CSSObject): Unit = js.native
  def dateFormat(format: String, timestamp: Double): String = js.native
  def dateFormat(format: String, timestamp: Double, capitalize: Boolean): String = js.native
  def defined(obj: js.Any): Boolean = js.native
  def destroyObjectProperties(obj: js.Any): Unit = js.native
  def destroyObjectProperties(obj: js.Any, except: js.Any): Unit = js.native
  def discardElement(element: HTMLDOMElement): Unit = js.native
  def each(arr: js.Array[_], fn: js.Function): Unit = js.native
  def each(arr: js.Array[_], fn: js.Function, ctx: js.Any): Unit = js.native
  def erase(arr: js.Array[_], item: js.Any): Unit = js.native
  def error(code: String): Unit = js.native
  def error(code: String, stop: Boolean): Unit = js.native
  def error(code: String, stop: Boolean, chart: Chart): Unit = js.native
  def error(code: Double): Unit = js.native
  def error(code: Double, stop: Boolean): Unit = js.native
  def error(code: Double, stop: Boolean, chart: Chart): Unit = js.native
  def extend[T](a: T, b: js.Object): T = js.native
  def extendClass(parent: js.Any, members: Dictionary[_]): js.Any = js.native
  def find(arr: js.Array[_], callback: js.Function): js.Any = js.native
  def fireEvent[T](el: T, `type`: String): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_]): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: js.Function): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: EventCallbackFunction[T]): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Event): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: js.Function): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Event, defaultFunction: EventCallbackFunction[T]): Unit = js.native
  def format(str: String, ctx: js.Any): String = js.native
  def format(str: String, ctx: js.Any, time: Time): String = js.native
  def formatSingle(format: String, `val`: js.Any): String = js.native
  def formatSingle(format: String, `val`: js.Any, time: Time): String = js.native
  def getMagnitude(num: Double): Double = js.native
  def getOptions(): Options = js.native
  def getStyle(el: HTMLDOMElement, prop: String): Double | String = js.native
  def getStyle(el: HTMLDOMElement, prop: String, toInt: Boolean): Double | String = js.native
  def grep(arr: js.Array[_], callback: js.Function): js.Array[_] = js.native
  def inArray(item: js.Any, arr: js.Array[_]): Double = js.native
  def inArray(item: js.Any, arr: js.Array[_], fromIndex: Double): Double = js.native
  def isArray(obj: js.Any): Boolean = js.native
  def isClass(obj: js.Any): Boolean = js.native
  def isDOMElement(obj: js.Any): Boolean = js.native
  def isNumber(n: js.Any): Boolean = js.native
  def isObject(obj: js.Any): Boolean = js.native
  def isObject(obj: js.Any, strict: Boolean): Boolean = js.native
  def isString(s: js.Any): Boolean = js.native
  def keys(obj: js.Any): js.Array[String] = js.native
  def map(arr: js.Array[_], fn: js.Function): js.Array[_] = js.native
  def merge[T](a: T): T = js.native
  def merge[T](a: T, n: js.Array[js.UndefOr[js.Object]]): T = js.native
  def merge[T](extend: Boolean, a: T): T = js.native
  def merge[T](extend: Boolean, a: T, n: js.Array[js.UndefOr[js.Object]]): T = js.native
  def normalizeTickInterval(interval: Double): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.Array[_]): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.Array[_], magnitude: Double): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.Array[_], magnitude: Double, allowDecimals: Boolean): Double = js.native
  def normalizeTickInterval(
    interval: Double,
    multiples: js.Array[_],
    magnitude: Double,
    allowDecimals: Boolean,
    hasTickAmount: Boolean
  ): Double = js.native
  def numberFormat(number: Double, decimals: Double): String = js.native
  def numberFormat(number: Double, decimals: Double, decimalPoint: String): String = js.native
  def numberFormat(number: Double, decimals: Double, decimalPoint: String, thousandsSep: String): String = js.native
  def objectEach[T](obj: js.Any, fn: ObjectEachCallbackFunction[T]): Unit = js.native
  def objectEach[T](obj: js.Any, fn: ObjectEachCallbackFunction[T], ctx: T): Unit = js.native
  def offset(el: HTMLDOMElement): OffsetObject = js.native
  def pad(number: Double): String = js.native
  def pad(number: Double, length: Double): String = js.native
  def pad(number: Double, length: Double, padder: String): String = js.native
  def pick(items: js.Any): js.Any = js.native
  def reduce(arr: js.Array[_], fn: js.Function, initialValue: js.Any): js.Any = js.native
  def relativeLength(value: RelativeSize, base: Double): Double = js.native
  def relativeLength(value: RelativeSize, base: Double, offset: Double): Double = js.native
  def removeEvent[T](el: T): Unit = js.native
  def removeEvent[T](el: T, `type`: String): Unit = js.native
  def removeEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
  def seriesType(`type`: String, parent: String, options: js.Any, props: js.Any): Series = js.native
  def seriesType(`type`: String, parent: String, options: js.Any, props: js.Any, pointProps: js.Any): Series = js.native
  def setAnimation(animation: js.UndefOr[scala.Nothing], chart: Chart): Unit = js.native
  def setAnimation(animation: Boolean, chart: Chart): Unit = js.native
  def setAnimation(animation: AnimationOptionsObject, chart: Chart): Unit = js.native
  def setOptions(options: Options): Options = js.native
  def some(arr: js.Array[_], fn: js.Function, ctx: js.Any): Boolean = js.native
  def splat(obj: js.Any): js.Array[_] = js.native
  def stableSort(arr: js.Array[_], sortFunction: js.Function): Unit = js.native
  def stop(el: SVGElement): Unit = js.native
  def stop(el: SVGElement, prop: String): Unit = js.native
  def syncTimeout(fn: js.Function): js.UndefOr[Double] = js.native
  def syncTimeout(fn: js.Function, delay: Double): js.UndefOr[Double] = js.native
  def syncTimeout(fn: js.Function, delay: Double, context: js.Any): js.UndefOr[Double] = js.native
  def uniqueKey(): String = js.native
  def wrap(obj: js.Any, method: String, func: WrapProceedFunction): Unit = js.native
}

