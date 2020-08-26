package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Shielded Instance Identity Entry.
  */
@js.native
trait SchemaShieldedInstanceIdentityEntry extends js.Object {
  /**
    * A PEM-encoded X.509 certificate. This field can be empty.
    */
  var ekCert: js.UndefOr[String] = js.native
  /**
    * A PEM-encoded public key.
    */
  var ekPub: js.UndefOr[String] = js.native
}

object SchemaShieldedInstanceIdentityEntry {
  @scala.inline
  def apply(): SchemaShieldedInstanceIdentityEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedInstanceIdentityEntry]
  }
  @scala.inline
  implicit class SchemaShieldedInstanceIdentityEntryOps[Self <: SchemaShieldedInstanceIdentityEntry] (val x: Self) extends AnyVal {
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
    def setEkCert(value: String): Self = this.set("ekCert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEkCert: Self = this.set("ekCert", js.undefined)
    @scala.inline
    def setEkPub(value: String): Self = this.set("ekPub", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEkPub: Self = this.set("ekPub", js.undefined)
  }
  
}

