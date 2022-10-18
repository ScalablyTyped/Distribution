package typings.json2csv

import typings.json2csv.mod.Json2CsvTransform
import typings.json2csv.mod.UnwindOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformsUnwindMod {
  
  /**
    * Builds a unwinding transform
    *
    * @param options Options to use for unwinding
    * @returns Array of objects containing all rows after unwind of chosen paths
    */
  inline def apply(): Json2CsvTransform[Any, js.Array[Any]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Json2CsvTransform[Any, js.Array[Any]]]
  inline def apply(options: UnwindOptions): Json2CsvTransform[Any, js.Array[Any]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[Any, js.Array[Any]]]
  
  @JSImport("json2csv/transforms/unwind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
