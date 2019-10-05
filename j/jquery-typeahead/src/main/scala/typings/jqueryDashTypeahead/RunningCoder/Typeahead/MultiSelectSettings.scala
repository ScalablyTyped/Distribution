package typings.jqueryDashTypeahead.RunningCoder.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectSettings extends js.Object {
  var callback: js.UndefOr[MultiSelectSettingsCallback] = js.undefined
  /** If true, the last label will be deleted if the query is empty and backspace is pressed */
  var cancelOnBackspace: js.UndefOr[Boolean] = js.undefined
  /** Default items when Typeahead is loade */
  var data: js.UndefOr[js.Array[_] | js.Function0[_]] = js.undefined
  /** Href link on the multiselect item */
  var href: js.UndefOr[String | (js.Function1[/* item */ js.UndefOr[js.Any], String])] = js.undefined
  /** Optional limit of maximum items to select */
  var limit: js.UndefOr[Double] = js.undefined
  /** Template when the limit is reached */
  var limitTemplate: js.UndefOr[String | (js.Function1[/* query */ js.UndefOr[String], String])] = js.undefined
  /** Unique item identifier to remove an item from the result list when selected (use any of the item key), by default a JSON of the item will be used */
  var matchOn: js.UndefOr[String | js.Array[_]] = js.undefined
}

object MultiSelectSettings {
  @scala.inline
  def apply(
    callback: MultiSelectSettingsCallback = null,
    cancelOnBackspace: js.UndefOr[Boolean] = js.undefined,
    data: js.Array[_] | js.Function0[_] = null,
    href: String | (js.Function1[/* item */ js.UndefOr[js.Any], String]) = null,
    limit: Int | Double = null,
    limitTemplate: String | (js.Function1[/* query */ js.UndefOr[String], String]) = null,
    matchOn: String | js.Array[_] = null
  ): MultiSelectSettings = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(cancelOnBackspace)) __obj.updateDynamic("cancelOnBackspace")(cancelOnBackspace)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (limitTemplate != null) __obj.updateDynamic("limitTemplate")(limitTemplate.asInstanceOf[js.Any])
    if (matchOn != null) __obj.updateDynamic("matchOn")(matchOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectSettings]
  }
}

