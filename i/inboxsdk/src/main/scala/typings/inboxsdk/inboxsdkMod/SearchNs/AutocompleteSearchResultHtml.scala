package typings.inboxsdk.inboxsdkMod.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteSearchResultHtml
  extends AutocompleteSearchResultBase
     with AutocompleteSearchResult {
  var descriptionHTML: String
  var nameHTML: String
}

object AutocompleteSearchResultHtml {
  @scala.inline
  def apply(
    descriptionHTML: String,
    nameHTML: String,
    externalURL: String = null,
    iconHTML: String = null,
    iconUrl: String = null,
    onClick: () => Unit = null,
    routeName: String = null,
    routeParams: js.Array[String] = null
  ): AutocompleteSearchResultHtml = {
    val __obj = js.Dynamic.literal(descriptionHTML = descriptionHTML, nameHTML = nameHTML)
    if (externalURL != null) __obj.updateDynamic("externalURL")(externalURL)
    if (iconHTML != null) __obj.updateDynamic("iconHTML")(iconHTML)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (routeName != null) __obj.updateDynamic("routeName")(routeName)
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams)
    __obj.asInstanceOf[AutocompleteSearchResultHtml]
  }
}

