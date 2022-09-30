package typings.jestExpectMessage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ShowMatcherMessage extends StObject {
    
    var showMatcherMessage: js.UndefOr[Boolean] = js.undefined
    
    var showPrefix: js.UndefOr[Boolean] = js.undefined
    
    var showStack: js.UndefOr[Boolean] = js.undefined
  }
  object ShowMatcherMessage {
    
    inline def apply(): ShowMatcherMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowMatcherMessage]
    }
    
    extension [Self <: ShowMatcherMessage](x: Self) {
      
      inline def setShowMatcherMessage(value: Boolean): Self = StObject.set(x, "showMatcherMessage", value.asInstanceOf[js.Any])
      
      inline def setShowMatcherMessageUndefined: Self = StObject.set(x, "showMatcherMessage", js.undefined)
      
      inline def setShowPrefix(value: Boolean): Self = StObject.set(x, "showPrefix", value.asInstanceOf[js.Any])
      
      inline def setShowPrefixUndefined: Self = StObject.set(x, "showPrefix", js.undefined)
      
      inline def setShowStack(value: Boolean): Self = StObject.set(x, "showStack", value.asInstanceOf[js.Any])
      
      inline def setShowStackUndefined: Self = StObject.set(x, "showStack", js.undefined)
    }
  }
}
