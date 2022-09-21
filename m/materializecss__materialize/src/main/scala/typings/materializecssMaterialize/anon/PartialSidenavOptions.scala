package typings.materializecssMaterialize.anon

import typings.materializecssMaterialize.M.Sidenav
import typings.materializecssMaterialize.materializecssMaterializeStrings.left
import typings.materializecssMaterialize.materializecssMaterializeStrings.right
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.SidenavOptions> */
trait PartialSidenavOptions extends StObject {
  
  var dragTargetWidth: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var edge: js.UndefOr[left | right] = js.undefined
  
  var inDuration: js.UndefOr[Double] = js.undefined
  
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]] = js.undefined
  
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]] = js.undefined
  
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]] = js.undefined
  
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]] = js.undefined
  
  var outDuration: js.UndefOr[Double] = js.undefined
}
object PartialSidenavOptions {
  
  inline def apply(): PartialSidenavOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSidenavOptions]
  }
  
  extension [Self <: PartialSidenavOptions](x: Self) {
    
    inline def setDragTargetWidth(value: String): Self = StObject.set(x, "dragTargetWidth", value.asInstanceOf[js.Any])
    
    inline def setDragTargetWidthUndefined: Self = StObject.set(x, "dragTargetWidth", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setEdge(value: left | right): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setInDurationUndefined: Self = StObject.set(x, "inDuration", js.undefined)
    
    inline def setOnCloseEnd(value: js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]): Self = StObject.set(x, "onCloseEnd", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEndUndefined: Self = StObject.set(x, "onCloseEnd", js.undefined)
    
    inline def setOnCloseStart(value: js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]): Self = StObject.set(x, "onCloseStart", value.asInstanceOf[js.Any])
    
    inline def setOnCloseStartUndefined: Self = StObject.set(x, "onCloseStart", js.undefined)
    
    inline def setOnOpenEnd(value: js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]): Self = StObject.set(x, "onOpenEnd", value.asInstanceOf[js.Any])
    
    inline def setOnOpenEndUndefined: Self = StObject.set(x, "onOpenEnd", js.undefined)
    
    inline def setOnOpenStart(value: js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]): Self = StObject.set(x, "onOpenStart", value.asInstanceOf[js.Any])
    
    inline def setOnOpenStartUndefined: Self = StObject.set(x, "onOpenStart", js.undefined)
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    inline def setOutDurationUndefined: Self = StObject.set(x, "outDuration", js.undefined)
  }
}
