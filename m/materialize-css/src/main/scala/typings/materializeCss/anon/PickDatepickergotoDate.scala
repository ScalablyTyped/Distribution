package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Datepicker, 'gotoDate'> */
trait PickDatepickergotoDate extends StObject {
  
  var gotoDate: js.UndefOr[js.Any] = js.undefined
}
object PickDatepickergotoDate {
  
  inline def apply(): PickDatepickergotoDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDatepickergotoDate]
  }
  
  extension [Self <: PickDatepickergotoDate](x: Self) {
    
    inline def setGotoDate(value: js.Any): Self = StObject.set(x, "gotoDate", value.asInstanceOf[js.Any])
    
    inline def setGotoDateUndefined: Self = StObject.set(x, "gotoDate", js.undefined)
  }
}
