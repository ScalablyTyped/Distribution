package typings.materializecssMaterialize.M

import typings.materializecssMaterialize.materializecssMaterializeStrings.left
import typings.materializecssMaterialize.materializecssMaterializeStrings.right
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the Sidenav
  */
trait SidenavOptions extends StObject {
  
  /**
    * Width of the area where you can start dragging.
    * @default '10px'
    */
  var dragTargetWidth: String
  
  /**
    * Allow swipe gestures to open/close Sidenav.
    * @default true
    */
  var draggable: Boolean
  
  /**
    * Side of screen on which Sidenav appears.
    * @default 'left'
    */
  var edge: left | right
  
  /**
    * Length in ms of enter transition.
    * @default 250
    */
  var inDuration: Double
  
  /**
    * Function called when sidenav finishes exiting.
    */
  def onCloseEnd(elem: Element): Unit
  
  /**
    * Function called when sidenav starts exiting.
    */
  def onCloseStart(elem: Element): Unit
  
  /**
    * Function called when sidenav finishes entering.
    */
  def onOpenEnd(elem: Element): Unit
  
  /**
    * Function called when sidenav starts entering.
    */
  def onOpenStart(elem: Element): Unit
  
  /**
    * Length in ms of exit transition.
    * @default 200
    */
  var outDuration: Double
  
  /**
    * Prevent page from scrolling while sidenav is open.
    * @default true
    */
  var preventScrolling: Boolean
}
object SidenavOptions {
  
  inline def apply(
    dragTargetWidth: String,
    draggable: Boolean,
    edge: left | right,
    inDuration: Double,
    onCloseEnd: Element => Unit,
    onCloseStart: Element => Unit,
    onOpenEnd: Element => Unit,
    onOpenStart: Element => Unit,
    outDuration: Double,
    preventScrolling: Boolean
  ): SidenavOptions = {
    val __obj = js.Dynamic.literal(dragTargetWidth = dragTargetWidth.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1(onCloseEnd), onCloseStart = js.Any.fromFunction1(onCloseStart), onOpenEnd = js.Any.fromFunction1(onOpenEnd), onOpenStart = js.Any.fromFunction1(onOpenStart), outDuration = outDuration.asInstanceOf[js.Any], preventScrolling = preventScrolling.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidenavOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SidenavOptions] (val x: Self) extends AnyVal {
    
    inline def setDragTargetWidth(value: String): Self = StObject.set(x, "dragTargetWidth", value.asInstanceOf[js.Any])
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setEdge(value: left | right): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEnd(value: Element => Unit): Self = StObject.set(x, "onCloseEnd", js.Any.fromFunction1(value))
    
    inline def setOnCloseStart(value: Element => Unit): Self = StObject.set(x, "onCloseStart", js.Any.fromFunction1(value))
    
    inline def setOnOpenEnd(value: Element => Unit): Self = StObject.set(x, "onOpenEnd", js.Any.fromFunction1(value))
    
    inline def setOnOpenStart(value: Element => Unit): Self = StObject.set(x, "onOpenStart", js.Any.fromFunction1(value))
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    inline def setPreventScrolling(value: Boolean): Self = StObject.set(x, "preventScrolling", value.asInstanceOf[js.Any])
  }
}
