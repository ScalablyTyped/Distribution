package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteSearchResultBase extends js.Object {
  var externalURL: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var routeName: js.UndefOr[java.lang.String] = js.undefined
  var routeParams: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AutocompleteSearchResultBase {
  @scala.inline
  def apply(
    externalURL: java.lang.String = null,
    iconUrl: java.lang.String = null,
    onClick: js.Function0[scala.Unit] = null,
    routeName: java.lang.String = null,
    routeParams: js.Array[java.lang.String] = null
  ): AutocompleteSearchResultBase = {
    val __obj = js.Dynamic.literal()
    if (externalURL != null) __obj.updateDynamic("externalURL")(externalURL)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (routeName != null) __obj.updateDynamic("routeName")(routeName)
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams)
    __obj.asInstanceOf[AutocompleteSearchResultBase]
  }
}

