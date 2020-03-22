package typings.lucene

import typings.lucene.mod.TermLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: TermLocation
  var start: TermLocation
}

object AnonEnd {
  @scala.inline
  def apply(end: TermLocation, start: TermLocation): AnonEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnd]
  }
}

