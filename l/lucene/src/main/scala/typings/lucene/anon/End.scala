package typings.lucene.anon

import typings.lucene.mod.TermLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: TermLocation
  var start: TermLocation
}

object End {
  @scala.inline
  def apply(end: TermLocation, start: TermLocation): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

