package typings.interactjsTypes.coreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionMap extends StObject {
  
  var drag: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof drag */ Any
  ] = js.undefined
  
  var drop: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof drop */ Any
  ] = js.undefined
  
  var gesture: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof gesture */ Any
  ] = js.undefined
  
  var resize: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof resize */ Any
  ] = js.undefined
}
object ActionMap {
  
  inline def apply(): ActionMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionMap] (val x: Self) extends AnyVal {
    
    inline def setDrag(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof drag */ Any): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setDrop(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof drop */ Any): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setGesture(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof gesture */ Any): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
    
    inline def setGestureUndefined: Self = StObject.set(x, "gesture", js.undefined)
    
    inline def setResize(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof resize */ Any): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
