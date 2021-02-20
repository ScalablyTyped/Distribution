package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragStopEventUIParam extends StObject {
  
  /**
    * Gets a reference to the helper.
    */
  var helper: js.UndefOr[String] = js.native
  
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
object DragStopEventUIParam {
  
  @scala.inline
  def apply(): DragStopEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragStopEventUIParam]
  }
  
  @scala.inline
  implicit class DragStopEventUIParamMutableBuilder[Self <: DragStopEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHelper(value: String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
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
