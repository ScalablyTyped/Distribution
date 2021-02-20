package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleInterfaceMod {
  
  @js.native
  trait ToggleChangeEventDetail extends StObject {
    
    var checked: Boolean = js.native
    
    var value: js.Any = js.native
  }
  object ToggleChangeEventDetail {
    
    @scala.inline
    def apply(checked: Boolean, value: js.Any): ToggleChangeEventDetail = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleChangeEventDetail]
    }
    
    @scala.inline
    implicit class ToggleChangeEventDetailMutableBuilder[Self <: ToggleChangeEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
