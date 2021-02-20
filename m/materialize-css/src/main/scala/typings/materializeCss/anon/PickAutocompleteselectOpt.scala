package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Autocomplete, 'selectOption'> */
@js.native
trait PickAutocompleteselectOpt extends StObject {
  
  var selectOption: js.UndefOr[js.Any] = js.native
}
object PickAutocompleteselectOpt {
  
  @scala.inline
  def apply(): PickAutocompleteselectOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAutocompleteselectOpt]
  }
  
  @scala.inline
  implicit class PickAutocompleteselectOptMutableBuilder[Self <: PickAutocompleteselectOpt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectOption(value: js.Any): Self = StObject.set(x, "selectOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOptionUndefined: Self = StObject.set(x, "selectOption", js.undefined)
  }
}
