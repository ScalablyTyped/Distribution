package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Isolines extends js.Object {
  var MetaInfo: Timestamp = js.native
  var View: js.Array[Result] = js.native
  var isolines: js.Array[_] = js.native
}

object Isolines {
  @scala.inline
  def apply(MetaInfo: Timestamp, View: js.Array[Result], isolines: js.Array[_]): Isolines = {
    val __obj = js.Dynamic.literal(MetaInfo = MetaInfo.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], isolines = isolines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Isolines]
  }
  @scala.inline
  implicit class IsolinesOps[Self <: Isolines] (val x: Self) extends AnyVal {
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
    def setMetaInfo(value: Timestamp): Self = this.set("MetaInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewVarargs(value: Result*): Self = this.set("View", js.Array(value :_*))
    @scala.inline
    def setView(value: js.Array[Result]): Self = this.set("View", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsolinesVarargs(value: js.Any*): Self = this.set("isolines", js.Array(value :_*))
    @scala.inline
    def setIsolines(value: js.Array[_]): Self = this.set("isolines", value.asInstanceOf[js.Any])
  }
  
}

