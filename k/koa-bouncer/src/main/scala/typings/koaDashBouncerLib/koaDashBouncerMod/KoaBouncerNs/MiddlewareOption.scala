package typings
package koaDashBouncerLib.koaDashBouncerMod.KoaBouncerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOption extends js.Object {
  var getBody: js.UndefOr[js.Function1[/* ctx */ koaLib.koaMod.ApplicationNs.Context, _]] = js.undefined
  var getParams: js.UndefOr[js.Function1[/* ctx */ koaLib.koaMod.ApplicationNs.Context, _]] = js.undefined
  var getQuery: js.UndefOr[js.Function1[/* ctx */ koaLib.koaMod.ApplicationNs.Context, _]] = js.undefined
}

