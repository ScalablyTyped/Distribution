package typings.jqueryGalleria.GalleriaJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GalleriaOptions extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.native
  var dataSource: js.Array[GalleriaEntry] = js.native
  var lightbox: js.UndefOr[Boolean] = js.native
}

object GalleriaOptions {
  @scala.inline
  def apply(dataSource: js.Array[GalleriaEntry]): GalleriaOptions = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleriaOptions]
  }
  @scala.inline
  implicit class GalleriaOptionsOps[Self <: GalleriaOptions] (val x: Self) extends AnyVal {
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
    def setDataSourceVarargs(value: GalleriaEntry*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[GalleriaEntry]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setLightbox(value: Boolean): Self = this.set("lightbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightbox: Self = this.set("lightbox", js.undefined)
  }
  
}

