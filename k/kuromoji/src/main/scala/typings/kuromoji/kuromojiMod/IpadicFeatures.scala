package typings.kuromoji.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpadicFeatures extends js.Object {
  var basic_form: String
  var conjugated_form: String
  var conjugated_type: String
  var pos: String
  var pos_detail_1: String
  var pos_detail_2: String
  var pos_detail_3: String
  var pronunciation: js.UndefOr[String] = js.undefined
  var reading: js.UndefOr[String] = js.undefined
  var surface_form: String
  var word_id: Double
  var word_position: Double
  var word_type: String
}

object IpadicFeatures {
  @scala.inline
  def apply(
    basic_form: String,
    conjugated_form: String,
    conjugated_type: String,
    pos: String,
    pos_detail_1: String,
    pos_detail_2: String,
    pos_detail_3: String,
    surface_form: String,
    word_id: Double,
    word_position: Double,
    word_type: String,
    pronunciation: String = null,
    reading: String = null
  ): IpadicFeatures = {
    val __obj = js.Dynamic.literal(basic_form = basic_form, conjugated_form = conjugated_form, conjugated_type = conjugated_type, pos = pos, pos_detail_1 = pos_detail_1, pos_detail_2 = pos_detail_2, pos_detail_3 = pos_detail_3, surface_form = surface_form, word_id = word_id, word_position = word_position, word_type = word_type)
    if (pronunciation != null) __obj.updateDynamic("pronunciation")(pronunciation)
    if (reading != null) __obj.updateDynamic("reading")(reading)
    __obj.asInstanceOf[IpadicFeatures]
  }
}

