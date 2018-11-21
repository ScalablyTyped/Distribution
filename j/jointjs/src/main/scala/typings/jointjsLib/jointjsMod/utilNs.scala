package typings
package jointjsLib.jointjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "util")
@js.native
object utilNs extends js.Object {
  var shapePerimeterConnectionPoint: jointjsLib.jointjsMod.diaNs.LinkViewNs.GetConnectionPoint = js.native
  def breakText(text: java.lang.String, size: jointjsLib.jointjsMod.diaNs.Size): java.lang.String = js.native
  def breakText(
    text: java.lang.String,
    size: jointjsLib.jointjsMod.diaNs.Size,
    attrs: jointjsLib.jointjsMod.attributesNs.NativeSVGAttributes
  ): java.lang.String = js.native
  def breakText(
    text: java.lang.String,
    size: jointjsLib.jointjsMod.diaNs.Size,
    attrs: jointjsLib.jointjsMod.attributesNs.NativeSVGAttributes,
    opt: jointjsLib.Anon_SvgDocument
  ): java.lang.String = js.native
  def cancelFrame(requestId: scala.Double): scala.Unit = js.native
  def dataUriToBlob(dataUri: java.lang.String): stdLib.Blob = js.native
  def deepMixin(objects: js.Array[_]): js.Any = js.native
  def deepSupplement(objects: js.Any): js.Any = js.native
  def deepSupplement(objects: js.Any, defaultIndicator: js.Any): js.Any = js.native
  def downloadBlob(blob: stdLib.Blob, fileName: java.lang.String): scala.Unit = js.native
  def downloadDataUri(dataUri: java.lang.String, fileName: java.lang.String): scala.Unit = js.native
  def flattenObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  def flattenObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any], delim: java.lang.String): js.Any = js.native
  def flattenObject(
    `object`: ScalablyTyped.runtime.StringDictionary[js.Any],
    delim: java.lang.String,
    stop: js.Function1[/* node */ js.Any, scala.Boolean]
  ): js.Any = js.native
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
  def guid(): java.lang.String = js.native
  def guid(obj: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  def hashCode(str: java.lang.String): java.lang.String = js.native
  def imageToDataUri(
    url: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* dataUri */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def isPercentage(`val`: js.Any): scala.Boolean = js.native
  def mixin(objects: js.Array[_]): js.Any = js.native
  def nextFrame(callback: js.Function0[scala.Unit]): scala.Double = js.native
  def nextFrame(callback: js.Function0[scala.Unit], context: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Double = js.native
  def normalizeEvent(evt: jqueryLib.JQueryNs.Event[stdLib.EventTarget, scala.Null]): jqueryLib.JQueryNs.Event[stdLib.EventTarget, scala.Null] = js.native
  def normalizeSides(sides: jointjsLib.Anon_Bottom): jointjsLib.jointjsMod.diaNs.PaddingJSON = js.native
  def normalizeSides(sides: scala.Double): jointjsLib.jointjsMod.diaNs.PaddingJSON = js.native
  def parseCssNumber(str: java.lang.String): jointjsLib.Anon_Value = js.native
  def parseCssNumber(str: java.lang.String, restrictUnits: js.Array[java.lang.String]): jointjsLib.Anon_Value = js.native
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
  def supplement(objects: js.Array[_]): js.Any = js.native
  def template(html: java.lang.String): js.Function1[/* data */ js.Any, java.lang.String] = js.native
  def toKebabCase(str: java.lang.String): java.lang.String = js.native
  def toggleFullScreen(): scala.Unit = js.native
  def toggleFullScreen(el: underscoreLib.underscoreMod.Global.Element): scala.Unit = js.native
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
  
}

