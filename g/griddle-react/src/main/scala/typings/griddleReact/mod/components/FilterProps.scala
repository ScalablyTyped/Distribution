package typings.griddleReact.mod.components

import org.scalablytyped.runtime.StringDictionary
import typings.griddleReact.mod.GriddleFilter
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterProps
  extends /* x */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var setFilter: js.UndefOr[js.Function1[/* filter */ GriddleFilter, Unit]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object FilterProps {
  
  @scala.inline
  def apply(): FilterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterProps]
  }
  
  @scala.inline
  implicit class FilterPropsMutableBuilder[Self <: FilterProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setSetFilter(value: /* filter */ GriddleFilter => Unit): Self = StObject.set(x, "setFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFilterUndefined: Self = StObject.set(x, "setFilter", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
