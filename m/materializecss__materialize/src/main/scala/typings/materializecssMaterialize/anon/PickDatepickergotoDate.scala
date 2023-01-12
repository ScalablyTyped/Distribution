package typings.materializecssMaterialize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Datepicker, 'gotoDate'> */
trait PickDatepickergotoDate extends StObject {
  
  def gotoDate(date: js.Date): Unit
  @JSName("gotoDate")
  var gotoDate_Original: js.Function1[/* date */ js.Date, Unit]
}
object PickDatepickergotoDate {
  
  inline def apply(gotoDate: /* date */ js.Date => Unit): PickDatepickergotoDate = {
    val __obj = js.Dynamic.literal(gotoDate = js.Any.fromFunction1(gotoDate))
    __obj.asInstanceOf[PickDatepickergotoDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickDatepickergotoDate] (val x: Self) extends AnyVal {
    
    inline def setGotoDate(value: /* date */ js.Date => Unit): Self = StObject.set(x, "gotoDate", js.Any.fromFunction1(value))
  }
}
