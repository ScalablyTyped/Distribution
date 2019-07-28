package typings.kuromoji.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViterbiNode extends js.Object {
  var cost: Double
  var left_id: Double
  var length: Double
  var name: String
  var prev: ViterbiNode
  var right_id: Double
  var shortest_cost: Double
  var start_pos: Double
  var surface_form: String
  var `type`: String
}

object ViterbiNode {
  @scala.inline
  def apply(
    cost: Double,
    left_id: Double,
    length: Double,
    name: String,
    prev: ViterbiNode,
    right_id: Double,
    shortest_cost: Double,
    start_pos: Double,
    surface_form: String,
    `type`: String
  ): ViterbiNode = {
    val __obj = js.Dynamic.literal(cost = cost, left_id = left_id, length = length, name = name, prev = prev, right_id = right_id, shortest_cost = shortest_cost, start_pos = start_pos, surface_form = surface_form)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ViterbiNode]
  }
}

