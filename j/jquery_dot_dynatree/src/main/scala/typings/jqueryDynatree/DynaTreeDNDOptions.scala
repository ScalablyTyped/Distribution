package typings.jqueryDynatree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynaTreeDNDOptions extends StObject {
  
  var autoExpandMS: js.UndefOr[Double] = js.undefined
  
  // Callback(sourceNode)
  // Make tree nodes accept draggables
  var onDragEnter: js.UndefOr[js.Function2[/* targetNode */ Any, /* sourceNode */ Any, Unit]] = js.undefined
  
  // Callback(targetNode, sourceNode, hitMode)
  var onDragLeave: js.UndefOr[js.Function2[/* targetNode */ Any, /* sourceNode */ Any, Unit]] = js.undefined
  
  // Callback(targetNode, sourceNode)
  var onDragOver: js.UndefOr[
    js.Function3[/* targetNode */ Any, /* sourceNode */ Any, /* hitMode */ String, Unit]
  ] = js.undefined
  
  // true: slide helper back to source if drop is rejected
  // Make tree nodes draggable:
  var onDragStart: js.UndefOr[js.Function1[/* sourceNode */ Any, Unit]] = js.undefined
  
  // Callback(sourceNode), return true, to enable dnd
  var onDragStop: js.UndefOr[js.Function1[/* sourceNode */ Any, Unit]] = js.undefined
  
  // Callback(targetNode, sourceNode, hitMode)
  var onDrop: js.UndefOr[
    js.Function3[/* targetNode */ Any, /* sourceNode */ Any, /* hitMode */ String, Unit]
  ] = js.undefined
  
  // Expand nodes after n milliseconds of hovering.
  var preventVoidMoves: js.UndefOr[Boolean] = js.undefined
  
  // Prevent dropping nodes 'before self', etc.
  var revert: Boolean
}
object DynaTreeDNDOptions {
  
  inline def apply(revert: Boolean): DynaTreeDNDOptions = {
    val __obj = js.Dynamic.literal(revert = revert.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynaTreeDNDOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynaTreeDNDOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoExpandMS(value: Double): Self = StObject.set(x, "autoExpandMS", value.asInstanceOf[js.Any])
    
    inline def setAutoExpandMSUndefined: Self = StObject.set(x, "autoExpandMS", js.undefined)
    
    inline def setOnDragEnter(value: (/* targetNode */ Any, /* sourceNode */ Any) => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction2(value))
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragLeave(value: (/* targetNode */ Any, /* sourceNode */ Any) => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction2(value))
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver(value: (/* targetNode */ Any, /* sourceNode */ Any, /* hitMode */ String) => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction3(value))
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(value: /* sourceNode */ Any => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragStop(value: /* sourceNode */ Any => Unit): Self = StObject.set(x, "onDragStop", js.Any.fromFunction1(value))
    
    inline def setOnDragStopUndefined: Self = StObject.set(x, "onDragStop", js.undefined)
    
    inline def setOnDrop(value: (/* targetNode */ Any, /* sourceNode */ Any, /* hitMode */ String) => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction3(value))
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setPreventVoidMoves(value: Boolean): Self = StObject.set(x, "preventVoidMoves", value.asInstanceOf[js.Any])
    
    inline def setPreventVoidMovesUndefined: Self = StObject.set(x, "preventVoidMoves", js.undefined)
    
    inline def setRevert(value: Boolean): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
  }
}
