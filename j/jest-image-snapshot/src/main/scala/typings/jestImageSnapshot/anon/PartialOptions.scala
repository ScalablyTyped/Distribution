package typings.jestImageSnapshot.anon

import typings.jestImageSnapshot.jestImageSnapshotBooleans.`false`
import typings.jestImageSnapshot.jestImageSnapshotStrings.bezkrovny
import typings.jestImageSnapshot.jestImageSnapshotStrings.fast
import typings.jestImageSnapshot.jestImageSnapshotStrings.integer
import typings.jestImageSnapshot.jestImageSnapshotStrings.original
import typings.jestImageSnapshot.jestImageSnapshotStrings.weber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ssim.js.ssim.js.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var bitDepth: js.UndefOr[Double] = js.native
  
  var downsample: js.UndefOr[original | fast | `false`] = js.native
  
  var k1: js.UndefOr[Double] = js.native
  
  var k2: js.UndefOr[Double] = js.native
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var rgb2grayVersion: js.UndefOr[original | integer] = js.native
  
  var ssim: js.UndefOr[fast | original | bezkrovny | weber] = js.native
  
  var windowSize: js.UndefOr[Double] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
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
    def setBitDepth(value: Double): Self = this.set("bitDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitDepth: Self = this.set("bitDepth", js.undefined)
    
    @scala.inline
    def setDownsample(value: original | fast | `false`): Self = this.set("downsample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownsample: Self = this.set("downsample", js.undefined)
    
    @scala.inline
    def setK1(value: Double): Self = this.set("k1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK1: Self = this.set("k1", js.undefined)
    
    @scala.inline
    def setK2(value: Double): Self = this.set("k2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK2: Self = this.set("k2", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setRgb2grayVersion(value: original | integer): Self = this.set("rgb2grayVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRgb2grayVersion: Self = this.set("rgb2grayVersion", js.undefined)
    
    @scala.inline
    def setSsim(value: fast | original | bezkrovny | weber): Self = this.set("ssim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsim: Self = this.set("ssim", js.undefined)
    
    @scala.inline
    def setWindowSize(value: Double): Self = this.set("windowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowSize: Self = this.set("windowSize", js.undefined)
  }
}
