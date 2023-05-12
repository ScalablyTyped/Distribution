package typings.highcharts.mod

import org.scalablytyped.runtime.StringDictionary
import typings.highcharts.anon.PartialAnimationOptionsOb
import typings.highcharts.globalsMod.GlobalSVGElement
import typings.highcharts.highchartsBooleans.`false`
import typings.highcharts.mod.^
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Partial
import typings.std.PointerEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def SeriesPalettes: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("SeriesPalettes").asInstanceOf[Any]
inline def SeriesPalettes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SeriesPalettes")(x.asInstanceOf[js.Any])

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
inline def animate(el: SVGElement, params: CSSObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def animate(el: SVGElement, params: CSSObject, opt: PartialAnimationOptionsOb): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def animate(el: SVGElement, params: SVGAttributes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def animate(el: SVGElement, params: SVGAttributes, opt: PartialAnimationOptionsOb): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], params.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Unit]

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

inline def centerImage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("centerImage")().asInstanceOf[Unit]

inline def chart(options: Options): Chart_ = ^.asInstanceOf[js.Dynamic].applyDynamic("chart")(options.asInstanceOf[js.Any]).asInstanceOf[Chart_]
inline def chart(options: Options, callback: ChartCallbackFunction): Chart_ = (^.asInstanceOf[js.Dynamic].applyDynamic("chart")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Chart_]
inline def chart(renderTo: String, options: Options): Chart_ = (^.asInstanceOf[js.Dynamic].applyDynamic("chart")(renderTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chart_]
inline def chart(renderTo: String, options: Options, callback: ChartCallbackFunction): Chart_ = (^.asInstanceOf[js.Dynamic].applyDynamic("chart")(renderTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Chart_]
inline def chart(renderTo: HTMLDOMElement, options: Options): Chart_ = (^.asInstanceOf[js.Dynamic].applyDynamic("chart")(renderTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chart_]
inline def chart(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction): Chart_ = (^.asInstanceOf[js.Dynamic].applyDynamic("chart")(renderTo.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Chart_]

inline def charts: js.Array[js.UndefOr[Chart_]] = ^.asInstanceOf[js.Dynamic].selectDynamic("charts").asInstanceOf[js.Array[js.UndefOr[Chart_]]]
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

inline def dateFormats: Record[String, TimeFormatCallbackFunction] = ^.asInstanceOf[js.Dynamic].selectDynamic("dateFormats").asInstanceOf[Record[String, TimeFormatCallbackFunction]]
inline def dateFormats_=(x: Record[String, TimeFormatCallbackFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateFormats")(x.asInstanceOf[js.Any])

inline def defaultOptions: Options = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultOptions").asInstanceOf[Options]
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
inline def getDeferredAnimation(chart: Chart_, animation: Boolean, series: Series): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeferredAnimation")(chart.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], series.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeferredAnimation")(chart.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getDeferredAnimation(chart: Chart_, animation: AnimationOptionsObject, series: Series): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeferredAnimation")(chart.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], series.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def getMagnitude(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMagnitude")(num.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def getOptions(): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")().asInstanceOf[Options]

inline def getRendererType(): Class[SVGRenderer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRendererType")().asInstanceOf[Class[SVGRenderer]]
inline def getRendererType(rendererType: String): Class[SVGRenderer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRendererType")(rendererType.asInstanceOf[js.Any]).asInstanceOf[Class[SVGRenderer]]

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

inline def pushUnique(array: js.Array[Any], item: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pushUnique")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def reduce(arr: js.Array[Any], fn: js.Function, initialValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def registerRendererType(rendererType: String, rendererClass: Class[SVGRenderer], setAsDefault: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRendererType")(rendererType.asInstanceOf[js.Any], rendererClass.asInstanceOf[js.Any], setAsDefault.asInstanceOf[js.Any])).asInstanceOf[Unit]

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

inline def seriesType(`type`: String, parent: String, options: Dictionary[Any]): Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Series]
inline def seriesType(`type`: String, parent: String, options: Dictionary[Any], props: Unit, pointProps: Dictionary[Any]): Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any], pointProps.asInstanceOf[js.Any])).asInstanceOf[Series]
inline def seriesType(`type`: String, parent: String, options: Dictionary[Any], props: Dictionary[Any]): Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Series]
inline def seriesType(
  `type`: String,
  parent: String,
  options: Dictionary[Any],
  props: Dictionary[Any],
  pointProps: Dictionary[Any]
): Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any], pointProps.asInstanceOf[js.Any])).asInstanceOf[Series]
inline def seriesType(`type`: String, parent: String, options: SeriesOptionsType): Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Series]
inline def seriesType(
  `type`: String,
  parent: String,
  options: SeriesOptionsType,
  props: Unit,
  pointProps: Dictionary[Any]
): Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any], pointProps.asInstanceOf[js.Any])).asInstanceOf[Series]
inline def seriesType(`type`: String, parent: String, options: SeriesOptionsType, props: Dictionary[Any]): Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Series]
inline def seriesType(
  `type`: String,
  parent: String,
  options: SeriesOptionsType,
  props: Dictionary[Any],
  pointProps: Dictionary[Any]
): Series = (^.asInstanceOf[js.Dynamic].applyDynamic("seriesType")(`type`.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any], props.asInstanceOf[js.Any], pointProps.asInstanceOf[js.Any])).asInstanceOf[Series]

inline def setAnimation(animation: Boolean, chart: Chart_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnimation")(animation.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setAnimation(animation: Unit, chart: Chart_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnimation")(animation.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setAnimation(animation: PartialAnimationOptionsOb, chart: Chart_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnimation")(animation.asInstanceOf[js.Any], chart.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setOptions(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def some(arr: js.Array[Any], fn: js.Function, ctx: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def splat(obj: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("splat")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]

inline def stableSort(arr: js.Array[Any], sortFunction: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stableSort")(arr.asInstanceOf[js.Any], sortFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def stop(el: SVGElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def stop(el: SVGElement, prop: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stop")(el.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def syncTimeout(fn: js.Function, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def syncTimeout(fn: js.Function, delay: Double, context: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("syncTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def theme: Options = ^.asInstanceOf[js.Dynamic].selectDynamic("theme").asInstanceOf[Options]
inline def theme_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])

inline def time: Time_ = ^.asInstanceOf[js.Dynamic].selectDynamic("time").asInstanceOf[Time_]
inline def time_=(x: Time_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])

inline def uniqueKey(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueKey")().asInstanceOf[String]

inline def useSerialIds(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSerialIds")().asInstanceOf[js.UndefOr[Boolean]]
inline def useSerialIds(mode: Boolean): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSerialIds")(mode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]

inline def wrap(obj: Any, method: String, func: WrapProceedFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(obj.asInstanceOf[js.Any], method.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]

type AccessibilityAnnouncementFormatter = js.Function3[
/* updatedSeries */ js.Array[Series], 
/* addedSeries */ js.UndefOr[Series], 
/* addedPoint */ js.UndefOr[Point], 
`false` | String]

type AnimationStepCallbackFunction = js.ThisFunction0[/* this */ SVGElement, Unit]

type AnnotationControlPointPositionerFunction = js.ThisFunction1[
/* this */ AnnotationControlPoint, 
/* target */ AnnotationControllable, 
PositionObject]

type AnnotationMockPointFunction = js.Function1[/* annotation */ Annotation, AnnotationMockPointOptionsObject]

type AnnotationShapePointOptions = String | AnnotationMockPointFunction | AnnotationMockPointOptionsObject

type AxisEventCallbackFunction = js.ThisFunction0[/* this */ Axis, Unit]

type AxisLabelsFormatterCallbackFunction = js.ThisFunction1[
/* this */ AxisLabelsFormatterContextObject, 
/* ctx */ AxisLabelsFormatterContextObject, 
String]

type AxisPointBreakEventCallbackFunction = js.ThisFunction1[/* this */ Axis, /* evt */ AxisPointBreakEventObject, Unit]

type AxisSetExtremesEventCallbackFunction = js.ThisFunction1[/* this */ Axis, /* evt */ AxisSetExtremesEventObject, Unit]

type AxisTickPositionerCallbackFunction = js.ThisFunction0[/* this */ Axis, AxisTickPositionsArray]

type BreadcrumbsClickCallbackFunction = js.Function3[/* event */ Event, /* options */ BreadcrumbOptions, /* e */ Event, Unit]

type BreadcrumbsFormatterCallbackFunction = js.Function2[/* event */ Event, /* options */ BreadcrumbOptions, String]

type ChartAddSeriesCallbackFunction = js.ThisFunction1[/* this */ Chart_, /* event */ ChartAddSeriesEventObject, Unit]

type ChartCallbackFunction = js.Function1[/* chart */ Chart_, Unit]

type ChartClickCallbackFunction = js.ThisFunction1[/* this */ Chart_, /* event */ PointerEventObject, Unit]

type ChartLoadCallbackFunction = js.ThisFunction1[/* this */ Chart_, /* event */ Event, Unit]

type ChartRedrawCallbackFunction = js.ThisFunction1[/* this */ Chart_, /* event */ Event, Unit]

type ChartRenderCallbackFunction = js.ThisFunction1[/* this */ Chart_, /* event */ Event, Unit]

type ChartSelectionCallbackFunction = js.ThisFunction1[/* this */ Chart_, /* event */ SelectEventObject, js.UndefOr[Boolean]]

type ClipRectElement = SVGElement

type ColorString = String

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.mod.ColorString
  - typings.highcharts.mod.GradientColorObject
  - typings.highcharts.mod.PatternObject
*/
type ColorType = _ColorType | ColorString

type DataBeforeParseCallbackFunction = js.Function1[/* csv */ String, String]

type DataCompleteCallbackFunction = js.Function1[/* chartOptions */ Options, Unit]

/**
  * Callback function that returns the correspondig Date object to a match.
  */
type DataDateFormatCallbackFunction = js.Function1[/* match */ js.Array[Double], Double]

type DataLabelsFormatterCallbackFunction = js.ThisFunction1[
/* this */ PointLabelObject, 
/* options */ DataLabelsOptions, 
js.UndefOr[Double | String | Null]]

type DataParseDateCallbackFunction = js.Function1[/* dateValue */ String, Double]

type DataParsedCallbackFunction = js.Function1[/* columns */ js.Array[js.Array[Any]], js.UndefOr[Boolean]]

type DataValueType = Double | String | Null

type Dictionary[T] = StringDictionary[T]

type DrilldownCallbackFunction = js.ThisFunction1[/* this */ Chart_, /* e */ DrilldownEventObject, Unit]

type DrillupAllCallbackFunction = js.ThisFunction1[/* this */ Chart_, /* e */ DrillupAllEventObject, Unit]

type DrillupCallbackFunction = js.ThisFunction1[/* this */ Chart_, /* e */ DrillupEventObject, Unit]

type EventCallbackFunction[T] = js.ThisFunction1[
/* this */ T, 
/* eventArguments */ js.UndefOr[Event | Dictionary[Any]], 
Boolean | Unit]

type ExportDataCallbackFunction = js.ThisFunction1[/* this */ Chart_, /* event */ ExportDataEventObject, Unit]

type ExportingAfterPrintCallbackFunction = js.ThisFunction1[/* this */ Chart_, /* event */ Event, Unit]

type ExportingBeforePrintCallbackFunction = js.ThisFunction1[/* this */ Chart_, /* event */ Event, Unit]

type ExportingErrorCallbackFunction = js.Function2[/* options */ ExportingOptions, /* err */ js.Error, Unit]

type FormatterCallbackFunction[T] = js.ThisFunction0[/* this */ T, String]

type FullScreenfullscreenCloseCallbackFunction = js.Function2[/* chart */ Chart_, /* event */ Event, Unit]

type FullScreenfullscreenOpenCallbackFunction = js.Function2[/* chart */ Chart_, /* event */ Event, Unit]

type HTMLAttributes = Dictionary[Boolean | Double | String | js.Function]

type HTMLDOMElement = HTMLElement

type LonLatArray = js.Array[Double]

type MarkerClusterDrillCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ PointClickEventObject, Unit]

/**
  * Callback that fires after the end of Networkgraph series simulation when
  * the layout is stable.
  *
  * @param this
  *        The series where the event occured.
  *
  * @param event
  *        The event that occured.
  */
type NetworkgraphAfterSimulationCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ Event, Unit]

type NumberFormatterCallbackFunction = js.Function4[
/* number */ Double, 
/* decimals */ Double, 
/* decimalPoint */ js.UndefOr[String], 
/* thousandsSep */ js.UndefOr[String], 
String]

type ObjectEachCallbackFunction[T] = js.ThisFunction3[/* this */ T, /* value */ Any, /* key */ String, /* obj */ Any, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.highchartsStrings.straight
  - typings.highcharts.highchartsStrings.fastAvoid
  - typings.highcharts.highchartsStrings.simpleConnect
  - java.lang.String
*/
type PathfinderTypeValue = _PathfinderTypeValue | String

type PointClickCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ PointClickEventObject, Unit]

type PointDragCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ PointDragEventObject, Unit]

type PointDragStartCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ PointDragStartEventObject, Unit]

type PointDropCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ PointDropEventObject, Unit]

type PointLegendItemClickCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ PointLegendItemClickEventObject, Unit]

type PointMouseOutCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ PointerEvent, Unit]

type PointMouseOverCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ Event, Unit]

type PointOptionsType = Double | String | PointOptionsObject | (js.Array[Double | String | Null]) | Null

type PointRemoveCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ Event, Unit]

type PointSelectCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ PointInteractionEventObject, Unit]

type PointUnselectCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ PointInteractionEventObject, Unit]

type PointUpdateCallbackFunction = js.ThisFunction1[/* this */ Point, /* event */ PointUpdateEventObject, Unit]

type RangeSelectorClickCallbackFunction = js.Function2[/* e */ Event, /* Return */ js.UndefOr[Boolean], Unit]

type RangeSelectorParseCallbackFunction = js.Function1[/* value */ String, Double]

type RelativeSize = Double | String

type ResponsiveCallbackFunction = js.ThisFunction0[/* this */ Chart_, Boolean]

type SVGDOMElement = GlobalSVGElement

type SVGPathArray = js.Array[
js.Array[SVGPathCommand] | (js.Tuple2[SVGPathCommand, Double]) | (js.Tuple3[SVGPathCommand, Double, Double]) | (js.Tuple5[SVGPathCommand, Double, Double, Double, Double]) | (js.Tuple7[SVGPathCommand, Double, Double, Double, Double, Double, Double]) | (js.Tuple8[SVGPathCommand, Double, Double, Double, Double, Double, Double, Double])]

type ScreenReaderClickCallbackFunction = js.Function1[/* evt */ MouseEvent, Unit]

type ScreenReaderFormatterCallbackFunction[T] = js.Function1[/* context */ T, String]

type SeriesAfterAnimateCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ SeriesAfterAnimateEventObject, Unit]

type SeriesCheckboxClickCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ SeriesCheckboxClickEventObject, Unit]

type SeriesClickCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ SeriesClickEventObject, Unit]

type SeriesHideCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ Event, Unit]

type SeriesLegendItemClickCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ SeriesLegendItemClickEventObject, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.highchartsStrings.butt
  - typings.highcharts.highchartsStrings.round
  - typings.highcharts.highchartsStrings.square
  - java.lang.String
*/
type SeriesLinecapValue = _SeriesLinecapValue | String

type SeriesMouseOutCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ PointerEvent, Unit]

type SeriesMouseOverCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ PointerEvent, Unit]

type SeriesNetworkgraphDataLabelsFormatterCallbackFunction = js.ThisFunction0[
/* this */ PointLabelObject | SeriesNetworkgraphDataLabelsFormatterContextObject, 
String]

type SeriesPackedBubbleDataLabelsFormatterCallbackFunction = js.ThisFunction0[/* this */ SeriesPackedBubbleDataLabelsFormatterContextObject, String]

type SeriesSankeyDataLabelsFormatterCallbackFunction = js.ThisFunction0[
/* this */ PointLabelObject | SeriesSankeyDataLabelsFormatterContextObject, 
js.UndefOr[String]]

type SeriesShowCallbackFunction = js.ThisFunction1[/* this */ Series, /* event */ Event, Unit]

/**
  * Callback function for sonification events on chart.
  *
  * @param e
  *        Sonification chart event context
  */
type SonificationChartEventCallback = js.Function1[
/* e */ typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationChartEventCallbackContext, 
Unit]

/**
  * Callback function for sonification events on series.
  *
  * @param e
  *        Sonification series event context
  */
type SonificationSeriesEventCallback = js.Function1[
/* e */ typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSeriesEventCallbackContext, 
Unit]

/**
  * Filter callback for filtering timeline events on a SonificationTimeline.
  *
  * @param e
  *        TimelineEvent being filtered
  *
  * @param ix
  *        Index of TimelineEvent in current event array
  *
  * @param arr
  *        The current event array
  *
  * @return The function should return true if the TimelineEvent should be
  *         included, false otherwise.
  */
type SonificationTimelineFilterCallback = js.Function3[
/* e */ typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationTimelineEvent, 
/* ix */ Double, 
/* arr */ js.Array[
  typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationTimelineEvent
], 
Boolean]

type SynthEnvelope = js.Array[SynthEnvelopePoint]

type TimeFormatCallbackFunction = js.Function1[/* timestamp */ Double, String]

type TimelineDataLabelsFormatterCallbackFunction = js.ThisFunction0[
/* this */ PointLabelObject | TimelineDataLabelsFormatterContextObject, 
js.UndefOr[Double | String | Null]]

type TimezoneOffsetCallbackFunction = js.Function1[/* timestamp */ Double, Double]

type TooltipFormatterCallbackFunction = js.ThisFunction1[
/* this */ TooltipFormatterContextObject, 
/* tooltip */ Tooltip, 
js.UndefOr[`false` | String | (js.Array[js.UndefOr[String | Null]]) | Null]]

type TooltipPositionerCallbackFunction = js.ThisFunction3[
/* this */ Tooltip, 
/* labelWidth */ Double, 
/* labelHeight */ Double, 
/* point */ TooltipPositionerPointObject, 
PositionObject]

type TopoJSON = js.Object

type WrapProceedFunction = js.Function3[
/* arg1 */ js.UndefOr[Any], 
/* arg2 */ js.UndefOr[Any], 
/* arg3 */ js.UndefOr[Any], 
Any]

type XAxisCrosshairLabelFormatterCallbackFunction = js.ThisFunction1[/* this */ Axis, /* value */ Double, String]
