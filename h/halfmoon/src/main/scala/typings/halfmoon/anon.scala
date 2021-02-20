package typings.halfmoon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AlertType extends StObject {
    
    var alertType: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var fillType: js.UndefOr[String] = js.native
    
    var hasDismissButton: js.UndefOr[Boolean] = js.native
    
    var timeShown: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object AlertType {
    
    @scala.inline
    def apply(): AlertType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertType]
    }
    
    @scala.inline
    implicit class AlertTypeMutableBuilder[Self <: AlertType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlertType(value: String): Self = StObject.set(x, "alertType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlertTypeUndefined: Self = StObject.set(x, "alertType", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setFillType(value: String): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillTypeUndefined: Self = StObject.set(x, "fillType", js.undefined)
      
      @scala.inline
      def setHasDismissButton(value: Boolean): Self = StObject.set(x, "hasDismissButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasDismissButtonUndefined: Self = StObject.set(x, "hasDismissButton", js.undefined)
      
      @scala.inline
      def setTimeShown(value: Double): Self = StObject.set(x, "timeShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeShownUndefined: Self = StObject.set(x, "timeShown", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
