package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a website entry.
  */
@js.native
trait SchemaUserWebsite extends js.Object {
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * If this is user&#39;s primary website or not.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example website could be of home, work, blog etc. In addition to the
    * standard type, an entry can have a custom type and can give it any name.
    * Such types should have the CUSTOM value as type and also have a
    * customType value.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Website.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaUserWebsite {
  @scala.inline
  def apply(): SchemaUserWebsite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserWebsite]
  }
  @scala.inline
  implicit class SchemaUserWebsiteOps[Self <: SchemaUserWebsite] (val x: Self) extends AnyVal {
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
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
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

