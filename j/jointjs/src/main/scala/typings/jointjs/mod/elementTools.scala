package typings.jointjs.mod

import typings.jointjs.mod.dia.Event
import typings.jointjs.mod.dia.LinkView
import typings.jointjs.mod.dia.MarkupJSON
import typings.jointjs.mod.dia.Sides
import typings.jointjs.mod.dia.ToolView
import typings.jointjs.mod.elementTools.Boundary.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementTools {
  
  @JSImport("jointjs", "elementTools.Boundary")
  @js.native
  class Boundary () extends ToolView {
    def this(opt: Options) = this()
  }
  object Boundary {
    
    trait Options
      extends StObject
         with typings.jointjs.mod.dia.ToolView.Options {
      
      var padding: js.UndefOr[Double | Sides] = js.undefined
      
      var rotate: js.UndefOr[Boolean] = js.undefined
      
      var useModelGeometry: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setPadding(value: Double | Sides): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
        
        inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
        
        inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
        
        inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
        
        inline def setUseModelGeometry(value: Boolean): Self = StObject.set(x, "useModelGeometry", value.asInstanceOf[js.Any])
        
        inline def setUseModelGeometryUndefined: Self = StObject.set(x, "useModelGeometry", js.undefined)
      }
    }
  }
  
  @JSImport("jointjs", "elementTools.Button")
  @js.native
  class Button () extends ToolView {
    def this(opt: typings.jointjs.mod.elementTools.Button.Options) = this()
    
    /* protected */ def onPointerDown(evt: Event): Unit = js.native
  }
  object Button {
    
    type ActionCallback = js.Function2[/* evt */ Event, /* view */ LinkView, Unit]
    
    trait Options
      extends StObject
         with typings.jointjs.mod.dia.ToolView.Options {
      
      var action: js.UndefOr[ActionCallback] = js.undefined
      
      var markup: js.UndefOr[MarkupJSON] = js.undefined
      
      var offset: js.UndefOr[Double] = js.undefined
      
      var rotate: js.UndefOr[Boolean] = js.undefined
      
      var useModelGeometry: js.UndefOr[Boolean] = js.undefined
      
      var x: js.UndefOr[Double | String] = js.undefined
      
      var y: js.UndefOr[Double | String] = js.undefined
    }
    object Options {
      
      inline def apply(): typings.jointjs.mod.elementTools.Button.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jointjs.mod.elementTools.Button.Options]
      }
      
      extension [Self <: typings.jointjs.mod.elementTools.Button.Options](x: Self) {
        
        inline def setAction(value: (/* evt */ Event, /* view */ LinkView) => Unit): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
        
        inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        inline def setMarkup(value: MarkupJSON): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
        
        inline def setMarkupUndefined: Self = StObject.set(x, "markup", js.undefined)
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
        
        inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
        
        inline def setUseModelGeometry(value: Boolean): Self = StObject.set(x, "useModelGeometry", value.asInstanceOf[js.Any])
        
        inline def setUseModelGeometryUndefined: Self = StObject.set(x, "useModelGeometry", js.undefined)
        
        inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
        
        inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      }
    }
  }
  
  @JSImport("jointjs", "elementTools.Remove")
  @js.native
  class Remove () extends Button {
    def this(opt: typings.jointjs.mod.elementTools.Button.Options) = this()
  }
}
