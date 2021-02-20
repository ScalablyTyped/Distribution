package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnChooserButtonApplyClickEventUIParam extends StObject {
  
  /**
    * Gets a reference to the Column Chooser element. This is a jQuery object.
    */
  var columnChooserElement: js.UndefOr[String] = js.native
  
  /**
    * Gets the array of columns identifiers which should be hidden.
    */
  var columnsToHide: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets the array of columns identifiers which should be shown.
    */
  var columnsToShow: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ColumnChooserButtonApplyClickEventUIParam {
  
  @scala.inline
  def apply(): ColumnChooserButtonApplyClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnChooserButtonApplyClickEventUIParam]
  }
  
  @scala.inline
  implicit class ColumnChooserButtonApplyClickEventUIParamMutableBuilder[Self <: ColumnChooserButtonApplyClickEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnChooserElement(value: String): Self = StObject.set(x, "columnChooserElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnChooserElementUndefined: Self = StObject.set(x, "columnChooserElement", js.undefined)
    
    @scala.inline
    def setColumnsToHide(value: js.Array[_]): Self = StObject.set(x, "columnsToHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsToHideUndefined: Self = StObject.set(x, "columnsToHide", js.undefined)
    
    @scala.inline
    def setColumnsToHideVarargs(value: js.Any*): Self = StObject.set(x, "columnsToHide", js.Array(value :_*))
    
    @scala.inline
    def setColumnsToShow(value: js.Array[_]): Self = StObject.set(x, "columnsToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsToShowUndefined: Self = StObject.set(x, "columnsToShow", js.undefined)
    
    @scala.inline
    def setColumnsToShowVarargs(value: js.Any*): Self = StObject.set(x, "columnsToShow", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
