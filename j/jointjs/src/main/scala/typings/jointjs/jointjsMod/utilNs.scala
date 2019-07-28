package typings.jointjs.jointjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.Anon_Amount
import typings.jointjs.Anon_Angle
import typings.jointjs.Anon_Blur
import typings.jointjs.Anon_BlurColor
import typings.jointjs.Anon_ColorMargin
import typings.jointjs.Anon_D
import typings.jointjs.Anon_Ellipsis
import typings.jointjs.Anon_Height
import typings.jointjs.Anon_Unit
import typings.jointjs.Anon_XY
import typings.jointjs.jointjsMod.attributesNs.NativeSVGAttributes
import typings.jointjs.jointjsMod.diaNs.BBox
import typings.jointjs.jointjsMod.diaNs.LinkViewNs.GetConnectionPoint
import typings.jointjs.jointjsMod.diaNs.MarkupJSON
import typings.jointjs.jointjsMod.diaNs.PaddingJSON
import typings.jointjs.jointjsMod.diaNs.Sides
import typings.jointjs.jointjsMod.utilNs.Collection
import typings.jointjs.jointjsMod.utilNs.CustomizerFunction
import typings.jointjs.jointjsMod.utilNs.DOMJSONDocument
import typings.jointjs.jointjsMod.utilNs.Iteratee
import typings.jointjs.jointjsMod.utilNs.IterateeFunction
import typings.jointjs.jointjsMod.utilNs.IterateeShorthand
import typings.jointjs.jointjsMod.utilNs.NotVoid
import typings.jointjs.jointjsMod.utilNs.PropertyPath
import typings.jointjs.jointjsMod.utilNs.SourceObjectsOptionalFinalCustomizer
import typings.jointjs.jointjsMod.utilNs.filterNs.FilterFunction
import typings.jointjs.jointjsMod.utilNs.formatNs.NumberLocale
import typings.jointjs.jointjsMod.utilNs.interpolateNs.InterpolateFunction
import typings.jointjs.jointjsMod.utilNs.timingNs.TimingFunction
import typings.jointjs.jointjsStrings.blur
import typings.jointjs.jointjsStrings.brightness
import typings.jointjs.jointjsStrings.contrast
import typings.jointjs.jointjsStrings.dropShadow
import typings.jointjs.jointjsStrings.grayscale
import typings.jointjs.jointjsStrings.highlight
import typings.jointjs.jointjsStrings.hueRotate
import typings.jointjs.jointjsStrings.invert
import typings.jointjs.jointjsStrings.outline
import typings.jointjs.jointjsStrings.saturate
import typings.jointjs.jointjsStrings.sepia
import typings.jquery.JQuery
import typings.jquery.JQueryNs.Event
import typings.std.Blob
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Error
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "util")
@js.native
object utilNs extends js.Object {
  trait DOMJSONDocument extends js.Object {
    var fragment: DocumentFragment
    var groupSelectors: StringDictionary[js.Array[Element]]
    var selectors: StringDictionary[Element]
  }
  
  var shapePerimeterConnectionPoint: GetConnectionPoint = js.native
  def assign(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  def bindAll(`object`: js.Object, methodNames: js.Array[PropertyPath]): js.Object = js.native
  def breakText(text: String, size: Anon_Height): String = js.native
  def breakText(text: String, size: Anon_Height, attrs: NativeSVGAttributes): String = js.native
  def breakText(text: String, size: Anon_Height, attrs: NativeSVGAttributes, opt: Anon_Ellipsis): String = js.native
  def camelCase(string: String): String = js.native
  def cancelFrame(requestId: Double): Unit = js.native
  def clone[T](value: T): T = js.native
  def cloneDeep[T](value: T): T = js.native
  def dataUriToBlob(dataUri: String): Blob = js.native
  def debounce(func: js.Function): js.Function = js.native
  def debounce(func: js.Function, wait: Double): js.Function = js.native
  def debounce(func: js.Function, wait: Double, options: js.Object): js.Function = js.native
  def deepMixin(destinationObject: js.Object, sourceObject: js.Object): js.Object = js.native
  def deepMixin(destinationObject: js.Object, sourceObject: js.Object, options: js.Object): js.Object = js.native
  def deepSupplement(destionationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  def defaults(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  def defaultsDeep(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  def difference(array: js.Array[_], excludedValuesArrays: js.Array[_]*): js.Array[_] = js.native
  def downloadBlob(blob: Blob, fileName: String): Unit = js.native
  def downloadDataUri(dataUri: String, fileName: String): Unit = js.native
  def flattenDeep(array: js.Array[_]): js.Array[_] = js.native
  def flattenObject(`object`: StringDictionary[js.Any]): js.Any = js.native
  def flattenObject(`object`: StringDictionary[js.Any], delim: String): js.Any = js.native
  def flattenObject(`object`: StringDictionary[js.Any], delim: String, stop: js.Function1[/* node */ js.Any, Boolean]): js.Any = js.native
  def forIn(`object`: js.Object): js.Object = js.native
  def forIn(`object`: js.Object, iteratee: Iteratee): js.Object = js.native
  def getByPath(`object`: StringDictionary[js.Any], path: String): js.Any = js.native
  def getByPath(`object`: StringDictionary[js.Any], path: String, delim: String): js.Any = js.native
  def getByPath(`object`: StringDictionary[js.Any], path: js.Array[String]): js.Any = js.native
  def getByPath(`object`: StringDictionary[js.Any], path: js.Array[String], delim: String): js.Any = js.native
  def getElementBBox(el: Element): BBox = js.native
  def groupBy(collection: Collection): js.Object = js.native
  def groupBy(collection: Collection, iteratee: Iteratee): js.Object = js.native
  def guid(): String = js.native
  def guid(obj: StringDictionary[js.Any]): String = js.native
  def has(`object`: js.Object, path: PropertyPath): Boolean = js.native
  def hashCode(str: String): String = js.native
  def imageToDataUri(url: String, callback: js.Function2[/* err */ Error | Null, /* dataUri */ String, Unit]): Unit = js.native
  def intersection(arrays: js.Array[_]*): js.Array[_] = js.native
  def invoke(collection: Collection, functionToInvokeForAll: IterateeFunction): js.Array[_] = js.native
  def invoke(collection: Collection, functionToInvokeForAll: IterateeFunction, args: js.Array[_]): js.Array[_] = js.native
  def invoke(collection: Collection, methodPath: PropertyPath): js.Array[_] = js.native
  def invoke(collection: Collection, methodPath: PropertyPath, args: js.Array[_]): js.Array[_] = js.native
  def isBoolean(value: js.Any): Boolean = js.native
  def isEmpty(value: js.Any): Boolean = js.native
  def isEqual(value: js.Any, otherValue: js.Any): Boolean = js.native
  def isFunction(value: js.Any): Boolean = js.native
  def isNumber(value: js.Any): Boolean = js.native
  def isObject(value: js.Any): Boolean = js.native
  def isPercentage(`val`: js.Any): Boolean = js.native
  def isPlainObject(value: js.Any): Boolean = js.native
  def isString(value: js.Any): Boolean = js.native
  def merge(destinationObject: js.Object, sourceObject1: js.Object, sourceObject2: js.Object): js.Object = js.native
  def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    customizer: CustomizerFunction
  ): js.Object = js.native
  def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    sourceObject3: js.Object
  ): js.Object = js.native
  def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    sourceObject3: js.Object,
    customizer: CustomizerFunction
  ): js.Object = js.native
  def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    sourceObject3: js.Object,
    sourceObject4: js.Object
  ): js.Object = js.native
  def merge(
    destinationObject: js.Object,
    sourceObject1: js.Object,
    sourceObject2: js.Object,
    sourceObject3: js.Object,
    sourceObject4: js.Object,
    customizer: CustomizerFunction
  ): js.Object = js.native
  def merge(destinationObject: js.Object, sourceObject: js.Object): js.Object = js.native
  def merge(destinationObject: js.Object, sourceObject: js.Object, customizer: CustomizerFunction): js.Object = js.native
  def merge(
    destinationObject: js.Object,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param sourceObjectsOptionalFinalCustomizer because its type SourceObjectsOptionalFinalCustomizer is not an array type */ sourceObjectsOptionalFinalCustomizer: SourceObjectsOptionalFinalCustomizer
  ): js.Object = js.native
  def mixin(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  def nextFrame(callback: js.Function0[Unit]): Double = js.native
  def nextFrame(callback: js.Function0[Unit], context: StringDictionary[js.Any], args: js.Any*): Double = js.native
  def noop(): Unit = js.native
  def normalizeEvent(evt: Event): Event = js.native
  def normalizeSides(sides: Sides): PaddingJSON = js.native
  def omit(`object`: js.Object, propertyPathsToOmit: PropertyPath*): js.Object = js.native
  def parseCssNumeric(`val`: js.Any, restrictUnits: String): Anon_Unit | Null = js.native
  def parseCssNumeric(`val`: js.Any, restrictUnits: js.Array[String]): Anon_Unit | Null = js.native
  def parseDOMJSON(json: MarkupJSON): DOMJSONDocument = js.native
  def pick(`object`: js.Object, propertyPathsToPick: PropertyPath*): js.Object = js.native
  def result(`object`: js.Object, propertyPath: PropertyPath): js.Any = js.native
  def result(`object`: js.Object, propertyPath: PropertyPath, defaultValue: js.Any): js.Any = js.native
  def sanitizeHTML(html: String): String = js.native
  def setAttributesBySelector(el: Element, attrs: StringDictionary[StringDictionary[js.Any]]): Unit = js.native
  def setByPath(`object`: StringDictionary[js.Any], path: String, value: js.Any): js.Any = js.native
  def setByPath(`object`: StringDictionary[js.Any], path: String, value: js.Any, delim: String): js.Any = js.native
  def setByPath(`object`: StringDictionary[js.Any], path: js.Array[String], value: js.Any): js.Any = js.native
  def setByPath(`object`: StringDictionary[js.Any], path: js.Array[String], value: js.Any, delim: String): js.Any = js.native
  def sortBy(collection: Collection, iterateesArray: js.Array[Iteratee]): js.Array[_] = js.native
  def sortElements(elements: String, comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = js.native
  def sortElements(elements: js.Array[Element], comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = js.native
  def sortElements(elements: JQuery[HTMLElement], comparator: js.Function2[/* a */ Element, /* b */ Element, Double]): js.Array[Element] = js.native
  def sortedIndex(sortedArray: js.Array[_], valueToInsert: js.Any): Double = js.native
  def sortedIndex(sortedArray: js.Array[_], valueToInsert: js.Any, iteratee: Iteratee): Double = js.native
  def supplement(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  def template(html: String): js.Function1[/* data */ js.Any, String] = js.native
  def toArray(value: js.Any): js.Array[_] = js.native
  def toKebabCase(str: String): String = js.native
  def toggleFullScreen(): Unit = js.native
  def toggleFullScreen(el: Element): Unit = js.native
  def union(arrays: js.Array[_]*): js.Array[_] = js.native
  def uniq(array: js.Array[_]): js.Array[_] = js.native
  def uniq(array: js.Array[_], iteratee: Iteratee): js.Array[_] = js.native
  def uniqueId(): String = js.native
  def uniqueId(prefix: String): String = js.native
  def unsetByPath(`object`: StringDictionary[js.Any], path: String): js.Any = js.native
  def unsetByPath(`object`: StringDictionary[js.Any], path: String, delim: String): js.Any = js.native
  def unsetByPath(`object`: StringDictionary[js.Any], path: js.Array[String]): js.Any = js.native
  def unsetByPath(`object`: StringDictionary[js.Any], path: js.Array[String], delim: String): js.Any = js.native
  def uuid(): String = js.native
  def without(array: js.Array[_], values: js.Any*): js.Array[_] = js.native
  @JSName("filter")
  @js.native
  object filterNs extends js.Object {
    trait FilterArgumentsMap extends js.Object {
      var blur: Anon_XY
      var brightness: Anon_Amount
      var contrast: Anon_Amount
      var dropShadow: Anon_BlurColor
      var grayscale: Anon_Amount
      var highlight: Anon_Blur
      var hueRotate: Anon_Angle
      var invert: Anon_Amount
      var outline: Anon_ColorMargin
      var saturate: Anon_Amount
      var sepia: Anon_Amount
    }
    
    var blur: FilterFunction[typings.jointjs.jointjsStrings.blur] = js.native
    var brightness: FilterFunction[typings.jointjs.jointjsStrings.brightness] = js.native
    var contrast: FilterFunction[typings.jointjs.jointjsStrings.contrast] = js.native
    var dropShadow: FilterFunction[typings.jointjs.jointjsStrings.dropShadow] = js.native
    var grayscale: FilterFunction[typings.jointjs.jointjsStrings.grayscale] = js.native
    var highlight: FilterFunction[typings.jointjs.jointjsStrings.highlight] = js.native
    var hueRotate: FilterFunction[typings.jointjs.jointjsStrings.hueRotate] = js.native
    var invert: FilterFunction[typings.jointjs.jointjsStrings.invert] = js.native
    var outline: FilterFunction[typings.jointjs.jointjsStrings.outline] = js.native
    var saturate: FilterFunction[typings.jointjs.jointjsStrings.saturate] = js.native
    var sepia: FilterFunction[typings.jointjs.jointjsStrings.sepia] = js.native
    type FilterFunction[K /* <: outline | highlight | blur | dropShadow | grayscale | sepia | saturate | hueRotate | invert | brightness | contrast */] = js.Function1[
        /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.util.filter.FilterArgumentsMap[K] */ /* args */ js.Any, 
        String
      ]
  }
  
  @JSName("format")
  @js.native
  object formatNs extends js.Object {
    trait NumberLocale extends js.Object {
      var currency: js.Tuple2[String, String]
      var decimal: String
      var grouping: js.Array[Double]
      var thousands: String
    }
    
    def convert(`type`: String, value: Double, precision: Double): String = js.native
    def number(specifier: String, value: Double): String = js.native
    def number(specifier: String, value: Double, locale: NumberLocale): String = js.native
    def precision(value: Double, precision: Double): Double = js.native
    def prefix(value: Double, precision: Double): js.UndefOr[Anon_D] = js.native
    def round(value: Double): Double = js.native
    def round(value: Double, precision: Double): Double = js.native
    def string(str: String, value: String): String = js.native
  }
  
  @JSName("interpolate")
  @js.native
  object interpolateNs extends js.Object {
    var hexColor: InterpolateFunction[String] = js.native
    var number: InterpolateFunction[Double] = js.native
    var `object`: InterpolateFunction[StringDictionary[js.Any]] = js.native
    var unit: InterpolateFunction[String] = js.native
    type InterpolateFunction[T] = js.Function2[/* start */ T, /* end */ T, js.Function1[/* time */ Double, T]]
  }
  
  @JSName("timing")
  @js.native
  object timingNs extends js.Object {
    var bounce: TimingFunction = js.native
    var cubic: TimingFunction = js.native
    var exponential: TimingFunction = js.native
    var inout: TimingFunction = js.native
    var linear: TimingFunction = js.native
    var quad: TimingFunction = js.native
    def back(): TimingFunction = js.native
    def back(s: Double): TimingFunction = js.native
    def clamp(f: TimingFunction): TimingFunction = js.native
    def clamp(f: TimingFunction, min: Double): TimingFunction = js.native
    def clamp(f: TimingFunction, min: Double, max: Double): TimingFunction = js.native
    def elastic(): TimingFunction = js.native
    def elastic(x: Double): TimingFunction = js.native
    def reflect(f: TimingFunction): TimingFunction = js.native
    def reverse(f: TimingFunction): TimingFunction = js.native
    type TimingFunction = js.Function1[/* time */ Double, Double]
  }
  
  type Collection = js.Object | js.Array[js.Any]
  type CustomizerFunction = js.Function6[
    /* objValue */ js.Any, 
    /* srcValue */ js.Any, 
    /* key */ String, 
    /* object */ js.Any, 
    /* source */ js.Any, 
    /* stack */ js.Any, 
    NotVoid
  ]
  type Iteratee = IterateeFunction | IterateeShorthand
  type IterateeFunction = js.Function1[/* value */ js.Any, NotVoid]
  type IterateeShorthand = PropertyPath
  // LODASH FUNCTIONS:
  type NotVoid = js.UndefOr[js.Object | Null]
  type PropertyPath = String | js.Array[String]
  type SourceObjectsOptionalFinalCustomizer = js.Array[js.Object | CustomizerFunction]
}

