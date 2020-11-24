package typings.json2csv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json2csv/transforms/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  
  type Json2CsvTransform[T1, T2] = js.Function1[/* item */ T1, T2 | js.Array[T2]]
}
