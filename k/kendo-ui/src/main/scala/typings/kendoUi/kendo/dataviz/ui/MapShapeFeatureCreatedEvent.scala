package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.dataviz.map.layer.Shape
import typings.kendoUi.kendo.drawing.Group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapShapeFeatureCreatedEvent extends MapEvent {
  
  var dataItem: js.UndefOr[js.Any] = js.native
  
  var group: js.UndefOr[Group] = js.native
  
  var layer: js.UndefOr[Shape] = js.native
  
  var properties: js.UndefOr[js.Any] = js.native
}
object MapShapeFeatureCreatedEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Map): MapShapeFeatureCreatedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapShapeFeatureCreatedEvent]
  }
  
  @scala.inline
  implicit class MapShapeFeatureCreatedEventMutableBuilder[Self <: MapShapeFeatureCreatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataItem(value: js.Any): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataItemUndefined: Self = StObject.set(x, "dataItem", js.undefined)
    
    @scala.inline
    def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setLayer(value: Shape): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
