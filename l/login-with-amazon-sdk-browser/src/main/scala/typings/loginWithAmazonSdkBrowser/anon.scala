package typings.loginWithAmazonSdkBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Essential extends StObject {
    
    var essential: Boolean
  }
  object Essential {
    
    inline def apply(essential: Boolean): Essential = {
      val __obj = js.Dynamic.literal(essential = essential.asInstanceOf[js.Any])
      __obj.asInstanceOf[Essential]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Essential] (val x: Self) extends AnyVal {
      
      inline def setEssential(value: Boolean): Self = StObject.set(x, "essential", value.asInstanceOf[js.Any])
    }
  }
}
