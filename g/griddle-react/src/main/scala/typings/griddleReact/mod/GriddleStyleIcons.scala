package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddleStyleIcons extends StObject {
  
  var sortAscendingIcon: js.UndefOr[js.Any] = js.native
  
  var sortDescendingIcon: js.UndefOr[js.Any] = js.native
}
object GriddleStyleIcons {
  
  @scala.inline
  def apply(): GriddleStyleIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleStyleIcons]
  }
  
  @scala.inline
  implicit class GriddleStyleIconsMutableBuilder[Self <: GriddleStyleIcons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSortAscendingIcon(value: js.Any): Self = StObject.set(x, "sortAscendingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortAscendingIconUndefined: Self = StObject.set(x, "sortAscendingIcon", js.undefined)
    
    @scala.inline
    def setSortDescendingIcon(value: js.Any): Self = StObject.set(x, "sortDescendingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDescendingIconUndefined: Self = StObject.set(x, "sortDescendingIcon", js.undefined)
  }
}
