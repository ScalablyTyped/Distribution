package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridSearch extends StObject {
  
  var fields: js.UndefOr[js.Any] = js.undefined
}
object GridSearch {
  
  @scala.inline
  def apply(): GridSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridSearch]
  }
  
  @scala.inline
  implicit class GridSearchMutableBuilder[Self <: GridSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
