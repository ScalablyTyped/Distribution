package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListColumnSortable extends StObject {
  
  var compare: js.UndefOr[js.Function] = js.native
}
object TreeListColumnSortable {
  
  @scala.inline
  def apply(): TreeListColumnSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListColumnSortable]
  }
  
  @scala.inline
  implicit class TreeListColumnSortableMutableBuilder[Self <: TreeListColumnSortable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompare(value: js.Function): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
  }
}
