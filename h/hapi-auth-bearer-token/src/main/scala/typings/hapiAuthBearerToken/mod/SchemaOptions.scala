package typings.hapiAuthBearerToken.mod

import typings.hapi.mod.Request
import typings.hapi.mod.ResponseToolkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOptions extends js.Object {
  var accessTokenName: js.UndefOr[String] = js.native
  var allowChaining: js.UndefOr[Boolean] = js.native
  var allowCookieToken: js.UndefOr[Boolean] = js.native
  var allowMultipleHeaders: js.UndefOr[Boolean] = js.native
  var allowQueryToken: js.UndefOr[Boolean] = js.native
  var tokenType: js.UndefOr[String] = js.native
  var unauthorized: js.UndefOr[js.Function2[/* message */ String | Null, /* scheme */ String, _]] = js.native
  @JSName("validate")
  var validate_Original: Validate = js.native
  def validate(request: Request, token: String, h: ResponseToolkit): js.Promise[ValidateReturn] | ValidateReturn = js.native
}

