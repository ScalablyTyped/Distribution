package typings.griddleReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.griddleReact.anon.FilterPlaceholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddleInitialState
  extends /* x */ StringDictionary[js.Any] {
  
  var enableSettings: js.UndefOr[Boolean] = js.native
  
  var pageProperties: js.UndefOr[GriddlePageProperties] = js.native
  
  var sortMethod: js.UndefOr[
    js.Function3[
      /* data */ js.Array[_], 
      /* column */ String, 
      /* sortAscending */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  
  var sortProperties: js.UndefOr[js.Array[GriddleSortKey]] = js.native
  
  var textProperties: js.UndefOr[FilterPlaceholder] = js.native
}
object GriddleInitialState {
  
  @scala.inline
  def apply(): GriddleInitialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleInitialState]
  }
  
  @scala.inline
  implicit class GriddleInitialStateMutableBuilder[Self <: GriddleInitialState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableSettings(value: Boolean): Self = StObject.set(x, "enableSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSettingsUndefined: Self = StObject.set(x, "enableSettings", js.undefined)
    
    @scala.inline
    def setPageProperties(value: GriddlePageProperties): Self = StObject.set(x, "pageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagePropertiesUndefined: Self = StObject.set(x, "pageProperties", js.undefined)
    
    @scala.inline
    def setSortMethod(
      value: (/* data */ js.Array[_], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double
    ): Self = StObject.set(x, "sortMethod", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSortMethodUndefined: Self = StObject.set(x, "sortMethod", js.undefined)
    
    @scala.inline
    def setSortProperties(value: js.Array[GriddleSortKey]): Self = StObject.set(x, "sortProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortPropertiesUndefined: Self = StObject.set(x, "sortProperties", js.undefined)
    
    @scala.inline
    def setSortPropertiesVarargs(value: GriddleSortKey*): Self = StObject.set(x, "sortProperties", js.Array(value :_*))
    
    @scala.inline
    def setTextProperties(value: FilterPlaceholder): Self = StObject.set(x, "textProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPropertiesUndefined: Self = StObject.set(x, "textProperties", js.undefined)
  }
}
