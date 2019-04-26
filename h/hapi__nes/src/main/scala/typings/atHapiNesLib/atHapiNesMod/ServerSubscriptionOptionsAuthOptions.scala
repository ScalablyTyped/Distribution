package typings
package atHapiNesLib.atHapiNesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSubscriptionOptionsAuthOptions extends js.Object {
  var entity: js.UndefOr[
    atHapiNesLib.atHapiNesLibStrings.user | atHapiNesLib.atHapiNesLibStrings.app | atHapiNesLib.atHapiNesLibStrings.any
  ] = js.undefined
  var index: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[
    atHapiNesLib.atHapiNesLibStrings.required | atHapiNesLib.atHapiNesLibStrings.optional
  ] = js.undefined
  var scope: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object ServerSubscriptionOptionsAuthOptions {
  @scala.inline
  def apply(
    entity: atHapiNesLib.atHapiNesLibStrings.user | atHapiNesLib.atHapiNesLibStrings.app | atHapiNesLib.atHapiNesLibStrings.any = null,
    index: js.UndefOr[scala.Boolean] = js.undefined,
    mode: atHapiNesLib.atHapiNesLibStrings.required | atHapiNesLib.atHapiNesLibStrings.optional = null,
    scope: java.lang.String | js.Array[java.lang.String] = null
  ): ServerSubscriptionOptionsAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSubscriptionOptionsAuthOptions]
  }
}

