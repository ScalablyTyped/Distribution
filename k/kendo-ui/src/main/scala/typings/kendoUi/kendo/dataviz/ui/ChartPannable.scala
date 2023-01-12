package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartPannable extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var lock: js.UndefOr[String] = js.undefined
}
object ChartPannable {
  
  inline def apply(): ChartPannable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPannable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartPannable] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLock(value: String): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
  }
}
