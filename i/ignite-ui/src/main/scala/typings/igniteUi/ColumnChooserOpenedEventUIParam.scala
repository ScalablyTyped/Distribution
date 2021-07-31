package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnChooserOpenedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the Column Chooser element. This is a jQuery object.
    */
  var columnChooserElement: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ColumnChooserOpenedEventUIParam {
  
  @scala.inline
  def apply(): ColumnChooserOpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnChooserOpenedEventUIParam]
  }
  
  @scala.inline
  implicit class ColumnChooserOpenedEventUIParamMutableBuilder[Self <: ColumnChooserOpenedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnChooserElement(value: String): Self = StObject.set(x, "columnChooserElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnChooserElementUndefined: Self = StObject.set(x, "columnChooserElement", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
