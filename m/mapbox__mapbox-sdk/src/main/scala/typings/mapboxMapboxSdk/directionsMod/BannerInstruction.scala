package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BannerInstruction extends js.Object {
  
  /**
    * Float indicating in meters, how far from the upcoming maneuver
    * the banner instruction should begin being displayed. Only 1 banner should be displayed at a time.
    */
  var distanceAlongGeometry: Double = js.native
  
  /**
    * Most important content to display to the user. Our SDK displays this text larger and at the top.
    */
  var primary: Instruction = js.native
  
  /**
    * Additional content useful for visual guidance. Our SDK displays this text slightly smaller and below the primary. Can be null.
    */
  var secondary: js.UndefOr[js.Array[Instruction]] = js.native
  
  /**
    * Additional information that is included if we feel the driver needs a heads up about something.
    * Can include information about the next maneuver (the one after the upcoming one) if the step is short -
    * can be null, or can be lane information. If we have lane information, that trumps information about the next maneuver.
    */
  var sub: js.UndefOr[Sub] = js.native
  
  var `then`: js.UndefOr[js.Any] = js.native
}
object BannerInstruction {
  
  @scala.inline
  def apply(distanceAlongGeometry: Double, primary: Instruction): BannerInstruction = {
    val __obj = js.Dynamic.literal(distanceAlongGeometry = distanceAlongGeometry.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerInstruction]
  }
  
  @scala.inline
  implicit class BannerInstructionOps[Self <: BannerInstruction] (val x: Self) extends AnyVal {
    
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
    def setDistanceAlongGeometry(value: Double): Self = this.set("distanceAlongGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary(value: Instruction): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryVarargs(value: Instruction*): Self = this.set("secondary", js.Array(value :_*))
    
    @scala.inline
    def setSecondary(value: js.Array[Instruction]): Self = this.set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    
    @scala.inline
    def setSub(value: Sub): Self = this.set("sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSub: Self = this.set("sub", js.undefined)
    
    @scala.inline
    def setThen(value: js.Any): Self = this.set("then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThen: Self = this.set("then", js.undefined)
  }
}
