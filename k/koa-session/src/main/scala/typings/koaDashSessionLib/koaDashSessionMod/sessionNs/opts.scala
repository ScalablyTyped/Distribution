package typings
package koaDashSessionLib.koaDashSessionMod.sessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof cookies.cookies.SetOption, 'maxAge'> ]: cookies.cookies.SetOption[P]} */ trait opts extends js.Object {
  /**
    * If your session store requires data or utilities from context, opts.ContextStore is alse supported.
    * ContextStore must be a class which claims three instance methods demonstrated above.
    * new ContextStore(ctx) will be executed on every request.
    */
  var ContextStore: js.UndefOr[koaDashSessionLib.Anon_Ctx] = js.undefined
  /**
    * Hook: before save session
    */
  var beforeSave: js.UndefOr[
    js.Function2[
      /* ctx */ koaDashSessionLib.koaDashSessionMod.koaMod.Context, 
      /* session */ Session, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * custom decode method
    */
  var decode: js.Function1[/* str */ java.lang.String, js.Object]
  /**
    * custom encode method
    */
  var encode: js.Function1[/* obj */ js.Object, java.lang.String]
  /**
    * cookie key (default is koa:sess)
    */
  var key: java.lang.String
  /**
    * maxAge in ms (default is 1 days)
    * "session" will result in a cookie that expires when session/browser is closed
    * Warning: If a session cookie is stolen, this cookie will never expire
    */
  var maxAge: js.UndefOr[scala.Double | koaDashSessionLib.koaDashSessionLibStrings.session] = js.undefined
  /**
    * If you want to add prefix for all external session id, you can use options.prefix, it will not work if options.genid present.
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Renew session when session is nearly expired, so we can always keep user logged in. (default is false)
    */
  var renew: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Force a session identifier cookie to be set on every response. The expiration is reset to the original maxAge, resetting the expiration countdown. default is false
    */
  var rolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * You can store the session content in external stores(redis, mongodb or other DBs)
    */
  var store: js.UndefOr[stores] = js.undefined
  /**
    * Hook: valid session value before use it
    */
  var valid: js.UndefOr[
    js.Function2[
      /* ctx */ koaDashSessionLib.koaDashSessionMod.koaMod.Context, 
      /* session */ stdLib.Partial[Session], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * The way of generating external session id is controlled by the options.genid, which defaults to Date.now() + "-" + uid.sync(24).
    */
  def genid(): java.lang.String
}

object opts {
  @scala.inline
  def apply(
    decode: js.Function1[/* str */ java.lang.String, js.Object],
    encode: js.Function1[/* obj */ js.Object, java.lang.String],
    genid: js.Function0[java.lang.String],
    key: java.lang.String,
    ContextStore: koaDashSessionLib.Anon_Ctx = null,
    beforeSave: js.Function2[
      /* ctx */ koaDashSessionLib.koaDashSessionMod.koaMod.Context, 
      /* session */ Session, 
      scala.Unit
    ] = null,
    maxAge: scala.Double | koaDashSessionLib.koaDashSessionLibStrings.session = null,
    prefix: java.lang.String = null,
    renew: js.UndefOr[scala.Boolean] = js.undefined,
    rolling: js.UndefOr[scala.Boolean] = js.undefined,
    store: stores = null,
    valid: js.Function2[
      /* ctx */ koaDashSessionLib.koaDashSessionMod.koaMod.Context, 
      /* session */ stdLib.Partial[Session], 
      scala.Unit
    ] = null
  ): opts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("encode")(encode)
    __obj.updateDynamic("genid")(genid)
    __obj.updateDynamic("key")(key)
    if (ContextStore != null) __obj.updateDynamic("ContextStore")(ContextStore)
    if (beforeSave != null) __obj.updateDynamic("beforeSave")(beforeSave)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(renew)) __obj.updateDynamic("renew")(renew)
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling)
    if (store != null) __obj.updateDynamic("store")(store)
    if (valid != null) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[opts]
  }
}

