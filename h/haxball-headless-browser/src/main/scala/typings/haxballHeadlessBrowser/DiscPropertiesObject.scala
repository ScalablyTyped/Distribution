package typings.haxballHeadlessBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscPropertiesObject extends StObject {
  
  var bCoeff: Double
  
  var cGroup: Double
  
  var cMask: Double
  
  var color: Double
  
  var damping: Double
  
  var invMass: Double
  
  var radius: Double
  
  var x: Double
  
  var xgravity: Double
  
  var xspeed: Double
  
  var y: Double
  
  var ygravity: Double
  
  var yspeed: Double
}
object DiscPropertiesObject {
  
  inline def apply(
    bCoeff: Double,
    cGroup: Double,
    cMask: Double,
    color: Double,
    damping: Double,
    invMass: Double,
    radius: Double,
    x: Double,
    xgravity: Double,
    xspeed: Double,
    y: Double,
    ygravity: Double,
    yspeed: Double
  ): DiscPropertiesObject = {
    val __obj = js.Dynamic.literal(bCoeff = bCoeff.asInstanceOf[js.Any], cGroup = cGroup.asInstanceOf[js.Any], cMask = cMask.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], invMass = invMass.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xgravity = xgravity.asInstanceOf[js.Any], xspeed = xspeed.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], ygravity = ygravity.asInstanceOf[js.Any], yspeed = yspeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscPropertiesObject]
  }
  
  extension [Self <: DiscPropertiesObject](x: Self) {
    
    inline def setBCoeff(value: Double): Self = StObject.set(x, "bCoeff", value.asInstanceOf[js.Any])
    
    inline def setCGroup(value: Double): Self = StObject.set(x, "cGroup", value.asInstanceOf[js.Any])
    
    inline def setCMask(value: Double): Self = StObject.set(x, "cMask", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    inline def setInvMass(value: Double): Self = StObject.set(x, "invMass", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXgravity(value: Double): Self = StObject.set(x, "xgravity", value.asInstanceOf[js.Any])
    
    inline def setXspeed(value: Double): Self = StObject.set(x, "xspeed", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYgravity(value: Double): Self = StObject.set(x, "ygravity", value.asInstanceOf[js.Any])
    
    inline def setYspeed(value: Double): Self = StObject.set(x, "yspeed", value.asInstanceOf[js.Any])
  }
}
