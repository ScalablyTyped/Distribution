package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramPannable extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
}
object DiagramPannable {
  
  inline def apply(): DiagramPannable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramPannable]
  }
  
  extension [Self <: DiagramPannable](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
