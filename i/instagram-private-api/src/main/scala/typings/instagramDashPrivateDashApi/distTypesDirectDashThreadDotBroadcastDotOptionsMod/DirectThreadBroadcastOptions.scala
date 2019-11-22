package typings.instagramDashPrivateDashApi.distTypesDirectDashThreadDotBroadcastDotOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined instagram-private-api.instagram-private-api/dist/types/direct-thread.broadcast.options.DirectTreadBroadcastBaseOptions & ts-xor.ts-xor.XOR<instagram-private-api.instagram-private-api/dist/types/direct-thread.broadcast.options.ExistingThreadOptions, instagram-private-api.instagram-private-api/dist/types/direct-thread.broadcast.options.CreateThreadOptions> */
trait DirectThreadBroadcastOptions extends js.Object {
  var form: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var item: String
  var qs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var signed: js.UndefOr[Boolean] = js.undefined
  var threadIds: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.undefined
  var userIds: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.undefined
}

object DirectThreadBroadcastOptions {
  @scala.inline
  def apply(
    item: String,
    form: StringDictionary[js.Any] = null,
    qs: StringDictionary[js.Any] = null,
    signed: js.UndefOr[Boolean] = js.undefined,
    threadIds: (js.Array[String | Double]) | String | Double = null,
    userIds: (js.Array[String | Double]) | String | Double = null
  ): DirectThreadBroadcastOptions = {
    val __obj = js.Dynamic.literal(item = item)
    if (form != null) __obj.updateDynamic("form")(form)
    if (qs != null) __obj.updateDynamic("qs")(qs)
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed)
    if (threadIds != null) __obj.updateDynamic("threadIds")(threadIds.asInstanceOf[js.Any])
    if (userIds != null) __obj.updateDynamic("userIds")(userIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastOptions]
  }
}

