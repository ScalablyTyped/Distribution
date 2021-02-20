package typings.gyronorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Absolute extends StObject {
    
    var absolute: Double = js.native
    
    var alpha: Double = js.native
    
    var beta: Double = js.native
    
    var gamma: Double = js.native
  }
  object Absolute {
    
    @scala.inline
    def apply(absolute: Double, alpha: Double, beta: Double, gamma: Double): Absolute = {
      val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any])
      __obj.asInstanceOf[Absolute]
    }
    
    @scala.inline
    implicit class AbsoluteMutableBuilder[Self <: Absolute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: Double): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Alpha extends StObject {
    
    var alpha: Double = js.native
    
    var beta: Double = js.native
    
    var gamma: Double = js.native
    
    var gx: Double = js.native
    
    var gy: Double = js.native
    
    var gz: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  object Alpha {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class AlphaMutableBuilder[Self <: Alpha] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGx(value: Double): Self = StObject.set(x, "gx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGy(value: Double): Self = StObject.set(x, "gy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGz(value: Double): Self = StObject.set(x, "gz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
