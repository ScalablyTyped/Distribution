package typings.jsCookie

import typings.jsCookie.mod.CookieReadConverter
import typings.jsCookie.mod.CookieWriteConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Read[TConv /* <: js.Object */] extends StObject {
    
    var read: js.UndefOr[CookieReadConverter] = js.undefined
    
    var write: js.UndefOr[CookieWriteConverter[TConv]] = js.undefined
  }
  object Read {
    
    inline def apply[TConv /* <: js.Object */](): Read[TConv] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Read[TConv]]
    }
    
    extension [Self <: Read[?], TConv /* <: js.Object */](x: Self & Read[TConv]) {
      
      inline def setRead(value: (/* value */ String, /* name */ String) => String): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setWrite(value: (/* value */ String | TConv, /* name */ String) => String): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
}
