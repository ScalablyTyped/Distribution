package typings
package loadjsLib.loadjsMod.loadjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LoadOptions extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var before: js.UndefOr[
    js.Function2[/* path */ java.lang.String, /* scriptEl */ java.lang.String, scala.Unit]
  ] = js.undefined
  var error: js.UndefOr[js.Function1[/* depsNotFound */ java.lang.String, scala.Unit]] = js.undefined
  var numRetries: js.UndefOr[scala.Double] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

