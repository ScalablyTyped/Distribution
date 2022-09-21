package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Autocomplete, 'selectOption'> */
trait PickAutocompleteselectOpt extends StObject {
  
  var selectOption: js.UndefOr[Any] = js.undefined
}
object PickAutocompleteselectOpt {
  
  inline def apply(): PickAutocompleteselectOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAutocompleteselectOpt]
  }
  
  extension [Self <: PickAutocompleteselectOpt](x: Self) {
    
    inline def setSelectOption(value: Any): Self = StObject.set(x, "selectOption", value.asInstanceOf[js.Any])
    
    inline def setSelectOptionUndefined: Self = StObject.set(x, "selectOption", js.undefined)
  }
}
