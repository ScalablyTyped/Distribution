package typings.haxballHeadlessBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: String
    
    var lat: Double
    
    var lon: Double
  }
  object Code {
    
    inline def apply(code: String, lat: Double, lon: Double): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<haxball-headless-browser.DiscPropertiesObject> */
  trait PartialDiscPropertiesObje extends StObject {
    
    var bCoeff: js.UndefOr[Double] = js.undefined
    
    var cGroup: js.UndefOr[Double] = js.undefined
    
    var cMask: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[Double] = js.undefined
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var invMass: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var xgravity: js.UndefOr[Double] = js.undefined
    
    var xspeed: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var ygravity: js.UndefOr[Double] = js.undefined
    
    var yspeed: js.UndefOr[Double] = js.undefined
  }
  object PartialDiscPropertiesObje {
    
    inline def apply(): PartialDiscPropertiesObje = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDiscPropertiesObje]
    }
    
    extension [Self <: PartialDiscPropertiesObje](x: Self) {
      
      inline def setBCoeff(value: Double): Self = StObject.set(x, "bCoeff", value.asInstanceOf[js.Any])
      
      inline def setBCoeffUndefined: Self = StObject.set(x, "bCoeff", js.undefined)
      
      inline def setCGroup(value: Double): Self = StObject.set(x, "cGroup", value.asInstanceOf[js.Any])
      
      inline def setCGroupUndefined: Self = StObject.set(x, "cGroup", js.undefined)
      
      inline def setCMask(value: Double): Self = StObject.set(x, "cMask", value.asInstanceOf[js.Any])
      
      inline def setCMaskUndefined: Self = StObject.set(x, "cMask", js.undefined)
      
      inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setInvMass(value: Double): Self = StObject.set(x, "invMass", value.asInstanceOf[js.Any])
      
      inline def setInvMassUndefined: Self = StObject.set(x, "invMass", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXgravity(value: Double): Self = StObject.set(x, "xgravity", value.asInstanceOf[js.Any])
      
      inline def setXgravityUndefined: Self = StObject.set(x, "xgravity", js.undefined)
      
      inline def setXspeed(value: Double): Self = StObject.set(x, "xspeed", value.asInstanceOf[js.Any])
      
      inline def setXspeedUndefined: Self = StObject.set(x, "xspeed", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setYgravity(value: Double): Self = StObject.set(x, "ygravity", value.asInstanceOf[js.Any])
      
      inline def setYgravityUndefined: Self = StObject.set(x, "ygravity", js.undefined)
      
      inline def setYspeed(value: Double): Self = StObject.set(x, "yspeed", value.asInstanceOf[js.Any])
      
      inline def setYspeedUndefined: Self = StObject.set(x, "yspeed", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
