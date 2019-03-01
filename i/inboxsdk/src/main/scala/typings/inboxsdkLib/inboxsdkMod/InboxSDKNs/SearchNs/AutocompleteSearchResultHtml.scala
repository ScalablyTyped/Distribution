package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteSearchResultHtml
  extends AutocompleteSearchResultBase
     with AutocompleteSearchResult {
  var descriptionHTML: java.lang.String
  var nameHTML: java.lang.String
}

object AutocompleteSearchResultHtml {
  @scala.inline
  def apply(
    descriptionHTML: java.lang.String,
    nameHTML: java.lang.String,
    externalURL: java.lang.String = null,
    iconUrl: java.lang.String = null,
    onClick: js.Function0[scala.Unit] = null,
    routeName: java.lang.String = null,
    routeParams: js.Array[java.lang.String] = null
  ): AutocompleteSearchResultHtml = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("descriptionHTML")(descriptionHTML)
    __obj.updateDynamic("nameHTML")(nameHTML)
    if (externalURL != null) __obj.updateDynamic("externalURL")(externalURL)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (routeName != null) __obj.updateDynamic("routeName")(routeName)
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams)
    __obj.asInstanceOf[AutocompleteSearchResultHtml]
  }
}

