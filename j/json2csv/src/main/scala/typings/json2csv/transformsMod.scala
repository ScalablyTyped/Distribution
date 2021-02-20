package typings.json2csv

import typings.json2csv.baseMod.Json2CsvTransform
import typings.json2csv.flattenMod.FlattenOptions
import typings.json2csv.unwindMod.UnwindOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformsMod {
  
  @JSImport("json2csv/transforms", "flatten")
  @js.native
  def flatten(): Json2CsvTransform[_, _] = js.native
  @JSImport("json2csv/transforms", "flatten")
  @js.native
  def flatten(options: FlattenOptions): Json2CsvTransform[_, _] = js.native
  
  @JSImport("json2csv/transforms", "unwind")
  @js.native
  def unwind(): Json2CsvTransform[_, js.Array[_]] = js.native
  @JSImport("json2csv/transforms", "unwind")
  @js.native
  def unwind(options: UnwindOptions): Json2CsvTransform[_, js.Array[_]] = js.native
}
