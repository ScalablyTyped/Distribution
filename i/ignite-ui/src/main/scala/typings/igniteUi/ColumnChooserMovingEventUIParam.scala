package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnChooserMovingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the Column Chooser element. This is a jQuery object.
    */
  var columnChooserElement: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the original position of the column chooser div as { top, left } object, relative to the page.
    */
  var originalPosition: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the current position of the column chooser div as { top, left } object, relative to the page.
    */
  var position: js.UndefOr[js.Any] = js.undefined
}
object ColumnChooserMovingEventUIParam {
  
  @scala.inline
  def apply(): ColumnChooserMovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnChooserMovingEventUIParam]
  }
  
  @scala.inline
  implicit class ColumnChooserMovingEventUIParamMutableBuilder[Self <: ColumnChooserMovingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnChooserElement(value: String): Self = StObject.set(x, "columnChooserElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnChooserElementUndefined: Self = StObject.set(x, "columnChooserElement", js.undefined)
    
    @scala.inline
    def setOriginalPosition(value: js.Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPositionUndefined: Self = StObject.set(x, "originalPosition", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
