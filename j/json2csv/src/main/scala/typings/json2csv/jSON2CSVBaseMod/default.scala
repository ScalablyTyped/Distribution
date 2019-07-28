package typings.json2csv.jSON2CSVBaseMod

import typings.json2csv.jSON2CSVBaseMod.json2csvNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv/JSON2CSVBase", JSImport.Default)
@js.native
abstract class default[T] () extends JSON2CSVBase[T] {
  def this(opts: Options[T]) = this()
}

