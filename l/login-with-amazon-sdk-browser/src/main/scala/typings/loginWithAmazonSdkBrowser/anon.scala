package typings.loginWithAmazonSdkBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Essential extends StObject {
    
    var essential: Boolean = js.native
  }
  object Essential {
    
    @scala.inline
    def apply(essential: Boolean): Essential = {
      val __obj = js.Dynamic.literal(essential = essential.asInstanceOf[js.Any])
      __obj.asInstanceOf[Essential]
    }
    
    @scala.inline
    implicit class EssentialMutableBuilder[Self <: Essential] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEssential(value: Boolean): Self = StObject.set(x, "essential", value.asInstanceOf[js.Any])
    }
  }
}
