package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViterbiNode extends js.Object {
  var cost: scala.Double
  var left_id: scala.Double
  var length: scala.Double
  var name: java.lang.String
  var prev: ViterbiNode
  var right_id: scala.Double
  var shortest_cost: scala.Double
  var start_pos: scala.Double
  var surface_form: java.lang.String
  var `type`: java.lang.String
}

object ViterbiNode {
  @scala.inline
  def apply(
    cost: scala.Double,
    left_id: scala.Double,
    length: scala.Double,
    name: java.lang.String,
    prev: ViterbiNode,
    right_id: scala.Double,
    shortest_cost: scala.Double,
    start_pos: scala.Double,
    surface_form: java.lang.String,
    `type`: java.lang.String
  ): ViterbiNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("cost")(cost)
    __obj.updateDynamic("left_id")(left_id)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("prev")(prev)
    __obj.updateDynamic("right_id")(right_id)
    __obj.updateDynamic("shortest_cost")(shortest_cost)
    __obj.updateDynamic("start_pos")(start_pos)
    __obj.updateDynamic("surface_form")(surface_form)
    __obj.asInstanceOf[ViterbiNode]
  }
}

