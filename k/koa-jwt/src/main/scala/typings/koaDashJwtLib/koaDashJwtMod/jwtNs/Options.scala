package typings
package koaDashJwtLib.koaDashJwtMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var algorithms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var cookie: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var getToken: js.UndefOr[
    js.Function2[
      /* ctx */ koaLib.koaMod.ApplicationNs.Context, 
      /* opts */ this.type, 
      java.lang.String
    ]
  ] = js.undefined
  var isRevoked: js.UndefOr[
    js.Function3[
      /* ctx */ koaLib.koaMod.ApplicationNs.Context, 
      /* decodedToken */ js.Object, 
      /* token */ java.lang.String, 
      js.Promise[scala.Boolean]
    ]
  ] = js.undefined
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var passthrough: js.UndefOr[scala.Boolean] = js.undefined
  var secret: java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer] | SecretLoader
  var tokenKey: js.UndefOr[java.lang.String] = js.undefined
}

