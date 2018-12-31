package typings
package kssLib.kssMod.kssNs

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
  var header: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to automatically format Markdown using [marked](https://github.com/chjj/marked).
    * Enabled by default.
    * @default true
    */
  var markdown: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use a regex or string (e.g. `*.less|*.css`) to only parse files matching this value.
    * @default *.css|*.less|*.sass|*.scss|*.styl|*.stylus
    */
  var mask: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
}

