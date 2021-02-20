package typings.koaSession

import org.scalablytyped.runtime.StringDictionary
import typings.koa.mod.Application
import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koa.mod.^
import typings.koaSession.anon.Changed
import typings.koaSession.anon.Instantiable
import typings.koaSession.anon.PartialSession
import typings.koaSession.anon.PartialSessionexpirenumbe
import typings.koaSession.anon.Partialopts
import typings.koaSession.anon.Rolling
import typings.koaSession.koaSessionBooleans.`false`
import typings.koaSession.koaSessionStrings.lax
import typings.koaSession.koaSessionStrings.none
import typings.koaSession.koaSessionStrings.session
import typings.koaSession.koaSessionStrings.strict
import typings.std.Date
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-session", JSImport.Namespace)
  @js.native
  def apply(CONFIG: Partialopts, app: ^[DefaultState, DefaultContext]): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-session", JSImport.Namespace)
  @js.native
  def apply(app: ^[DefaultState, DefaultContext]): Middleware[DefaultState, DefaultContext] = js.native
  
  @js.native
  trait ContextSession extends StObject {
    
    var app: Application[DefaultState, DefaultContext] = js.native
    
    /**
      * Commit the session changes or removal.
      */
    def commit(): js.Promise[Unit] = js.native
    
    var ctx: Context = js.native
    
    /**
      * internal logic of `ctx.session`
      */
    def get(): Session = js.native
    
    /**
      * init session from external store
      * will be called in the front of session middleware
      */
    def initFromExternal(): js.Promise[Unit] = js.native
    
    var opts: typings.koaSession.mod.opts = js.native
    
    var prevHash: String = js.native
    
    var session: Session | `false` = js.native
    
    /**
      * internal logic of `ctx.session=`
      */
    def set(`val`: js.Any): Unit = js.native
    
    var store: stores = js.native
  }
  object ContextSession {
    
    @scala.inline
    def apply(
      app: Application[DefaultState, DefaultContext],
      commit: () => js.Promise[Unit],
      ctx: Context,
      get: () => Session,
      initFromExternal: () => js.Promise[Unit],
      opts: opts,
      prevHash: String,
      session: Session | `false`,
      set: js.Any => Unit,
      store: stores
    ): ContextSession = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], commit = js.Any.fromFunction0(commit), ctx = ctx.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), initFromExternal = js.Any.fromFunction0(initFromExternal), opts = opts.asInstanceOf[js.Any], prevHash = prevHash.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextSession]
    }
    
    @scala.inline
    implicit class ContextSessionMutableBuilder[Self <: ContextSession] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: Application[DefaultState, DefaultContext]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommit(value: () => js.Promise[Unit]): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet(value: () => Session): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitFromExternal(value: () => js.Promise[Unit]): Self = StObject.set(x, "initFromExternal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpts(value: opts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevHash(value: String): Self = StObject.set(x, "prevHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: Session | `false`): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: js.Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStore(value: stores): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExternalKeys extends StObject {
    
    /**
      * get session object by key
      */
    def get(ctx: Context): String = js.native
    
    /**
      * set session object for key, with a maxAge (in ms)
      */
    def set(ctx: Context, value: js.Any): Unit = js.native
  }
  object ExternalKeys {
    
    @scala.inline
    def apply(get: Context => String, set: (Context, js.Any) => Unit): ExternalKeys = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[ExternalKeys]
    }
    
    @scala.inline
    implicit class ExternalKeysMutableBuilder[Self <: ExternalKeys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: Context => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (Context, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  /**
    * Session model.
    */
  @js.native
  trait Session
    extends /**
    * allow to put any value on session object
    */
  /* _ */ StringDictionary[js.Any] {
    
    /**
      * alias to `toJSON`
      */
    def inspect(): js.Object = js.native
    
    /**
      * Return how many values there are in the session object.
      * Used to see if it"s "populated".
      */
    val length: Double = js.native
    
    /**
      * get/set session maxAge
      */
    var maxAge: js.UndefOr[Double | session] = js.native
    
    /**
      * populated flag, which is just a boolean alias of .length.
      */
    val populated: Boolean = js.native
    
    /**
      * save this session no matter whether it is populated
      */
    def save(): Unit = js.native
    
    /**
      * JSON representation of the session.
      */
    def toJSON(): js.Object = js.native
  }
  object Session {
    
    @scala.inline
    def apply(
      inspect: () => js.Object,
      length: Double,
      populated: Boolean,
      save: () => Unit,
      toJSON: () => js.Object
    ): Session = {
      val __obj = js.Dynamic.literal(inspect = js.Any.fromFunction0(inspect), length = length.asInstanceOf[js.Any], populated = populated.asInstanceOf[js.Any], save = js.Any.fromFunction0(save), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[Session]
    }
    
    @scala.inline
    implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInspect(value: () => js.Object): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAge(value: Double | session): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setPopulated(value: Boolean): Self = StObject.set(x, "populated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait BaseContext extends StObject {
      
      var session: Session | Null = js.native
      
      val sessionOptions: js.UndefOr[opts] = js.native
    }
    object BaseContext {
      
      @scala.inline
      def apply(): BaseContext = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseContext]
      }
      
      @scala.inline
      implicit class BaseContextMutableBuilder[Self <: BaseContext] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionNull: Self = StObject.set(x, "session", null)
        
        @scala.inline
        def setSessionOptions(value: opts): Self = StObject.set(x, "sessionOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionOptionsUndefined: Self = StObject.set(x, "sessionOptions", js.undefined)
      }
    }
  }
  
  /* Inlined parent koa-session.koa-session.Omit<cookies.cookies.SetOption, 'maxAge'> */
  @js.native
  trait opts extends StObject {
    
    /**
      * If your session store requires data or utilities from context, opts.ContextStore is alse supported.
      * ContextStore must be a class which claims three instance methods demonstrated above.
      * new ContextStore(ctx) will be executed on every request.
      */
    var ContextStore: js.UndefOr[Instantiable] = js.native
    
    /**
      * Hook: before save session
      */
    var beforeSave: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Unit]] = js.native
    
    /**
      * custom decode method
      */
    def decode(str: String): js.Object = js.native
    /**
      * custom decode method
      */
    @JSName("decode")
    var decode_Original: js.Function1[/* str */ String, js.Object] = js.native
    
    var domain: js.UndefOr[String] = js.native
    
    /**
      * custom encode method
      */
    def encode(obj: js.Object): String = js.native
    /**
      * custom encode method
      */
    @JSName("encode")
    var encode_Original: js.Function1[/* obj */ js.Object, String] = js.native
    
    var expires: js.UndefOr[Date] = js.native
    
    /**
      * External key is used the cookie by default,
      * but you can use options.externalKey to customize your own external key methods.
      */
    var externalKey: js.UndefOr[ExternalKeys] = js.native
    
    /**
      * The way of generating external session id is controlled by the options.genid, which defaults to Date.now() + "-" + uid.sync(24).
      */
    def genid(): String = js.native
    
    var httpOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * cookie key (default is koa:sess)
      */
    var key: String = js.native
    
    /**
      * maxAge in ms (default is 1 days)
      * "session" will result in a cookie that expires when session/browser is closed
      * Warning: If a session cookie is stolen, this cookie will never expire
      */
    var maxAge: js.UndefOr[Double | session] = js.native
    
    var overwrite: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    /**
      * If you want to add prefix for all external session id, you can use options.prefix, it will not work if options.genid present.
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * Renew session when session is nearly expired, so we can always keep user logged in. (default is false)
      */
    var renew: js.UndefOr[Boolean] = js.native
    
    /**
      * Force a session identifier cookie to be set on every response. The expiration is reset to the original maxAge, resetting the expiration countdown. default is false
      */
    var rolling: js.UndefOr[Boolean] = js.native
    
    var sameSite: js.UndefOr[strict | lax | none | Boolean] = js.native
    
    var secure: js.UndefOr[Boolean] = js.native
    
    var secureProxy: js.UndefOr[Boolean] = js.native
    
    var signed: js.UndefOr[Boolean] = js.native
    
    /**
      * You can store the session content in external stores(redis, mongodb or other DBs)
      */
    var store: js.UndefOr[stores] = js.native
    
    /**
      * Hook: valid session value before use it
      */
    var valid: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ PartialSession, Unit]] = js.native
  }
  
  @js.native
  trait stores extends StObject {
    
    /**
      * destroy session for key
      */
    def destroy(key: String): js.Any = js.native
    
    def get(key: String, maxAge: js.UndefOr[scala.Nothing], data: Rolling): js.Any = js.native
    /**
      * get session object by key
      */
    def get(key: String, maxAge: Double, data: Rolling): js.Any = js.native
    @JSName("get")
    def get_session(key: String, maxAge: session, data: Rolling): js.Any = js.native
    
    def set(key: String, sess: PartialSessionexpirenumbe, maxAge: js.UndefOr[scala.Nothing], data: Changed): js.Any = js.native
    /**
      * set session object for key, with a maxAge (in ms)
      */
    def set(key: String, sess: PartialSessionexpirenumbe, maxAge: Double, data: Changed): js.Any = js.native
    @JSName("set")
    def set_session(key: String, sess: PartialSessionexpirenumbe, maxAge: session, data: Changed): js.Any = js.native
  }
  
  @js.native
  trait util extends StObject {
    
    /**
      * Decode the base64 cookie value to an object.
      */
    def decode(str: String): js.Object = js.native
    
    /**
      * Encode an object into a base64-encoded JSON string.
      */
    def encode(obj: js.Object): String = js.native
    
    def hash(sess: js.Any): String = js.native
  }
  object util {
    
    @scala.inline
    def apply(decode: String => js.Object, encode: js.Object => String, hash: js.Any => String): util = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), hash = js.Any.fromFunction1(hash))
      __obj.asInstanceOf[util]
    }
    
    @scala.inline
    implicit class utilMutableBuilder[Self <: util] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecode(value: String => js.Object): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncode(value: js.Object => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHash(value: js.Any => String): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
    }
  }
}
