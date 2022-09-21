package typings.hdkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Private extends StObject {
    
    var `private`: Double
    
    var public: Double
  }
  object Private {
    
    inline def apply(`private`: Double, public: Double): Private = {
      val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Private]
    }
    
    extension [Self <: Private](x: Self) {
      
      inline def setPrivate(value: Double): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: Double): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
  
  trait Xpriv extends StObject {
    
    var xpriv: String
    
    var xpub: String
  }
  object Xpriv {
    
    inline def apply(xpriv: String, xpub: String): Xpriv = {
      val __obj = js.Dynamic.literal(xpriv = xpriv.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xpriv]
    }
    
    extension [Self <: Xpriv](x: Self) {
      
      inline def setXpriv(value: String): Self = StObject.set(x, "xpriv", value.asInstanceOf[js.Any])
      
      inline def setXpub(value: String): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
    }
  }
}
