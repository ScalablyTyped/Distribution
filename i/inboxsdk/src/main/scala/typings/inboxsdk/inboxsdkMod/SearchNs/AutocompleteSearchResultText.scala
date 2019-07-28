package typings.inboxsdk.inboxsdkMod.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteSearchResultText
  extends AutocompleteSearchResultBase
     with AutocompleteSearchResult {
  var description: String
  var name: String
}

object AutocompleteSearchResultText {
  @scala.inline
  def apply(
    description: String,
    name: String,
    externalURL: String = null,
    iconHTML: String = null,
    iconUrl: String = null,
    onClick: () => Unit = null,
    routeName: String = null,
    routeParams: js.Array[String] = null
  ): AutocompleteSearchResultText = {
    val __obj = js.Dynamic.literal(description = description, name = name)
    if (externalURL != null) __obj.updateDynamic("externalURL")(externalURL)
    if (iconHTML != null) __obj.updateDynamic("iconHTML")(iconHTML)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (routeName != null) __obj.updateDynamic("routeName")(routeName)
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams)
    __obj.asInstanceOf[AutocompleteSearchResultText]
  }
}

