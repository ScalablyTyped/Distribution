package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accounts to search
  */
@js.native
trait SchemaAccountInfo extends js.Object {
  /**
    * A set of accounts to search.
    */
  var emails: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAccountInfo {
  @scala.inline
  def apply(): SchemaAccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountInfo]
  }
  @scala.inline
  implicit class SchemaAccountInfoOps[Self <: SchemaAccountInfo] (val x: Self) extends AnyVal {
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
    def setEmailsVarargs(value: String*): Self = this.set("emails", js.Array(value :_*))
    @scala.inline
    def setEmails(value: js.Array[String]): Self = this.set("emails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmails: Self = this.set("emails", js.undefined)
  }
  
}

