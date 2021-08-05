package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bubbles extends StObject {
  
  var bubbles: Circles
  
  var circles: Circles
  
  var circular: Dur
  
  var crescent: Fn
  
  var dots: CirclesDur
  
  var lines: Lines
  
  var `lines-small`: Lines
}
object Bubbles {
  
  inline def apply(
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
  
  extension [Self <: Bubbles](x: Self) {
    
    inline def setBubbles(value: Circles): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCircles(value: Circles): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
    
    inline def setCircular(value: Dur): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
    
    inline def setCrescent(value: Fn): Self = StObject.set(x, "crescent", value.asInstanceOf[js.Any])
    
    inline def setDots(value: CirclesDur): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setLines(value: Lines): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def `setLines-small`(value: Lines): Self = StObject.set(x, "lines-small", value.asInstanceOf[js.Any])
  }
}
