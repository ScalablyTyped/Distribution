package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttColumnFilterable extends StObject {
  
  var ui: js.UndefOr[String | js.Function] = js.native
}
object GanttColumnFilterable {
  
  @scala.inline
  def apply(): GanttColumnFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttColumnFilterable]
  }
  
  @scala.inline
  implicit class GanttColumnFilterableMutableBuilder[Self <: GanttColumnFilterable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUi(value: String | js.Function): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
