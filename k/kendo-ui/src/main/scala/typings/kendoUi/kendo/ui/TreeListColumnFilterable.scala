package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListColumnFilterable extends StObject {
  
  var ui: js.UndefOr[String | js.Function] = js.native
}
object TreeListColumnFilterable {
  
  @scala.inline
  def apply(): TreeListColumnFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListColumnFilterable]
  }
  
  @scala.inline
  implicit class TreeListColumnFilterableMutableBuilder[Self <: TreeListColumnFilterable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUi(value: String | js.Function): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
