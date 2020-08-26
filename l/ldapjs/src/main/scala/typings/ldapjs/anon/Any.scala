package typings.ldapjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Any extends js.Object {
  var any: js.UndefOr[js.Array[String]] = js.native
  var attribute: String = js.native
  var `final`: js.UndefOr[String] = js.native
  var initial: String = js.native
}

object Any {
  @scala.inline
  def apply(attribute: String, initial: String): Any = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Any]
  }
  @scala.inline
  implicit class AnyOps[Self <: Any] (val x: Self) extends AnyVal {
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
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitial(value: String): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnyVarargs(value: String*): Self = this.set("any", js.Array(value :_*))
    @scala.inline
    def setAny(value: js.Array[String]): Self = this.set("any", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAny: Self = this.set("any", js.undefined)
    @scala.inline
    def setFinal(value: String): Self = this.set("final", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinal: Self = this.set("final", js.undefined)
  }
  
}

