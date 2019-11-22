package typings.instagramDashPrivateDashApi.distTypesDirectDashThreadDotBroadcastDotOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectTreadBroadcastBaseOptions extends js.Object {
  var form: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var item: String
  var qs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var signed: js.UndefOr[Boolean] = js.undefined
}

object DirectTreadBroadcastBaseOptions {
  @scala.inline
  def apply(
    item: String,
    form: StringDictionary[js.Any] = null,
    qs: StringDictionary[js.Any] = null,
    signed: js.UndefOr[Boolean] = js.undefined
  ): DirectTreadBroadcastBaseOptions = {
    val __obj = js.Dynamic.literal(item = item)
    if (form != null) __obj.updateDynamic("form")(form)
    if (qs != null) __obj.updateDynamic("qs")(qs)
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed)
    __obj.asInstanceOf[DirectTreadBroadcastBaseOptions]
  }
}

