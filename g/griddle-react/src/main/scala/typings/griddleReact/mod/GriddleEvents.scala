package typings.griddleReact.mod

import typings.griddleReact.mod.utils.SortProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddleEvents extends GriddleActions {
  
  var onFilter: js.UndefOr[js.Function1[/* filterText */ String, Unit]] = js.native
  
  var setSortProperties: js.UndefOr[js.Function1[/* sortProperties */ SortProperties, js.Function0[Unit]]] = js.native
}
object GriddleEvents {
  
  @scala.inline
  def apply(): GriddleEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleEvents]
  }
  
  @scala.inline
  implicit class GriddleEventsMutableBuilder[Self <: GriddleEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnFilter(value: /* filterText */ String => Unit): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
    
    @scala.inline
    def setSetSortProperties(value: /* sortProperties */ SortProperties => js.Function0[Unit]): Self = StObject.set(x, "setSortProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSortPropertiesUndefined: Self = StObject.set(x, "setSortProperties", js.undefined)
  }
}
