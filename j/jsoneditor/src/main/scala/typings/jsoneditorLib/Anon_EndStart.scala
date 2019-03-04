package typings
package jsoneditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndStart extends js.Object {
  var end: jsoneditorLib.jsoneditorMod.SelectionPosition
  var start: jsoneditorLib.jsoneditorMod.SelectionPosition
  var text: java.lang.String
}

object Anon_EndStart {
  @scala.inline
  def apply(
    end: jsoneditorLib.jsoneditorMod.SelectionPosition,
    start: jsoneditorLib.jsoneditorMod.SelectionPosition,
    text: java.lang.String
  ): Anon_EndStart = {
    val __obj = js.Dynamic.literal(end = end, start = start, text = text)
  
    __obj.asInstanceOf[Anon_EndStart]
  }
}

