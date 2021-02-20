package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupInterfaceMod {
  
  @js.native
  trait RadioChangeEventDetail extends StObject {
    
    var checked: Boolean = js.native
    
    var value: js.Any = js.native
  }
  object RadioChangeEventDetail {
    
    @scala.inline
    def apply(checked: Boolean, value: js.Any): RadioChangeEventDetail = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioChangeEventDetail]
    }
    
    @scala.inline
    implicit class RadioChangeEventDetailMutableBuilder[Self <: RadioChangeEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RadioGroupChangeEventDetail extends StObject {
    
    var value: js.Any = js.native
  }
  object RadioGroupChangeEventDetail {
    
    @scala.inline
    def apply(value: js.Any): RadioGroupChangeEventDetail = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioGroupChangeEventDetail]
    }
    
    @scala.inline
    implicit class RadioGroupChangeEventDetailMutableBuilder[Self <: RadioGroupChangeEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
