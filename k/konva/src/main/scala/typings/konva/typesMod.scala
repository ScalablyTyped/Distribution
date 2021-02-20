package typings.konva

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  sealed trait KonvaNodeEvent extends StObject
  @JSImport("konva/types/types", "KonvaNodeEvent")
  @js.native
  object KonvaNodeEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[KonvaNodeEvent with String] = js.native
    
    @js.native
    sealed trait click extends KonvaNodeEvent
    /* "click" */ val click: typings.konva.typesMod.KonvaNodeEvent.click with String = js.native
    
    @js.native
    sealed trait contextmenu extends KonvaNodeEvent
    /* "contextmenu" */ val contextmenu: typings.konva.typesMod.KonvaNodeEvent.contextmenu with String = js.native
    
    @js.native
    sealed trait dblclick extends KonvaNodeEvent
    /* "dblclick" */ val dblclick: typings.konva.typesMod.KonvaNodeEvent.dblclick with String = js.native
    
    @js.native
    sealed trait dbltap extends KonvaNodeEvent
    /* "dbltap" */ val dbltap: typings.konva.typesMod.KonvaNodeEvent.dbltap with String = js.native
    
    @js.native
    sealed trait dragend extends KonvaNodeEvent
    /* "dragend" */ val dragend: typings.konva.typesMod.KonvaNodeEvent.dragend with String = js.native
    
    @js.native
    sealed trait dragmove extends KonvaNodeEvent
    /* "dragmove" */ val dragmove: typings.konva.typesMod.KonvaNodeEvent.dragmove with String = js.native
    
    @js.native
    sealed trait dragstart extends KonvaNodeEvent
    /* "dragstart" */ val dragstart: typings.konva.typesMod.KonvaNodeEvent.dragstart with String = js.native
    
    @js.native
    sealed trait mousedown extends KonvaNodeEvent
    /* "mousedown" */ val mousedown: typings.konva.typesMod.KonvaNodeEvent.mousedown with String = js.native
    
    @js.native
    sealed trait mouseenter extends KonvaNodeEvent
    /* "mouseenter" */ val mouseenter: typings.konva.typesMod.KonvaNodeEvent.mouseenter with String = js.native
    
    @js.native
    sealed trait mouseleave extends KonvaNodeEvent
    /* "mouseleave" */ val mouseleave: typings.konva.typesMod.KonvaNodeEvent.mouseleave with String = js.native
    
    @js.native
    sealed trait mousemove extends KonvaNodeEvent
    /* "mousemove" */ val mousemove: typings.konva.typesMod.KonvaNodeEvent.mousemove with String = js.native
    
    @js.native
    sealed trait mouseout extends KonvaNodeEvent
    /* "mouseout" */ val mouseout: typings.konva.typesMod.KonvaNodeEvent.mouseout with String = js.native
    
    @js.native
    sealed trait mouseover extends KonvaNodeEvent
    /* "mouseover" */ val mouseover: typings.konva.typesMod.KonvaNodeEvent.mouseover with String = js.native
    
    @js.native
    sealed trait mouseup extends KonvaNodeEvent
    /* "mouseup" */ val mouseup: typings.konva.typesMod.KonvaNodeEvent.mouseup with String = js.native
    
    @js.native
    sealed trait tap extends KonvaNodeEvent
    /* "tap" */ val tap: typings.konva.typesMod.KonvaNodeEvent.tap with String = js.native
    
    @js.native
    sealed trait touchend extends KonvaNodeEvent
    /* "touchend" */ val touchend: typings.konva.typesMod.KonvaNodeEvent.touchend with String = js.native
    
    @js.native
    sealed trait touchmove extends KonvaNodeEvent
    /* "touchmove" */ val touchmove: typings.konva.typesMod.KonvaNodeEvent.touchmove with String = js.native
    
    @js.native
    sealed trait touchstart extends KonvaNodeEvent
    /* "touchstart" */ val touchstart: typings.konva.typesMod.KonvaNodeEvent.touchstart with String = js.native
    
    @js.native
    sealed trait wheel extends KonvaNodeEvent
    /* "wheel" */ val wheel: typings.konva.typesMod.KonvaNodeEvent.wheel with String = js.native
  }
  
  type AnimationFn = js.Function1[/* frame */ js.UndefOr[IFrame], Boolean | Unit]
  
  @js.native
  trait GetSet[Type, This] extends StObject {
    
    def apply(): Type = js.native
    def apply(v: Type): This = js.native
  }
  
  @js.native
  trait IFrame extends StObject {
    
    var frameRate: Double = js.native
    
    var lastTime: Double = js.native
    
    var time: Double = js.native
    
    var timeDiff: Double = js.native
  }
  object IFrame {
    
    @scala.inline
    def apply(frameRate: Double, lastTime: Double, time: Double, timeDiff: Double): IFrame = {
      val __obj = js.Dynamic.literal(frameRate = frameRate.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeDiff = timeDiff.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFrame]
    }
    
    @scala.inline
    implicit class IFrameMutableBuilder[Self <: IFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastTime(value: Double): Self = StObject.set(x, "lastTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeDiff(value: Double): Self = StObject.set(x, "timeDiff", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRect extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object IRect {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): IRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRect]
    }
    
    @scala.inline
    implicit class IRectMutableBuilder[Self <: IRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RGB extends StObject {
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
  object RGB {
    
    @scala.inline
    def apply(b: Double, g: Double, r: Double): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    @scala.inline
    implicit class RGBMutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RGBA extends RGB {
    
    var a: Double = js.native
  }
  object RGBA {
    
    @scala.inline
    def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
    
    @scala.inline
    implicit class RGBAMutableBuilder[Self <: RGBA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Vector2d extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Vector2d {
    
    @scala.inline
    def apply(x: Double, y: Double): Vector2d = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vector2d]
    }
    
    @scala.inline
    implicit class Vector2dMutableBuilder[Self <: Vector2d] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
