package typings.handsontable

import typings.handsontable.anon.MaxTouchPoints
import typings.handsontable.anon.Platform
import typings.handsontable.anon.UserAgent
import typings.handsontable.commonMod.CellValue
import typings.handsontable.coreMod.default
import typings.handsontable.helpersFeatureMod.Comparator
import typings.handsontable.settingsMod.GridSettings
import typings.std.Document
import typings.std.HTMLTableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("handsontable/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/helpers", "KEY_CODES")
  @js.native
  object KEY_CODES extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.handsontable.helpersUnicodeMod.KEY_CODES & Double] = js.native
    
    /* 65 */ val A: typings.handsontable.helpersUnicodeMod.KEY_CODES.A & Double = js.native
    
    /* 18 */ val ALT: typings.handsontable.helpersUnicodeMod.KEY_CODES.ALT & Double = js.native
    
    /* 40 */ val ARROW_DOWN: typings.handsontable.helpersUnicodeMod.KEY_CODES.ARROW_DOWN & Double = js.native
    
    /* 37 */ val ARROW_LEFT: typings.handsontable.helpersUnicodeMod.KEY_CODES.ARROW_LEFT & Double = js.native
    
    /* 39 */ val ARROW_RIGHT: typings.handsontable.helpersUnicodeMod.KEY_CODES.ARROW_RIGHT & Double = js.native
    
    /* 38 */ val ARROW_UP: typings.handsontable.helpersUnicodeMod.KEY_CODES.ARROW_UP & Double = js.native
    
    /* 174 */ val AUDIO_DOWN: typings.handsontable.helpersUnicodeMod.KEY_CODES.AUDIO_DOWN & Double = js.native
    
    /* 173 */ val AUDIO_MUTE: typings.handsontable.helpersUnicodeMod.KEY_CODES.AUDIO_MUTE & Double = js.native
    
    /* 175 */ val AUDIO_UP: typings.handsontable.helpersUnicodeMod.KEY_CODES.AUDIO_UP & Double = js.native
    
    /* 8 */ val BACKSPACE: typings.handsontable.helpersUnicodeMod.KEY_CODES.BACKSPACE & Double = js.native
    
    /* 67 */ val C: typings.handsontable.helpersUnicodeMod.KEY_CODES.C & Double = js.native
    
    /* 20 */ val CAPS_LOCK: typings.handsontable.helpersUnicodeMod.KEY_CODES.CAPS_LOCK & Double = js.native
    
    /* 188 */ val COMMA: typings.handsontable.helpersUnicodeMod.KEY_CODES.COMMA & Double = js.native
    
    /* 224 */ val COMMAND_FIREFOX: typings.handsontable.helpersUnicodeMod.KEY_CODES.COMMAND_FIREFOX & Double = js.native
    
    /* 91 */ val COMMAND_LEFT: typings.handsontable.helpersUnicodeMod.KEY_CODES.COMMAND_LEFT & Double = js.native
    
    /* 93 */ val COMMAND_RIGHT: typings.handsontable.helpersUnicodeMod.KEY_CODES.COMMAND_RIGHT & Double = js.native
    
    /* 17 */ val CONTROL: typings.handsontable.helpersUnicodeMod.KEY_CODES.CONTROL & Double = js.native
    
    /* 68 */ val D: typings.handsontable.helpersUnicodeMod.KEY_CODES.D & Double = js.native
    
    /* 46 */ val DELETE: typings.handsontable.helpersUnicodeMod.KEY_CODES.DELETE & Double = js.native
    
    /* 35 */ val END: typings.handsontable.helpersUnicodeMod.KEY_CODES.END & Double = js.native
    
    /* 13 */ val ENTER: typings.handsontable.helpersUnicodeMod.KEY_CODES.ENTER & Double = js.native
    
    /* 27 */ val ESCAPE: typings.handsontable.helpersUnicodeMod.KEY_CODES.ESCAPE & Double = js.native
    
    /* 70 */ val F: typings.handsontable.helpersUnicodeMod.KEY_CODES.F & Double = js.native
    
    /* 112 */ val F1: typings.handsontable.helpersUnicodeMod.KEY_CODES.F1 & Double = js.native
    
    /* 121 */ val F10: typings.handsontable.helpersUnicodeMod.KEY_CODES.F10 & Double = js.native
    
    /* 122 */ val F11: typings.handsontable.helpersUnicodeMod.KEY_CODES.F11 & Double = js.native
    
    /* 123 */ val F12: typings.handsontable.helpersUnicodeMod.KEY_CODES.F12 & Double = js.native
    
    /* 124 */ val F13: typings.handsontable.helpersUnicodeMod.KEY_CODES.F13 & Double = js.native
    
    /* 125 */ val F14: typings.handsontable.helpersUnicodeMod.KEY_CODES.F14 & Double = js.native
    
    /* 126 */ val F15: typings.handsontable.helpersUnicodeMod.KEY_CODES.F15 & Double = js.native
    
    /* 127 */ val F16: typings.handsontable.helpersUnicodeMod.KEY_CODES.F16 & Double = js.native
    
    /* 128 */ val F17: typings.handsontable.helpersUnicodeMod.KEY_CODES.F17 & Double = js.native
    
    /* 129 */ val F18: typings.handsontable.helpersUnicodeMod.KEY_CODES.F18 & Double = js.native
    
    /* 130 */ val F19: typings.handsontable.helpersUnicodeMod.KEY_CODES.F19 & Double = js.native
    
    /* 113 */ val F2: typings.handsontable.helpersUnicodeMod.KEY_CODES.F2 & Double = js.native
    
    /* 114 */ val F3: typings.handsontable.helpersUnicodeMod.KEY_CODES.F3 & Double = js.native
    
    /* 115 */ val F4: typings.handsontable.helpersUnicodeMod.KEY_CODES.F4 & Double = js.native
    
    /* 116 */ val F5: typings.handsontable.helpersUnicodeMod.KEY_CODES.F5 & Double = js.native
    
    /* 117 */ val F6: typings.handsontable.helpersUnicodeMod.KEY_CODES.F6 & Double = js.native
    
    /* 118 */ val F7: typings.handsontable.helpersUnicodeMod.KEY_CODES.F7 & Double = js.native
    
    /* 119 */ val F8: typings.handsontable.helpersUnicodeMod.KEY_CODES.F8 & Double = js.native
    
    /* 120 */ val F9: typings.handsontable.helpersUnicodeMod.KEY_CODES.F9 & Double = js.native
    
    /* 36 */ val HOME: typings.handsontable.helpersUnicodeMod.KEY_CODES.HOME & Double = js.native
    
    /* 45 */ val INSERT: typings.handsontable.helpersUnicodeMod.KEY_CODES.INSERT & Double = js.native
    
    /* 76 */ val L: typings.handsontable.helpersUnicodeMod.KEY_CODES.L & Double = js.native
    
    /* 176 */ val MEDIA_NEXT: typings.handsontable.helpersUnicodeMod.KEY_CODES.MEDIA_NEXT & Double = js.native
    
    /* 179 */ val MEDIA_PLAY_PAUSE: typings.handsontable.helpersUnicodeMod.KEY_CODES.MEDIA_PLAY_PAUSE & Double = js.native
    
    /* 177 */ val MEDIA_PREV: typings.handsontable.helpersUnicodeMod.KEY_CODES.MEDIA_PREV & Double = js.native
    
    /* 178 */ val MEDIA_STOP: typings.handsontable.helpersUnicodeMod.KEY_CODES.MEDIA_STOP & Double = js.native
    
    /* 0 */ val NULL: typings.handsontable.helpersUnicodeMod.KEY_CODES.NULL & Double = js.native
    
    /* 144 */ val NUM_LOCK: typings.handsontable.helpersUnicodeMod.KEY_CODES.NUM_LOCK & Double = js.native
    
    /* 79 */ val O: typings.handsontable.helpersUnicodeMod.KEY_CODES.O & Double = js.native
    
    /* 80 */ val P: typings.handsontable.helpersUnicodeMod.KEY_CODES.P & Double = js.native
    
    /* 34 */ val PAGE_DOWN: typings.handsontable.helpersUnicodeMod.KEY_CODES.PAGE_DOWN & Double = js.native
    
    /* 33 */ val PAGE_UP: typings.handsontable.helpersUnicodeMod.KEY_CODES.PAGE_UP & Double = js.native
    
    /* 19 */ val PAUSE: typings.handsontable.helpersUnicodeMod.KEY_CODES.PAUSE & Double = js.native
    
    /* 190 */ val PERIOD: typings.handsontable.helpersUnicodeMod.KEY_CODES.PERIOD & Double = js.native
    
    /* 83 */ val S: typings.handsontable.helpersUnicodeMod.KEY_CODES.S & Double = js.native
    
    /* 145 */ val SCROLL_LOCK: typings.handsontable.helpersUnicodeMod.KEY_CODES.SCROLL_LOCK & Double = js.native
    
    /* 16 */ val SHIFT: typings.handsontable.helpersUnicodeMod.KEY_CODES.SHIFT & Double = js.native
    
    /* 32 */ val SPACE: typings.handsontable.helpersUnicodeMod.KEY_CODES.SPACE & Double = js.native
    
    /* 9 */ val TAB: typings.handsontable.helpersUnicodeMod.KEY_CODES.TAB & Double = js.native
    
    /* 86 */ val V: typings.handsontable.helpersUnicodeMod.KEY_CODES.V & Double = js.native
    
    /* 88 */ val X: typings.handsontable.helpersUnicodeMod.KEY_CODES.X & Double = js.native
    
    /* 89 */ val Y: typings.handsontable.helpersUnicodeMod.KEY_CODES.Y & Double = js.native
    
    /* 90 */ val Z: typings.handsontable.helpersUnicodeMod.KEY_CODES.Z & Double = js.native
  }
  
  inline def arrayAvg(array: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayAvg")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def arrayEach(
    array: js.Array[Any],
    iteratee: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEach")(array.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def arrayFilter(
    array: js.Array[Any],
    predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayFilter")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def arrayFlatten(array: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayFlatten")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def arrayMap(
    array: js.Array[Any],
    iteratee: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMap")(array.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def arrayMax(array: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayMax")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def arrayMin(array: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayMin")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def arrayReduce(
    array: js.Array[Any],
    iteratee: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit],
    accumulator: Any,
    initFromArray: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayReduce")(array.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], accumulator.asInstanceOf[js.Any], initFromArray.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def arraySum(array: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arraySum")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def arrayUnique(array: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnique")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def cancelAnimationFrame(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimationFrame")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def cellMethodLookupFactory(methodName: String): js.Function2[/* row */ Double, /* col */ Double, js.Function1[/* prop */ String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cellMethodLookupFactory")(methodName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* row */ Double, /* col */ Double, js.Function1[/* prop */ String, Any]]]
  inline def cellMethodLookupFactory(methodName: String, allowUndefined: Boolean): js.Function2[/* row */ Double, /* col */ Double, js.Function1[/* prop */ String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cellMethodLookupFactory")(methodName.asInstanceOf[js.Any], allowUndefined.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* row */ Double, /* col */ Double, js.Function1[/* prop */ String, Any]]]
  
  inline def clone_(`object`: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def countFirstRowKeys(data: js.Array[CellValue]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countFirstRowKeys")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def createEmptySpreadsheetData(rows: Double, columns: Double): js.Array[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEmptySpreadsheetData")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String]]]
  
  inline def createObjectPropListener(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectPropListener")().asInstanceOf[js.Object]
  inline def createObjectPropListener(defaultValue: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectPropListener")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def createObjectPropListener(defaultValue: Any, propertyToListen: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("createObjectPropListener")(defaultValue.asInstanceOf[js.Any], propertyToListen.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def createObjectPropListener(defaultValue: Unit, propertyToListen: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("createObjectPropListener")(defaultValue.asInstanceOf[js.Any], propertyToListen.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def createSpreadsheetData(): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetData")().asInstanceOf[js.Array[js.Array[Any]]]
  inline def createSpreadsheetData(rows: Double): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetData")(rows.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Any]]]
  inline def createSpreadsheetData(rows: Double, columns: Double): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetData")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
  inline def createSpreadsheetData(rows: Unit, columns: Double): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetData")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
  
  inline def createSpreadsheetObjectData(): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetObjectData")().asInstanceOf[js.Array[js.Array[Any]]]
  inline def createSpreadsheetObjectData(rows: Double): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetObjectData")(rows.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Any]]]
  inline def createSpreadsheetObjectData(rows: Double, colCount: Double): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetObjectData")(rows.asInstanceOf[js.Any], colCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
  inline def createSpreadsheetObjectData(rows: Unit, colCount: Double): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSpreadsheetObjectData")(rows.asInstanceOf[js.Any], colCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
  
  inline def curry(func: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("curry")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def curryRight(func: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("curryRight")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def dataRowToChangesArray(dataRow: js.Array[CellValue]): js.Array[CellValue | Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataRowToChangesArray")(dataRow.asInstanceOf[js.Any]).asInstanceOf[js.Array[CellValue | Double | String]]
  inline def dataRowToChangesArray(dataRow: js.Array[CellValue], rowOffset: Double): js.Array[CellValue | Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("dataRowToChangesArray")(dataRow.asInstanceOf[js.Any], rowOffset.asInstanceOf[js.Any])).asInstanceOf[js.Array[CellValue | Double | String]]
  inline def dataRowToChangesArray(dataRow: js.Object): js.Array[CellValue | Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataRowToChangesArray")(dataRow.asInstanceOf[js.Any]).asInstanceOf[js.Array[CellValue | Double | String]]
  inline def dataRowToChangesArray(dataRow: js.Object, rowOffset: Double): js.Array[CellValue | Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("dataRowToChangesArray")(dataRow.asInstanceOf[js.Any], rowOffset.asInstanceOf[js.Any])).asInstanceOf[js.Array[CellValue | Double | String]]
  
  inline def debounce(func: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def debounce(func: js.Function0[Unit], wait: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def deepClone(obj: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("deepClone")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def deepExtend(target: js.Object, `extension`: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepExtend")(target.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deepObjectSize(`object`: js.Object): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deepObjectSize")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def defineGetter(`object`: js.Object, property: Any, value: Any, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineGetter")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def duckSchema(`object`: js.Array[Any]): js.Array[Any] | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("duckSchema")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any] | js.Object]
  inline def duckSchema(`object`: js.Object): js.Array[Any] | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("duckSchema")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any] | js.Object]
  
  inline def equalsIgnoreCase(strings: String*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsIgnoreCase")(strings.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Boolean]
  
  inline def error(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def extend(target: js.Object, `extension`: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def extend(target: js.Object, `extension`: js.Object, writableKeys: js.Array[String]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any], writableKeys.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def extendArray(arr: js.Array[Any], `extension`: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendArray")(arr.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fastCall(
    func: js.Function0[Unit],
    context: Any,
    arg1: js.UndefOr[Any],
    arg2: js.UndefOr[Any],
    arg3: js.UndefOr[Any],
    arg4: js.UndefOr[Any],
    arg5: js.UndefOr[Any],
    arg6: js.UndefOr[Any]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fastCall")(func.asInstanceOf[js.Any], context.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any], arg6.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getComparisonFunction(): Comparator = ^.asInstanceOf[js.Dynamic].applyDynamic("getComparisonFunction")().asInstanceOf[Comparator]
  inline def getComparisonFunction(language: String): Comparator = ^.asInstanceOf[js.Dynamic].applyDynamic("getComparisonFunction")(language.asInstanceOf[js.Any]).asInstanceOf[Comparator]
  inline def getComparisonFunction(language: String, options: js.Object): Comparator = (^.asInstanceOf[js.Dynamic].applyDynamic("getComparisonFunction")(language.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Comparator]
  inline def getComparisonFunction(language: Unit, options: js.Object): Comparator = (^.asInstanceOf[js.Dynamic].applyDynamic("getComparisonFunction")(language.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Comparator]
  
  inline def getDifferenceOfArrays(arrays: (js.Array[String | Double])*): js.Array[Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDifferenceOfArrays")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Double | String]]
  
  inline def getIntersectionOfArrays(arrays: (js.Array[String | Double])*): js.Array[Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionOfArrays")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Double | String]]
  
  inline def getNormalizedDate(dateString: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedDate")(dateString.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def getProperty(`object`: js.Object, name: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getUnionOfArrays(arrays: (js.Array[String | Double])*): js.Array[Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnionOfArrays")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Double | String]]
  
  inline def hasCaptionProblem(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCaptionProblem")().asInstanceOf[Boolean]
  
  inline def hasOwnProperty_(`object`: js.Object, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def htmlToGridSettings(element: String): GridSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlToGridSettings")(element.asInstanceOf[js.Any]).asInstanceOf[GridSettings]
  inline def htmlToGridSettings(element: String, rootDocument: Document): GridSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlToGridSettings")(element.asInstanceOf[js.Any], rootDocument.asInstanceOf[js.Any])).asInstanceOf[GridSettings]
  inline def htmlToGridSettings(element: HTMLTableElement): GridSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlToGridSettings")(element.asInstanceOf[js.Any]).asInstanceOf[GridSettings]
  inline def htmlToGridSettings(element: HTMLTableElement, rootDocument: Document): GridSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlToGridSettings")(element.asInstanceOf[js.Any], rootDocument.asInstanceOf[js.Any])).asInstanceOf[GridSettings]
  
  inline def info(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def inherit(Child: js.Object, Parent: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(Child.asInstanceOf[js.Any], Parent.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def instanceToHTML(instance: default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceToHTML")(instance.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isArrayOfArrays(data: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfArrays")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isArrayOfObjects(data: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfObjects")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isChrome(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChrome")().asInstanceOf[Boolean]
  
  inline def isChromeWebKit(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChromeWebKit")().asInstanceOf[Boolean]
  
  inline def isClassListSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassListSupported")().asInstanceOf[Boolean]
  
  inline def isCtrlKey(keyCode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCtrlKey")(keyCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCtrlMetaKey(keyCode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCtrlMetaKey")(keyCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDefined(variable: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(variable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEdge(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdge")().asInstanceOf[Boolean]
  
  inline def isEdgeWebKit(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdgeWebKit")().asInstanceOf[Boolean]
  
  inline def isEmpty(variable: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(variable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFirefox(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirefox")().asInstanceOf[Boolean]
  
  inline def isFirefoxWebKit(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirefoxWebKit")().asInstanceOf[Boolean]
  
  inline def isFunction(func: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(func.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunctionKey(keyCode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionKey")(keyCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isGetComputedStyleSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGetComputedStyleSupported")().asInstanceOf[Boolean]
  
  inline def isIE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIE")().asInstanceOf[Boolean]
  
  inline def isIE9(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIE9")().asInstanceOf[Boolean]
  
  inline def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS")().asInstanceOf[Boolean]
  
  inline def isIpadOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIpadOS")().asInstanceOf[Boolean]
  inline def isIpadOS(param0: MaxTouchPoints): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIpadOS")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKey(keyCode: Double, baseCode: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isKey")(keyCode.asInstanceOf[js.Any], baseCode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isLinuxOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinuxOS")().asInstanceOf[Boolean]
  
  inline def isMSBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMSBrowser")().asInstanceOf[Boolean]
  
  inline def isMacOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacOS")().asInstanceOf[Boolean]
  
  inline def isMobileBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobileBrowser")().asInstanceOf[Boolean]
  
  inline def isNumeric(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNumeric(value: Any, additionalDelimiters: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any], additionalDelimiters.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNumericLike(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericLike")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObjectEqual(object1: js.Array[Any], object2: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectEqual")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isObjectEqual(object1: js.Array[Any], object2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectEqual")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isObjectEqual(object1: js.Object, object2: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectEqual")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isObjectEqual(object1: js.Object, object2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectEqual")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPassiveEventSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPassiveEventSupported")().asInstanceOf[Boolean]
  
  inline def isPercentValue(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPercentValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrintableChar(keyCode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrintableChar")(keyCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegExp(variable: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(variable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafari")().asInstanceOf[Boolean]
  
  inline def isTextContentSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextContentSupported")().asInstanceOf[Boolean]
  
  inline def isTouchSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchSupported")().asInstanceOf[Boolean]
  
  inline def isUndefined(variable: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(variable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWindowsOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindowsOS")().asInstanceOf[Boolean]
  
  inline def log(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def mixin(Base: js.Object, mixins: js.Object*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(scala.List(Base.asInstanceOf[js.Any]).`++`(mixins.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
  
  inline def objectEach(
    `object`: js.Object,
    iteratee: js.Function3[/* value */ Any, /* key */ Any, /* object */ js.Object, Unit]
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("objectEach")(`object`.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def partial(func: js.Function0[Unit], params: Any*): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(scala.List(func.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function0[Unit]]
  
  inline def pipe(functions: js.Function0[Unit]*): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(functions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function0[Unit]]
  
  inline def pivot(arr: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pivot")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def randomString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")().asInstanceOf[String]
  
  inline def rangeEach(rangeFrom: Double, rangeTo: Double, iteratee: js.Function1[/* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeEach")(rangeFrom.asInstanceOf[js.Any], rangeTo.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rangeEachReverse(rangeFrom: Double, rangeTo: Double, iteratee: js.Function1[/* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeEachReverse")(rangeFrom.asInstanceOf[js.Any], rangeTo.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def requestAnimationFrame(callback: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimationFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sanitize(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sanitize(string: String, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setBrowserMeta(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBrowserMeta")().asInstanceOf[Unit]
  inline def setBrowserMeta(param0: UserAgent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBrowserMeta")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setPlatformMeta(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPlatformMeta")().asInstanceOf[Unit]
  inline def setPlatformMeta(param0: Platform): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPlatformMeta")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setProperty(`object`: js.Object, name: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setProperty")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def spreadsheetColumnIndex(label: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("spreadsheetColumnIndex")(label.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def spreadsheetColumnLabel(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("spreadsheetColumnLabel")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringToArray(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def stringToArray(value: String, delimiter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToArray")(value.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def stringToArray(value: String, delimiter: js.RegExp): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToArray")(value.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripTags(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTags")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def substitute(template: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("substitute")(template.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def substitute(template: String, variables: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substitute")(template.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def throttle(func: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def throttle(func: js.Function0[Unit], wait: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def throttleAfterHits(func: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleAfterHits")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def throttleAfterHits(func: js.Function0[Unit], wait: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAfterHits")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def throttleAfterHits(func: js.Function0[Unit], wait: Double, hits: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAfterHits")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], hits.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def throttleAfterHits(func: js.Function0[Unit], wait: Unit, hits: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAfterHits")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], hits.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def to2dArray(arr: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("to2dArray")(arr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toSingleLine(strings: js.Array[String], expressions: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSingleLine")(scala.List(strings.asInstanceOf[js.Any]).`++`(expressions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def toUpperCaseFirst(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUpperCaseFirst")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def valueAccordingPercent(value: Double, percent: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("valueAccordingPercent")(value.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def valueAccordingPercent(value: Double, percent: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("valueAccordingPercent")(value.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def warn(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
}
