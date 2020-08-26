package typings.hastUtilFromParse5.mod

import typings.hastUtilFromParse5.hastUtilFromParse5Strings.html
import typings.hastUtilFromParse5.hastUtilFromParse5Strings.svg
import typings.vfile.mod.VFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HastUtilFromParse5Options extends js.Object {
  /**
    * [`VFile`](https://github.com/vfile/vfile), used to add
    * [positional information](https://github.com/syntax-tree/unist#positional-information)
    * to [*nodes*](https://github.com/syntax-tree/hast#nodes).
    * If given, the [*file*](https://github.com/syntax-tree/unist#file) should have the
    * original HTML source as its contents.
    */
  var file: js.UndefOr[VFile] = js.native
  /**
    * Whether the [*root*](https://github.com/syntax-tree/unist#root) of the
    * [*tree*](https://github.com/syntax-tree/unist#tree) is in the `'html'` or `'svg'`
    * space.
    *
    * If an element in with the SVG namespace is found in `ast`, `fromParse5`
    * automatically switches to the SVG space when entering the element, and switches
    * back when leaving.
    *
    * @default 'html'
    */
  var space: js.UndefOr[html | svg] = js.native
  /**
    *
    * Whether to add extra positional information about starting tags, closing tags,
    * and attributes to elements.
    *
    * Note: not used without `file`.
    *
    * @default: false
    */
  var verbose: js.UndefOr[Boolean] = js.native
}

object HastUtilFromParse5Options {
  @scala.inline
  def apply(): HastUtilFromParse5Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HastUtilFromParse5Options]
  }
  @scala.inline
  implicit class HastUtilFromParse5OptionsOps[Self <: HastUtilFromParse5Options] (val x: Self) extends AnyVal {
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
    def setFile(value: VFile): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setSpace(value: html | svg): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

