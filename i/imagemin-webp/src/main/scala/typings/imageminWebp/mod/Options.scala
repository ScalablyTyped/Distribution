package typings.imageminWebp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Set transparency-compression quality between 0 and 100.
    * @default 100
    */
  var alphaQuality: js.UndefOr[Double] = js.native
  
  /**
    * Adjust filter strength automatically.
    * @default false
    */
  var autoFilter: js.UndefOr[Boolean] = js.native
  
  /**
    * Crop the image.
    */
  var crop: js.UndefOr[Crop] = js.native
  
  /**
    * Set deblocking filter strength between 0 (off) and 100.
    */
  var filter: js.UndefOr[Double] = js.native
  
  /**
    * Encode images losslessly.
    * @default false
    */
  var lossless: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of metadata to copy from the input to the output if present.
    */
  var metadata: js.UndefOr[Metadata | js.Array[Metadata]] = js.native
  
  /**
    * Specify the compression method to use,
    * between 0 (fastest) and 6 (slowest).
    * This parameter controls the trade off between encoding speed
    * and the compressed file size and quality.
    * @default 4
    */
  var method: js.UndefOr[Double] = js.native
  
  /**
    * Encode losslessly with an additional lossy pre-processing step,
    * with a quality factor between
    * 0 (maximum pre-processing) and 100 (same as lossless).
    * @default 100
    */
  var nearLossless: js.UndefOr[Double] = js.native
  
  /**
    * Preset setting.
    * @default default
    */
  var preset: js.UndefOr[Preset] = js.native
  
  /**
    * Set quality factor between 0 and 100.
    * @default 75
    */
  var quality: js.UndefOr[Double] = js.native
  
  /**
    * Resize the image. Happens after crop.
    */
  var resize: js.UndefOr[Resize] = js.native
  
  /**
    * Set filter sharpness between 0 (sharpest) and 7 (least sharp).
    * @default 0
    */
  var sharpness: js.UndefOr[Double] = js.native
  
  /**
    * Set target size in bytes.
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * Set the amplitude of spatial noise shaping between 0 and 100.
    * @default 80
    */
  var sns: js.UndefOr[Double] = js.native
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
    def setAlphaQuality(value: Double): Self = this.set("alphaQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaQuality: Self = this.set("alphaQuality", js.undefined)
    
    @scala.inline
    def setAutoFilter(value: Boolean): Self = this.set("autoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFilter: Self = this.set("autoFilter", js.undefined)
    
    @scala.inline
    def setCrop(value: Crop): Self = this.set("crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    
    @scala.inline
    def setFilter(value: Double): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLossless(value: Boolean): Self = this.set("lossless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLossless: Self = this.set("lossless", js.undefined)
    
    @scala.inline
    def setMetadataVarargs(value: Metadata*): Self = this.set("metadata", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: Metadata | js.Array[Metadata]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMethod(value: Double): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setNearLossless(value: Double): Self = this.set("nearLossless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNearLossless: Self = this.set("nearLossless", js.undefined)
    
    @scala.inline
    def setPreset(value: Preset): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setResize(value: Resize): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setSharpness(value: Double): Self = this.set("sharpness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharpness: Self = this.set("sharpness", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSns(value: Double): Self = this.set("sns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSns: Self = this.set("sns", js.undefined)
  }
}
