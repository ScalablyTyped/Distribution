package typings.materialDialog

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCDialogCloseEvent
    extends StObject
       with Event {
    
    val detail: MDCDialogCloseEventDetail = js.native
  }
  
  trait MDCDialogCloseEventDetail extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
  }
  object MDCDialogCloseEventDetail {
    
    inline def apply(): MDCDialogCloseEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDCDialogCloseEventDetail]
    }
    
    extension [Self <: MDCDialogCloseEventDetail](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    }
  }
}
