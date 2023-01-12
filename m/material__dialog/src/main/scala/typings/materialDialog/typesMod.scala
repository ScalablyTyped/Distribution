package typings.materialDialog

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait DialogConfigOptions extends StObject {
    
    var isAboveFullscreenDialog: js.UndefOr[Boolean] = js.undefined
  }
  object DialogConfigOptions {
    
    inline def apply(): DialogConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setIsAboveFullscreenDialog(value: Boolean): Self = StObject.set(x, "isAboveFullscreenDialog", value.asInstanceOf[js.Any])
      
      inline def setIsAboveFullscreenDialogUndefined: Self = StObject.set(x, "isAboveFullscreenDialog", js.undefined)
    }
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCDialogCloseEventDetail] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    }
  }
}
