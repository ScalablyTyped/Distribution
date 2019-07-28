package typings.jsoneditor

import typings.jsoneditor.jsoneditorMod.SelectionPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndStart extends js.Object {
  var end: SelectionPosition
  var start: SelectionPosition
  var text: String
}

object Anon_EndStart {
  @scala.inline
  def apply(end: SelectionPosition, start: SelectionPosition, text: String): Anon_EndStart = {
    val __obj = js.Dynamic.literal(end = end, start = start, text = text)
  
    __obj.asInstanceOf[Anon_EndStart]
  }
}

