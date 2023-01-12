package typings.leafletDraw.leafletMod

import typings.leafletDraw.anon.Cancel
import typings.leafletDraw.anon.Circle
import typings.leafletDraw.anon.Error
import typings.leafletDraw.anon.Radius
import typings.leafletDraw.anon.TooltipCont
import typings.leafletDraw.anon.TooltipEnd
import typings.leafletDraw.anon.TooltipText
import typings.leafletDraw.anon.TooltipTextString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Localization {
  
  trait Action extends StObject {
    
    var text: String
    
    var title: String
  }
  object Action {
    
    inline def apply(text: String, title: String): Action = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Draw extends StObject {
    
    var handlers: DrawHandlers
    
    var toolbar: typings.leafletDraw.leafletMod.Localization.DrawToolbar
  }
  object Draw {
    
    inline def apply(handlers: DrawHandlers, toolbar: typings.leafletDraw.leafletMod.Localization.DrawToolbar): typings.leafletDraw.leafletMod.Localization.Draw = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.leafletDraw.leafletMod.Localization.Draw]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.leafletDraw.leafletMod.Localization.Draw] (val x: Self) extends AnyVal {
      
      inline def setHandlers(value: DrawHandlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setToolbar(value: typings.leafletDraw.leafletMod.Localization.DrawToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawHandlers extends StObject {
    
    var circle: Radius
    
    var circlemarker: typings.leafletDraw.anon.Tooltip
    
    var marker: typings.leafletDraw.anon.Tooltip
    
    var polygon: TooltipCont
    
    var polyline: Error
    
    var rectangle: typings.leafletDraw.anon.Tooltip
    
    var simpleshape: TooltipEnd
  }
  object DrawHandlers {
    
    inline def apply(
      circle: Radius,
      circlemarker: typings.leafletDraw.anon.Tooltip,
      marker: typings.leafletDraw.anon.Tooltip,
      polygon: TooltipCont,
      polyline: Error,
      rectangle: typings.leafletDraw.anon.Tooltip,
      simpleshape: TooltipEnd
    ): DrawHandlers = {
      val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], circlemarker = circlemarker.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any], simpleshape = simpleshape.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawHandlers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawHandlers] (val x: Self) extends AnyVal {
      
      inline def setCircle(value: Radius): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCirclemarker(value: typings.leafletDraw.anon.Tooltip): Self = StObject.set(x, "circlemarker", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: typings.leafletDraw.anon.Tooltip): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setPolygon(value: TooltipCont): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      inline def setPolyline(value: Error): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
      
      inline def setRectangle(value: typings.leafletDraw.anon.Tooltip): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      inline def setSimpleshape(value: TooltipEnd): Self = StObject.set(x, "simpleshape", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawLocal extends StObject {
    
    var draw: typings.leafletDraw.leafletMod.Localization.Draw
    
    var edit: typings.leafletDraw.leafletMod.Localization.Edit
  }
  object DrawLocal {
    
    inline def apply(
      draw: typings.leafletDraw.leafletMod.Localization.Draw,
      edit: typings.leafletDraw.leafletMod.Localization.Edit
    ): DrawLocal = {
      val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawLocal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawLocal] (val x: Self) extends AnyVal {
      
      inline def setDraw(value: typings.leafletDraw.leafletMod.Localization.Draw): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
      
      inline def setEdit(value: typings.leafletDraw.leafletMod.Localization.Edit): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawToolbar extends StObject {
    
    var actions: Action
    
    var buttons: Circle
    
    var finish: Action
    
    var undo: Action
  }
  object DrawToolbar {
    
    inline def apply(actions: Action, buttons: Circle, finish: Action, undo: Action): typings.leafletDraw.leafletMod.Localization.DrawToolbar = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.leafletDraw.leafletMod.Localization.DrawToolbar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.leafletDraw.leafletMod.Localization.DrawToolbar] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Action): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setButtons(value: Circle): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: Action): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      inline def setUndo(value: Action): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
    }
  }
  
  trait Edit extends StObject {
    
    var handlers: EditHandlers
    
    var toolbar: typings.leafletDraw.leafletMod.Localization.EditToolbar
  }
  object Edit {
    
    inline def apply(handlers: EditHandlers, toolbar: typings.leafletDraw.leafletMod.Localization.EditToolbar): typings.leafletDraw.leafletMod.Localization.Edit = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.leafletDraw.leafletMod.Localization.Edit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.leafletDraw.leafletMod.Localization.Edit] (val x: Self) extends AnyVal {
      
      inline def setHandlers(value: EditHandlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setToolbar(value: typings.leafletDraw.leafletMod.Localization.EditToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditHandlers extends StObject {
    
    var edit: TooltipText
    
    var remove: TooltipTextString
  }
  object EditHandlers {
    
    inline def apply(edit: TooltipText, remove: TooltipTextString): EditHandlers = {
      val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditHandlers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditHandlers] (val x: Self) extends AnyVal {
      
      inline def setEdit(value: TooltipText): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: TooltipTextString): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditToolbar extends StObject {
    
    var actions: Cancel
    
    var buttons: typings.leafletDraw.anon.Edit
  }
  object EditToolbar {
    
    inline def apply(actions: Cancel, buttons: typings.leafletDraw.anon.Edit): typings.leafletDraw.leafletMod.Localization.EditToolbar = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.leafletDraw.leafletMod.Localization.EditToolbar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.leafletDraw.leafletMod.Localization.EditToolbar] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Cancel): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setButtons(value: typings.leafletDraw.anon.Edit): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tooltip extends StObject {
    
    var cont: js.UndefOr[String] = js.undefined
    
    var end: js.UndefOr[String] = js.undefined
    
    var start: js.UndefOr[String] = js.undefined
  }
  object Tooltip {
    
    inline def apply(): Tooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
      
      inline def setCont(value: String): Self = StObject.set(x, "cont", value.asInstanceOf[js.Any])
      
      inline def setContUndefined: Self = StObject.set(x, "cont", js.undefined)
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
