package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describe image data.
  */
@js.native
trait SchemaImage extends js.Object {
  /**
    * Image data in format determined by the mime type. Currently, the format
    * will always be &quot;image/png&quot;, but this might change in the
    * future.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The mime-type of the image data.
    */
  var mimeType: js.UndefOr[String] = js.native
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
  }
  
}

