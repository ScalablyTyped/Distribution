package typings.howler.anon

import typings.howler.howlerStrings.HRTF
import typings.howler.howlerStrings.equalpower
import typings.howler.howlerStrings.inverse
import typings.howler.howlerStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConeInnerAngle extends js.Object {
  
  var coneInnerAngle: js.UndefOr[Double] = js.native
  
  var coneOuterAngle: js.UndefOr[Double] = js.native
  
  var coneOuterGain: js.UndefOr[Double] = js.native
  
  var distanceModel: inverse | linear = js.native
  
  var maxDistance: Double = js.native
  
  var panningModel: HRTF | equalpower = js.native
  
  var refDistance: Double = js.native
  
  var rolloffFactor: Double = js.native
}
object ConeInnerAngle {
  
  @scala.inline
  def apply(
    distanceModel: inverse | linear,
    maxDistance: Double,
    panningModel: HRTF | equalpower,
    refDistance: Double,
    rolloffFactor: Double
  ): ConeInnerAngle = {
    val __obj = js.Dynamic.literal(distanceModel = distanceModel.asInstanceOf[js.Any], maxDistance = maxDistance.asInstanceOf[js.Any], panningModel = panningModel.asInstanceOf[js.Any], refDistance = refDistance.asInstanceOf[js.Any], rolloffFactor = rolloffFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConeInnerAngle]
  }
  
  @scala.inline
  implicit class ConeInnerAngleOps[Self <: ConeInnerAngle] (val x: Self) extends AnyVal {
    
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
    def setDistanceModel(value: inverse | linear): Self = this.set("distanceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDistance(value: Double): Self = this.set("maxDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanningModel(value: HRTF | equalpower): Self = this.set("panningModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefDistance(value: Double): Self = this.set("refDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolloffFactor(value: Double): Self = this.set("rolloffFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConeInnerAngle(value: Double): Self = this.set("coneInnerAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConeInnerAngle: Self = this.set("coneInnerAngle", js.undefined)
    
    @scala.inline
    def setConeOuterAngle(value: Double): Self = this.set("coneOuterAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConeOuterAngle: Self = this.set("coneOuterAngle", js.undefined)
    
    @scala.inline
    def setConeOuterGain(value: Double): Self = this.set("coneOuterGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConeOuterGain: Self = this.set("coneOuterGain", js.undefined)
  }
}
