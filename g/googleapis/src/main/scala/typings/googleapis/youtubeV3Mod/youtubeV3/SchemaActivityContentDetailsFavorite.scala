package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a video that was marked as a favorite video.
  */
@js.native
trait SchemaActivityContentDetailsFavorite extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource
    * that was marked as a favorite.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}

object SchemaActivityContentDetailsFavorite {
  @scala.inline
  def apply(): SchemaActivityContentDetailsFavorite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsFavorite]
  }
  @scala.inline
  implicit class SchemaActivityContentDetailsFavoriteOps[Self <: SchemaActivityContentDetailsFavorite] (val x: Self) extends AnyVal {
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
    def setResourceId(value: SchemaResourceId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
  }
  
}

