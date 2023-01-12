package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramEditableDrag extends StObject {
  
  var snap: js.UndefOr[Boolean | DiagramEditableDragSnap] = js.undefined
}
object DiagramEditableDrag {
  
  inline def apply(): DiagramEditableDrag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableDrag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagramEditableDrag] (val x: Self) extends AnyVal {
    
    inline def setSnap(value: Boolean | DiagramEditableDragSnap): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
  }
}
