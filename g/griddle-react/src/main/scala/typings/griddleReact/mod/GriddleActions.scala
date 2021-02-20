package typings.griddleReact.mod

import typings.redux.mod.ActionCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddleActions
  extends PropertyBag[js.UndefOr[ActionCreator[js.Any]]] {
  
  var onGetPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.native
  
  var onNext: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPrevious: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSort: js.UndefOr[js.Function1[/* sortProperties */ js.Any, Unit]] = js.native
  
  var setFilter: js.UndefOr[js.Function1[/* filter */ GriddleFilter, Unit]] = js.native
}
object GriddleActions {
  
  @scala.inline
  def apply(): GriddleActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleActions]
  }
  
  @scala.inline
  implicit class GriddleActionsMutableBuilder[Self <: GriddleActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnGetPage(value: /* pageNumber */ Double => Unit): Self = StObject.set(x, "onGetPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGetPageUndefined: Self = StObject.set(x, "onGetPage", js.undefined)
    
    @scala.inline
    def setOnNext(value: () => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
    
    @scala.inline
    def setOnPrevious(value: () => Unit): Self = StObject.set(x, "onPrevious", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPreviousUndefined: Self = StObject.set(x, "onPrevious", js.undefined)
    
    @scala.inline
    def setOnSort(value: /* sortProperties */ js.Any => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
    
    @scala.inline
    def setSetFilter(value: /* filter */ GriddleFilter => Unit): Self = StObject.set(x, "setFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFilterUndefined: Self = StObject.set(x, "setFilter", js.undefined)
  }
}
