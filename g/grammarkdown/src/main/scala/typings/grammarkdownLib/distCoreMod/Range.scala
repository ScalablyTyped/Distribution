package typings
package grammarkdownLib.distCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var end: Position
  var start: Position
}

object Range {
  @scala.inline
  def apply(end: Position, start: Position): Range = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[Range]
  }
}

