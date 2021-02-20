package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialGradientColorObject extends StObject {
  
  /**
    * Center horizontal position relative to the shape. Float ranges 0-1.
    */
  var cx: Double = js.native
  
  /**
    * Center vertical position relative to the shape. Float ranges 0-1.
    */
  var cy: Double = js.native
  
  /**
    * Radius relative to the shape. Float ranges 0-1.
    */
  var r: Double = js.native
}
object RadialGradientColorObject {
  
  @scala.inline
  def apply(cx: Double, cy: Double, r: Double): RadialGradientColorObject = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradientColorObject]
  }
  
  @scala.inline
  implicit class RadialGradientColorObjectMutableBuilder[Self <: RadialGradientColorObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
