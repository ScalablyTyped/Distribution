package typings
package koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaSessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var allowEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var beforeSave: js.UndefOr[
    js.Function2[
      /* ctx */ koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaMod.Context, 
      /* session */ Session, 
      scala.Unit
    ]
  ] = js.undefined
  var cookie: js.UndefOr[koaDashGenericDashSessionLib.Anon_HttpOnly] = js.undefined
  var defer: js.UndefOr[scala.Boolean] = js.undefined
  var errorHandler: js.UndefOr[
    js.Function3[
      /* error */ nodeLib.Error, 
      /* type */ java.lang.String, 
      /* ctx */ koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaMod.Context, 
      scala.Unit
    ]
  ] = js.undefined
  var genSid: js.UndefOr[js.Function1[/* length */ scala.Double, java.lang.String]] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var reconnectTimeout: js.UndefOr[scala.Double] = js.undefined
  var rolling: js.UndefOr[scala.Boolean] = js.undefined
  var sessionIdStore: js.UndefOr[SessionIdStore] = js.undefined
  var store: js.UndefOr[SessionStore] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
  var valid: js.UndefOr[
    js.Function2[
      /* ctx */ koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaMod.Context, 
      /* session */ Session, 
      scala.Boolean
    ]
  ] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(
    allowEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSave: js.Function2[
      /* ctx */ koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaMod.Context, 
      /* session */ Session, 
      scala.Unit
    ] = null,
    cookie: koaDashGenericDashSessionLib.Anon_HttpOnly = null,
    defer: js.UndefOr[scala.Boolean] = js.undefined,
    errorHandler: js.Function3[
      /* error */ nodeLib.Error, 
      /* type */ java.lang.String, 
      /* ctx */ koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaMod.Context, 
      scala.Unit
    ] = null,
    genSid: js.Function1[/* length */ scala.Double, java.lang.String] = null,
    key: java.lang.String = null,
    prefix: java.lang.String = null,
    reconnectTimeout: scala.Int | scala.Double = null,
    rolling: js.UndefOr[scala.Boolean] = js.undefined,
    sessionIdStore: SessionIdStore = null,
    store: SessionStore = null,
    ttl: scala.Int | scala.Double = null,
    valid: js.Function2[
      /* ctx */ koaDashGenericDashSessionLib.koaDashGenericDashSessionMod.koaMod.Context, 
      /* session */ Session, 
      scala.Boolean
    ] = null
  ): SessionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (beforeSave != null) __obj.updateDynamic("beforeSave")(beforeSave)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler)
    if (genSid != null) __obj.updateDynamic("genSid")(genSid)
    if (key != null) __obj.updateDynamic("key")(key)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (reconnectTimeout != null) __obj.updateDynamic("reconnectTimeout")(reconnectTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling)
    if (sessionIdStore != null) __obj.updateDynamic("sessionIdStore")(sessionIdStore)
    if (store != null) __obj.updateDynamic("store")(store)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[SessionOptions]
  }
}

