package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishingPunching extends js.Object {
  
  var `punching-locations`: js.UndefOr[js.Array[Double]] = js.native
  
  var `punching-offset`: js.UndefOr[Double] = js.native
  
  var `punching-reference-edge`: js.UndefOr[ReferenceEdge] = js.native
}
object FinishingPunching {
  
  @scala.inline
  def apply(): FinishingPunching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingPunching]
  }
  
  @scala.inline
  implicit class FinishingPunchingOps[Self <: FinishingPunching] (val x: Self) extends AnyVal {
    
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
    def `setPunching-locationsVarargs`(value: Double*): Self = this.set("punching-locations", js.Array(value :_*))
    
    @scala.inline
    def `setPunching-locations`(value: js.Array[Double]): Self = this.set("punching-locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePunching-locations`: Self = this.set("punching-locations", js.undefined)
    
    @scala.inline
    def `setPunching-offset`(value: Double): Self = this.set("punching-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePunching-offset`: Self = this.set("punching-offset", js.undefined)
    
    @scala.inline
    def `setPunching-reference-edge`(value: ReferenceEdge): Self = this.set("punching-reference-edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePunching-reference-edge`: Self = this.set("punching-reference-edge", js.undefined)
  }
}
