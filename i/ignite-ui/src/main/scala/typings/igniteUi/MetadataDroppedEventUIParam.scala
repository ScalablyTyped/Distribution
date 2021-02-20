package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataDroppedEventUIParam extends StObject {
  
  /**
    * A reference to the dragged element.
    */
  var draggedElement: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the helper.
    */
  var helper: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the data.
    */
  var metadata: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the index at which the metadata is inserted.
    */
  var metadataIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets a reference to the offset.
    */
  var offset: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the current position of the draggable element.
    */
  var position: js.UndefOr[js.Any] = js.native
  
  /**
    * A reference to the drop target.
    */
  var targetElement: js.UndefOr[String] = js.native
}
object MetadataDroppedEventUIParam {
  
  @scala.inline
  def apply(): MetadataDroppedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataDroppedEventUIParam]
  }
  
  @scala.inline
  implicit class MetadataDroppedEventUIParamMutableBuilder[Self <: MetadataDroppedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggedElement(value: String): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
    
    @scala.inline
    def setHelper(value: String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataIndex(value: Double): Self = StObject.set(x, "metadataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataIndexUndefined: Self = StObject.set(x, "metadataIndex", js.undefined)
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTargetElement(value: String): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
  }
}
