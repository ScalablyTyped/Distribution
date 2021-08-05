package typings.gyronorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Absolute extends StObject {
    
    var absolute: Double
    
    var alpha: Double
    
    var beta: Double
    
    var gamma: Double
  }
  object Absolute {
    
    inline def apply(absolute: Double, alpha: Double, beta: Double, gamma: Double): Absolute = {
      val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any])
      __obj.asInstanceOf[Absolute]
    }
    
    extension [Self <: Absolute](x: Self) {
      
      inline def setAbsolute(value: Double): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    }
  }
  
  trait Alpha extends StObject {
    
    var alpha: Double
    
    var beta: Double
    
    var gamma: Double
    
    var gx: Double
    
    var gy: Double
    
    var gz: Double
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object Alpha {
    
    inline def apply(
      alpha: Double,
      beta: Double,
      gamma: Double,
      gx: Double,
      gy: Double,
      gz: Double,
      x: Double,
      y: Double,
      z: Double
    ): Alpha = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any], gx = gx.asInstanceOf[js.Any], gy = gy.asInstanceOf[js.Any], gz = gz.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alpha]
    }
    
    extension [Self <: Alpha](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
      
      inline def setGx(value: Double): Self = StObject.set(x, "gx", value.asInstanceOf[js.Any])
      
      inline def setGy(value: Double): Self = StObject.set(x, "gy", value.asInstanceOf[js.Any])
      
      inline def setGz(value: Double): Self = StObject.set(x, "gz", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
