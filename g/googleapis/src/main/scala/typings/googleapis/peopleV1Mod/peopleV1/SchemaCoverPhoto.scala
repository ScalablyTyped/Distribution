package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s read-only cover photo. A large image shown on the
  * person&#39;s profile page that represents who they are or what they care
  * about.
  */
@js.native
trait SchemaCoverPhoto extends js.Object {
  /**
    * True if the cover photo is the default cover photo; false if the cover
    * photo is a user-provided cover photo.
    */
  var default: js.UndefOr[Boolean] = js.native
  /**
    * Metadata about the cover photo.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The URL of the cover photo.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaCoverPhoto {
  @scala.inline
  def apply(): SchemaCoverPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCoverPhoto]
  }
  @scala.inline
  implicit class SchemaCoverPhotoOps[Self <: SchemaCoverPhoto] (val x: Self) extends AnyVal {
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
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

