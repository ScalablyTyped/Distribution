package typings.higButton.mod

import typings.higButton.higButtonStrings.flat
import typings.higButton.higButtonStrings.outline
import typings.higButton.higButtonStrings.primary
import typings.higButton.higButtonStrings.secondary
import typings.higButton.higButtonStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types_ extends js.Object {
  var FLAT: flat = js.native
  var OUTLINE: outline = js.native
  /** @deprecated */
  var PRIMARY: primary = js.native
  /** @deprecated */
  var SECONDARY: secondary = js.native
  var SOLID: solid = js.native
}

object Types_ {
  @scala.inline
  def apply(FLAT: flat, OUTLINE: outline, PRIMARY: primary, SECONDARY: secondary, SOLID: solid): Types_ = {
    val __obj = js.Dynamic.literal(FLAT = FLAT.asInstanceOf[js.Any], OUTLINE = OUTLINE.asInstanceOf[js.Any], PRIMARY = PRIMARY.asInstanceOf[js.Any], SECONDARY = SECONDARY.asInstanceOf[js.Any], SOLID = SOLID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types_]
  }
  @scala.inline
  implicit class Types_Ops[Self <: Types_] (val x: Self) extends AnyVal {
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
    def setFLAT(value: flat): Self = this.set("FLAT", value.asInstanceOf[js.Any])
    @scala.inline
    def setOUTLINE(value: outline): Self = this.set("OUTLINE", value.asInstanceOf[js.Any])
    @scala.inline
    def setPRIMARY(value: primary): Self = this.set("PRIMARY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSECONDARY(value: secondary): Self = this.set("SECONDARY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSOLID(value: solid): Self = this.set("SOLID", value.asInstanceOf[js.Any])
  }
  
}

