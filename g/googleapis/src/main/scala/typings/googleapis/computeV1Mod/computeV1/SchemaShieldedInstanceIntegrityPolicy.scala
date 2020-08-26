package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The policy describes the baseline against which Instance boot integrity is
  * measured.
  */
@js.native
trait SchemaShieldedInstanceIntegrityPolicy extends js.Object {
  /**
    * Updates the integrity policy baseline using the measurements from the VM
    * instance&#39;s most recent boot.
    */
  var updateAutoLearnPolicy: js.UndefOr[Boolean] = js.native
}

object SchemaShieldedInstanceIntegrityPolicy {
  @scala.inline
  def apply(): SchemaShieldedInstanceIntegrityPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedInstanceIntegrityPolicy]
  }
  @scala.inline
  implicit class SchemaShieldedInstanceIntegrityPolicyOps[Self <: SchemaShieldedInstanceIntegrityPolicy] (val x: Self) extends AnyVal {
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
    def setUpdateAutoLearnPolicy(value: Boolean): Self = this.set("updateAutoLearnPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateAutoLearnPolicy: Self = this.set("updateAutoLearnPolicy", js.undefined)
  }
  
}

