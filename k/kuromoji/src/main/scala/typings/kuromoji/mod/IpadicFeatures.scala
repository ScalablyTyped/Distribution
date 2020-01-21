package typings.kuromoji.mod

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
    val __obj = js.Dynamic.literal(basic_form = basic_form.asInstanceOf[js.Any], conjugated_form = conjugated_form.asInstanceOf[js.Any], conjugated_type = conjugated_type.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], pos_detail_1 = pos_detail_1.asInstanceOf[js.Any], pos_detail_2 = pos_detail_2.asInstanceOf[js.Any], pos_detail_3 = pos_detail_3.asInstanceOf[js.Any], surface_form = surface_form.asInstanceOf[js.Any], word_id = word_id.asInstanceOf[js.Any], word_position = word_position.asInstanceOf[js.Any], word_type = word_type.asInstanceOf[js.Any])
    if (pronunciation != null) __obj.updateDynamic("pronunciation")(pronunciation.asInstanceOf[js.Any])
    if (reading != null) __obj.updateDynamic("reading")(reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpadicFeatures]
  }
}

