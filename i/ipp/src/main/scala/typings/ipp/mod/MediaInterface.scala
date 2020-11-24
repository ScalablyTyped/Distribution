package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaInterface extends js.Object {
  
  var `media-back-coating`: js.UndefOr[MediaCoating] = js.native
  
  var `media-bottom-margin`: js.UndefOr[Double] = js.native
  
  var `media-color`: js.UndefOr[MediaColor] = js.native
  
  var `media-front-coating`: js.UndefOr[MediaCoating] = js.native
  
  var `media-grain`: js.UndefOr[MediaGrain] = js.native
  
  var `media-hole-count`: js.UndefOr[Double] = js.native
  
  var `media-info`: js.UndefOr[String] = js.native
  
  var `media-key`: js.UndefOr[MediaSizeName | MediaName] = js.native
  
  var `media-left-margin`: js.UndefOr[Double] = js.native
  
  var `media-order-count`: js.UndefOr[Double] = js.native
  
  var `media-pre-printed`: js.UndefOr[MediaPrePrinted] = js.native
  
  var `media-recycled`: js.UndefOr[MediaPrePrinted] = js.native
  
  var `media-right-margin`: js.UndefOr[Double] = js.native
  
  var `media-size`: js.UndefOr[MediaSize] = js.native
  
  var `media-size-name`: js.UndefOr[MediaSizeName] = js.native
  
  var `media-source`: js.UndefOr[MediaSource] = js.native
  
  var `media-thickness`: js.UndefOr[Double] = js.native
  
  var `media-tooth`: js.UndefOr[MediaTooth] = js.native
  
  var `media-top-margin`: js.UndefOr[Double] = js.native
  
  var `media-type`: js.UndefOr[MediaType] = js.native
  
  var `media-weight-metric`: js.UndefOr[Double] = js.native
}
object MediaInterface {
  
  @scala.inline
  def apply(): MediaInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaInterface]
  }
  
  @scala.inline
  implicit class MediaInterfaceOps[Self <: MediaInterface] (val x: Self) extends AnyVal {
    
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
    def `setMedia-back-coating`(value: MediaCoating): Self = this.set("media-back-coating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-back-coating`: Self = this.set("media-back-coating", js.undefined)
    
    @scala.inline
    def `setMedia-bottom-margin`(value: Double): Self = this.set("media-bottom-margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-bottom-margin`: Self = this.set("media-bottom-margin", js.undefined)
    
    @scala.inline
    def `setMedia-color`(value: MediaColor): Self = this.set("media-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-color`: Self = this.set("media-color", js.undefined)
    
    @scala.inline
    def `setMedia-front-coating`(value: MediaCoating): Self = this.set("media-front-coating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-front-coating`: Self = this.set("media-front-coating", js.undefined)
    
    @scala.inline
    def `setMedia-grain`(value: MediaGrain): Self = this.set("media-grain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-grain`: Self = this.set("media-grain", js.undefined)
    
    @scala.inline
    def `setMedia-hole-count`(value: Double): Self = this.set("media-hole-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-hole-count`: Self = this.set("media-hole-count", js.undefined)
    
    @scala.inline
    def `setMedia-info`(value: String): Self = this.set("media-info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-info`: Self = this.set("media-info", js.undefined)
    
    @scala.inline
    def `setMedia-key`(value: MediaSizeName | MediaName): Self = this.set("media-key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-key`: Self = this.set("media-key", js.undefined)
    
    @scala.inline
    def `setMedia-left-margin`(value: Double): Self = this.set("media-left-margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-left-margin`: Self = this.set("media-left-margin", js.undefined)
    
    @scala.inline
    def `setMedia-order-count`(value: Double): Self = this.set("media-order-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-order-count`: Self = this.set("media-order-count", js.undefined)
    
    @scala.inline
    def `setMedia-pre-printed`(value: MediaPrePrinted): Self = this.set("media-pre-printed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-pre-printed`: Self = this.set("media-pre-printed", js.undefined)
    
    @scala.inline
    def `setMedia-recycled`(value: MediaPrePrinted): Self = this.set("media-recycled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-recycled`: Self = this.set("media-recycled", js.undefined)
    
    @scala.inline
    def `setMedia-right-margin`(value: Double): Self = this.set("media-right-margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-right-margin`: Self = this.set("media-right-margin", js.undefined)
    
    @scala.inline
    def `setMedia-size`(value: MediaSize): Self = this.set("media-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-size`: Self = this.set("media-size", js.undefined)
    
    @scala.inline
    def `setMedia-size-name`(value: MediaSizeName): Self = this.set("media-size-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-size-name`: Self = this.set("media-size-name", js.undefined)
    
    @scala.inline
    def `setMedia-source`(value: MediaSource): Self = this.set("media-source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-source`: Self = this.set("media-source", js.undefined)
    
    @scala.inline
    def `setMedia-thickness`(value: Double): Self = this.set("media-thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-thickness`: Self = this.set("media-thickness", js.undefined)
    
    @scala.inline
    def `setMedia-tooth`(value: MediaTooth): Self = this.set("media-tooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-tooth`: Self = this.set("media-tooth", js.undefined)
    
    @scala.inline
    def `setMedia-top-margin`(value: Double): Self = this.set("media-top-margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-top-margin`: Self = this.set("media-top-margin", js.undefined)
    
    @scala.inline
    def `setMedia-type`(value: MediaType): Self = this.set("media-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-type`: Self = this.set("media-type", js.undefined)
    
    @scala.inline
    def `setMedia-weight-metric`(value: Double): Self = this.set("media-weight-metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-weight-metric`: Self = this.set("media-weight-metric", js.undefined)
  }
}
