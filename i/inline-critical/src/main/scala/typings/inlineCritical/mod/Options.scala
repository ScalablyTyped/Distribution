package typings.inlineCritical.mod

import typings.inlineCritical.inlineCriticalBooleans.`false`
import typings.inlineCritical.inlineCriticalStrings.body
import typings.inlineCritical.inlineCriticalStrings.head
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The path to be used when extracting styles to find the files references by `href` attributes.
    * @default process.cwd
    */
  var basePath: js.UndefOr[String] = js.undefined
  /**
    * Whether to remove the inlined styles from any stylesheets referenced in the HTML.
    * @default false
    */
  var extract: js.UndefOr[Boolean] = js.undefined
  /**
    * Stylesheets to ignore when inlining.
    * @default []
    * @example [/bootstrap/]
    */
  var ignore: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  /**
    * Whether to minify the styles before inlining.
    * @default true
    */
  var minify: js.UndefOr[Boolean] = js.undefined
  /**
    * The position of the `noscript` fallback.
    * * `body`: end of body
    * * `head`: end of head
    * * `false`: no `noscript`
    * @default 'body'
    */
  var noscript: js.UndefOr[body | head | `false`] = js.undefined
  /**
    * Whether to add loadCSS if it's not already loaded.
    * @default true
    */
  var polyfill: js.UndefOr[Boolean] = js.undefined
  /**
    * Paths to use in the `href` tag of the `link` elements.
    * @default false
    */
  var replaceStylesheets: js.UndefOr[js.Array[String] | `false`] = js.undefined
  /** The selector for the element used by loadCSS as a reference for inlining. */
  var selector: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basePath: String = null,
    extract: js.UndefOr[Boolean] = js.undefined,
    ignore: String | RegExp | (js.Array[String | RegExp]) = null,
    minify: js.UndefOr[Boolean] = js.undefined,
    noscript: body | head | `false` = null,
    polyfill: js.UndefOr[Boolean] = js.undefined,
    replaceStylesheets: js.Array[String] | `false` = null,
    selector: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (!js.isUndefined(extract)) __obj.updateDynamic("extract")(extract.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify.get.asInstanceOf[js.Any])
    if (noscript != null) __obj.updateDynamic("noscript")(noscript.asInstanceOf[js.Any])
    if (!js.isUndefined(polyfill)) __obj.updateDynamic("polyfill")(polyfill.get.asInstanceOf[js.Any])
    if (replaceStylesheets != null) __obj.updateDynamic("replaceStylesheets")(replaceStylesheets.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

