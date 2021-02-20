package typings.koaGenericSession

import org.scalablytyped.runtime.StringDictionary
import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaGenericSession.anon.HttpOnly
import typings.std.Error
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-generic-session", JSImport.Namespace)
  @js.native
  def apply(options: SessionOptions): Middleware[DefaultState, DefaultContext] = js.native
  
  @JSImport("koa-generic-session", "MemoryStore")
  @js.native
  val MemoryStore: SessionStore = js.native
  
  @js.native
  trait Session
    extends /* key */ StringDictionary[js.Any] {
    
    var cookie: js.Any = js.native
  }
  object Session {
    
    @scala.inline
    def apply(cookie: js.Any): Session = {
      val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session]
    }
    
    @scala.inline
    implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie(value: js.Any): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SessionIdStore extends StObject {
    
    def get(): js.Any = js.native
    
    def reset(): Unit = js.native
    
    def set(sid: String, session: Session): Unit = js.native
  }
  object SessionIdStore {
    
    @scala.inline
    def apply(get: () => js.Any, reset: () => Unit, set: (String, Session) => Unit): SessionIdStore = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[SessionIdStore]
    }
    
    @scala.inline
    implicit class SessionIdStoreMutableBuilder[Self <: SessionIdStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: () => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: (String, Session) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SessionOptions extends StObject {
    
    var allowEmpty: js.UndefOr[Boolean] = js.native
    
    var beforeSave: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Unit]] = js.native
    
    var cookie: js.UndefOr[HttpOnly] = js.native
    
    var defer: js.UndefOr[Boolean] = js.native
    
    var errorHandler: js.UndefOr[js.Function3[/* error */ Error, /* type */ String, /* ctx */ Context, Unit]] = js.native
    
    var genSid: js.UndefOr[js.Function1[/* length */ Double, String]] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var reconnectTimeout: js.UndefOr[Double] = js.native
    
    var rolling: js.UndefOr[Boolean] = js.native
    
    var sessionIdStore: js.UndefOr[SessionIdStore] = js.native
    
    var store: js.UndefOr[SessionStore] = js.native
    
    var ttl: js.UndefOr[Double] = js.native
    
    var valid: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Boolean]] = js.native
  }
  object SessionOptions {
    
    @scala.inline
    def apply(): SessionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionOptions]
    }
    
    @scala.inline
    implicit class SessionOptionsMutableBuilder[Self <: SessionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def setBeforeSave(value: (/* ctx */ Context, /* session */ Session) => Unit): Self = StObject.set(x, "beforeSave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeSaveUndefined: Self = StObject.set(x, "beforeSave", js.undefined)
      
      @scala.inline
      def setCookie(value: HttpOnly): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setErrorHandler(value: (/* error */ Error, /* type */ String, /* ctx */ Context) => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setGenSid(value: /* length */ Double => String): Self = StObject.set(x, "genSid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenSidUndefined: Self = StObject.set(x, "genSid", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setReconnectTimeout(value: Double): Self = StObject.set(x, "reconnectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectTimeoutUndefined: Self = StObject.set(x, "reconnectTimeout", js.undefined)
      
      @scala.inline
      def setRolling(value: Boolean): Self = StObject.set(x, "rolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRollingUndefined: Self = StObject.set(x, "rolling", js.undefined)
      
      @scala.inline
      def setSessionIdStore(value: SessionIdStore): Self = StObject.set(x, "sessionIdStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIdStoreUndefined: Self = StObject.set(x, "sessionIdStore", js.undefined)
      
      @scala.inline
      def setStore(value: SessionStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      @scala.inline
      def setValid(value: (/* ctx */ Context, /* session */ Session) => Boolean): Self = StObject.set(x, "valid", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  @js.native
  trait SessionStore extends StObject {
    
    def apply(): SessionStore = js.native
    
    def destroy(sid: String): Unit = js.native
    
    def get(sid: String): js.Any = js.native
    
    def set(sid: String, session: Session, ttl: Double): Unit = js.native
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait Context extends StObject {
      
      def regenerateSession(): Generator[_, _, _] = js.native
      
      var session: Session | Null = js.native
      
      var sessionSave: Boolean | Null = js.native
    }
    object Context {
      
      @scala.inline
      def apply(regenerateSession: () => Generator[_, _, _]): typings.koaGenericSession.mod.koaAugmentingMod.Context = {
        val __obj = js.Dynamic.literal(regenerateSession = js.Any.fromFunction0(regenerateSession))
        __obj.asInstanceOf[typings.koaGenericSession.mod.koaAugmentingMod.Context]
      }
      
      @scala.inline
      implicit class ContextMutableBuilder[Self <: typings.koaGenericSession.mod.koaAugmentingMod.Context] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRegenerateSession(value: () => Generator[_, _, _]): Self = StObject.set(x, "regenerateSession", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionNull: Self = StObject.set(x, "session", null)
        
        @scala.inline
        def setSessionSave(value: Boolean): Self = StObject.set(x, "sessionSave", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionSaveNull: Self = StObject.set(x, "sessionSave", null)
      }
    }
  }
}
