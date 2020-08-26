package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an externalId entry.
  */
@js.native
trait SchemaUserExternalId extends js.Object {
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * The type of the Id.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The value of the id.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaUserExternalId {
  @scala.inline
  def apply(): SchemaUserExternalId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserExternalId]
  }
  @scala.inline
  implicit class SchemaUserExternalIdOps[Self <: SchemaUserExternalId] (val x: Self) extends AnyVal {
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
    def setCustomType(value: String): Self = this.set("customType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomType: Self = this.set("customType", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

