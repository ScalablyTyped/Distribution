package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabStripScrollable extends StObject {
  
  var distance: js.UndefOr[Double] = js.undefined
}
object TabStripScrollable {
  
  inline def apply(): TabStripScrollable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabStripScrollable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabStripScrollable] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
  }
}
