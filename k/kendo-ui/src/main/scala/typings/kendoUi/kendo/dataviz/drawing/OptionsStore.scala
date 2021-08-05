package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsStore
  extends StObject
     with Class {
  
  def get(field: String): js.Any
  
  var observer: js.Any
  
  var options: OptionsStoreOptions
  
  def set(field: String, value: js.Any): Unit
}
object OptionsStore {
  
  inline def apply(
    get: String => js.Any,
    observer: js.Any,
    options: OptionsStoreOptions,
    set: (String, js.Any) => Unit
  ): OptionsStore = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), observer = observer.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[OptionsStore]
  }
  
  extension [Self <: OptionsStore](x: Self) {
    
    inline def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setObserver(value: js.Any): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: OptionsStoreOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
