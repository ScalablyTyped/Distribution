package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGridRenderedEventUIParam extends StObject {
  
  /**
    * Gets reference to the igGrid widget, which represents the data.
    */
  var grid: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object PivotGridRenderedEventUIParam {
  
  @scala.inline
  def apply(): PivotGridRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class PivotGridRenderedEventUIParamMutableBuilder[Self <: PivotGridRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
