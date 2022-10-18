package typings.json2csv

import typings.json2csv.mod.FlattenOptions
import typings.json2csv.mod.Json2CsvTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformsFlattenMod {
  
  /**
    * Builds a flattening transform
    *
    * @param options Options to use for flattening
    * @returns Flattening transform
    */
  inline def apply(): Json2CsvTransform[Any, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Json2CsvTransform[Any, Any]]
  inline def apply(options: FlattenOptions): Json2CsvTransform[Any, Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[Any, Any]]
  
  @JSImport("json2csv/transforms/flatten", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
