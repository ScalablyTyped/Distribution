package typings.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColorStr extends js.Object {
  var backgroundColorStr: js.UndefOr[String] = js.native
  var bleedRatio: js.UndefOr[Double] = js.native
  var imageType: js.UndefOr[String] = js.native
  var layerFill: js.UndefOr[js.Object] = js.native
  var layerOutline: js.UndefOr[js.Object] = js.native
  var layerVisibility: js.UndefOr[js.Object] = js.native
  var layerWhere: js.UndefOr[js.Object] = js.native
  var mapCacheName: js.UndefOr[String] = js.native
  var mapCacheOption: js.UndefOr[String] = js.native
  var tag: js.UndefOr[String] = js.native
  var useQuadKeyForMapCacheName: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
}

object BackgroundColorStr {
  @scala.inline
  def apply(): BackgroundColorStr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorStr]
  }
  @scala.inline
  implicit class BackgroundColorStrOps[Self <: BackgroundColorStr] (val x: Self) extends AnyVal {
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
    def setBackgroundColorStr(value: String): Self = this.set("backgroundColorStr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColorStr: Self = this.set("backgroundColorStr", js.undefined)
    @scala.inline
    def setBleedRatio(value: Double): Self = this.set("bleedRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBleedRatio: Self = this.set("bleedRatio", js.undefined)
    @scala.inline
    def setImageType(value: String): Self = this.set("imageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageType: Self = this.set("imageType", js.undefined)
    @scala.inline
    def setLayerFill(value: js.Object): Self = this.set("layerFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerFill: Self = this.set("layerFill", js.undefined)
    @scala.inline
    def setLayerOutline(value: js.Object): Self = this.set("layerOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerOutline: Self = this.set("layerOutline", js.undefined)
    @scala.inline
    def setLayerVisibility(value: js.Object): Self = this.set("layerVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerVisibility: Self = this.set("layerVisibility", js.undefined)
    @scala.inline
    def setLayerWhere(value: js.Object): Self = this.set("layerWhere", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerWhere: Self = this.set("layerWhere", js.undefined)
    @scala.inline
    def setMapCacheName(value: String): Self = this.set("mapCacheName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapCacheName: Self = this.set("mapCacheName", js.undefined)
    @scala.inline
    def setMapCacheOption(value: String): Self = this.set("mapCacheOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapCacheOption: Self = this.set("mapCacheOption", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setUseQuadKeyForMapCacheName(value: Boolean): Self = this.set("useQuadKeyForMapCacheName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseQuadKeyForMapCacheName: Self = this.set("useQuadKeyForMapCacheName", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

