package typings.materialIconButton

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCIconButtonToggleEventDetail extends StObject {
    
    var isOn: Boolean = js.native
  }
  object MDCIconButtonToggleEventDetail {
    
    @scala.inline
    def apply(isOn: Boolean): MDCIconButtonToggleEventDetail = {
      val __obj = js.Dynamic.literal(isOn = isOn.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCIconButtonToggleEventDetail]
    }
    
    @scala.inline
    implicit class MDCIconButtonToggleEventDetailMutableBuilder[Self <: MDCIconButtonToggleEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOn(value: Boolean): Self = StObject.set(x, "isOn", value.asInstanceOf[js.Any])
    }
  }
}
