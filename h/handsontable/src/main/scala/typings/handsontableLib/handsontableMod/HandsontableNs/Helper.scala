package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Helper extends js.Object {
  val KEY_CODES: handsontableLib.Anon_A = js.native
  def arrayAvg(array: js.Array[_]): scala.Double = js.native
  def arrayEach(
    array: js.Array[_],
    iteratee: js.Function3[/* value */ js.Any, /* index */ scala.Double, /* array */ js.Array[_], scala.Unit]
  ): js.Array[_] = js.native
  def arrayFilter(
    array: js.Array[_],
    predicate: js.Function3[/* value */ js.Any, /* index */ scala.Double, /* array */ js.Array[_], scala.Unit]
  ): js.Array[_] = js.native
  def arrayFlatten(array: js.Array[_]): js.Array[_] = js.native
  def arrayIncludes(array: js.Array[_], searchElement: js.Any, fromIndex: scala.Double): js.Array[_] = js.native
  def arrayMap(
    array: js.Array[_],
    iteratee: js.Function3[/* value */ js.Any, /* index */ scala.Double, /* array */ js.Array[_], scala.Unit]
  ): js.Array[_] = js.native
  def arrayMax(array: js.Array[_]): scala.Double = js.native
  def arrayMin(array: js.Array[_]): scala.Double = js.native
  def arrayReduce(
    array: js.Array[_],
    iteratee: js.Function3[/* value */ js.Any, /* index */ scala.Double, /* array */ js.Array[_], scala.Unit],
    accumulator: js.Any,
    initFromArray: scala.Boolean
  ): js.Any = js.native
  def arraySum(array: js.Array[_]): scala.Double = js.native
  def arrayUnique(array: js.Array[_]): js.Array[_] = js.native
  def cancelAnimationFrame(id: scala.Double): scala.Unit = js.native
  def cellMethodLookupFactory(methodName: java.lang.String, allowUndefined: scala.Boolean): scala.Unit = js.native
  def clone(`object`: js.Object): js.Object = js.native
  def columnFactory(GridSettings: GridSettings, conflictList: js.Array[_]): js.Object = js.native
  def createEmptySpreadsheetData(rows: scala.Double, columns: scala.Double): js.Array[_] = js.native
  def createObjectPropListener(): js.Object = js.native
  def createObjectPropListener(defaultValue: js.Any): js.Object = js.native
  def createObjectPropListener(defaultValue: js.Any, propertyToListen: java.lang.String): js.Object = js.native
  def createSpreadsheetData(): js.Array[_] = js.native
  def createSpreadsheetData(rows: scala.Double): js.Array[_] = js.native
  def createSpreadsheetData(rows: scala.Double, columns: scala.Double): js.Array[_] = js.native
  def createSpreadsheetObjectData(): js.Array[_] = js.native
  def createSpreadsheetObjectData(rows: scala.Double): js.Array[_] = js.native
  def createSpreadsheetObjectData(rows: scala.Double, colCount: scala.Double): js.Array[_] = js.native
  def curry(func: js.Function0[scala.Unit]): js.Function0[scala.Unit] = js.native
  def curryRight(func: js.Function0[scala.Unit]): js.Function0[scala.Unit] = js.native
  def debounce(func: js.Function0[scala.Unit]): js.Function0[scala.Unit] = js.native
  def debounce(func: js.Function0[scala.Unit], wait: scala.Double): js.Function0[scala.Unit] = js.native
  def deepClone(obj: js.Object): js.Object = js.native
  def deepExtend(target: js.Object, extension: js.Object): scala.Unit = js.native
  def deepObjectSize(`object`: js.Object): scala.Double = js.native
  def defineGetter(`object`: js.Object, property: js.Any, value: js.Any, options: js.Object): scala.Unit = js.native
  def duckSchema(`object`: js.Array[_]): js.Array[_] | js.Object = js.native
  def duckSchema(`object`: js.Object): js.Array[_] | js.Object = js.native
  def endsWith(string: java.lang.String, needle: java.lang.String): scala.Boolean = js.native
  def equalsIgnoreCase(string: java.lang.String*): scala.Boolean = js.native
  def extend(target: js.Object, extension: js.Object): scala.Unit = js.native
  def extendArray(arr: js.Array[_], extension: js.Array[_]): scala.Unit = js.native
  def getComparisonFunction(language: java.lang.String): js.Any | scala.Unit = js.native
  def getComparisonFunction(language: java.lang.String, options: js.Object): js.Any | scala.Unit = js.native
  def getNormalizedDate(dateString: java.lang.String): stdLib.Date = js.native
  def getProperty(`object`: js.Object, name: java.lang.String): js.Any | scala.Unit = js.native
  def getPrototypeOf(obj: js.Object): js.Any | scala.Unit = js.native
  def hasCaptionProblem(): scala.Boolean | scala.Unit = js.native
  def htmlToGridSettings(element: java.lang.String): GridSettings = js.native
  def htmlToGridSettings(element: java.lang.String, rootDocument: stdLib.Document): GridSettings = js.native
  def htmlToGridSettings(element: stdLib.HTMLTableElement): GridSettings = js.native
  def htmlToGridSettings(element: stdLib.HTMLTableElement, rootDocument: stdLib.Document): GridSettings = js.native
  def inherit(Child: js.Object, Parent: js.Object): js.Object = js.native
  def instanceToHTML(instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core): java.lang.String = js.native
  def isChrome(): scala.Boolean = js.native
  def isClassListSupported(): scala.Boolean = js.native
  def isCtrlKey(keyCode: scala.Double): scala.Boolean = js.native
  def isDefined(variable: js.Any): scala.Boolean = js.native
  def isEdge(): scala.Boolean = js.native
  def isEmpty(variable: js.Any): scala.Boolean = js.native
  def isFunction(func: js.Any): scala.Boolean = js.native
  def isGetComputedStyleSupported(): scala.Boolean = js.native
  def isIE(): scala.Boolean = js.native
  def isIE8(): scala.Boolean = js.native
  def isIE9(): scala.Boolean = js.native
  def isKey(keyCode: scala.Double, baseCode: java.lang.String): scala.Boolean = js.native
  def isMSBrowser(): scala.Boolean = js.native
  def isMetaKey(keyCode: scala.Double): scala.Boolean = js.native
  def isMobileBrowser(): scala.Boolean = js.native
  def isNumeric(n: js.Any): scala.Boolean = js.native
  def isObject(obj: js.Any): scala.Boolean = js.native
  def isObjectEqual(object1: js.Array[_], object2: js.Array[_]): scala.Boolean = js.native
  def isObjectEqual(object1: js.Array[_], object2: js.Object): scala.Boolean = js.native
  def isObjectEqual(object1: js.Object, object2: js.Array[_]): scala.Boolean = js.native
  def isObjectEqual(object1: js.Object, object2: js.Object): scala.Boolean = js.native
  def isPercentValue(value: java.lang.String): scala.Boolean = js.native
  def isPrintableChar(keyCode: scala.Double): scala.Boolean = js.native
  def isSafari(): scala.Boolean = js.native
  def isTextContentSupported(): scala.Boolean = js.native
  def isTouchSupported(): scala.Boolean = js.native
  def isUndefined(variable: js.Any): scala.Boolean = js.native
  def isWebComponentSupportedNatively(): scala.Boolean = js.native
  def mixin(Base: js.Object, mixins: js.Object*): js.Object = js.native
  def objectEach(
    `object`: js.Object,
    iteratee: js.Function3[/* value */ js.Any, /* key */ js.Any, /* object */ js.Object, scala.Unit]
  ): js.Object = js.native
  def padStart(string: java.lang.String, maxLength: scala.Double): java.lang.String = js.native
  def padStart(string: java.lang.String, maxLength: scala.Double, fillString: java.lang.String): java.lang.String = js.native
  def partial(func: js.Function0[scala.Unit], params: js.Any*): js.Function0[scala.Unit] = js.native
  def pipe(functions: js.Function0[scala.Unit]*): js.Function0[scala.Unit] = js.native
  def pivot(arr: js.Array[_]): js.Array[_] = js.native
  def randomString(): java.lang.String = js.native
  def rangeEach(
    rangeFrom: scala.Double,
    rangeTo: scala.Double,
    iteratee: js.Function1[/* index */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def rangeEachReverse(
    rangeFrom: scala.Double,
    rangeTo: scala.Double,
    iteratee: js.Function1[/* index */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def requestAnimationFrame(callback: js.Function0[scala.Unit]): scala.Double = js.native
  def spreadsheetColumnIndex(label: java.lang.String): scala.Double = js.native
  def spreadsheetColumnLabel(index: scala.Double): java.lang.String = js.native
  def startsWith(string: java.lang.String, needle: java.lang.String): scala.Boolean = js.native
  def stringify(value: js.Any): java.lang.String = js.native
  def stripTags(string: java.lang.String): java.lang.String = js.native
  def substitute(template: java.lang.String): java.lang.String = js.native
  def substitute(template: java.lang.String, variables: js.Object): java.lang.String = js.native
  def throttle(func: js.Function0[scala.Unit]): js.Function0[scala.Unit] = js.native
  def throttle(func: js.Function0[scala.Unit], wait: scala.Double): js.Function0[scala.Unit] = js.native
  def throttleAfterHits(func: js.Function0[scala.Unit]): js.Function0[scala.Unit] = js.native
  def throttleAfterHits(func: js.Function0[scala.Unit], wait: scala.Double): js.Function0[scala.Unit] = js.native
  def throttleAfterHits(func: js.Function0[scala.Unit], wait: scala.Double, hits: scala.Double): js.Function0[scala.Unit] = js.native
  def to2dArray(arr: js.Array[_]): scala.Unit = js.native
  def toUpperCaseFirst(string: java.lang.String): java.lang.String = js.native
  def translateRowsToColumns(input: js.Array[_]): js.Array[_] = js.native
  def valueAccordingPercent(value: scala.Double, percent: java.lang.String): scala.Double = js.native
  def valueAccordingPercent(value: scala.Double, percent: scala.Double): scala.Double = js.native
}

