package typings.jqueryGrowl

import typings.jqueryGrowl.growl.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait growl extends StObject {
  
  def apply(options: Options): Unit = js.native
  
  def error(options: Options): Unit = js.native
  
  def notice(options: Options): Unit = js.native
  
  def warning(options: Options): Unit = js.native
}
object growl {
  
  trait Options extends StObject {
    
    // while hovering over the alert, prevent it from being dismissed (true | false - default: true)
    var delayOnHover: js.UndefOr[Boolean] = js.undefined
    
    // the duration (in milliseconds) for which the alert is displayed (default: 3200)
    var duration: js.UndefOr[Double] = js.undefined
    
    // whether the alert should be fixed rather than auto- dismissed(true | false - default: false)
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    // the alert's position ('tl' | 'tr' | 'bl' | 'br' | 'tc' | 'bc' - default: 'tr')
    var location: js.UndefOr[String] = js.undefined
    
    // Message
    var message: String
    
    // the alert's size ('small' | 'medium' | 'large' - default: 'medium')
    var size: js.UndefOr[String] = js.undefined
    
    // the alert's style ('default' | 'error' | 'notice' | 'warning' - default: 'default')
    var style: js.UndefOr[String] = js.undefined
    
    // Title
    var title: js.UndefOr[String] = js.undefined
    
    // URL
    var url: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(message: String): Options = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelayOnHover(value: Boolean): Self = StObject.set(x, "delayOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayOnHoverUndefined: Self = StObject.set(x, "delayOnHover", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
