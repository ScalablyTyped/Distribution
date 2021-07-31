package typings.json2csv

import typings.json2csv.baseMod.Json2CsvTransform
import typings.json2csv.flattenMod.FlattenOptions
import typings.json2csv.unwindMod.UnwindOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformsMod {
  
  @JSImport("json2csv/transforms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def flatten(): Json2CsvTransform[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[Json2CsvTransform[js.Any, js.Any]]
  @scala.inline
  def flatten(options: FlattenOptions): Json2CsvTransform[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[js.Any, js.Any]]
  
  @scala.inline
  def unwind(): Json2CsvTransform[js.Any, js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")().asInstanceOf[Json2CsvTransform[js.Any, js.Array[js.Any]]]
  @scala.inline
  def unwind(options: UnwindOptions): Json2CsvTransform[js.Any, js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[js.Any, js.Array[js.Any]]]
}
