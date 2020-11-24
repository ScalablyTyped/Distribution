package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bubbles extends js.Object {
  
  var bubbles: Circles = js.native
  
  var circles: Circles = js.native
  
  var circular: Dur = js.native
  
  var crescent: Fn = js.native
  
  var dots: CirclesDur = js.native
  
  var lines: Lines = js.native
  
  var `lines-small`: Lines = js.native
}
object Bubbles {
  
  @scala.inline
  def apply(
    bubbles: Circles,
    circles: Circles,
    circular: Dur,
    crescent: Fn,
    dots: CirclesDur,
    lines: Lines,
    `lines-small`: Lines
  ): Bubbles = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], circles = circles.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], crescent = crescent.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.updateDynamic("lines-small")(`lines-small`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bubbles]
  }
  
  @scala.inline
  implicit class BubblesOps[Self <: Bubbles] (val x: Self) extends AnyVal {
    
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
    def setBubbles(value: Circles): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircles(value: Circles): Self = this.set("circles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircular(value: Dur): Self = this.set("circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrescent(value: Fn): Self = this.set("crescent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDots(value: CirclesDur): Self = this.set("dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: Lines): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLines-small`(value: Lines): Self = this.set("lines-small", value.asInstanceOf[js.Any])
  }
}
