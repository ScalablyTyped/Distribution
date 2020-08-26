package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies an account and how to log into it.
  */
@js.native
trait SchemaAccount extends js.Object {
  /**
    * An automatic google login account.
    */
  var googleAuto: js.UndefOr[SchemaGoogleAuto] = js.native
}

object SchemaAccount {
  @scala.inline
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  @scala.inline
  implicit class SchemaAccountOps[Self <: SchemaAccount] (val x: Self) extends AnyVal {
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
    def setGoogleAuto(value: SchemaGoogleAuto): Self = this.set("googleAuto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleAuto: Self = this.set("googleAuto", js.undefined)
  }
  
}

