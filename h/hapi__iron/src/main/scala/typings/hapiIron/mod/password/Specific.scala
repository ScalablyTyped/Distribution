package typings.hapiIron.mod.password

import typings.hapiIron.mod.Password_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  Secret object with optional id and specified password for each encryption and integrity.
  */
@js.native
trait Specific extends js.Object {
  var encryption: Password_ = js.native
  var id: js.UndefOr[String] = js.native
  var integrity: Password_ = js.native
}

object Specific {
  @scala.inline
  def apply(encryption: Password_, integrity: Password_): Specific = {
    val __obj = js.Dynamic.literal(encryption = encryption.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specific]
  }
  @scala.inline
  implicit class SpecificOps[Self <: Specific] (val x: Self) extends AnyVal {
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
    def setEncryption(value: Password_): Self = this.set("encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegrity(value: Password_): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

