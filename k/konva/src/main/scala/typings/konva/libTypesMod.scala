package typings.konva

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  @js.native
  sealed trait KonvaNodeEvent extends StObject
  @JSImport("konva/lib/types", "KonvaNodeEvent")
  @js.native
  object KonvaNodeEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[KonvaNodeEvent & String] = js.native
    
    @js.native
    sealed trait click
      extends StObject
         with KonvaNodeEvent
    /* "click" */ val click: typings.konva.libTypesMod.KonvaNodeEvent.click & String = js.native
    
    @js.native
    sealed trait contextmenu
      extends StObject
         with KonvaNodeEvent
    /* "contextmenu" */ val contextmenu: typings.konva.libTypesMod.KonvaNodeEvent.contextmenu & String = js.native
    
    @js.native
    sealed trait dblclick
      extends StObject
         with KonvaNodeEvent
    /* "dblclick" */ val dblclick: typings.konva.libTypesMod.KonvaNodeEvent.dblclick & String = js.native
    
    @js.native
    sealed trait dbltap
      extends StObject
         with KonvaNodeEvent
    /* "dbltap" */ val dbltap: typings.konva.libTypesMod.KonvaNodeEvent.dbltap & String = js.native
    
    @js.native
    sealed trait dragend
      extends StObject
         with KonvaNodeEvent
    /* "dragend" */ val dragend: typings.konva.libTypesMod.KonvaNodeEvent.dragend & String = js.native
    
    @js.native
    sealed trait dragmove
      extends StObject
         with KonvaNodeEvent
    /* "dragmove" */ val dragmove: typings.konva.libTypesMod.KonvaNodeEvent.dragmove & String = js.native
    
    @js.native
    sealed trait dragstart
      extends StObject
         with KonvaNodeEvent
    /* "dragstart" */ val dragstart: typings.konva.libTypesMod.KonvaNodeEvent.dragstart & String = js.native
    
    @js.native
    sealed trait mousedown
      extends StObject
         with KonvaNodeEvent
    /* "mousedown" */ val mousedown: typings.konva.libTypesMod.KonvaNodeEvent.mousedown & String = js.native
    
    @js.native
    sealed trait mouseenter
      extends StObject
         with KonvaNodeEvent
    /* "mouseenter" */ val mouseenter: typings.konva.libTypesMod.KonvaNodeEvent.mouseenter & String = js.native
    
    @js.native
    sealed trait mouseleave
      extends StObject
         with KonvaNodeEvent
    /* "mouseleave" */ val mouseleave: typings.konva.libTypesMod.KonvaNodeEvent.mouseleave & String = js.native
    
    @js.native
    sealed trait mousemove
      extends StObject
         with KonvaNodeEvent
    /* "mousemove" */ val mousemove: typings.konva.libTypesMod.KonvaNodeEvent.mousemove & String = js.native
    
    @js.native
    sealed trait mouseout
      extends StObject
         with KonvaNodeEvent
    /* "mouseout" */ val mouseout: typings.konva.libTypesMod.KonvaNodeEvent.mouseout & String = js.native
    
    @js.native
    sealed trait mouseover
      extends StObject
         with KonvaNodeEvent
    /* "mouseover" */ val mouseover: typings.konva.libTypesMod.KonvaNodeEvent.mouseover & String = js.native
    
    @js.native
    sealed trait mouseup
      extends StObject
         with KonvaNodeEvent
    /* "mouseup" */ val mouseup: typings.konva.libTypesMod.KonvaNodeEvent.mouseup & String = js.native
    
    @js.native
    sealed trait tap
      extends StObject
         with KonvaNodeEvent
    /* "tap" */ val tap: typings.konva.libTypesMod.KonvaNodeEvent.tap & String = js.native
    
    @js.native
    sealed trait touchend
      extends StObject
         with KonvaNodeEvent
    /* "touchend" */ val touchend: typings.konva.libTypesMod.KonvaNodeEvent.touchend & String = js.native
    
    @js.native
    sealed trait touchmove
      extends StObject
         with KonvaNodeEvent
    /* "touchmove" */ val touchmove: typings.konva.libTypesMod.KonvaNodeEvent.touchmove & String = js.native
    
    @js.native
    sealed trait touchstart
      extends StObject
         with KonvaNodeEvent
    /* "touchstart" */ val touchstart: typings.konva.libTypesMod.KonvaNodeEvent.touchstart & String = js.native
    
    @js.native
    sealed trait wheel
      extends StObject
         with KonvaNodeEvent
    /* "wheel" */ val wheel: typings.konva.libTypesMod.KonvaNodeEvent.wheel & String = js.native
  }
  
  type AnimationFn = js.Function1[/* frame */ js.UndefOr[IFrame], Boolean | Unit]
  
  @js.native
  trait GetSet[Type, This] extends StObject {
    
    def apply(): Type = js.native
    def apply(v: Type): This = js.native
  }
  
  trait IFrame extends StObject {
    
    var frameRate: Double
    
    var lastTime: Double
    
    var time: Double
    
    var timeDiff: Double
  }
  object IFrame {
    
    inline def apply(frameRate: Double, lastTime: Double, time: Double, timeDiff: Double): IFrame = {
      val __obj = js.Dynamic.literal(frameRate = frameRate.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeDiff = timeDiff.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFrame] (val x: Self) extends AnyVal {
      
      inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
      
      inline def setLastTime(value: Double): Self = StObject.set(x, "lastTime", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeDiff(value: Double): Self = StObject.set(x, "timeDiff", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRect extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object IRect {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): IRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRect] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
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
       with RGB {
    
    var a: Double
  }
  object RGBA {
    
    inline def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RGBA] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
  
  trait Vector2d extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Vector2d {
    
    inline def apply(x: Double, y: Double): Vector2d = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vector2d]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Vector2d] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
