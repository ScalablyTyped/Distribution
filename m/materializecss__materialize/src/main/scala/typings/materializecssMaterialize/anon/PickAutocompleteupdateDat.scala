package typings.materializecssMaterialize.anon

import typings.materializecssMaterialize.M.AutocompleteData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Autocomplete, 'updateData'> */
trait PickAutocompleteupdateDat extends StObject {
  
  def updateData(data: AutocompleteData): Unit
  @JSName("updateData")
  var updateData_Original: js.Function1[/* data */ AutocompleteData, Unit]
}
object PickAutocompleteupdateDat {
  
  inline def apply(updateData: /* data */ AutocompleteData => Unit): PickAutocompleteupdateDat = {
    val __obj = js.Dynamic.literal(updateData = js.Any.fromFunction1(updateData))
    __obj.asInstanceOf[PickAutocompleteupdateDat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickAutocompleteupdateDat] (val x: Self) extends AnyVal {
    
    inline def setUpdateData(value: /* data */ AutocompleteData => Unit): Self = StObject.set(x, "updateData", js.Any.fromFunction1(value))
  }
}
