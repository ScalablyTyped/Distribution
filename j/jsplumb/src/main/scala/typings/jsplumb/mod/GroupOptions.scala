package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupOptions extends StObject {
  
  var anchor: js.UndefOr[AnchorSpec] = js.undefined
  
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  var constrain: js.UndefOr[Boolean] = js.undefined
  
  var dragOptions: js.UndefOr[DragOptions] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var dropOverride: js.UndefOr[Boolean] = js.undefined
  
  var droppable: js.UndefOr[Boolean] = js.undefined
  
  var el: ElementRef
  
  var endpoint: js.UndefOr[EndpointSpec] = js.undefined
  
  var ghost: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var orphan: js.UndefOr[Boolean] = js.undefined
  
  var proxied: js.UndefOr[Boolean] = js.undefined
  
  var prune: js.UndefOr[Boolean] = js.undefined
  
  var revert: js.UndefOr[Boolean] = js.undefined
}
object GroupOptions {
  
  inline def apply(el: ElementRef): GroupOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupOptions] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: AnchorSpec): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAnchorVarargs(value: (AnchorStaticSpec | AnchorDynamicId | AnchorPerimeterSpec | AnchorContinuousSpec)*): Self = StObject.set(x, "anchor", js.Array(value*))
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setConstrain(value: Boolean): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
    
    inline def setConstrainUndefined: Self = StObject.set(x, "constrain", js.undefined)
    
    inline def setDragOptions(value: DragOptions): Self = StObject.set(x, "dragOptions", value.asInstanceOf[js.Any])
    
    inline def setDragOptionsUndefined: Self = StObject.set(x, "dragOptions", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setDropOverride(value: Boolean): Self = StObject.set(x, "dropOverride", value.asInstanceOf[js.Any])
    
    inline def setDropOverrideUndefined: Self = StObject.set(x, "dropOverride", js.undefined)
    
    inline def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
    
    inline def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
    
    inline def setEl(value: ElementRef): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setEndpoint(value: EndpointSpec): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
    
    inline def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOrphan(value: Boolean): Self = StObject.set(x, "orphan", value.asInstanceOf[js.Any])
    
    inline def setOrphanUndefined: Self = StObject.set(x, "orphan", js.undefined)
    
    inline def setProxied(value: Boolean): Self = StObject.set(x, "proxied", value.asInstanceOf[js.Any])
    
    inline def setProxiedUndefined: Self = StObject.set(x, "proxied", js.undefined)
    
    inline def setPrune(value: Boolean): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
    
    inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
    
    inline def setRevert(value: Boolean): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    inline def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
  }
}
