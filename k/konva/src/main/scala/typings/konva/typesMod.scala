package typings.konva

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  sealed trait KonvaNodeEvent extends StObject
  @JSImport("konva/types/types", "KonvaNodeEvent")
  @js.native
  object KonvaNodeEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[KonvaNodeEvent & String] = js.native
    
    @js.native
    sealed trait click
      extends StObject
         with KonvaNodeEvent
    /* "click" */ val click: typings.konva.typesMod.KonvaNodeEvent.click & String = js.native
    
    @js.native
    sealed trait contextmenu
      extends StObject
         with KonvaNodeEvent
    /* "contextmenu" */ val contextmenu: typings.konva.typesMod.KonvaNodeEvent.contextmenu & String = js.native
    
    @js.native
    sealed trait dblclick
      extends StObject
         with KonvaNodeEvent
    /* "dblclick" */ val dblclick: typings.konva.typesMod.KonvaNodeEvent.dblclick & String = js.native
    
    @js.native
    sealed trait dbltap
      extends StObject
         with KonvaNodeEvent
    /* "dbltap" */ val dbltap: typings.konva.typesMod.KonvaNodeEvent.dbltap & String = js.native
    
    @js.native
    sealed trait dragend
      extends StObject
         with KonvaNodeEvent
    /* "dragend" */ val dragend: typings.konva.typesMod.KonvaNodeEvent.dragend & String = js.native
    
    @js.native
    sealed trait dragmove
      extends StObject
         with KonvaNodeEvent
    /* "dragmove" */ val dragmove: typings.konva.typesMod.KonvaNodeEvent.dragmove & String = js.native
    
    @js.native
    sealed trait dragstart
      extends StObject
         with KonvaNodeEvent
    /* "dragstart" */ val dragstart: typings.konva.typesMod.KonvaNodeEvent.dragstart & String = js.native
    
    @js.native
    sealed trait mousedown
      extends StObject
         with KonvaNodeEvent
    /* "mousedown" */ val mousedown: typings.konva.typesMod.KonvaNodeEvent.mousedown & String = js.native
    
    @js.native
    sealed trait mouseenter
      extends StObject
         with KonvaNodeEvent
    /* "mouseenter" */ val mouseenter: typings.konva.typesMod.KonvaNodeEvent.mouseenter & String = js.native
    
    @js.native
    sealed trait mouseleave
      extends StObject
         with KonvaNodeEvent
    /* "mouseleave" */ val mouseleave: typings.konva.typesMod.KonvaNodeEvent.mouseleave & String = js.native
    
    @js.native
    sealed trait mousemove
      extends StObject
         with KonvaNodeEvent
    /* "mousemove" */ val mousemove: typings.konva.typesMod.KonvaNodeEvent.mousemove & String = js.native
    
    @js.native
    sealed trait mouseout
      extends StObject
         with KonvaNodeEvent
    /* "mouseout" */ val mouseout: typings.konva.typesMod.KonvaNodeEvent.mouseout & String = js.native
    
    @js.native
    sealed trait mouseover
      extends StObject
         with KonvaNodeEvent
    /* "mouseover" */ val mouseover: typings.konva.typesMod.KonvaNodeEvent.mouseover & String = js.native
    
    @js.native
    sealed trait mouseup
      extends StObject
         with KonvaNodeEvent
    /* "mouseup" */ val mouseup: typings.konva.typesMod.KonvaNodeEvent.mouseup & String = js.native
    
    @js.native
    sealed trait tap
      extends StObject
         with KonvaNodeEvent
    /* "tap" */ val tap: typings.konva.typesMod.KonvaNodeEvent.tap & String = js.native
    
    @js.native
    sealed trait touchend
      extends StObject
         with KonvaNodeEvent
    /* "touchend" */ val touchend: typings.konva.typesMod.KonvaNodeEvent.touchend & String = js.native
    
    @js.native
    sealed trait touchmove
      extends StObject
         with KonvaNodeEvent
    /* "touchmove" */ val touchmove: typings.konva.typesMod.KonvaNodeEvent.touchmove & String = js.native
    
    @js.native
    sealed trait touchstart
      extends StObject
         with KonvaNodeEvent
    /* "touchstart" */ val touchstart: typings.konva.typesMod.KonvaNodeEvent.touchstart & String = js.native
    
    @js.native
    sealed trait wheel
      extends StObject
         with KonvaNodeEvent
    /* "wheel" */ val wheel: typings.konva.typesMod.KonvaNodeEvent.wheel & String = js.native
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
    
    extension [Self <: IFrame](x: Self) {
      
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
    
    extension [Self <: IRect](x: Self) {
      
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
    
    extension [Self <: RGB](x: Self) {
      
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
    
    extension [Self <: RGBA](x: Self) {
      
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
    
    extension [Self <: Vector2d](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
