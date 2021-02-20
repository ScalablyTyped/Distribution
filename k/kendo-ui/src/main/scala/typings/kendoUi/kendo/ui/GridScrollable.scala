package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridScrollable extends StObject {
  
  var endless: js.UndefOr[Boolean] = js.native
  
  var virtual: js.UndefOr[Boolean | String] = js.native
}
object GridScrollable {
  
  @scala.inline
  def apply(): GridScrollable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridScrollable]
  }
  
  @scala.inline
  implicit class GridScrollableMutableBuilder[Self <: GridScrollable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndless(value: Boolean): Self = StObject.set(x, "endless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndlessUndefined: Self = StObject.set(x, "endless", js.undefined)
    
    @scala.inline
    def setVirtual(value: Boolean | String): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
