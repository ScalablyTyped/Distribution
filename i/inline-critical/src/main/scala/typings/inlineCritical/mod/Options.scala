package typings.inlineCritical.mod

import typings.inlineCritical.inlineCriticalBooleans.`false`
import typings.inlineCritical.inlineCriticalStrings.body
import typings.inlineCritical.inlineCriticalStrings.head
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The path to be used when extracting styles to find the files references by `href` attributes.
    * @default process.cwd
    */
  var basePath: js.UndefOr[String] = js.native
  /**
    * Whether to remove the inlined styles from any stylesheets referenced in the HTML.
    * @default false
    */
  var extract: js.UndefOr[Boolean] = js.native
  /**
    * Stylesheets to ignore when inlining.
    * @default []
    * @example [/bootstrap/]
    */
  var ignore: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  /**
    * Whether to minify the styles before inlining.
    * @default true
    */
  var minify: js.UndefOr[Boolean] = js.native
  /**
    * The position of the `noscript` fallback.
    * * `body`: end of body
    * * `head`: end of head
    * * `false`: no `noscript`
    * @default 'body'
    */
  var noscript: js.UndefOr[body | head | `false`] = js.native
  /**
    * Whether to add loadCSS if it's not already loaded.
    * @default true
    */
  var polyfill: js.UndefOr[Boolean] = js.native
  /**
    * Paths to use in the `href` tag of the `link` elements.
    * @default false
    */
  var replaceStylesheets: js.UndefOr[js.Array[String] | `false`] = js.native
  /** The selector for the element used by loadCSS as a reference for inlining. */
  var selector: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    @scala.inline
    def setExtract(value: Boolean): Self = this.set("extract", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtract: Self = this.set("extract", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: (String | RegExp)*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setMinify(value: Boolean): Self = this.set("minify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    @scala.inline
    def setNoscript(value: body | head | `false`): Self = this.set("noscript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoscript: Self = this.set("noscript", js.undefined)
    @scala.inline
    def setPolyfill(value: Boolean): Self = this.set("polyfill", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolyfill: Self = this.set("polyfill", js.undefined)
    @scala.inline
    def setReplaceStylesheetsVarargs(value: String*): Self = this.set("replaceStylesheets", js.Array(value :_*))
    @scala.inline
    def setReplaceStylesheets(value: js.Array[String] | `false`): Self = this.set("replaceStylesheets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceStylesheets: Self = this.set("replaceStylesheets", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

