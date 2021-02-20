package typings.hdkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Xpriv extends StObject {
    
    var xpriv: String = js.native
    
    var xpub: String = js.native
  }
  object Xpriv {
    
    @scala.inline
    def apply(xpriv: String, xpub: String): Xpriv = {
      val __obj = js.Dynamic.literal(xpriv = xpriv.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xpriv]
    }
    
    @scala.inline
    implicit class XprivMutableBuilder[Self <: Xpriv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXpriv(value: String): Self = StObject.set(x, "xpriv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXpub(value: String): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
    }
  }
}
