package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scan authentication configuration.
  */
@js.native
trait SchemaAuthentication extends js.Object {
  /**
    * Authentication using a custom account.
    */
  var customAccount: js.UndefOr[SchemaCustomAccount] = js.native
  /**
    * Authentication using a Google account.
    */
  var googleAccount: js.UndefOr[SchemaGoogleAccount] = js.native
}

object SchemaAuthentication {
  @scala.inline
  def apply(): SchemaAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthentication]
  }
  @scala.inline
  implicit class SchemaAuthenticationOps[Self <: SchemaAuthentication] (val x: Self) extends AnyVal {
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
    def setCustomAccount(value: SchemaCustomAccount): Self = this.set("customAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAccount: Self = this.set("customAccount", js.undefined)
    @scala.inline
    def setGoogleAccount(value: SchemaGoogleAccount): Self = this.set("googleAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleAccount: Self = this.set("googleAccount", js.undefined)
  }
  
}

