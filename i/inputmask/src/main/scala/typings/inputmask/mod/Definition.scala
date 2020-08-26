package typings.inputmask.mod

import typings.inputmask.anon.C
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Definition extends js.Object {
  var cardinality: js.UndefOr[Double] = js.native
  var casing: js.UndefOr[Casing] = js.native
  var definitionSymbol: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var validator: String | DefinitionValidator = js.native
}

object Definition {
  @scala.inline
  def apply(validator: String | DefinitionValidator): Definition = {
    val __obj = js.Dynamic.literal(validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  implicit class DefinitionOps[Self <: Definition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValidatorFunction5(
      value: (/* chrs */ String, /* buffer */ js.Array[String], /* pos */ Double, /* strict */ Boolean, /* opts */ Options) => Boolean | C
    ): Self = this.set("validator", js.Any.fromFunction5(value))
    @scala.inline
    def setValidator(value: String | DefinitionValidator): Self = this.set("validator", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardinality(value: Double): Self = this.set("cardinality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardinality: Self = this.set("cardinality", js.undefined)
    @scala.inline
    def setCasing(value: Casing): Self = this.set("casing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCasing: Self = this.set("casing", js.undefined)
    @scala.inline
    def setDefinitionSymbol(value: String): Self = this.set("definitionSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitionSymbol: Self = this.set("definitionSymbol", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
  }
  
}

