package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setBestiesInputMod {
  
  trait SetBestiesInput extends StObject {
    
    var add: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var remove: js.UndefOr[js.Array[String | Double]] = js.undefined
  }
  object SetBestiesInput {
    
    inline def apply(): SetBestiesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetBestiesInput]
    }
    
    extension [Self <: SetBestiesInput](x: Self) {
      
      inline def setAdd(value: js.Array[String | Double]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setAddVarargs(value: (String | Double)*): Self = StObject.set(x, "add", js.Array(value :_*))
      
      inline def setRemove(value: js.Array[String | Double]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setRemoveVarargs(value: (String | Double)*): Self = StObject.set(x, "remove", js.Array(value :_*))
    }
  }
}
