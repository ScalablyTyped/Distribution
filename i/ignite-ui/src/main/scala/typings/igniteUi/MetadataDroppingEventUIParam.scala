package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataDroppingEventUIParam extends StObject {
  
  /**
    * A reference to the dragged element.
    */
  var draggedElement: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the helper.
    */
  var helper: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the data.
    */
  var metadata: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the index at which the metadata will be inserted.
    */
  var metadataIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets a reference to the offset.
    */
  var offset: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the current position of the draggable element.
    */
  var position: js.UndefOr[Any] = js.undefined
  
  /**
    * A reference to the drop target.
    */
  var targetElement: js.UndefOr[String] = js.undefined
}
object MetadataDroppingEventUIParam {
  
  inline def apply(): MetadataDroppingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataDroppingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataDroppingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setDraggedElement(value: String): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
    
    inline def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
    
    inline def setHelper(value: String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    inline def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataIndex(value: Double): Self = StObject.set(x, "metadataIndex", value.asInstanceOf[js.Any])
    
    inline def setMetadataIndexUndefined: Self = StObject.set(x, "metadataIndex", js.undefined)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOffset(value: Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTargetElement(value: String): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    
    inline def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
  }
}
