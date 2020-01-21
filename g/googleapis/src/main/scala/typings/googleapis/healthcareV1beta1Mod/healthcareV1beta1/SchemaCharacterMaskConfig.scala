package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

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
  def apply(maskingCharacter: String = null): SchemaCharacterMaskConfig = {
    val __obj = js.Dynamic.literal()
    if (maskingCharacter != null) __obj.updateDynamic("maskingCharacter")(maskingCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCharacterMaskConfig]
  }
}

