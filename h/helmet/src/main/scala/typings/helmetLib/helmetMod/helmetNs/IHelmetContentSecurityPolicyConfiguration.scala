package typings
package helmetLib.helmetMod.helmetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IHelmetContentSecurityPolicyConfiguration extends js.Object {
  var browserSniff: js.UndefOr[scala.Boolean] = js.undefined
  var directives: js.UndefOr[IHelmetContentSecurityPolicyDirectives] = js.undefined
  var disableAndroid: js.UndefOr[scala.Boolean] = js.undefined
  var loose: js.UndefOr[scala.Boolean] = js.undefined
  var reportOnly: js.UndefOr[
    scala.Boolean | (js.Function2[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      scala.Boolean
    ])
  ] = js.undefined
  var setAllHeaders: js.UndefOr[scala.Boolean] = js.undefined
}

