package typings.materializecssMaterialize.anon

import typings.materializecssMaterialize.M.Views
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Timepicker, 'showView'> */
trait PickTimepickershowView extends StObject {
  
  def showView(view: Views): Unit
  @JSName("showView")
  var showView_Original: js.Function1[/* view */ Views, Unit]
}
object PickTimepickershowView {
  
  inline def apply(showView: /* view */ Views => Unit): PickTimepickershowView = {
    val __obj = js.Dynamic.literal(showView = js.Any.fromFunction1(showView))
    __obj.asInstanceOf[PickTimepickershowView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickTimepickershowView] (val x: Self) extends AnyVal {
    
    inline def setShowView(value: /* view */ Views => Unit): Self = StObject.set(x, "showView", js.Any.fromFunction1(value))
  }
}
