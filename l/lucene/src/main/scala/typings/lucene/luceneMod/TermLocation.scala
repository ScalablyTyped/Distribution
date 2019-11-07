package typings.lucene.luceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermLocation extends js.Object {
  var column: Double
  var line: Double
  var offset: Double
}

object TermLocation {
  @scala.inline
  def apply(column: Double, line: Double, offset: Double): TermLocation = {
    val __obj = js.Dynamic.literal(column = column, line = line, offset = offset)
  
    __obj.asInstanceOf[TermLocation]
  }
}

