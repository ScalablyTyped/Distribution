package typings.koaSessionMinimal

import typings.cookies.mod.IOptions
import typings.koa.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cookie extends StObject {
    
    /**
      * cookie options
      */
    var cookie: js.UndefOr[IOptions | (js.Function1[/* ctx */ js.UndefOr[Context], IOptions])] = js.undefined
    
    /**
      * session cookie name and store key prefix. Default is 'koa:sess'
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * session store
      */
    var store: js.UndefOr[Any] = js.undefined
  }
  object Cookie {
    
    inline def apply(): Cookie = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cookie]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
      
      inline def setCookie(value: IOptions | (js.Function1[/* ctx */ js.UndefOr[Context], IOptions])): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieFunction1(value: /* ctx */ js.UndefOr[Context] => IOptions): Self = StObject.set(x, "cookie", js.Any.fromFunction1(value))
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  trait RegenerateId extends StObject {
    
    def regenerateId(): Unit
  }
  object RegenerateId {
    
    inline def apply(regenerateId: () => Unit): RegenerateId = {
      val __obj = js.Dynamic.literal(regenerateId = js.Any.fromFunction0(regenerateId))
      __obj.asInstanceOf[RegenerateId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegenerateId] (val x: Self) extends AnyVal {
      
      inline def setRegenerateId(value: () => Unit): Self = StObject.set(x, "regenerateId", js.Any.fromFunction0(value))
    }
  }
}
