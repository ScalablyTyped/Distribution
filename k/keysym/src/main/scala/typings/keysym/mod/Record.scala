package typings.keysym.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Record extends js.Object {
  var keysym: Double = js.native
  var names: js.Array[String] = js.native
  var status: String = js.native
  var unicode: Double = js.native
}

object Record {
  @scala.inline
  def apply(keysym: Double, names: js.Array[String], status: String, unicode: Double): Record = {
    val __obj = js.Dynamic.literal(keysym = keysym.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
  @scala.inline
  implicit class RecordOps[Self <: Record] (val x: Self) extends AnyVal {
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
    def setKeysym(value: Double): Self = this.set("keysym", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnicode(value: Double): Self = this.set("unicode", value.asInstanceOf[js.Any])
  }
  
}

