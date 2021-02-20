package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bubbles extends StObject {
  
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
  implicit class BubblesMutableBuilder[Self <: Bubbles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Circles): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircles(value: Circles): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircular(value: Dur): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrescent(value: Fn): Self = StObject.set(x, "crescent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDots(value: CirclesDur): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: Lines): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLines-small`(value: Lines): Self = StObject.set(x, "lines-small", value.asInstanceOf[js.Any])
  }
}
