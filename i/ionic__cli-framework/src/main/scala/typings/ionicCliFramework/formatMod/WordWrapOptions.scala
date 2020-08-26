package typings.ionicCliFramework.formatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordWrapOptions extends js.Object {
  var append: js.UndefOr[String] = js.native
  var indentation: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object WordWrapOptions {
  @scala.inline
  def apply(): WordWrapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordWrapOptions]
  }
  @scala.inline
  implicit class WordWrapOptionsOps[Self <: WordWrapOptions] (val x: Self) extends AnyVal {
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
    def setAppend(value: String): Self = this.set("append", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setIndentation(value: Double): Self = this.set("indentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentation: Self = this.set("indentation", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

