package typings
package koaDashSessionLib.koaDashSessionMod.sessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof cookies.cookies.Cookies.SetOption, 'maxAge'> ]: cookies.cookies.Cookies.SetOption[P]} */ @js.native
trait opts extends js.Object {
  /**
    * If your session store requires data or utilities from context, opts.ContextStore is alse supported.
    * ContextStore must be a class which claims three instance methods demonstrated above.
    * new ContextStore(ctx) will be executed on every request.
    */
  var ContextStore: js.UndefOr[koaDashSessionLib.Anon_Ctx] = js.native
  /**
    * Hook: before save session
    */
  var beforeSave: js.UndefOr[
    js.Function2[
      /* ctx */ koaDashSessionLib.koaDashSessionMod.koaMod.Context, 
      /* session */ Session, 
      scala.Unit
    ]
  ] = js.native
  /**
    * custom decode method
    */
  @JSName("decode")
  var decode_Original: js.Function1[/* str */ java.lang.String, js.Object] = js.native
  /**
    * custom encode method
    */
  @JSName("encode")
  var encode_Original: js.Function1[/* obj */ js.Object, java.lang.String] = js.native
  /**
    * cookie key (default is koa:sess)
    */
  var key: java.lang.String = js.native
  /**
    * maxAge in ms (default is 1 days)
    * "session" will result in a cookie that expires when session/browser is closed
    * Warning: If a session cookie is stolen, this cookie will never expire
    */
  var maxAge: js.UndefOr[scala.Double | koaDashSessionLib.koaDashSessionLibStrings.session] = js.native
  /**
    * If you want to add prefix for all external session id, you can use options.prefix, it will not work if options.genid present.
    */
  var prefix: js.UndefOr[java.lang.String] = js.native
  /**
    * Renew session when session is nearly expired, so we can always keep user logged in. (default is false)
    */
  var renew: js.UndefOr[scala.Boolean] = js.native
  /**
    * Force a session identifier cookie to be set on every response. The expiration is reset to the original maxAge, resetting the expiration countdown. default is false
    */
  var rolling: js.UndefOr[scala.Boolean] = js.native
  /**
    * You can store the session content in external stores(redis, mongodb or other DBs)
    */
  var store: js.UndefOr[stores] = js.native
  /**
    * Hook: valid session value before use it
    */
  var valid: js.UndefOr[
    js.Function2[
      /* ctx */ koaDashSessionLib.koaDashSessionMod.koaMod.Context, 
      /* session */ stdLib.Partial[Session], 
      scala.Unit
    ]
  ] = js.native
  /**
    * custom decode method
    */
  def decode(str: java.lang.String): js.Object = js.native
  /**
    * custom encode method
    */
  def encode(obj: js.Object): java.lang.String = js.native
  /**
    * The way of generating external session id is controlled by the options.genid, which defaults to Date.now() + "-" + uid.sync(24).
    */
  def genid(): java.lang.String = js.native
}

