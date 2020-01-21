package typings.knockoutMapping.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutPropertyMappingCallBack extends js.Object {
  var create: js.UndefOr[js.Function1[/* options */ KnockoutMappingCreateOptions, Unit]] = js.undefined
  var key: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var update: js.UndefOr[js.Function1[/* options */ KnockoutMappingUpdateOptions, Unit]] = js.undefined
}

object KnockoutPropertyMappingCallBack {
  @scala.inline
  def apply(
    create: /* options */ KnockoutMappingCreateOptions => Unit = null,
    key: /* data */ js.Any => _ = null,
    update: /* options */ KnockoutMappingUpdateOptions => Unit = null
  ): KnockoutPropertyMappingCallBack = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (key != null) __obj.updateDynamic("key")(js.Any.fromFunction1(key))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[KnockoutPropertyMappingCallBack]
  }
}

