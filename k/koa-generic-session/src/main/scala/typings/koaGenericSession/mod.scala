package typings.koaGenericSession

import typings.cookies.mod.SetOption
import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: SessionOptions): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-generic-session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("koa-generic-session", "MemoryStore")
  @js.native
  open class MemoryStore ()
    extends StObject
       with SessionStore
  
  trait Session extends StObject {
    
    var cookie: SetOption
  }
  object Session {
    
    inline def apply(cookie: SetOption): Session = {
      val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session]
    }
    
    extension [Self <: Session](x: Self) {
      
      inline def setCookie(value: SetOption): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    }
  }
  
  trait SessionIdStore[Ctx] extends StObject {
    
    def get(): js.UndefOr[String]
    
    def reset(): Unit
    
    def set(sid: String, session: Session): Unit
  }
  object SessionIdStore {
    
    inline def apply[Ctx](get: () => js.UndefOr[String], reset: () => Unit, set: (String, Session) => Unit): SessionIdStore[Ctx] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[SessionIdStore[Ctx]]
    }
    
    extension [Self <: SessionIdStore[?], Ctx](x: Self & SessionIdStore[Ctx]) {
      
      inline def setGet(value: () => js.UndefOr[String]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSet(value: (String, Session) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait SessionOptions extends StObject {
    
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    var beforeSave: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Unit]] = js.undefined
    
    var cookie: js.UndefOr[SetOption] = js.undefined
    
    var defer: js.UndefOr[Boolean] = js.undefined
    
    var errorHandler: js.UndefOr[js.Function3[/* error */ js.Error, /* type */ String, /* ctx */ Context, Unit]] = js.undefined
    
    var genSid: js.UndefOr[
        js.ThisFunction1[/* this */ Context, /* length */ Double, String | js.Promise[String]]
      ] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var reconnectTimeout: js.UndefOr[Double] = js.undefined
    
    var rolling: js.UndefOr[Boolean] = js.undefined
    
    var sessionIdStore: js.UndefOr[SessionIdStore[Context]] = js.undefined
    
    var store: js.UndefOr[SessionStore] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var valid: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Boolean]] = js.undefined
  }
  object SessionOptions {
    
    inline def apply(): SessionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionOptions]
    }
    
    extension [Self <: SessionOptions](x: Self) {
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setBeforeSave(value: (/* ctx */ Context, /* session */ Session) => Unit): Self = StObject.set(x, "beforeSave", js.Any.fromFunction2(value))
      
      inline def setBeforeSaveUndefined: Self = StObject.set(x, "beforeSave", js.undefined)
      
      inline def setCookie(value: SetOption): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setErrorHandler(value: (/* error */ js.Error, /* type */ String, /* ctx */ Context) => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction3(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setGenSid(value: js.ThisFunction1[/* this */ Context, /* length */ Double, String | js.Promise[String]]): Self = StObject.set(x, "genSid", value.asInstanceOf[js.Any])
      
      inline def setGenSidUndefined: Self = StObject.set(x, "genSid", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setReconnectTimeout(value: Double): Self = StObject.set(x, "reconnectTimeout", value.asInstanceOf[js.Any])
      
      inline def setReconnectTimeoutUndefined: Self = StObject.set(x, "reconnectTimeout", js.undefined)
      
      inline def setRolling(value: Boolean): Self = StObject.set(x, "rolling", value.asInstanceOf[js.Any])
      
      inline def setRollingUndefined: Self = StObject.set(x, "rolling", js.undefined)
      
      inline def setSessionIdStore(value: SessionIdStore[Context]): Self = StObject.set(x, "sessionIdStore", value.asInstanceOf[js.Any])
      
      inline def setSessionIdStoreUndefined: Self = StObject.set(x, "sessionIdStore", js.undefined)
      
      inline def setStore(value: SessionStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setValid(value: (/* ctx */ Context, /* session */ Session) => Boolean): Self = StObject.set(x, "valid", js.Any.fromFunction2(value))
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  @js.native
  trait SessionStore extends StObject {
    
    def destroy(sid: String): Unit | js.Promise[Unit] = js.native
    
    def get(sid: String): js.UndefOr[Session | js.Promise[js.UndefOr[Session]]] = js.native
    
    def set(sid: String, session: Session): Unit | js.Promise[Unit] = js.native
    def set(sid: String, session: Session, ttl: Double): Unit | js.Promise[Unit] = js.native
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait Context extends StObject {
      
      def regenerateSession(): js.Promise[Unit]
      
      var session: Session | Null
      
      var sessionId: String
      
      var sessionSave: Boolean | Null
    }
    object Context {
      
      inline def apply(regenerateSession: () => js.Promise[Unit], sessionId: String): typings.koaGenericSession.mod.koaAugmentingMod.Context = {
        val __obj = js.Dynamic.literal(regenerateSession = js.Any.fromFunction0(regenerateSession), sessionId = sessionId.asInstanceOf[js.Any], session = null, sessionSave = null)
        __obj.asInstanceOf[typings.koaGenericSession.mod.koaAugmentingMod.Context]
      }
      
      extension [Self <: typings.koaGenericSession.mod.koaAugmentingMod.Context](x: Self) {
        
        inline def setRegenerateSession(value: () => js.Promise[Unit]): Self = StObject.set(x, "regenerateSession", js.Any.fromFunction0(value))
        
        inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
        
        inline def setSessionNull: Self = StObject.set(x, "session", null)
        
        inline def setSessionSave(value: Boolean): Self = StObject.set(x, "sessionSave", value.asInstanceOf[js.Any])
        
        inline def setSessionSaveNull: Self = StObject.set(x, "sessionSave", null)
      }
    }
  }
}
