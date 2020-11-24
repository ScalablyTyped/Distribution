package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishingsInterface extends js.Object {
  
  var baling: js.UndefOr[FinishingBailing] = js.native
  
  var binding: js.UndefOr[FinishingBinding] = js.native
  
  var coating: js.UndefOr[FinishingCoating] = js.native
  
  var covering: js.UndefOr[FinishingCovering] = js.native
  
  var `finishing-template`: js.UndefOr[Finishings] = js.native
  
  var folding: js.UndefOr[js.Array[FinishingFolding]] = js.native
  
  var `imposition-template`: js.UndefOr[ImpositionTemplate] = js.native
  
  var laminating: js.UndefOr[FinishingLaminating] = js.native
  
  var `media-sheets-supported`: js.UndefOr[String] = js.native
  
  var `media-size`: js.UndefOr[MediaSize] = js.native
  
  var `media-size-name`: js.UndefOr[String] = js.native
  
  var punching: js.UndefOr[FinishingPunching] = js.native
  
  var stitching: js.UndefOr[FinishingStitching] = js.native
  
  var trimming: js.UndefOr[js.Array[FinishingTrimming]] = js.native
}
object FinishingsInterface {
  
  @scala.inline
  def apply(): FinishingsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingsInterface]
  }
  
  @scala.inline
  implicit class FinishingsInterfaceOps[Self <: FinishingsInterface] (val x: Self) extends AnyVal {
    
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
    def setBaling(value: FinishingBailing): Self = this.set("baling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaling: Self = this.set("baling", js.undefined)
    
    @scala.inline
    def setBinding(value: FinishingBinding): Self = this.set("binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinding: Self = this.set("binding", js.undefined)
    
    @scala.inline
    def setCoating(value: FinishingCoating): Self = this.set("coating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoating: Self = this.set("coating", js.undefined)
    
    @scala.inline
    def setCovering(value: FinishingCovering): Self = this.set("covering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCovering: Self = this.set("covering", js.undefined)
    
    @scala.inline
    def `setFinishing-template`(value: Finishings): Self = this.set("finishing-template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFinishing-template`: Self = this.set("finishing-template", js.undefined)
    
    @scala.inline
    def setFoldingVarargs(value: FinishingFolding*): Self = this.set("folding", js.Array(value :_*))
    
    @scala.inline
    def setFolding(value: js.Array[FinishingFolding]): Self = this.set("folding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolding: Self = this.set("folding", js.undefined)
    
    @scala.inline
    def `setImposition-template`(value: ImpositionTemplate): Self = this.set("imposition-template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteImposition-template`: Self = this.set("imposition-template", js.undefined)
    
    @scala.inline
    def setLaminating(value: FinishingLaminating): Self = this.set("laminating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaminating: Self = this.set("laminating", js.undefined)
    
    @scala.inline
    def `setMedia-sheets-supported`(value: String): Self = this.set("media-sheets-supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-sheets-supported`: Self = this.set("media-sheets-supported", js.undefined)
    
    @scala.inline
    def `setMedia-size`(value: MediaSize): Self = this.set("media-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-size`: Self = this.set("media-size", js.undefined)
    
    @scala.inline
    def `setMedia-size-name`(value: String): Self = this.set("media-size-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-size-name`: Self = this.set("media-size-name", js.undefined)
    
    @scala.inline
    def setPunching(value: FinishingPunching): Self = this.set("punching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePunching: Self = this.set("punching", js.undefined)
    
    @scala.inline
    def setStitching(value: FinishingStitching): Self = this.set("stitching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStitching: Self = this.set("stitching", js.undefined)
    
    @scala.inline
    def setTrimmingVarargs(value: FinishingTrimming*): Self = this.set("trimming", js.Array(value :_*))
    
    @scala.inline
    def setTrimming(value: js.Array[FinishingTrimming]): Self = this.set("trimming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimming: Self = this.set("trimming", js.undefined)
  }
}
