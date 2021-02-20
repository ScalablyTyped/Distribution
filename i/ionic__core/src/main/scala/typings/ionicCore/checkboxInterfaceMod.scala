package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxInterfaceMod {
  
  @js.native
  trait CheckboxChangeEventDetail extends StObject {
    
    var checked: Boolean = js.native
    
    var value: js.Any = js.native
  }
  object CheckboxChangeEventDetail {
    
    @scala.inline
    def apply(checked: Boolean, value: js.Any): CheckboxChangeEventDetail = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxChangeEventDetail]
    }
    
    @scala.inline
    implicit class CheckboxChangeEventDetailMutableBuilder[Self <: CheckboxChangeEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
