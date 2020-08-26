package typings.gulpMinify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Min extends js.Object {
  /**
    * The suffix string of the filenames that output minified files ends with or the regex expressions to be replaced with input filenames.
    */
  var min: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The suffix string of the filenames that output source files ends with.
    */
  var src: js.UndefOr[String] = js.native
}

object Min {
  @scala.inline
  def apply(): Min = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Min]
  }
  @scala.inline
  implicit class MinOps[Self <: Min] (val x: Self) extends AnyVal {
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
    def setMinVarargs(value: String*): Self = this.set("min", js.Array(value :_*))
    @scala.inline
    def setMin(value: String | js.Array[String]): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}

