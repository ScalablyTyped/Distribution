package typings.khroma

import typings.khroma.distChannelsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @JSImport("khroma/dist/types", "Channels")
  @js.native
  open class Channels protected () extends default {
    def this(data: CHANNELS_) = this()
    def this(data: HSLA) = this()
    def this(data: RGBA) = this()
    def this(data: CHANNELS_, color: String) = this()
    def this(data: HSLA, color: String) = this()
    def this(data: RGBA, color: String) = this()
  }
  
  trait ALPHA extends StObject {
    
    var a: Double
  }
  object ALPHA {
    
    inline def apply(a: Double): ALPHA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
      __obj.asInstanceOf[ALPHA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ALPHA] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.khroma.khromaStrings.r
    - typings.khroma.khromaStrings.g
    - typings.khroma.khromaStrings.b
    - typings.khroma.khromaStrings.h
    - typings.khroma.khromaStrings.s
    - typings.khroma.khromaStrings.l
    - typings.khroma.khromaStrings.a
  */
  trait CHANNEL extends StObject
  object CHANNEL {
    
    inline def a: typings.khroma.khromaStrings.a = "a".asInstanceOf[typings.khroma.khromaStrings.a]
    
    inline def b: typings.khroma.khromaStrings.b = "b".asInstanceOf[typings.khroma.khromaStrings.b]
    
    inline def g: typings.khroma.khromaStrings.g = "g".asInstanceOf[typings.khroma.khromaStrings.g]
    
    inline def h: typings.khroma.khromaStrings.h = "h".asInstanceOf[typings.khroma.khromaStrings.h]
    
    inline def l: typings.khroma.khromaStrings.l = "l".asInstanceOf[typings.khroma.khromaStrings.l]
    
    inline def r: typings.khroma.khromaStrings.r = "r".asInstanceOf[typings.khroma.khromaStrings.r]
    
    inline def s: typings.khroma.khromaStrings.s = "s".asInstanceOf[typings.khroma.khromaStrings.s]
  }
  
  /* Inlined std.Record<khroma.khroma/dist/types.CHANNEL, number> */
  trait CHANNELS_ extends StObject {
    
    var a: Double
    
    var b: Double
    
    var g: Double
    
    var h: Double
    
    var l: Double
    
    var r: Double
    
    var s: Double
  }
  object CHANNELS_ {
    
    inline def apply(a: Double, b: Double, g: Double, h: Double, l: Double, r: Double, s: Double): CHANNELS_ = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[CHANNELS_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CHANNELS_] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait HSL extends StObject {
    
    var h: Double
    
    var l: Double
    
    var s: Double
  }
  object HSL {
    
    inline def apply(h: Double, l: Double, s: Double): HSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HSL] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait HSLA
    extends StObject
       with HSL
       with ALPHA
  object HSLA {
    
    inline def apply(a: Double, h: Double, l: Double, s: Double): HSLA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSLA]
    }
  }
  
  trait RGB extends StObject {
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGB {
    
    inline def apply(b: Double, g: Double, r: Double): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait RGBA
    extends StObject
       with RGB
       with ALPHA
  object RGBA {
    
    inline def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
  }
}
