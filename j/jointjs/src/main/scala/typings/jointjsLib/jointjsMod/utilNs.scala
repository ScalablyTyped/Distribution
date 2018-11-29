package typings
package jointjsLib.jointjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "util")
@js.native
object utilNs extends js.Object {
  
  trait DOMJSONDocument extends js.Object {
    var fragment: stdLib.DocumentFragment
    var groupSelectors: ScalablyTyped.runtime.StringDictionary[js.Array[underscoreLib.underscoreMod.Global.Element]]
    var selectors: ScalablyTyped.runtime.StringDictionary[underscoreLib.underscoreMod.Global.Element]
  }
  
  var shapePerimeterConnectionPoint: jointjsLib.jointjsMod.diaNs.LinkViewNs.GetConnectionPoint = js.native
  def assign(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  def bindAll(`object`: js.Object, methodNames: js.Array[PropertyPath]): js.Object = js.native
  def breakText(text: java.lang.String, size: jointjsLib.Anon_Height): java.lang.String = js.native
  def breakText(
    text: java.lang.String,
    size: jointjsLib.Anon_Height,
    attrs: jointjsLib.jointjsMod.attributesNs.NativeSVGAttributes
  ): java.lang.String = js.native
  def breakText(
    text: java.lang.String,
    size: jointjsLib.Anon_Height,
    attrs: jointjsLib.jointjsMod.attributesNs.NativeSVGAttributes,
    opt: jointjsLib.Anon_SvgDocument
  ): java.lang.String = js.native
  def camelCase(string: java.lang.String): java.lang.String = js.native
  def cancelFrame(requestId: scala.Double): scala.Unit = js.native
  def clone[T](value: T): T = js.native
  def cloneDeep[T](value: T): T = js.native
  def dataUriToBlob(dataUri: java.lang.String): stdLib.Blob = js.native
  def debounce(func: js.Function): js.Function = js.native
  def debounce(func: js.Function, wait: scala.Double): js.Function = js.native
  def debounce(func: js.Function, wait: scala.Double, options: js.Object): js.Function = js.native
  def deepMixin(destinationObject: js.Object, sourceObject: js.Object): js.Object = js.native
  def deepMixin(destinationObject: js.Object, sourceObject: js.Object, options: js.Object): js.Object = js.native
  def deepSupplement(destionationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  def defaults(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  def defaultsDeep(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  def difference(array: js.Array[_], excludedValuesArrays: js.Array[_]*): js.Array[_] = js.native
  def downloadBlob(blob: stdLib.Blob, fileName: java.lang.String): scala.Unit = js.native
  def downloadDataUri(dataUri: java.lang.String, fileName: java.lang.String): scala.Unit = js.native
  def flattenDeep(array: js.Array[_]): js.Array[_] = js.native
  def flattenObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  def flattenObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any], delim: java.lang.String): js.Any = js.native
  def flattenObject(
    `object`: ScalablyTyped.runtime.StringDictionary[js.Any],
    delim: java.lang.String,
    stop: js.Function1[/* node */ js.Any, scala.Boolean]
  ): js.Any = js.native
  def forIn(`object`: js.Object): js.Object = js.native
  def forIn(`object`: js.Object, iteratee: Iteratee): js.Object = js.native
  def getByPath(`object`: ScalablyTyped.runtime.StringDictionary[js.Any], path: java.lang.String): js.Any = js.native
  def getByPath(
    `object`: ScalablyTyped.runtime.StringDictionary[js.Any],
    path: java.lang.String,
    delim: java.lang.String
  ): js.Any = js.native
  def getByPath(`object`: ScalablyTyped.runtime.StringDictionary[js.Any], path: js.Array[java.lang.String]): js.Any = js.native
  def getByPath(
    `object`: ScalablyTyped.runtime.StringDictionary[js.Any],
    path: js.Array[java.lang.String],
    delim: java.lang.String
  ): js.Any = js.native
  def getElementBBox(el: underscoreLib.underscoreMod.Global.Element): jointjsLib.jointjsMod.diaNs.BBox = js.native
  def groupBy(collection: Collection): js.Object = js.native
  def groupBy(collection: Collection, iteratee: Iteratee): js.Object = js.native
  def guid(): java.lang.String = js.native
  def guid(obj: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  def has(`object`: js.Object, path: PropertyPath): scala.Boolean = js.native
  def hashCode(str: java.lang.String): java.lang.String = js.native
  def imageToDataUri(
    url: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* dataUri */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def intersection(arrays: js.Array[_]*): js.Array[_] = js.native
  def invoke(collection: Collection, functionToInvokeForAll: IterateeFunction): js.Array[_] = js.native
  def invoke(collection: Collection, functionToInvokeForAll: IterateeFunction, args: js.Array[_]): js.Array[_] = js.native
  def invoke(collection: Collection, methodPath: PropertyPath): js.Array[_] = js.native
  def invoke(collection: Collection, methodPath: PropertyPath, args: js.Array[_]): js.Array[_] = js.native
  def isBoolean(value: js.Any): scala.Boolean = js.native
  def isEmpty(value: js.Any): scala.Boolean = js.native
  def isEqual(value: js.Any, otherValue: js.Any): scala.Boolean = js.native
  def isFunction(value: js.Any): scala.Boolean = js.native
  def isNumber(value: js.Any): scala.Boolean = js.native
  def isObject(value: js.Any): scala.Boolean = js.native
  def isPercentage(`val`: js.Any): scala.Boolean = js.native
  def isPlainObject(value: js.Any): scala.Boolean = js.native
  def isString(value: js.Any): scala.Boolean = js.native
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
    /* import warning: Dropping repeated marker of param TsIdentSimple(sourceObjectsOptionalFinalCustomizer) because its type Some(TsTypeRef(TsQIdent(List(TsIdentSimple(SourceObjectsOptionalFinalCustomizer))),List())) is not an array type */sourceObjectsOptionalFinalCustomizer: SourceObjectsOptionalFinalCustomizer
  ): js.Object = js.native
  def mixin(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  def nextFrame(callback: js.Function0[scala.Unit]): scala.Double = js.native
  def nextFrame(callback: js.Function0[scala.Unit], context: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Double = js.native
  def noop(): scala.Unit = js.native
  def normalizeEvent(evt: jqueryLib.JQueryNs.Event[stdLib.EventTarget, scala.Null]): jqueryLib.JQueryNs.Event[stdLib.EventTarget, scala.Null] = js.native
  def normalizeSides(sides: jointjsLib.jointjsMod.diaNs.Sides): jointjsLib.jointjsMod.diaNs.PaddingJSON = js.native
  def omit(`object`: js.Object, propertyPathsToOmit: PropertyPath*): js.Object = js.native
  def parseCssNumeric(`val`: js.Any, restrictUnits: java.lang.String): jointjsLib.Anon_Value | scala.Null = js.native
  def parseCssNumeric(`val`: js.Any, restrictUnits: js.Array[java.lang.String]): jointjsLib.Anon_Value | scala.Null = js.native
  def parseDOMJSON(json: jointjsLib.jointjsMod.diaNs.MarkupJSON): DOMJSONDocument = js.native
  def pick(`object`: js.Object, propertyPathsToPick: PropertyPath*): js.Object = js.native
  def result(`object`: js.Object, propertyPath: PropertyPath): js.Any = js.native
  def result(`object`: js.Object, propertyPath: PropertyPath, defaultValue: js.Any): js.Any = js.native
  def sanitizeHTML(html: java.lang.String): java.lang.String = js.native
  def setAttributesBySelector(
    el: underscoreLib.underscoreMod.Global.Element,
    attrs: ScalablyTyped.runtime.StringDictionary[ScalablyTyped.runtime.StringDictionary[js.Any]]
  ): scala.Unit = js.native
  def setByPath(`object`: ScalablyTyped.runtime.StringDictionary[js.Any], path: java.lang.String, value: js.Any): js.Any = js.native
  def setByPath(
    `object`: ScalablyTyped.runtime.StringDictionary[js.Any],
    path: java.lang.String,
    value: js.Any,
    delim: java.lang.String
  ): js.Any = js.native
  def setByPath(
    `object`: ScalablyTyped.runtime.StringDictionary[js.Any],
    path: js.Array[java.lang.String],
    value: js.Any
  ): js.Any = js.native
  def setByPath(
    `object`: ScalablyTyped.runtime.StringDictionary[js.Any],
    path: js.Array[java.lang.String],
    value: js.Any,
    delim: java.lang.String
  ): js.Any = js.native
  def sortBy(collection: Collection, iterateesArray: js.Array[Iteratee]): js.Array[_] = js.native
  def sortElements(
    elements: java.lang.String,
    comparator: js.Function2[
      /* a */ underscoreLib.underscoreMod.Global.Element, 
      /* b */ underscoreLib.underscoreMod.Global.Element, 
      scala.Double
    ]
  ): js.Array[underscoreLib.underscoreMod.Global.Element] = js.native
  def sortElements(
    elements: jqueryLib.JQuery[stdLib.HTMLElement],
    comparator: js.Function2[
      /* a */ underscoreLib.underscoreMod.Global.Element, 
      /* b */ underscoreLib.underscoreMod.Global.Element, 
      scala.Double
    ]
  ): js.Array[underscoreLib.underscoreMod.Global.Element] = js.native
  def sortElements(
    elements: js.Array[underscoreLib.underscoreMod.Global.Element],
    comparator: js.Function2[
      /* a */ underscoreLib.underscoreMod.Global.Element, 
      /* b */ underscoreLib.underscoreMod.Global.Element, 
      scala.Double
    ]
  ): js.Array[underscoreLib.underscoreMod.Global.Element] = js.native
  def sortedIndex(sortedArray: js.Array[_], valueToInsert: js.Any): scala.Double = js.native
  def sortedIndex(sortedArray: js.Array[_], valueToInsert: js.Any, iteratee: Iteratee): scala.Double = js.native
  def supplement(destinationObject: js.Object, sourceObjects: js.Object*): js.Object = js.native
  def template(html: java.lang.String): js.Function1[/* data */ js.Any, java.lang.String] = js.native
  def toArray(value: js.Any): js.Array[_] = js.native
  def toKebabCase(str: java.lang.String): java.lang.String = js.native
  def toggleFullScreen(): scala.Unit = js.native
  def toggleFullScreen(el: underscoreLib.underscoreMod.Global.Element): scala.Unit = js.native
  def union(arrays: js.Array[_]*): js.Array[_] = js.native
  def uniq(array: js.Array[_]): js.Array[_] = js.native
  def uniq(array: js.Array[_], iteratee: Iteratee): js.Array[_] = js.native
  def uniqueId(): java.lang.String = js.native
  def uniqueId(prefix: java.lang.String): java.lang.String = js.native
  def unsetByPath(`object`: ScalablyTyped.runtime.StringDictionary[js.Any], path: java.lang.String): js.Any = js.native
  def unsetByPath(
    `object`: ScalablyTyped.runtime.StringDictionary[js.Any],
    path: java.lang.String,
    delim: java.lang.String
  ): js.Any = js.native
  def unsetByPath(`object`: ScalablyTyped.runtime.StringDictionary[js.Any], path: js.Array[java.lang.String]): js.Any = js.native
  def unsetByPath(
    `object`: ScalablyTyped.runtime.StringDictionary[js.Any],
    path: js.Array[java.lang.String],
    delim: java.lang.String
  ): js.Any = js.native
  def uuid(): java.lang.String = js.native
  def without(array: js.Array[_], values: js.Any*): js.Array[_] = js.native
  @JSName("filter")
  @js.native
  object filterNs extends js.Object {
    
    trait FilterArgumentsMap extends js.Object {
      var blur: jointjsLib.Anon_Y
      var brightness: jointjsLib.Anon_Amount
      var contrast: jointjsLib.Anon_Amount
      var dropShadow: jointjsLib.Anon_Dy
      var grayscale: jointjsLib.Anon_Amount
      var highlight: jointjsLib.Anon_OpacityColor
      var hueRotate: jointjsLib.Anon_Angle
      var invert: jointjsLib.Anon_Amount
      var outline: jointjsLib.Anon_Opacity
      var saturate: jointjsLib.Anon_Amount
      var sepia: jointjsLib.Anon_Amount
    }
    
    var blur: FilterFunction[jointjsLib.jointjsLibStrings.blur] = js.native
    var brightness: FilterFunction[jointjsLib.jointjsLibStrings.brightness] = js.native
    var contrast: FilterFunction[jointjsLib.jointjsLibStrings.contrast] = js.native
    var dropShadow: FilterFunction[jointjsLib.jointjsLibStrings.dropShadow] = js.native
    var grayscale: FilterFunction[jointjsLib.jointjsLibStrings.grayscale] = js.native
    var highlight: FilterFunction[jointjsLib.jointjsLibStrings.highlight] = js.native
    var hueRotate: FilterFunction[jointjsLib.jointjsLibStrings.hueRotate] = js.native
    var invert: FilterFunction[jointjsLib.jointjsLibStrings.invert] = js.native
    var outline: FilterFunction[jointjsLib.jointjsLibStrings.outline] = js.native
    var saturate: FilterFunction[jointjsLib.jointjsLibStrings.saturate] = js.native
    var sepia: FilterFunction[jointjsLib.jointjsLibStrings.sepia] = js.native
    type FilterFunction[K /* <: jointjsLib.jointjsLibStrings.outline | jointjsLib.jointjsLibStrings.highlight | jointjsLib.jointjsLibStrings.blur | jointjsLib.jointjsLibStrings.dropShadow | jointjsLib.jointjsLibStrings.grayscale | jointjsLib.jointjsLibStrings.sepia | jointjsLib.jointjsLibStrings.saturate | jointjsLib.jointjsLibStrings.hueRotate | jointjsLib.jointjsLibStrings.invert | jointjsLib.jointjsLibStrings.brightness | jointjsLib.jointjsLibStrings.contrast */] = js.Function1[/* args */ js.Any, java.lang.String]
  }
  
  @JSName("format")
  @js.native
  object formatNs extends js.Object {
    
    trait NumberLocale extends js.Object {
      var currency: js.Tuple2[java.lang.String, java.lang.String]
      var decimal: java.lang.String
      var grouping: js.Array[scala.Double]
      var thousands: java.lang.String
    }
    
    def convert(`type`: java.lang.String, value: scala.Double, precision: scala.Double): java.lang.String = js.native
    def number(specifier: java.lang.String, value: scala.Double): java.lang.String = js.native
    def number(specifier: java.lang.String, value: scala.Double, locale: NumberLocale): java.lang.String = js.native
    def precision(value: scala.Double, precision: scala.Double): scala.Double = js.native
    def prefix(value: scala.Double, precision: scala.Double): js.UndefOr[jointjsLib.Anon_Symbol] = js.native
    def round(value: scala.Double): scala.Double = js.native
    def round(value: scala.Double, precision: scala.Double): scala.Double = js.native
    def string(str: java.lang.String, value: java.lang.String): java.lang.String = js.native
  }
  
  @JSName("interpolate")
  @js.native
  object interpolateNs extends js.Object {
    var hexColor: InterpolateFunction[java.lang.String] = js.native
    var number: InterpolateFunction[scala.Double] = js.native
    var `object`: InterpolateFunction[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.native
    var unit: InterpolateFunction[java.lang.String] = js.native
    type InterpolateFunction[T] = js.Function2[/* start */ T, /* end */ T, js.Function1[/* time */ scala.Double, T]]
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
    def back(s: scala.Double): TimingFunction = js.native
    def clamp(f: TimingFunction): TimingFunction = js.native
    def clamp(f: TimingFunction, min: scala.Double): TimingFunction = js.native
    def clamp(f: TimingFunction, min: scala.Double, max: scala.Double): TimingFunction = js.native
    def elastic(): TimingFunction = js.native
    def elastic(x: scala.Double): TimingFunction = js.native
    def reflect(f: TimingFunction): TimingFunction = js.native
    def reverse(f: TimingFunction): TimingFunction = js.native
    type TimingFunction = js.Function1[/* time */ scala.Double, scala.Double]
  }
  
  type Collection = js.Object | js.Array[js.Any]
  type CustomizerFunction = js.Function6[
    /* objValue */ js.Any, 
    /* srcValue */ js.Any, 
    /* key */ java.lang.String, 
    /* object */ js.Any, 
    /* source */ js.Any, 
    /* stack */ js.Any, 
    NotVoid
  ]
  type Iteratee = IterateeFunction | IterateeShorthand
  type IterateeFunction = js.Function1[/* value */ js.Any, NotVoid]
  type IterateeShorthand = PropertyPath
  // LODASH FUNCTIONS:
  type NotVoid = js.UndefOr[js.Object | scala.Null]
  type PropertyPath = java.lang.String | js.Array[java.lang.String]
  type SourceObjectsOptionalFinalCustomizer = js.Array[js.Object | CustomizerFunction]
}

