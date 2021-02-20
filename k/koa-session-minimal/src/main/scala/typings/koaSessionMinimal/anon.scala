package typings.koaSessionMinimal

import typings.cookies.mod.IOptions
import typings.koa.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cookie extends StObject {
    
    /**
      * cookie options
      */
    var cookie: js.UndefOr[IOptions | (js.Function1[/* ctx */ js.UndefOr[Context], IOptions])] = js.native
    
    /**
      * session cookie name and store key prefix. Default is 'koa:sess'
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * session store
      */
    var store: js.UndefOr[js.Any] = js.native
  }
  object Cookie {
    
    @scala.inline
    def apply(): Cookie = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cookie]
    }
    
    @scala.inline
    implicit class CookieMutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie(value: IOptions | (js.Function1[/* ctx */ js.UndefOr[Context], IOptions])): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieFunction1(value: /* ctx */ js.UndefOr[Context] => IOptions): Self = StObject.set(x, "cookie", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setStore(value: js.Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  @js.native
  trait RegenerateId extends StObject {
    
    def regenerateId(): Unit = js.native
  }
  object RegenerateId {
    
    @scala.inline
    def apply(regenerateId: () => Unit): RegenerateId = {
      val __obj = js.Dynamic.literal(regenerateId = js.Any.fromFunction0(regenerateId))
      __obj.asInstanceOf[RegenerateId]
    }
    
    @scala.inline
    implicit class RegenerateIdMutableBuilder[Self <: RegenerateId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegenerateId(value: () => Unit): Self = StObject.set(x, "regenerateId", js.Any.fromFunction0(value))
    }
  }
}
