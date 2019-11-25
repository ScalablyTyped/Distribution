package typings.atHapiNes.atHapiNesMod

import typings.atHapiNes.atHapiNesStrings.any
import typings.atHapiNes.atHapiNesStrings.app
import typings.atHapiNes.atHapiNesStrings.optional
import typings.atHapiNes.atHapiNesStrings.required
import typings.atHapiNes.atHapiNesStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSubscriptionOptionsAuthOptions extends js.Object {
  var entity: js.UndefOr[user | app | any] = js.undefined
  var index: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[required | optional] = js.undefined
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ServerSubscriptionOptionsAuthOptions {
  @scala.inline
  def apply(
    entity: user | app | any = null,
    index: js.UndefOr[Boolean] = js.undefined,
    mode: required | optional = null,
    scope: String | js.Array[String] = null
  ): ServerSubscriptionOptionsAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSubscriptionOptionsAuthOptions]
  }
}

