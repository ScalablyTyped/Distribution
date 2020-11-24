package typings.griddleReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.griddleReact.anon.FilterPlaceholder
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
  implicit class GriddleInitialStateOps[Self <: GriddleInitialState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnableSettings(value: Boolean): Self = this.set("enableSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSettings: Self = this.set("enableSettings", js.undefined)
    
    @scala.inline
    def setPageProperties(value: GriddlePageProperties): Self = this.set("pageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageProperties: Self = this.set("pageProperties", js.undefined)
    
    @scala.inline
    def setSortMethod(
      value: (/* data */ js.Array[_], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double
    ): Self = this.set("sortMethod", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSortMethod: Self = this.set("sortMethod", js.undefined)
    
    @scala.inline
    def setSortPropertiesVarargs(value: GriddleSortKey*): Self = this.set("sortProperties", js.Array(value :_*))
    
    @scala.inline
    def setSortProperties(value: js.Array[GriddleSortKey]): Self = this.set("sortProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortProperties: Self = this.set("sortProperties", js.undefined)
    
    @scala.inline
    def setTextProperties(value: FilterPlaceholder): Self = this.set("textProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextProperties: Self = this.set("textProperties", js.undefined)
  }
}
