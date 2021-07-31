package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveColumnHiddenEventUIParam extends StObject {
  
  /**
    * Gets the hidden column index. Has a value only if the column's key is a number.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the hidden column key. Has a value only if the column's key is a string.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the reference to the igGridResponsive widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ResponsiveColumnHiddenEventUIParam {
  
  @scala.inline
  def apply(): ResponsiveColumnHiddenEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveColumnHiddenEventUIParam]
  }
  
  @scala.inline
  implicit class ResponsiveColumnHiddenEventUIParamMutableBuilder[Self <: ResponsiveColumnHiddenEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
