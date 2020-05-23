package typings.handsontable.mod.Handsontable

import typings.handsontable.anon.A
import typings.handsontable.mod._Handsontable.Core
import typings.std.Date
import typings.std.Document
import typings.std.HTMLTableElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Helper extends js.Object {
  val KEY_CODES: A = js.native
  def arrayAvg(array: js.Array[_]): Double = js.native
  def arrayEach(
    array: js.Array[_],
    iteratee: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Unit]
  ): js.Array[_] = js.native
  def arrayFilter(
    array: js.Array[_],
    predicate: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Unit]
  ): js.Array[_] = js.native
  def arrayFlatten(array: js.Array[_]): js.Array[_] = js.native
  def arrayIncludes(array: js.Array[_], searchElement: js.Any, fromIndex: Double): js.Array[_] = js.native
  def arrayMap(
    array: js.Array[_],
    iteratee: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Unit]
  ): js.Array[_] = js.native
  def arrayMax(array: js.Array[_]): Double = js.native
  def arrayMin(array: js.Array[_]): Double = js.native
  def arrayReduce(
    array: js.Array[_],
    iteratee: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Unit],
    accumulator: js.Any,
    initFromArray: Boolean
  ): js.Any = js.native
  def arraySum(array: js.Array[_]): Double = js.native
  def arrayUnique(array: js.Array[_]): js.Array[_] = js.native
  def cancelAnimationFrame(id: Double): Unit = js.native
  def cellMethodLookupFactory(methodName: String, allowUndefined: Boolean): Unit = js.native
  def clone(`object`: js.Object): js.Object = js.native
  def columnFactory(GridSettings: GridSettings, conflictList: js.Array[_]): js.Object = js.native
  def createEmptySpreadsheetData(rows: Double, columns: Double): js.Array[_] = js.native
  def createObjectPropListener(): js.Object = js.native
  def createObjectPropListener(defaultValue: js.Any): js.Object = js.native
  def createObjectPropListener(defaultValue: js.Any, propertyToListen: String): js.Object = js.native
  def createSpreadsheetData(): js.Array[_] = js.native
  def createSpreadsheetData(rows: Double): js.Array[_] = js.native
  def createSpreadsheetData(rows: Double, columns: Double): js.Array[_] = js.native
  def createSpreadsheetObjectData(): js.Array[_] = js.native
  def createSpreadsheetObjectData(rows: Double): js.Array[_] = js.native
  def createSpreadsheetObjectData(rows: Double, colCount: Double): js.Array[_] = js.native
  def curry(func: js.Function0[Unit]): js.Function0[Unit] = js.native
  def curryRight(func: js.Function0[Unit]): js.Function0[Unit] = js.native
  def debounce(func: js.Function0[Unit]): js.Function0[Unit] = js.native
  def debounce(func: js.Function0[Unit], wait: Double): js.Function0[Unit] = js.native
  def deepClone(obj: js.Object): js.Object = js.native
  def deepExtend(target: js.Object, extension: js.Object): Unit = js.native
  def deepObjectSize(`object`: js.Object): Double = js.native
  def defineGetter(`object`: js.Object, property: js.Any, value: js.Any, options: js.Object): Unit = js.native
  def duckSchema(`object`: js.Array[_]): js.Array[_] | js.Object = js.native
  def duckSchema(`object`: js.Object): js.Array[_] | js.Object = js.native
  def endsWith(string: String, needle: String): Boolean = js.native
  def equalsIgnoreCase(string: String*): Boolean = js.native
  def extend(target: js.Object, extension: js.Object): Unit = js.native
  def extendArray(arr: js.Array[_], extension: js.Array[_]): Unit = js.native
  def getComparisonFunction(language: String): js.Any | Unit = js.native
  def getComparisonFunction(language: String, options: js.Object): js.Any | Unit = js.native
  def getNormalizedDate(dateString: String): Date = js.native
  def getProperty(`object`: js.Object, name: String): js.Any | Unit = js.native
  def getPrototypeOf(obj: js.Object): js.Any | Unit = js.native
  def hasCaptionProblem(): Boolean | Unit = js.native
  def htmlToGridSettings(element: String): GridSettings = js.native
  def htmlToGridSettings(element: String, rootDocument: Document): GridSettings = js.native
  def htmlToGridSettings(element: HTMLTableElement): GridSettings = js.native
  def htmlToGridSettings(element: HTMLTableElement, rootDocument: Document): GridSettings = js.native
  def inherit(Child: js.Object, Parent: js.Object): js.Object = js.native
  def instanceToHTML(instance: Core): String = js.native
  def isChrome(): Boolean = js.native
  def isClassListSupported(): Boolean = js.native
  def isCtrlKey(keyCode: Double): Boolean = js.native
  def isDefined(variable: js.Any): Boolean = js.native
  def isEdge(): Boolean = js.native
  def isEmpty(variable: js.Any): Boolean = js.native
  def isFirefox(): Boolean = js.native
  def isFunction(func: js.Any): Boolean = js.native
  def isGetComputedStyleSupported(): Boolean = js.native
  def isIE(): Boolean = js.native
  def isIE8(): Boolean = js.native
  def isIE9(): Boolean = js.native
  def isKey(keyCode: Double, baseCode: String): Boolean = js.native
  def isMSBrowser(): Boolean = js.native
  def isMetaKey(keyCode: Double): Boolean = js.native
  def isMobileBrowser(): Boolean = js.native
  def isNumeric(n: js.Any): Boolean = js.native
  def isObject(obj: js.Any): Boolean = js.native
  def isObjectEqual(object1: js.Array[_], object2: js.Array[_]): Boolean = js.native
  def isObjectEqual(object1: js.Array[_], object2: js.Object): Boolean = js.native
  def isObjectEqual(object1: js.Object, object2: js.Array[_]): Boolean = js.native
  def isObjectEqual(object1: js.Object, object2: js.Object): Boolean = js.native
  def isPercentValue(value: String): Boolean = js.native
  def isPrintableChar(keyCode: Double): Boolean = js.native
  def isSafari(): Boolean = js.native
  def isTextContentSupported(): Boolean = js.native
  def isTouchSupported(): Boolean = js.native
  def isUndefined(variable: js.Any): Boolean = js.native
  def isWebComponentSupportedNatively(): Boolean = js.native
  def mixin(Base: js.Object, mixins: js.Object*): js.Object = js.native
  def objectEach(
    `object`: js.Object,
    iteratee: js.Function3[/* value */ js.Any, /* key */ js.Any, /* object */ js.Object, Unit]
  ): js.Object = js.native
  def padStart(string: String, maxLength: Double): String = js.native
  def padStart(string: String, maxLength: Double, fillString: String): String = js.native
  def partial(func: js.Function0[Unit], params: js.Any*): js.Function0[Unit] = js.native
  def pipe(functions: js.Function0[Unit]*): js.Function0[Unit] = js.native
  def pivot(arr: js.Array[_]): js.Array[_] = js.native
  def randomString(): String = js.native
  def rangeEach(rangeFrom: Double, rangeTo: Double, iteratee: js.Function1[/* index */ Double, Unit]): Unit = js.native
  def rangeEachReverse(rangeFrom: Double, rangeTo: Double, iteratee: js.Function1[/* index */ Double, Unit]): Unit = js.native
  def requestAnimationFrame(callback: js.Function0[Unit]): Double = js.native
  def spreadsheetColumnIndex(label: String): Double = js.native
  def spreadsheetColumnLabel(index: Double): String = js.native
  def startsWith(string: String, needle: String): Boolean = js.native
  def stringify(value: js.Any): String = js.native
  def stripTags(string: String): String = js.native
  def substitute(template: String): String = js.native
  def substitute(template: String, variables: js.Object): String = js.native
  def throttle(func: js.Function0[Unit]): js.Function0[Unit] = js.native
  def throttle(func: js.Function0[Unit], wait: Double): js.Function0[Unit] = js.native
  def throttleAfterHits(func: js.Function0[Unit]): js.Function0[Unit] = js.native
  def throttleAfterHits(func: js.Function0[Unit], wait: Double): js.Function0[Unit] = js.native
  def throttleAfterHits(func: js.Function0[Unit], wait: Double, hits: Double): js.Function0[Unit] = js.native
  def to2dArray(arr: js.Array[_]): Unit = js.native
  def toUpperCaseFirst(string: String): String = js.native
  def translateRowsToColumns(input: js.Array[_]): js.Array[_] = js.native
  def valueAccordingPercent(value: Double, percent: String): Double = js.native
  def valueAccordingPercent(value: Double, percent: Double): Double = js.native
}

