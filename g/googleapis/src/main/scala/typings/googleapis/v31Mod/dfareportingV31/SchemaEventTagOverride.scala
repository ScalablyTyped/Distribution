package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event tag override information.
  */
@js.native
trait SchemaEventTagOverride extends js.Object {
  /**
    * Whether this override is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * ID of this event tag override. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaEventTagOverride {
  @scala.inline
  def apply(): SchemaEventTagOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventTagOverride]
  }
  @scala.inline
  implicit class SchemaEventTagOverrideOps[Self <: SchemaEventTagOverride] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

