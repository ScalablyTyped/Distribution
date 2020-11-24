package typings.json2csv.unwindMod

import typings.json2csv.baseMod.Json2CsvTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json2csv/transforms/unwind", "unwind")
@js.native
object unwind extends js.Object {
  
  def apply(): Json2CsvTransform[_, js.Array[_]] = js.native
  def apply(options: UnwindOptions): Json2CsvTransform[_, js.Array[_]] = js.native
}
