package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaInterfaceMod {
  
  trait TextareaChangeEventDetail extends StObject {
    
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object TextareaChangeEventDetail {
    
    @scala.inline
    def apply(): TextareaChangeEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextareaChangeEventDetail]
    }
    
    @scala.inline
    implicit class TextareaChangeEventDetailMutableBuilder[Self <: TextareaChangeEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
