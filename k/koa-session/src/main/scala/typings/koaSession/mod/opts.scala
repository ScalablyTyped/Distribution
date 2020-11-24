package typings.koaSession.mod

import typings.koa.mod.Context
import typings.koaSession.anon.Instantiable
import typings.koaSession.anon.PartialSession
import typings.koaSession.koaSessionStrings.lax
import typings.koaSession.koaSessionStrings.none
import typings.koaSession.koaSessionStrings.session
import typings.koaSession.koaSessionStrings.strict
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent koa-session.koa-session.Omit<cookies.cookies.SetOption, 'maxAge'> */
@js.native
trait opts extends js.Object {
  
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
