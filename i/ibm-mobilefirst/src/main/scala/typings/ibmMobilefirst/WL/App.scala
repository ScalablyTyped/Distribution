package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object App {
  
  type ActionReceiverCallback = js.Function1[/* action */ js.Any, Unit]
  
  object BackgroundHandler {
    
    type Handler = js.Function0[Unit]
  }
  
  type Callback = js.Function0[Unit]
  
  @js.native
  trait Data extends StObject
  
  @js.native
  trait KeepAliveInBackgroundOptions extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var contentTextText: js.UndefOr[String] = js.native
    
    var contentTitle: js.UndefOr[String] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var notificationId: js.UndefOr[Double] = js.native
    
    var tickerText: js.UndefOr[String] = js.native
  }
  object KeepAliveInBackgroundOptions {
    
    @scala.inline
    def apply(): KeepAliveInBackgroundOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeepAliveInBackgroundOptions]
    }
    
    @scala.inline
    implicit class KeepAliveInBackgroundOptionsMutableBuilder[Self <: KeepAliveInBackgroundOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContentTextText(value: String): Self = StObject.set(x, "contentTextText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTextTextUndefined: Self = StObject.set(x, "contentTextText", js.undefined)
      
      @scala.inline
      def setContentTitle(value: String): Self = StObject.set(x, "contentTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTitleUndefined: Self = StObject.set(x, "contentTitle", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setNotificationId(value: Double): Self = StObject.set(x, "notificationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationIdUndefined: Self = StObject.set(x, "notificationId", js.undefined)
      
      @scala.inline
      def setTickerText(value: String): Self = StObject.set(x, "tickerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickerTextUndefined: Self = StObject.set(x, "tickerText", js.undefined)
    }
  }
  
  @js.native
  trait OpenURLOptions extends StObject {
    
    var directories: js.UndefOr[Double] = js.native
    
    var location: js.UndefOr[Double] = js.native
    
    var menubar: js.UndefOr[Double] = js.native
    
    var resizable: js.UndefOr[Double] = js.native
    
    var scrollbars: js.UndefOr[Double] = js.native
    
    var status: js.UndefOr[Double] = js.native
    
    var toolbar: js.UndefOr[Double] = js.native
  }
  object OpenURLOptions {
    
    @scala.inline
    def apply(): OpenURLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenURLOptions]
    }
    
    @scala.inline
    implicit class OpenURLOptionsMutableBuilder[Self <: OpenURLOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectories(value: Double): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      @scala.inline
      def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMenubar(value: Double): Self = StObject.set(x, "menubar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenubarUndefined: Self = StObject.set(x, "menubar", js.undefined)
      
      @scala.inline
      def setResizable(value: Double): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setScrollbars(value: Double): Self = StObject.set(x, "scrollbars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarsUndefined: Self = StObject.set(x, "scrollbars", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setToolbar(value: Double): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    }
  }
}
