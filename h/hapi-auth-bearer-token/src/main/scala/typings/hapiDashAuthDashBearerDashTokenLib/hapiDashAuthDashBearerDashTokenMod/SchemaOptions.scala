package typings
package hapiDashAuthDashBearerDashTokenLib.hapiDashAuthDashBearerDashTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOptions extends js.Object {
  var accessTokenName: js.UndefOr[java.lang.String] = js.native
  var allowChaining: js.UndefOr[scala.Boolean] = js.native
  var allowCookieToken: js.UndefOr[scala.Boolean] = js.native
  var allowMultipleHeaders: js.UndefOr[scala.Boolean] = js.native
  var allowQueryToken: js.UndefOr[scala.Boolean] = js.native
  var tokenType: js.UndefOr[java.lang.String] = js.native
  var unauthorized: js.UndefOr[
    js.Function2[/* message */ java.lang.String | scala.Null, /* scheme */ java.lang.String, _]
  ] = js.native
  @JSName("validate")
  var validate_Original: Validate = js.native
  def validate(request: hapiLib.hapiMod.Request, token: java.lang.String, h: hapiLib.hapiMod.ResponseToolkit): js.Promise[hapiDashAuthDashBearerDashTokenLib.ValidateReturn] | hapiDashAuthDashBearerDashTokenLib.ValidateReturn = js.native
}

