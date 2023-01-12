package typings.griddleReact.mod

import typings.redux.mod.ActionCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GriddleActions
  extends StObject
     with PropertyBag[js.UndefOr[ActionCreator[Any]]] {
  
  var onGetPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
  
  var onNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPrevious: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSort: js.UndefOr[js.Function1[/* sortProperties */ Any, Unit]] = js.undefined
  
  var setFilter: js.UndefOr[js.Function1[/* filter */ GriddleFilter, Unit]] = js.undefined
}
object GriddleActions {
  
  inline def apply(): GriddleActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleActions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GriddleActions] (val x: Self) extends AnyVal {
    
    inline def setOnGetPage(value: /* pageNumber */ Double => Unit): Self = StObject.set(x, "onGetPage", js.Any.fromFunction1(value))
    
    inline def setOnGetPageUndefined: Self = StObject.set(x, "onGetPage", js.undefined)
    
    inline def setOnNext(value: () => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
    
    inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
    
    inline def setOnPrevious(value: () => Unit): Self = StObject.set(x, "onPrevious", js.Any.fromFunction0(value))
    
    inline def setOnPreviousUndefined: Self = StObject.set(x, "onPrevious", js.undefined)
    
    inline def setOnSort(value: /* sortProperties */ Any => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction1(value))
    
    inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
    
    inline def setSetFilter(value: /* filter */ GriddleFilter => Unit): Self = StObject.set(x, "setFilter", js.Any.fromFunction1(value))
    
    inline def setSetFilterUndefined: Self = StObject.set(x, "setFilter", js.undefined)
  }
}
