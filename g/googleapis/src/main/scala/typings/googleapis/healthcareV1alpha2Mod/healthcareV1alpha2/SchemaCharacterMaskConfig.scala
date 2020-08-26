package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mask a string by replacing its characters with a fixed character.
  */
@js.native
trait SchemaCharacterMaskConfig extends js.Object {
  /**
    * Character to mask the sensitive values. If not supplied, defaults to
    * &quot;*&quot;.
    */
  var maskingCharacter: js.UndefOr[String] = js.native
}

object SchemaCharacterMaskConfig {
  @scala.inline
  def apply(): SchemaCharacterMaskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCharacterMaskConfig]
  }
  @scala.inline
  implicit class SchemaCharacterMaskConfigOps[Self <: SchemaCharacterMaskConfig] (val x: Self) extends AnyVal {
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
    def setMaskingCharacter(value: String): Self = this.set("maskingCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskingCharacter: Self = this.set("maskingCharacter", js.undefined)
  }
  
}

