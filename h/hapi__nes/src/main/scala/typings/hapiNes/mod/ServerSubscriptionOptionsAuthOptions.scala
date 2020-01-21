package typings.hapiNes.mod

import typings.hapiNes.hapiNesStrings.any
import typings.hapiNes.hapiNesStrings.app
import typings.hapiNes.hapiNesStrings.optional
import typings.hapiNes.hapiNesStrings.required
import typings.hapiNes.hapiNesStrings.user
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

