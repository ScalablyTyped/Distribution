package typings.jqueryDashTypeahead.RunningCoder.Typeahead

import typings.jqueryDashTypeahead.jqueryDashTypeaheadNumbers.`false`
import typings.jqueryDashTypeahead.jqueryDashTypeaheadStrings.localStorage
import typings.jqueryDashTypeahead.jqueryDashTypeaheadStrings.sessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  /** En extended version of `JQuery Ajax` */
  var ajax: js.UndefOr[AJaxSettings | (js.Function1[/* query */ js.UndefOr[String], AJaxSettings])] = js.undefined
  /** Overrides the default configuration for the specified group. */
  var cache: js.UndefOr[Boolean | localStorage | sessionStorage] = js.undefined
  /** Overrides the default configuration for the specified group. */
  var compression: js.UndefOr[Boolean] = js.undefined
  /**  Array or function that returns an Array. The items in your array can either be strings or objects */
  var data: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.undefined
  /** Overrides the default configuration for the specified group. */
  var display: js.UndefOr[String | js.Array[String]] = js.undefined
  /** Overrides the default configuration for the specified group. */
  var dynamic: js.UndefOr[Boolean] = js.undefined
  /** Overrides the default configuration for the specified group. */
  var filter: js.UndefOr[
    Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
  ] = js.undefined
  /** Overrides the default configuration for the specified group. */
  var matcher: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean]
  ] = js.undefined
  /** Overrides the default configuration for the specified group. */
  var maxLength: js.UndefOr[`false` | Double] = js.undefined
  /** Overrides the default configuration for the specified group. */
  var minLength: js.UndefOr[Double] = js.undefined
  /** Overrides the default configuration for the specified group. */
  var template: js.UndefOr[
    String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String])
  ] = js.undefined
  /** Overrides the default configuration for the specified group. */
  var ttl: js.UndefOr[Double] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    ajax: AJaxSettings | (js.Function1[/* query */ js.UndefOr[String], AJaxSettings]) = null,
    cache: Boolean | localStorage | sessionStorage = null,
    compression: js.UndefOr[Boolean] = js.undefined,
    data: js.Array[_] | js.Function0[js.Array[_]] = null,
    display: String | js.Array[String] = null,
    dynamic: js.UndefOr[Boolean] = js.undefined,
    filter: Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean]) = null,
    matcher: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean = null,
    maxLength: `false` | Double = null,
    minLength: Int | Double = null,
    template: String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String]) = null,
    ttl: Int | Double = null
  ): Source = {
    val __obj = js.Dynamic.literal()
    if (ajax != null) __obj.updateDynamic("ajax")(ajax.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction2(matcher))
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

