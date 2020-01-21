package typings.inputmask.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var cardinality: js.UndefOr[Double] = js.undefined
  var casing: js.UndefOr[Casing] = js.undefined
  var definitionSymbol: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var validator: String | DefinitionValidator
}

object Definition {
  @scala.inline
  def apply(
    validator: String | DefinitionValidator,
    cardinality: Int | Double = null,
    casing: Casing = null,
    definitionSymbol: String = null,
    placeholder: String = null
  ): Definition = {
    val __obj = js.Dynamic.literal(validator = validator.asInstanceOf[js.Any])
    if (cardinality != null) __obj.updateDynamic("cardinality")(cardinality.asInstanceOf[js.Any])
    if (casing != null) __obj.updateDynamic("casing")(casing.asInstanceOf[js.Any])
    if (definitionSymbol != null) __obj.updateDynamic("definitionSymbol")(definitionSymbol.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
}

