package typings.materialDialog

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCDialogCloseEvent extends Event {
    
    val detail: MDCDialogCloseEventDetail = js.native
  }
  
  @js.native
  trait MDCDialogCloseEventDetail extends StObject {
    
    var action: js.UndefOr[String] = js.native
  }
  object MDCDialogCloseEventDetail {
    
    @scala.inline
    def apply(): MDCDialogCloseEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDCDialogCloseEventDetail]
    }
    
    @scala.inline
    implicit class MDCDialogCloseEventDetailMutableBuilder[Self <: MDCDialogCloseEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    }
  }
}
