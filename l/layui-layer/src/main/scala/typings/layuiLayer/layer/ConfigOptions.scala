package typings.layuiLayer.layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends Options {
  /**
    * 拓展的css皮肤
    */
  var extend: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * js所在的目录，可以是绝对目录，也可以是相对目录
    */
  var path: js.UndefOr[String] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
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
    def setExtendVarargs(value: String*): Self = this.set("extend", js.Array(value :_*))
    @scala.inline
    def setExtend(value: String | js.Array[String]): Self = this.set("extend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

