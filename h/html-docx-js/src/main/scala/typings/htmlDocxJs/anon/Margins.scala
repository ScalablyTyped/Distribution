package typings.htmlDocxJs.anon

import typings.htmlDocxJs.htmlDocxJsStrings.landscape
import typings.htmlDocxJs.htmlDocxJsStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Margins extends js.Object {
  /**
    * A map of margin sizes (expressed in twentieths of point, see
    * [WordprocessingML documentation](http://officeopenxml.com/WPsectionPgMar.php)
    * for details).
    */
  var margins: js.UndefOr[Bottom] = js.native
  /**
    * Page orientation. Must be `landscape` or `portrait` (default).
    */
  var orientation: js.UndefOr[landscape | portrait] = js.native
}

object Margins {
  @scala.inline
  def apply(): Margins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Margins]
  }
  @scala.inline
  implicit class MarginsOps[Self <: Margins] (val x: Self) extends AnyVal {
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
    def setMargins(value: Bottom): Self = this.set("margins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargins: Self = this.set("margins", js.undefined)
    @scala.inline
    def setOrientation(value: landscape | portrait): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
  
}

