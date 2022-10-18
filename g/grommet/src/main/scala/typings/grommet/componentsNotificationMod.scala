package typings.grommet

import typings.grommet.anon.AutoClose
import typings.grommet.componentsAnchorMod.AnchorType
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsNotificationMod {
  
  @JSImport("grommet/components/Notification", "Notification")
  @js.native
  val Notification: FC[NotificationProps] = js.native
  
  trait NotificationProps extends StObject {
    
    var actions: js.UndefOr[js.Array[AnchorType]] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[String | ReactNode] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var status: js.UndefOr[StatusType] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var toast: js.UndefOr[Boolean | AutoClose] = js.undefined
  }
  object NotificationProps {
    
    inline def apply(): NotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationProps]
    }
    
    extension [Self <: NotificationProps](x: Self) {
      
      inline def setActions(value: js.Array[AnchorType]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: AnchorType*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setMessage(value: String | ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnClose(value: /* repeated */ Any => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setStatus(value: StatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToast(value: Boolean | AutoClose): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
      
      inline def setToastUndefined: Self = StObject.set(x, "toast", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.critical
    - typings.grommet.grommetStrings.warning
    - typings.grommet.grommetStrings.normal
    - typings.grommet.grommetStrings.info
    - typings.grommet.grommetStrings.unknown
  */
  trait StatusType extends StObject
  object StatusType {
    
    inline def critical: typings.grommet.grommetStrings.critical = "critical".asInstanceOf[typings.grommet.grommetStrings.critical]
    
    inline def info: typings.grommet.grommetStrings.info = "info".asInstanceOf[typings.grommet.grommetStrings.info]
    
    inline def normal: typings.grommet.grommetStrings.normal = "normal".asInstanceOf[typings.grommet.grommetStrings.normal]
    
    inline def unknown: typings.grommet.grommetStrings.unknown = "unknown".asInstanceOf[typings.grommet.grommetStrings.unknown]
    
    inline def warning: typings.grommet.grommetStrings.warning = "warning".asInstanceOf[typings.grommet.grommetStrings.warning]
  }
}
