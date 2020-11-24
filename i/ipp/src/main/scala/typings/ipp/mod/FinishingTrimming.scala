package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishingTrimming extends js.Object {
  
  var `trimming-offset`: js.UndefOr[Double] = js.native
  
  var `trimming-reference-edge`: js.UndefOr[ReferenceEdge] = js.native
  
  var `trimming-type`: js.UndefOr[TrimmingType] = js.native
  
  var `trimming-when`: js.UndefOr[String] = js.native
}
object FinishingTrimming {
  
  @scala.inline
  def apply(): FinishingTrimming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingTrimming]
  }
  
  @scala.inline
  implicit class FinishingTrimmingOps[Self <: FinishingTrimming] (val x: Self) extends AnyVal {
    
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
    def `setTrimming-offset`(value: Double): Self = this.set("trimming-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTrimming-offset`: Self = this.set("trimming-offset", js.undefined)
    
    @scala.inline
    def `setTrimming-reference-edge`(value: ReferenceEdge): Self = this.set("trimming-reference-edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTrimming-reference-edge`: Self = this.set("trimming-reference-edge", js.undefined)
    
    @scala.inline
    def `setTrimming-type`(value: TrimmingType): Self = this.set("trimming-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTrimming-type`: Self = this.set("trimming-type", js.undefined)
    
    @scala.inline
    def `setTrimming-when`(value: String): Self = this.set("trimming-when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTrimming-when`: Self = this.set("trimming-when", js.undefined)
  }
}
