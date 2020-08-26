package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Groups advertisers together so that reports can be generated for the entire
  * group at once.
  */
@js.native
trait SchemaAdvertiserGroup extends js.Object {
  /**
    * Account ID of this advertiser group. This is a read-only field that can
    * be left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * ID of this advertiser group. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertiserGroup&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this advertiser group. This is a required field and must be less
    * than 256 characters long and unique among advertiser groups of the same
    * account.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaAdvertiserGroup {
  @scala.inline
  def apply(): SchemaAdvertiserGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserGroup]
  }
  @scala.inline
  implicit class SchemaAdvertiserGroupOps[Self <: SchemaAdvertiserGroup] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

