package typings.leafletEditable.mod

import typings.leaflet.mod.LayerEvent
import typings.leaflet.mod.LayerEventHandlerFn
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.LeafletEventHandlerFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extend the existing event handler function map,
  * to include
  */
trait LeafletEventHandlerFnMap extends StObject {
  
  /**
    * Fired when a new feature (Marker, Polyline…) is created.
    */
  @JSName("editable:created")
  var editableColoncreated: js.UndefOr[LayerEventHandlerFn] = js.undefined
  
  /**
    * Fired when an existing feature is not ready anymore to be edited.
    */
  @JSName("editable:disable")
  var editableColondisable: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired when a path feature is being dragged.
    */
  @JSName("editable:drag")
  var editableColondrag: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired after a path feature has been dragged.
    */
  @JSName("editable:dragend")
  var editableColondragend: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired before a path feature is dragged.
    */
  @JSName("editable:dragstart")
  var editableColondragstart: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired when user cancel drawing while a feature is being drawn.
    */
  @JSName("editable:drawing:cancel")
  var editableColondrawingColoncancel: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired when user click while drawing, before any internal action is being processed.
    */
  @JSName("editable:drawing:click")
  var editableColondrawingColonclick: js.UndefOr[CancelableEventHandlerFn] = js.undefined
  
  /**
    * Fired when user click while drawing, after all internal actions.
    */
  @JSName("editable:drawing:clicked")
  var editableColondrawingColonclicked: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired when user finish drawing a feature.
    */
  @JSName("editable:drawing:commit")
  var editableColondrawingColoncommit: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired when a feature is not drawn anymore.
    */
  @JSName("editable:drawing:end")
  var editableColondrawingColonend: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired when user mousedown while drawing.
    */
  @JSName("editable:drawing:mousedown")
  var editableColondrawingColonmousedown: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired when user mouseup while drawing.
    */
  @JSName("editable:drawing:mouseup")
  var editableColondrawingColonmouseup: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired when move mouse while drawing, while dragging a marker, and while dragging a vertex.
    */
  @JSName("editable:drawing:move")
  var editableColondrawingColonmove: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired when a feature is to be drawn.
    */
  @JSName("editable:drawing:start")
  var editableColondrawingColonstart: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired as soon as any change is made to the feature geometry.
    */
  @JSName("editable:editing")
  var editableColonediting: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired when an existing feature is ready to be edited.
    */
  @JSName("editable:enable")
  var editableColonenable: js.UndefOr[LeafletEventHandlerFn] = js.undefined
  
  /**
    * Fired when user mousedown a middle marker.
    */
  @JSName("editable:middlemarker:mousedown")
  var editableColonmiddlemarkerColonmousedown: js.UndefOr[VertexEventHandlerFn] = js.undefined
  
  /**
    * Fired before a new shape is deleted in a multi (Polygon or Polyline).
    */
  @JSName("editable:shape:delete")
  var editableColonshapeColondelete: js.UndefOr[CancelableShapeEventHandlerFn] = js.undefined
  
  /**
    * Fired after a new shape is deleted in a multi (Polygon or Polyline).
    */
  @JSName("editable:shape:deleted")
  var editableColonshapeColondeleted: js.UndefOr[ShapeEventHandlerFn] = js.undefined
  
  /**
    * Fired when a new shape is created in a multi (Polygon or Polyline).
    */
  @JSName("editable:shape:new")
  var editableColonshapeColonnew: js.UndefOr[ShapeEventHandlerFn] = js.undefined
  
  /**
    * Fired when a click with altKey is issued on a vertex.
    */
  @JSName("editable:vertex:altclick")
  var editableColonvertexColonaltclick: js.UndefOr[VertexEventHandlerFn] = js.undefined
  
  /**
    * Fired when a click is issued on a vertex, before any internal action is being processed.
    */
  @JSName("editable:vertex:click")
  var editableColonvertexColonclick: js.UndefOr[CancelableVertexEventHandlerFn] = js.undefined
  
  /**
    * Fired when a click is issued on a vertex, after all internal actions.
    */
  @JSName("editable:vertex:clicked")
  var editableColonvertexColonclicked: js.UndefOr[VertexEventHandlerFn] = js.undefined
  
  /**
    * Fired when a contextmenu is issued on a vertex.
    */
  @JSName("editable:vertex:contextmenu")
  var editableColonvertexColoncontextmenu: js.UndefOr[VertexEventHandlerFn] = js.undefined
  
  /**
    * Fired when a click with ctrlKey is issued on a vertex.
    */
  @JSName("editable:vertex:ctrlclick")
  var editableColonvertexColonctrlclick: js.UndefOr[VertexEventHandlerFn] = js.undefined
  
  /**
    * Fired after a vertex has been deleted by user.
    */
  @JSName("editable:vertex:deleted")
  var editableColonvertexColondeleted: js.UndefOr[VertexEventHandlerFn] = js.undefined
  
  /**
    * Fired when a vertex is dragged by user.
    */
  @JSName("editable:vertex:drag")
  var editableColonvertexColondrag: js.UndefOr[VertexEventHandlerFn] = js.undefined
  
  /**
    * Fired after a vertex is dragged by user.
    */
  @JSName("editable:vertex:dragend")
  var editableColonvertexColondragend: js.UndefOr[VertexEventHandlerFn] = js.undefined
  
  /**
    * Fired before a vertex is dragged by user.
    */
  @JSName("editable:vertex:dragstart")
  var editableColonvertexColondragstart: js.UndefOr[VertexEventHandlerFn] = js.undefined
  
  /**
    * Fired when a click with metaKey is issued on a vertex.
    */
  @JSName("editable:vertex:metakeyclick")
  var editableColonvertexColonmetakeyclick: js.UndefOr[VertexEventHandlerFn] = js.undefined
  
  /**
    * Fired when user mousedown a vertex.
    */
  @JSName("editable:vertex:mousedown")
  var editableColonvertexColonmousedown: js.UndefOr[VertexEventHandlerFn] = js.undefined
  
  /**
    * Fired when a new vertex is created.
    */
  @JSName("editable:vertex:new")
  var editableColonvertexColonnew: js.UndefOr[VertexEventHandlerFn] = js.undefined
  
  /**
    * Fired when a click is issued on a vertex without any special key and without being in drawing mode.
    */
  @JSName("editable:vertex:rawclick")
  var editableColonvertexColonrawclick: js.UndefOr[CancelableVertexEventHandlerFn] = js.undefined
  
  /**
    * Fired when a click with shiftKey is issued on a vertex.
    */
  @JSName("editable:vertex:shiftclick")
  var editableColonvertexColonshiftclick: js.UndefOr[VertexEventHandlerFn] = js.undefined
}
object LeafletEventHandlerFnMap {
  
  inline def apply(): LeafletEventHandlerFnMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeafletEventHandlerFnMap]
  }
  
  extension [Self <: LeafletEventHandlerFnMap](x: Self) {
    
    inline def setEditableColoncreated(value: /* event */ LayerEvent => Unit): Self = StObject.set(x, "editable:created", js.Any.fromFunction1(value))
    
    inline def setEditableColoncreatedUndefined: Self = StObject.set(x, "editable:created", js.undefined)
    
    inline def setEditableColondisable(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:disable", js.Any.fromFunction1(value))
    
    inline def setEditableColondisableUndefined: Self = StObject.set(x, "editable:disable", js.undefined)
    
    inline def setEditableColondrag(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:drag", js.Any.fromFunction1(value))
    
    inline def setEditableColondragUndefined: Self = StObject.set(x, "editable:drag", js.undefined)
    
    inline def setEditableColondragend(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:dragend", js.Any.fromFunction1(value))
    
    inline def setEditableColondragendUndefined: Self = StObject.set(x, "editable:dragend", js.undefined)
    
    inline def setEditableColondragstart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:dragstart", js.Any.fromFunction1(value))
    
    inline def setEditableColondragstartUndefined: Self = StObject.set(x, "editable:dragstart", js.undefined)
    
    inline def setEditableColondrawingColoncancel(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:drawing:cancel", js.Any.fromFunction1(value))
    
    inline def setEditableColondrawingColoncancelUndefined: Self = StObject.set(x, "editable:drawing:cancel", js.undefined)
    
    inline def setEditableColondrawingColonclick(value: /* event */ CancelableEvent => Unit): Self = StObject.set(x, "editable:drawing:click", js.Any.fromFunction1(value))
    
    inline def setEditableColondrawingColonclickUndefined: Self = StObject.set(x, "editable:drawing:click", js.undefined)
    
    inline def setEditableColondrawingColonclicked(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:drawing:clicked", js.Any.fromFunction1(value))
    
    inline def setEditableColondrawingColonclickedUndefined: Self = StObject.set(x, "editable:drawing:clicked", js.undefined)
    
    inline def setEditableColondrawingColoncommit(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:drawing:commit", js.Any.fromFunction1(value))
    
    inline def setEditableColondrawingColoncommitUndefined: Self = StObject.set(x, "editable:drawing:commit", js.undefined)
    
    inline def setEditableColondrawingColonend(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:drawing:end", js.Any.fromFunction1(value))
    
    inline def setEditableColondrawingColonendUndefined: Self = StObject.set(x, "editable:drawing:end", js.undefined)
    
    inline def setEditableColondrawingColonmousedown(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:drawing:mousedown", js.Any.fromFunction1(value))
    
    inline def setEditableColondrawingColonmousedownUndefined: Self = StObject.set(x, "editable:drawing:mousedown", js.undefined)
    
    inline def setEditableColondrawingColonmouseup(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:drawing:mouseup", js.Any.fromFunction1(value))
    
    inline def setEditableColondrawingColonmouseupUndefined: Self = StObject.set(x, "editable:drawing:mouseup", js.undefined)
    
    inline def setEditableColondrawingColonmove(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:drawing:move", js.Any.fromFunction1(value))
    
    inline def setEditableColondrawingColonmoveUndefined: Self = StObject.set(x, "editable:drawing:move", js.undefined)
    
    inline def setEditableColondrawingColonstart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:drawing:start", js.Any.fromFunction1(value))
    
    inline def setEditableColondrawingColonstartUndefined: Self = StObject.set(x, "editable:drawing:start", js.undefined)
    
    inline def setEditableColonediting(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:editing", js.Any.fromFunction1(value))
    
    inline def setEditableColoneditingUndefined: Self = StObject.set(x, "editable:editing", js.undefined)
    
    inline def setEditableColonenable(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "editable:enable", js.Any.fromFunction1(value))
    
    inline def setEditableColonenableUndefined: Self = StObject.set(x, "editable:enable", js.undefined)
    
    inline def setEditableColonmiddlemarkerColonmousedown(value: /* event */ VertexEvent => Unit): Self = StObject.set(x, "editable:middlemarker:mousedown", js.Any.fromFunction1(value))
    
    inline def setEditableColonmiddlemarkerColonmousedownUndefined: Self = StObject.set(x, "editable:middlemarker:mousedown", js.undefined)
    
    inline def setEditableColonshapeColondelete(value: /* event */ CancelableShapeEvent => Unit): Self = StObject.set(x, "editable:shape:delete", js.Any.fromFunction1(value))
    
    inline def setEditableColonshapeColondeleteUndefined: Self = StObject.set(x, "editable:shape:delete", js.undefined)
    
    inline def setEditableColonshapeColondeleted(value: /* event */ ShapeEvent => Unit): Self = StObject.set(x, "editable:shape:deleted", js.Any.fromFunction1(value))
    
    inline def setEditableColonshapeColondeletedUndefined: Self = StObject.set(x, "editable:shape:deleted", js.undefined)
    
    inline def setEditableColonshapeColonnew(value: /* event */ ShapeEvent => Unit): Self = StObject.set(x, "editable:shape:new", js.Any.fromFunction1(value))
    
    inline def setEditableColonshapeColonnewUndefined: Self = StObject.set(x, "editable:shape:new", js.undefined)
    
    inline def setEditableColonvertexColonaltclick(value: /* event */ VertexEvent => Unit): Self = StObject.set(x, "editable:vertex:altclick", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColonaltclickUndefined: Self = StObject.set(x, "editable:vertex:altclick", js.undefined)
    
    inline def setEditableColonvertexColonclick(value: /* event */ CancelableVertexEvent => Unit): Self = StObject.set(x, "editable:vertex:click", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColonclickUndefined: Self = StObject.set(x, "editable:vertex:click", js.undefined)
    
    inline def setEditableColonvertexColonclicked(value: /* event */ VertexEvent => Unit): Self = StObject.set(x, "editable:vertex:clicked", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColonclickedUndefined: Self = StObject.set(x, "editable:vertex:clicked", js.undefined)
    
    inline def setEditableColonvertexColoncontextmenu(value: /* event */ VertexEvent => Unit): Self = StObject.set(x, "editable:vertex:contextmenu", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColoncontextmenuUndefined: Self = StObject.set(x, "editable:vertex:contextmenu", js.undefined)
    
    inline def setEditableColonvertexColonctrlclick(value: /* event */ VertexEvent => Unit): Self = StObject.set(x, "editable:vertex:ctrlclick", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColonctrlclickUndefined: Self = StObject.set(x, "editable:vertex:ctrlclick", js.undefined)
    
    inline def setEditableColonvertexColondeleted(value: /* event */ VertexEvent => Unit): Self = StObject.set(x, "editable:vertex:deleted", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColondeletedUndefined: Self = StObject.set(x, "editable:vertex:deleted", js.undefined)
    
    inline def setEditableColonvertexColondrag(value: /* event */ VertexEvent => Unit): Self = StObject.set(x, "editable:vertex:drag", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColondragUndefined: Self = StObject.set(x, "editable:vertex:drag", js.undefined)
    
    inline def setEditableColonvertexColondragend(value: /* event */ VertexEvent => Unit): Self = StObject.set(x, "editable:vertex:dragend", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColondragendUndefined: Self = StObject.set(x, "editable:vertex:dragend", js.undefined)
    
    inline def setEditableColonvertexColondragstart(value: /* event */ VertexEvent => Unit): Self = StObject.set(x, "editable:vertex:dragstart", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColondragstartUndefined: Self = StObject.set(x, "editable:vertex:dragstart", js.undefined)
    
    inline def setEditableColonvertexColonmetakeyclick(value: /* event */ VertexEvent => Unit): Self = StObject.set(x, "editable:vertex:metakeyclick", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColonmetakeyclickUndefined: Self = StObject.set(x, "editable:vertex:metakeyclick", js.undefined)
    
    inline def setEditableColonvertexColonmousedown(value: /* event */ VertexEvent => Unit): Self = StObject.set(x, "editable:vertex:mousedown", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColonmousedownUndefined: Self = StObject.set(x, "editable:vertex:mousedown", js.undefined)
    
    inline def setEditableColonvertexColonnew(value: /* event */ VertexEvent => Unit): Self = StObject.set(x, "editable:vertex:new", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColonnewUndefined: Self = StObject.set(x, "editable:vertex:new", js.undefined)
    
    inline def setEditableColonvertexColonrawclick(value: /* event */ CancelableVertexEvent => Unit): Self = StObject.set(x, "editable:vertex:rawclick", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColonrawclickUndefined: Self = StObject.set(x, "editable:vertex:rawclick", js.undefined)
    
    inline def setEditableColonvertexColonshiftclick(value: /* event */ VertexEvent => Unit): Self = StObject.set(x, "editable:vertex:shiftclick", js.Any.fromFunction1(value))
    
    inline def setEditableColonvertexColonshiftclickUndefined: Self = StObject.set(x, "editable:vertex:shiftclick", js.undefined)
  }
}
