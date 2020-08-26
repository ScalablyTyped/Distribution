package typings.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google service account
  */
@js.native
trait SchemaGoogleServiceAccount extends js.Object {
  /**
    * Required.
    */
  var accountEmail: js.UndefOr[String] = js.native
}

object SchemaGoogleServiceAccount {
  @scala.inline
  def apply(): SchemaGoogleServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleServiceAccount]
  }
  @scala.inline
  implicit class SchemaGoogleServiceAccountOps[Self <: SchemaGoogleServiceAccount] (val x: Self) extends AnyVal {
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
    def setAccountEmail(value: String): Self = this.set("accountEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountEmail: Self = this.set("accountEmail", js.undefined)
  }
  
}

