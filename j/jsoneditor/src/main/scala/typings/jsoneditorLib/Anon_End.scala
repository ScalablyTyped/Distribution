package typings
package jsoneditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: jsoneditorLib.jsoneditorMod.SerializableNode
  var start: jsoneditorLib.jsoneditorMod.SerializableNode
}

object Anon_End {
  @scala.inline
  def apply(
    end: jsoneditorLib.jsoneditorMod.SerializableNode,
    start: jsoneditorLib.jsoneditorMod.SerializableNode
  ): Anon_End = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_End]
  }
}

