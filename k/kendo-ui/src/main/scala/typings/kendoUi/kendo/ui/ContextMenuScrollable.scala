package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenuScrollable extends StObject {
  
  var distance: js.UndefOr[Double] = js.undefined
}
object ContextMenuScrollable {
  
  @scala.inline
  def apply(): ContextMenuScrollable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuScrollable]
  }
  
  @scala.inline
  implicit class ContextMenuScrollableMutableBuilder[Self <: ContextMenuScrollable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
  }
}
