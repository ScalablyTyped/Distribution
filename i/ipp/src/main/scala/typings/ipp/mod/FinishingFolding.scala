package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishingFolding extends js.Object {
  
  var `folding-direction`: js.UndefOr[FoldingDirection] = js.native
  
  var `folding-offset`: js.UndefOr[Double] = js.native
  
  var `folding-reference-edge`: js.UndefOr[ReferenceEdge] = js.native
}
object FinishingFolding {
  
  @scala.inline
  def apply(): FinishingFolding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingFolding]
  }
  
  @scala.inline
  implicit class FinishingFoldingOps[Self <: FinishingFolding] (val x: Self) extends AnyVal {
    
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
    def `setFolding-direction`(value: FoldingDirection): Self = this.set("folding-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFolding-direction`: Self = this.set("folding-direction", js.undefined)
    
    @scala.inline
    def `setFolding-offset`(value: Double): Self = this.set("folding-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFolding-offset`: Self = this.set("folding-offset", js.undefined)
    
    @scala.inline
    def `setFolding-reference-edge`(value: ReferenceEdge): Self = this.set("folding-reference-edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFolding-reference-edge`: Self = this.set("folding-reference-edge", js.undefined)
  }
}
