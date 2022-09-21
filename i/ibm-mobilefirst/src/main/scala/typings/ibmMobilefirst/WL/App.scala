package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object App {
  
  type ActionReceiverCallback = js.Function1[/* action */ Any, Unit]
  
  object BackgroundHandler {
    
    type Handler = js.Function0[Unit]
  }
  
  type Callback = js.Function0[Unit]
  
  trait Data extends StObject
  
  trait KeepAliveInBackgroundOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentTextText: js.UndefOr[String] = js.undefined
    
    var contentTitle: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var notificationId: js.UndefOr[Double] = js.undefined
    
    var tickerText: js.UndefOr[String] = js.undefined
  }
  object KeepAliveInBackgroundOptions {
    
    inline def apply(): KeepAliveInBackgroundOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeepAliveInBackgroundOptions]
    }
    
    extension [Self <: KeepAliveInBackgroundOptions](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentTextText(value: String): Self = StObject.set(x, "contentTextText", value.asInstanceOf[js.Any])
      
      inline def setContentTextTextUndefined: Self = StObject.set(x, "contentTextText", js.undefined)
      
      inline def setContentTitle(value: String): Self = StObject.set(x, "contentTitle", value.asInstanceOf[js.Any])
      
      inline def setContentTitleUndefined: Self = StObject.set(x, "contentTitle", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setNotificationId(value: Double): Self = StObject.set(x, "notificationId", value.asInstanceOf[js.Any])
      
      inline def setNotificationIdUndefined: Self = StObject.set(x, "notificationId", js.undefined)
      
      inline def setTickerText(value: String): Self = StObject.set(x, "tickerText", value.asInstanceOf[js.Any])
      
      inline def setTickerTextUndefined: Self = StObject.set(x, "tickerText", js.undefined)
    }
  }
  
  trait OpenURLOptions extends StObject {
    
    var directories: js.UndefOr[Double] = js.undefined
    
    var location: js.UndefOr[Double] = js.undefined
    
    var menubar: js.UndefOr[Double] = js.undefined
    
    var resizable: js.UndefOr[Double] = js.undefined
    
    var scrollbars: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
    
    var toolbar: js.UndefOr[Double] = js.undefined
  }
  object OpenURLOptions {
    
    inline def apply(): OpenURLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenURLOptions]
    }
    
    extension [Self <: OpenURLOptions](x: Self) {
      
      inline def setDirectories(value: Double): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMenubar(value: Double): Self = StObject.set(x, "menubar", value.asInstanceOf[js.Any])
      
      inline def setMenubarUndefined: Self = StObject.set(x, "menubar", js.undefined)
      
      inline def setResizable(value: Double): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setScrollbars(value: Double): Self = StObject.set(x, "scrollbars", value.asInstanceOf[js.Any])
      
      inline def setScrollbarsUndefined: Self = StObject.set(x, "scrollbars", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setToolbar(value: Double): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    }
  }
}
