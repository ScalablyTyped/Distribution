package typings
package atHapiNesLib.atHapiNesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSubscriptionOptions extends js.Object {
  var auth: js.UndefOr[scala.Boolean | ServerSubscriptionOptionsAuthOptions] = js.undefined
  var filter: js.UndefOr[
    js.Function4[
      /* path */ java.lang.String, 
      /* message */ js.Any, 
      /* options */ ServerSubscriptionOptionsFilterOptions, 
      /* next */ js.Function2[/* isMatch */ scala.Boolean, /* override */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var onSubscribe: js.UndefOr[ServerOnSubscribe] = js.undefined
  var onUnsubscribe: js.UndefOr[ServerOnUnSubscribe] = js.undefined
}

object ServerSubscriptionOptions {
  @scala.inline
  def apply(
    auth: scala.Boolean | ServerSubscriptionOptionsAuthOptions = null,
    filter: (/* path */ java.lang.String, /* message */ js.Any, /* options */ ServerSubscriptionOptionsFilterOptions, /* next */ js.Function2[/* isMatch */ scala.Boolean, /* override */ js.UndefOr[js.Any], scala.Unit]) => scala.Unit = null,
    onSubscribe: ServerOnSubscribe = null,
    onUnsubscribe: ServerOnUnSubscribe = null
  ): ServerSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4(filter))
    if (onSubscribe != null) __obj.updateDynamic("onSubscribe")(onSubscribe.asInstanceOf[js.Any])
    if (onUnsubscribe != null) __obj.updateDynamic("onUnsubscribe")(onUnsubscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSubscriptionOptions]
  }
}

