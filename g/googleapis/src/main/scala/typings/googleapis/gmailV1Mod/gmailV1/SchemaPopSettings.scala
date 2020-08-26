package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POP settings for an account.
  */
@js.native
trait SchemaPopSettings extends js.Object {
  /**
    * The range of messages which are accessible via POP.
    */
  var accessWindow: js.UndefOr[String] = js.native
  /**
    * The action that will be executed on a message after it has been fetched
    * via POP.
    */
  var disposition: js.UndefOr[String] = js.native
}

object SchemaPopSettings {
  @scala.inline
  def apply(): SchemaPopSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPopSettings]
  }
  @scala.inline
  implicit class SchemaPopSettingsOps[Self <: SchemaPopSettings] (val x: Self) extends AnyVal {
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
    def setAccessWindow(value: String): Self = this.set("accessWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessWindow: Self = this.set("accessWindow", js.undefined)
    @scala.inline
    def setDisposition(value: String): Self = this.set("disposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisposition: Self = this.set("disposition", js.undefined)
  }
  
}

