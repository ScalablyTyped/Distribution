package typings.luminoDatagrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Color1 extends StObject {
    
    /**
      * The first color stop for the shadow.
      */
    val color1: String = js.native
    
    /**
      * The second color stop for the shadow.
      */
    val color2: String = js.native
    
    /**
      * The third color stop for the shadow.
      */
    val color3: String = js.native
    
    /**
      * The size of the shadow, in pixels.
      */
    val size: Double = js.native
  }
  object Color1 {
    
    @scala.inline
    def apply(color1: String, color2: String, color3: String, size: Double): Color1 = {
      val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], color2 = color2.asInstanceOf[js.Any], color3 = color3.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color1]
    }
    
    @scala.inline
    implicit class Color1MutableBuilder[Self <: Color1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor1(value: String): Self = StObject.set(x, "color1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor2(value: String): Self = StObject.set(x, "color2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor3(value: String): Self = StObject.set(x, "color3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Lx extends StObject {
    
    var lx: Double = js.native
    
    var ly: Double = js.native
  }
  object Lx {
    
    @scala.inline
    def apply(lx: Double, ly: Double): Lx = {
      val __obj = js.Dynamic.literal(lx = lx.asInstanceOf[js.Any], ly = ly.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lx]
    }
    
    @scala.inline
    implicit class LxMutableBuilder[Self <: Lx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLx(value: Double): Self = StObject.set(x, "lx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLy(value: Double): Self = StObject.set(x, "ly", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Vx extends StObject {
    
    var vx: Double = js.native
    
    var vy: Double = js.native
  }
  object Vx {
    
    @scala.inline
    def apply(vx: Double, vy: Double): Vx = {
      val __obj = js.Dynamic.literal(vx = vx.asInstanceOf[js.Any], vy = vy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vx]
    }
    
    @scala.inline
    implicit class VxMutableBuilder[Self <: Vx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVx(value: Double): Self = StObject.set(x, "vx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVy(value: Double): Self = StObject.set(x, "vy", value.asInstanceOf[js.Any])
    }
  }
}
