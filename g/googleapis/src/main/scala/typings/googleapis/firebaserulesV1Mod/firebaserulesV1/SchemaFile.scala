package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `File` containing source content.
  */
@js.native
trait SchemaFile extends js.Object {
  /**
    * Textual Content.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * Fingerprint (e.g. github sha) associated with the `File`.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * File name.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaFile {
  @scala.inline
  def apply(): SchemaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFile]
  }
  @scala.inline
  implicit class SchemaFileOps[Self <: SchemaFile] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

