package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaScreen extends js.Object {
  /**
    * File reference of the png file. Required.
    */
  var fileReference: js.UndefOr[String] = js.native
  /**
    * Locale of the device that the screenshot was taken on. Required.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Model of the device that the screenshot was taken on. Required.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * OS version of the device that the screenshot was taken on. Required.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaScreen {
  @scala.inline
  def apply(): SchemaScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScreen]
  }
  @scala.inline
  implicit class SchemaScreenOps[Self <: SchemaScreen] (val x: Self) extends AnyVal {
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
    def setFileReference(value: String): Self = this.set("fileReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileReference: Self = this.set("fileReference", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

