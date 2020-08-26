package typings.less.Less

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticOptions extends js.Object {
  var async: Boolean = js.native
  var fileAsync: Boolean = js.native
  var modifyVars: StringDictionary[String] = js.native
}

object StaticOptions {
  @scala.inline
  def apply(async: Boolean, fileAsync: Boolean, modifyVars: StringDictionary[String]): StaticOptions = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fileAsync = fileAsync.asInstanceOf[js.Any], modifyVars = modifyVars.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticOptions]
  }
  @scala.inline
  implicit class StaticOptionsOps[Self <: StaticOptions] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileAsync(value: Boolean): Self = this.set("fileAsync", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifyVars(value: StringDictionary[String]): Self = this.set("modifyVars", value.asInstanceOf[js.Any])
  }
  
}

