package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setBestiesInputMod {
  
  @js.native
  trait SetBestiesInput extends StObject {
    
    var add: js.UndefOr[js.Array[String | Double]] = js.native
    
    var remove: js.UndefOr[js.Array[String | Double]] = js.native
  }
  object SetBestiesInput {
    
    @scala.inline
    def apply(): SetBestiesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetBestiesInput]
    }
    
    @scala.inline
    implicit class SetBestiesInputMutableBuilder[Self <: SetBestiesInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: js.Array[String | Double]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      @scala.inline
      def setAddVarargs(value: (String | Double)*): Self = StObject.set(x, "add", js.Array(value :_*))
      
      @scala.inline
      def setRemove(value: js.Array[String | Double]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setRemoveVarargs(value: (String | Double)*): Self = StObject.set(x, "remove", js.Array(value :_*))
    }
  }
}
