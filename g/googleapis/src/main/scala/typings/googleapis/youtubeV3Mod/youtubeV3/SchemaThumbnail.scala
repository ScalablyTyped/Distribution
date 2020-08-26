package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A thumbnail is an image representing a YouTube resource.
  */
@js.native
trait SchemaThumbnail extends js.Object {
  /**
    * (Optional) Height of the thumbnail image.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The thumbnail image&#39;s URL.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * (Optional) Width of the thumbnail image.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaThumbnail {
  @scala.inline
  def apply(): SchemaThumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThumbnail]
  }
  @scala.inline
  implicit class SchemaThumbnailOps[Self <: SchemaThumbnail] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

