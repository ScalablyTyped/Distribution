package typings.jestTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  var code: String = js.native
  var mapCoverage: Boolean = js.native
  var sourceMapPath: String | Null = js.native
}

object Code {
  @scala.inline
  def apply(code: String, mapCoverage: Boolean): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], mapCoverage = mapCoverage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapCoverage(value: Boolean): Self = this.set("mapCoverage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceMapPath(value: String): Self = this.set("sourceMapPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceMapPathNull: Self = this.set("sourceMapPath", null)
  }
  
}

