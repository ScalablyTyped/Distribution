package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cx extends StObject {
  
  var cx: Double
  
  var cy: Double
  
  var fill: String
  
  var r: Double
  
  var transform: String
  
  var viewBox: String
}
object Cx {
  
  @scala.inline
  def apply(cx: Double, cy: Double, fill: String, r: Double, transform: String, viewBox: String): Cx = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cx]
  }
  
  @scala.inline
  implicit class CxMutableBuilder[Self <: Cx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
  }
}
