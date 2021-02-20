package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramEditableDrag extends StObject {
  
  var snap: js.UndefOr[Boolean | DiagramEditableDragSnap] = js.native
}
object DiagramEditableDrag {
  
  @scala.inline
  def apply(): DiagramEditableDrag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableDrag]
  }
  
  @scala.inline
  implicit class DiagramEditableDragMutableBuilder[Self <: DiagramEditableDrag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnap(value: Boolean | DiagramEditableDragSnap): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
  }
}
