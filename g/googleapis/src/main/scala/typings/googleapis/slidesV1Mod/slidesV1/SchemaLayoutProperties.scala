package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of Page are only relevant for pages with page_type LAYOUT.
  */
@js.native
trait SchemaLayoutProperties extends js.Object {
  /**
    * The human-readable name of the layout.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The object ID of the master that this layout is based on.
    */
  var masterObjectId: js.UndefOr[String] = js.native
  /**
    * The name of the layout.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaLayoutProperties {
  @scala.inline
  def apply(): SchemaLayoutProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayoutProperties]
  }
  @scala.inline
  implicit class SchemaLayoutPropertiesOps[Self <: SchemaLayoutProperties] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setMasterObjectId(value: String): Self = this.set("masterObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterObjectId: Self = this.set("masterObjectId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

