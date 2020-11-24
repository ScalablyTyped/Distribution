package typings.libp2pGossipsub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub/src/score/peer-score-thresholds.PeerScoreThresholds> */
@js.native
trait PartialPeerScoreThreshold extends js.Object {
  
  var acceptPXThreshold: js.UndefOr[Double] = js.native
  
  var gossipThreshold: js.UndefOr[Double] = js.native
  
  var graylistThreshold: js.UndefOr[Double] = js.native
  
  var opportunisticGraftThreshold: js.UndefOr[Double] = js.native
  
  var publishThreshold: js.UndefOr[Double] = js.native
}
object PartialPeerScoreThreshold {
  
  @scala.inline
  def apply(): PartialPeerScoreThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPeerScoreThreshold]
  }
  
  @scala.inline
  implicit class PartialPeerScoreThresholdOps[Self <: PartialPeerScoreThreshold] (val x: Self) extends AnyVal {
    
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
    def setAcceptPXThreshold(value: Double): Self = this.set("acceptPXThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptPXThreshold: Self = this.set("acceptPXThreshold", js.undefined)
    
    @scala.inline
    def setGossipThreshold(value: Double): Self = this.set("gossipThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGossipThreshold: Self = this.set("gossipThreshold", js.undefined)
    
    @scala.inline
    def setGraylistThreshold(value: Double): Self = this.set("graylistThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraylistThreshold: Self = this.set("graylistThreshold", js.undefined)
    
    @scala.inline
    def setOpportunisticGraftThreshold(value: Double): Self = this.set("opportunisticGraftThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpportunisticGraftThreshold: Self = this.set("opportunisticGraftThreshold", js.undefined)
    
    @scala.inline
    def setPublishThreshold(value: Double): Self = this.set("publishThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishThreshold: Self = this.set("publishThreshold", js.undefined)
  }
}
