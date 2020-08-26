package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for About (notes) of a user in Directory API.
  */
@js.native
trait SchemaUserAbout extends js.Object {
  /**
    * About entry can have a type which indicates the content type. It can
    * either be plain or html. By default, notes contents are assumed to
    * contain plain text.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Actual value of notes.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaUserAbout {
  @scala.inline
  def apply(): SchemaUserAbout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAbout]
  }
  @scala.inline
  implicit class SchemaUserAboutOps[Self <: SchemaUserAbout] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

