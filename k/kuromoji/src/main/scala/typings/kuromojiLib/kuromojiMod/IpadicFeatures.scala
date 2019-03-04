package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpadicFeatures extends js.Object {
  var basic_form: java.lang.String
  var conjugated_form: java.lang.String
  var conjugated_type: java.lang.String
  var pos: java.lang.String
  var pos_detail_1: java.lang.String
  var pos_detail_2: java.lang.String
  var pos_detail_3: java.lang.String
  var pronunciation: js.UndefOr[java.lang.String] = js.undefined
  var reading: js.UndefOr[java.lang.String] = js.undefined
  var surface_form: java.lang.String
  var word_id: scala.Double
  var word_position: scala.Double
  var word_type: java.lang.String
}

object IpadicFeatures {
  @scala.inline
  def apply(
    basic_form: java.lang.String,
    conjugated_form: java.lang.String,
    conjugated_type: java.lang.String,
    pos: java.lang.String,
    pos_detail_1: java.lang.String,
    pos_detail_2: java.lang.String,
    pos_detail_3: java.lang.String,
    surface_form: java.lang.String,
    word_id: scala.Double,
    word_position: scala.Double,
    word_type: java.lang.String,
    pronunciation: java.lang.String = null,
    reading: java.lang.String = null
  ): IpadicFeatures = {
    val __obj = js.Dynamic.literal(basic_form = basic_form, conjugated_form = conjugated_form, conjugated_type = conjugated_type, pos = pos, pos_detail_1 = pos_detail_1, pos_detail_2 = pos_detail_2, pos_detail_3 = pos_detail_3, surface_form = surface_form, word_id = word_id, word_position = word_position, word_type = word_type)
    if (pronunciation != null) __obj.updateDynamic("pronunciation")(pronunciation)
    if (reading != null) __obj.updateDynamic("reading")(reading)
    __obj.asInstanceOf[IpadicFeatures]
  }
}

