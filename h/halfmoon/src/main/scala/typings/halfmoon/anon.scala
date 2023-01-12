package typings.halfmoon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AlertType extends StObject {
    
    var alertType: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var fillType: js.UndefOr[String] = js.undefined
    
    var hasDismissButton: js.UndefOr[Boolean] = js.undefined
    
    var timeShown: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object AlertType {
    
    inline def apply(): AlertType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlertType] (val x: Self) extends AnyVal {
      
      inline def setAlertType(value: String): Self = StObject.set(x, "alertType", value.asInstanceOf[js.Any])
      
      inline def setAlertTypeUndefined: Self = StObject.set(x, "alertType", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFillType(value: String): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
      
      inline def setFillTypeUndefined: Self = StObject.set(x, "fillType", js.undefined)
      
      inline def setHasDismissButton(value: Boolean): Self = StObject.set(x, "hasDismissButton", value.asInstanceOf[js.Any])
      
      inline def setHasDismissButtonUndefined: Self = StObject.set(x, "hasDismissButton", js.undefined)
      
      inline def setTimeShown(value: Double): Self = StObject.set(x, "timeShown", value.asInstanceOf[js.Any])
      
      inline def setTimeShownUndefined: Self = StObject.set(x, "timeShown", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
