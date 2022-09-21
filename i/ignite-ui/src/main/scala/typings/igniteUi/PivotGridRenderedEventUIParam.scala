package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridRenderedEventUIParam extends StObject {
  
  /**
    * Gets reference to the igGrid widget, which represents the data.
    */
  var grid: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object PivotGridRenderedEventUIParam {
  
  inline def apply(): PivotGridRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridRenderedEventUIParam]
  }
  
  extension [Self <: PivotGridRenderedEventUIParam](x: Self) {
    
    inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
