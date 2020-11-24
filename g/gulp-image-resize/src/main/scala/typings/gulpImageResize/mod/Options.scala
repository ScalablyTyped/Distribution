package typings.gulpImageResize.mod

import typings.gm.mod.FilterType
import typings.gm.mod.GravityDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var background: js.UndefOr[String] = js.native
  
  var cover: js.UndefOr[Boolean] = js.native
  
  var crop: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[FilterType] = js.native
  
  var flatten: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var gravity: js.UndefOr[GravityDirection] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var imageMagick: js.UndefOr[Boolean] = js.native
  
  var interlace: js.UndefOr[Boolean] = js.native
  
  var noProfile: js.UndefOr[Boolean] = js.native
  
  var percentage: js.UndefOr[Double] = js.native
  
  var quality: js.UndefOr[Double] = js.native
  
  var samplingFactor: js.UndefOr[SamplingFactor] = js.native
  
  var sharpen: js.UndefOr[Boolean | String] = js.native
  
  var upscale: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setCover(value: Boolean): Self = this.set("cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCover: Self = this.set("cover", js.undefined)
    
    @scala.inline
    def setCrop(value: Boolean): Self = this.set("crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterType): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFlatten(value: Boolean): Self = this.set("flatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGravity(value: GravityDirection): Self = this.set("gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setImageMagick(value: Boolean): Self = this.set("imageMagick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageMagick: Self = this.set("imageMagick", js.undefined)
    
    @scala.inline
    def setInterlace(value: Boolean): Self = this.set("interlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterlace: Self = this.set("interlace", js.undefined)
    
    @scala.inline
    def setNoProfile(value: Boolean): Self = this.set("noProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoProfile: Self = this.set("noProfile", js.undefined)
    
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setSamplingFactor(value: SamplingFactor): Self = this.set("samplingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingFactor: Self = this.set("samplingFactor", js.undefined)
    
    @scala.inline
    def setSharpen(value: Boolean | String): Self = this.set("sharpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharpen: Self = this.set("sharpen", js.undefined)
    
    @scala.inline
    def setUpscale(value: Boolean): Self = this.set("upscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpscale: Self = this.set("upscale", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
