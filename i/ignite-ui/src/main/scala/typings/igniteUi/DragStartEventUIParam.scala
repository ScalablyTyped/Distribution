package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragStartEventUIParam extends StObject {
  
  /**
    * Gets a reference to the helper.
    */
  var helper: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the data.
    */
  var metadata: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the offset.
    */
  var offset: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the original position of the draggable element.
    */
  var originalPosition: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the current position of the draggable element.
    */
  var position: js.UndefOr[js.Any] = js.native
}
object DragStartEventUIParam {
  
  @scala.inline
  def apply(): DragStartEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragStartEventUIParam]
  }
  
  @scala.inline
  implicit class DragStartEventUIParamMutableBuilder[Self <: DragStartEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHelper(value: String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOriginalPosition(value: js.Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPositionUndefined: Self = StObject.set(x, "originalPosition", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
