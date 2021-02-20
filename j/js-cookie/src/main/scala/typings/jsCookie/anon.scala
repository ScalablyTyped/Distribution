package typings.jsCookie

import typings.jsCookie.mod.CookieReadConverter
import typings.jsCookie.mod.CookieWriteConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Read[TConv /* <: js.Object */] extends StObject {
    
    var read: js.UndefOr[CookieReadConverter] = js.native
    
    var write: js.UndefOr[CookieWriteConverter[TConv]] = js.native
  }
  object Read {
    
    @scala.inline
    def apply[TConv /* <: js.Object */](): Read[TConv] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Read[TConv]]
    }
    
    @scala.inline
    implicit class ReadMutableBuilder[Self <: Read[_], TConv /* <: js.Object */] (val x: Self with Read[TConv]) extends AnyVal {
      
      @scala.inline
      def setRead(value: (/* value */ String, /* name */ String) => String): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setWrite(value: (/* value */ String | TConv, /* name */ String) => String): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
}
