package typings.materialSnackbar

import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type MDCSnackbarAnnouncer = js.Function2[/* ariaEl */ Element, /* labelEl */ js.UndefOr[Element], Unit]
  
  type MDCSnackbarAnnouncerFactory = js.Function0[MDCSnackbarAnnouncer]
  
  @js.native
  trait MDCSnackbarCloseEvent
    extends StObject
       with Event {
    
    val detail: MDCSnackbarCloseEventDetail = js.native
  }
  
  trait MDCSnackbarCloseEventDetail extends StObject {
    
    var reason: js.UndefOr[String] = js.undefined
  }
  object MDCSnackbarCloseEventDetail {
    
    inline def apply(): MDCSnackbarCloseEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDCSnackbarCloseEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCSnackbarCloseEventDetail] (val x: Self) extends AnyVal {
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    }
  }
}
