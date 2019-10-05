package typings.inboxsdk.inboxsdkMod.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteSearchResultBase extends js.Object {
  var externalURL: js.UndefOr[String] = js.undefined
  var iconHTML: js.UndefOr[String] = js.undefined
  var iconUrl: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var routeName: js.UndefOr[String] = js.undefined
  var routeParams: js.UndefOr[js.Array[String]] = js.undefined
}

object AutocompleteSearchResultBase {
  @scala.inline
  def apply(
    externalURL: String = null,
    iconHTML: String = null,
    iconUrl: String = null,
    onClick: () => Unit = null,
    routeName: String = null,
    routeParams: js.Array[String] = null
  ): AutocompleteSearchResultBase = {
    val __obj = js.Dynamic.literal()
    if (externalURL != null) __obj.updateDynamic("externalURL")(externalURL)
    if (iconHTML != null) __obj.updateDynamic("iconHTML")(iconHTML)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (routeName != null) __obj.updateDynamic("routeName")(routeName)
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams)
    __obj.asInstanceOf[AutocompleteSearchResultBase]
  }
}

