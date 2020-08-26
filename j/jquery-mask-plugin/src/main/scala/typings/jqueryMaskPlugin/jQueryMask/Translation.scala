package typings.jqueryMaskPlugin.jQueryMask

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translation
  extends /* key */ StringDictionary[js.UndefOr[Pattern | js.Object]] {
  var placeholder: js.UndefOr[String] = js.native
}

object Translation {
  @scala.inline
  def apply(): Translation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Translation]
  }
  @scala.inline
  implicit class TranslationOps[Self <: Translation] (val x: Self) extends AnyVal {
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
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
  }
  
}

