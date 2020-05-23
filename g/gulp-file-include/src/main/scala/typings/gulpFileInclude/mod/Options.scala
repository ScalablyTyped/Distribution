package typings.gulpFileInclude.mod

import org.scalablytyped.runtime.StringDictionary
import typings.gulpFileInclude.gulpFileIncludeStrings.`@file`
import typings.gulpFileInclude.gulpFileIncludeStrings.`@root`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Can be "@file" or "@root" or some base path.
    * default: "@file"
    */
  var basepath: js.UndefOr[`@file` | `@root` | String] = js.undefined
  /**
    * Effectively a context for variables used in 'if' statements.
    */
  var context: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Filters basically look like functions that get passed into '@@include'.
    * When one of these functions is called, something of that name is looked
    * up in this object and called to get the contents of that include.
    */
  var filters: js.UndefOr[StringDictionary[js.Function1[/* arg */ js.Any, String]]] = js.undefined
  /**
    * default: false
    */
  var indent: js.UndefOr[Boolean] = js.undefined
  /** default: "@@" */
  var prefix: js.UndefOr[String] = js.undefined
  /** default: "" */
  var suffix: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basepath: `@file` | `@root` | String = null,
    context: StringDictionary[js.Any] = null,
    filters: StringDictionary[js.Function1[/* arg */ js.Any, String]] = null,
    indent: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    suffix: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (basepath != null) __obj.updateDynamic("basepath")(basepath.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

