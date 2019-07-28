package typings.kss.kssMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * kss-node makes the header available separately from the description. To make kss-node
    * behave like the Ruby KSS, disable this option and the title will remain a part of the
    * description. Enabled by default.
    * @default true.
    */
  var header: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to automatically format Markdown using [marked](https://github.com/chjj/marked).
    * Enabled by default.
    * @default true
    */
  var markdown: js.UndefOr[Boolean] = js.undefined
  /**
    * Use a regex or string (e.g. `*.less|*.css`) to only parse files matching this value.
    * @default *.css|*.less|*.sass|*.scss|*.styl|*.stylus
    */
  var mask: js.UndefOr[String | RegExp] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    header: js.UndefOr[Boolean] = js.undefined,
    markdown: js.UndefOr[Boolean] = js.undefined,
    mask: String | RegExp = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (!js.isUndefined(markdown)) __obj.updateDynamic("markdown")(markdown)
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

