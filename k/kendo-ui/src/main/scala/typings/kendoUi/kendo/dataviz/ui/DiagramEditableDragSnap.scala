package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramEditableDragSnap extends StObject {
  
  var size: js.UndefOr[Double] = js.undefined
}
object DiagramEditableDragSnap {
  
  inline def apply(): DiagramEditableDragSnap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableDragSnap]
  }
  
  extension [Self <: DiagramEditableDragSnap](x: Self) {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
