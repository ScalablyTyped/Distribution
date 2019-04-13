package typings
package inputmaskLib.inputmaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var cardinality: js.UndefOr[scala.Double] = js.undefined
  var casing: js.UndefOr[Casing] = js.undefined
  var definitionSymbol: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var validator: java.lang.String | DefinitionValidator
}

object Definition {
  @scala.inline
  def apply(
    validator: java.lang.String | DefinitionValidator,
    cardinality: scala.Int | scala.Double = null,
    casing: Casing = null,
    definitionSymbol: java.lang.String = null,
    placeholder: java.lang.String = null
  ): Definition = {
    val __obj = js.Dynamic.literal(validator = validator.asInstanceOf[js.Any])
    if (cardinality != null) __obj.updateDynamic("cardinality")(cardinality.asInstanceOf[js.Any])
    if (casing != null) __obj.updateDynamic("casing")(casing)
    if (definitionSymbol != null) __obj.updateDynamic("definitionSymbol")(definitionSymbol)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[Definition]
  }
}

