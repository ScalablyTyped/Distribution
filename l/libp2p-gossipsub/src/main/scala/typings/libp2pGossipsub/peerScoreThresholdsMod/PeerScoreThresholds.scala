package typings.libp2pGossipsub.peerScoreThresholdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerScoreThresholds extends js.Object {
  
  /**
    * acceptPXThreshold is the score threshold below which PX will be ignored; this should be positive
    * and limited to scores attainable by bootstrappers and other trusted nodes.
    */
  var acceptPXThreshold: Double = js.native
  
  /**
    * gossipThreshold is the score threshold below which gossip propagation is supressed;
    * should be negative.
    */
  var gossipThreshold: Double = js.native
  
  /**
    * graylistThreshold is the score threshold below which message processing is supressed altogether,
    * implementing an effective graylist according to peer score; should be negative and <= PublisThreshold.
    */
  var graylistThreshold: Double = js.native
  
  /**
    * opportunisticGraftThreshold is the median mesh score threshold before triggering opportunistic
    * grafting; this should have a small positive value.
    */
  var opportunisticGraftThreshold: Double = js.native
  
  /**
    * publishThreshold is the score threshold below which we shouldn't publish when using flood
    * publishing (also applies to fanout and floodsub peers); should be negative and <= GossipThreshold.
    */
  var publishThreshold: Double = js.native
}
object PeerScoreThresholds {
  
  @scala.inline
  def apply(
    acceptPXThreshold: Double,
    gossipThreshold: Double,
    graylistThreshold: Double,
    opportunisticGraftThreshold: Double,
    publishThreshold: Double
  ): PeerScoreThresholds = {
    val __obj = js.Dynamic.literal(acceptPXThreshold = acceptPXThreshold.asInstanceOf[js.Any], gossipThreshold = gossipThreshold.asInstanceOf[js.Any], graylistThreshold = graylistThreshold.asInstanceOf[js.Any], opportunisticGraftThreshold = opportunisticGraftThreshold.asInstanceOf[js.Any], publishThreshold = publishThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerScoreThresholds]
  }
  
  @scala.inline
  implicit class PeerScoreThresholdsOps[Self <: PeerScoreThresholds] (val x: Self) extends AnyVal {
    
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
    def setGossipThreshold(value: Double): Self = this.set("gossipThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraylistThreshold(value: Double): Self = this.set("graylistThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpportunisticGraftThreshold(value: Double): Self = this.set("opportunisticGraftThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishThreshold(value: Double): Self = this.set("publishThreshold", value.asInstanceOf[js.Any])
  }
}
