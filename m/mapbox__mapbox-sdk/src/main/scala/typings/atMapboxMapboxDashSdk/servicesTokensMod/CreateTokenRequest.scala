package typings.atMapboxMapboxDashSdk.servicesTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTokenRequest extends js.Object {
  var note: js.UndefOr[String] = js.undefined
  var resources: js.UndefOr[js.Array[String]] = js.undefined
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object CreateTokenRequest {
  @scala.inline
  def apply(note: String = null, resources: js.Array[String] = null, scopes: js.Array[String] = null): CreateTokenRequest = {
    val __obj = js.Dynamic.literal()
    if (note != null) __obj.updateDynamic("note")(note)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[CreateTokenRequest]
  }
}

