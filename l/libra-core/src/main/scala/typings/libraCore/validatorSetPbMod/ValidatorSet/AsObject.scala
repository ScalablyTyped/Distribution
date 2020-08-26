package typings.libraCore.validatorSetPbMod.ValidatorSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var validatorPublicKeysList: js.Array[typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    validatorPublicKeysList: js.Array[typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(validatorPublicKeysList = validatorPublicKeysList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
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
    def setValidatorPublicKeysListVarargs(value: typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject*): Self = this.set("validatorPublicKeysList", js.Array(value :_*))
    @scala.inline
    def setValidatorPublicKeysList(value: js.Array[typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject]): Self = this.set("validatorPublicKeysList", value.asInstanceOf[js.Any])
  }
  
}

