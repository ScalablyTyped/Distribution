package typings.jquerySlugify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{preSlug (source : string): string, postSlug (source : string): string, slugFunc (input : string, options : jquery-slugify.jquery-slugify.Options): string,   separator  :string,   lang  :string | boolean,   symbols  :boolean,   maintainCase  :boolean,   titleCase  :std.Array<string> | boolean,   truncate  :number,   uric  :boolean,   uricNoSlash  :boolean,   mark  :boolean,   custom  :std.Array<string>}> */
trait Options extends js.Object {
  var custom: js.UndefOr[js.Array[String]] = js.undefined
  var lang: js.UndefOr[String | Boolean] = js.undefined
  var maintainCase: js.UndefOr[Boolean] = js.undefined
  var mark: js.UndefOr[Boolean] = js.undefined
  var postSlug: js.UndefOr[js.Function1[/* source */ String, String]] = js.undefined
  var preSlug: js.UndefOr[js.Function1[/* source */ String, String]] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var slugFunc: js.UndefOr[js.Function2[/* input */ String, /* options */ this.type, String]] = js.undefined
  var symbols: js.UndefOr[Boolean] = js.undefined
  var titleCase: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var truncate: js.UndefOr[Double] = js.undefined
  var uric: js.UndefOr[Boolean] = js.undefined
  var uricNoSlash: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    custom: js.Array[String] = null,
    lang: String | Boolean = null,
    maintainCase: js.UndefOr[Boolean] = js.undefined,
    mark: js.UndefOr[Boolean] = js.undefined,
    postSlug: /* source */ String => String = null,
    preSlug: /* source */ String => String = null,
    separator: String = null,
    slugFunc: (/* input */ String, Options) => String = null,
    symbols: js.UndefOr[Boolean] = js.undefined,
    titleCase: js.Array[String] | Boolean = null,
    truncate: Int | Double = null,
    uric: js.UndefOr[Boolean] = js.undefined,
    uricNoSlash: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainCase)) __obj.updateDynamic("maintainCase")(maintainCase.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (postSlug != null) __obj.updateDynamic("postSlug")(js.Any.fromFunction1(postSlug))
    if (preSlug != null) __obj.updateDynamic("preSlug")(js.Any.fromFunction1(preSlug))
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (slugFunc != null) __obj.updateDynamic("slugFunc")(js.Any.fromFunction2(slugFunc))
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols.asInstanceOf[js.Any])
    if (titleCase != null) __obj.updateDynamic("titleCase")(titleCase.asInstanceOf[js.Any])
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (!js.isUndefined(uric)) __obj.updateDynamic("uric")(uric.asInstanceOf[js.Any])
    if (!js.isUndefined(uricNoSlash)) __obj.updateDynamic("uricNoSlash")(uricNoSlash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

