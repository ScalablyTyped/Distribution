package typings.graphqlToolsDelegate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dehoist extends js.Object {
  var dehoist: js.UndefOr[Boolean] = js.native
  var delimeter: js.UndefOr[String] = js.native
  var fromPath: js.UndefOr[js.Array[String]] = js.native
}

object Dehoist {
  @scala.inline
  def apply(): Dehoist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dehoist]
  }
  @scala.inline
  implicit class DehoistOps[Self <: Dehoist] (val x: Self) extends AnyVal {
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
    def setDehoist(value: Boolean): Self = this.set("dehoist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDehoist: Self = this.set("dehoist", js.undefined)
    @scala.inline
    def setDelimeter(value: String): Self = this.set("delimeter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimeter: Self = this.set("delimeter", js.undefined)
    @scala.inline
    def setFromPathVarargs(value: String*): Self = this.set("fromPath", js.Array(value :_*))
    @scala.inline
    def setFromPath(value: js.Array[String]): Self = this.set("fromPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromPath: Self = this.set("fromPath", js.undefined)
  }
  
}

