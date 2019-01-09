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

