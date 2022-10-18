package typings.materializeCss.anon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Autocomplete, 'selectOption'> */
trait PickAutocompleteselectOpt extends StObject {
  
  def selectOption(el: Element): Unit
  @JSName("selectOption")
  var selectOption_Original: js.Function1[/* el */ Element, Unit]
}
object PickAutocompleteselectOpt {
  
  inline def apply(selectOption: /* el */ Element => Unit): PickAutocompleteselectOpt = {
    val __obj = js.Dynamic.literal(selectOption = js.Any.fromFunction1(selectOption))
    __obj.asInstanceOf[PickAutocompleteselectOpt]
  }
  
  extension [Self <: PickAutocompleteselectOpt](x: Self) {
    
    inline def setSelectOption(value: /* el */ Element => Unit): Self = StObject.set(x, "selectOption", js.Any.fromFunction1(value))
  }
}
