package typings.kss.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * kss-node makes the header available separately from the description. To make kss-node
    * behave like the Ruby KSS, disable this option and the title will remain a part of the
    * description. Enabled by default.
    * @default true.
    */
  var header: js.UndefOr[Boolean] = js.native
  /**
    * Whether to automatically format Markdown using [marked](https://github.com/chjj/marked).
    * Enabled by default.
    * @default true
    */
  var markdown: js.UndefOr[Boolean] = js.native
  /**
    * Use a regex or string (e.g. `*.less|*.css`) to only parse files matching this value.
    * @default *.css|*.less|*.sass|*.scss|*.styl|*.stylus
    */
  var mask: js.UndefOr[String | RegExp] = js.native
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
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setMarkdown(value: Boolean): Self = this.set("markdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkdown: Self = this.set("markdown", js.undefined)
    @scala.inline
    def setMask(value: String | RegExp): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
  }
  
}

