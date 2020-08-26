package typings.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An image.
  */
@js.native
trait SchemaImage extends js.Object {
  /**
    * The URL of the image. For crawled images, this is the provided URL. For
    * uploaded images, this is a serving URL from Google if the image has been
    * processed successfully.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * The status of the image. @OutputOnly
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The type of the image, i.e., crawled or uploaded. @OutputOnly
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaImage {
  @scala.inline
  def apply(): SchemaImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImage]
  }
  @scala.inline
  implicit class SchemaImageOps[Self <: SchemaImage] (val x: Self) extends AnyVal {
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
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

