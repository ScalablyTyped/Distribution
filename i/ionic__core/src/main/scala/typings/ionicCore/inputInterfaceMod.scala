package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputInterfaceMod {
  
  @js.native
  trait InputChangeEventDetail extends StObject {
    
    var value: js.UndefOr[String | Null] = js.native
  }
  object InputChangeEventDetail {
    
    @scala.inline
    def apply(): InputChangeEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputChangeEventDetail]
    }
    
    @scala.inline
    implicit class InputChangeEventDetailMutableBuilder[Self <: InputChangeEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
