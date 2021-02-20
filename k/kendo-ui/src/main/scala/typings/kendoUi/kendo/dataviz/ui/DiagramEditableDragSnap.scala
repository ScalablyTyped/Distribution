package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramEditableDragSnap extends StObject {
  
  var size: js.UndefOr[Double] = js.native
}
object DiagramEditableDragSnap {
  
  @scala.inline
  def apply(): DiagramEditableDragSnap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableDragSnap]
  }
  
  @scala.inline
  implicit class DiagramEditableDragSnapMutableBuilder[Self <: DiagramEditableDragSnap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
