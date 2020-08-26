package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s read-only photo. A picture shown next to the person&#39;s
  * name to help others recognize the person.
  */
@js.native
trait SchemaPhoto extends js.Object {
  /**
    * True if the photo is a default photo; false if the photo is a
    * user-provided photo.
    */
  var default: js.UndefOr[Boolean] = js.native
  /**
    * Metadata about the photo.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The URL of the photo. You can change the desired size by appending a
    * query parameter `sz=`&lt;var&gt;size&lt;/var&gt; at the end of the url.
    * Example:
    * `https://lh3.googleusercontent.com/-T_wVWLlmg7w/AAAAAAAAAAI/AAAAAAAABa8/00gzXvDBYqw/s100/photo.jpg?sz=50`
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaPhoto {
  @scala.inline
  def apply(): SchemaPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhoto]
  }
  @scala.inline
  implicit class SchemaPhotoOps[Self <: SchemaPhoto] (val x: Self) extends AnyVal {
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

