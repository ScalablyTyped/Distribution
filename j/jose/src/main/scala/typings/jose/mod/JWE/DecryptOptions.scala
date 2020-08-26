package typings.jose.mod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecryptOptions[komplet] extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  var complete: js.UndefOr[komplet] = js.native
  var crit: js.UndefOr[js.Array[String]] = js.native
}

object DecryptOptions {
  @scala.inline
  def apply[komplet](): DecryptOptions[komplet] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptOptions[komplet]]
  }
  @scala.inline
  implicit class DecryptOptionsOps[Self <: DecryptOptions[_], komplet] (val x: Self with DecryptOptions[komplet]) extends AnyVal {
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
    def setAlgorithmsVarargs(value: String*): Self = this.set("algorithms", js.Array(value :_*))
    @scala.inline
    def setAlgorithms(value: js.Array[String]): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithms: Self = this.set("algorithms", js.undefined)
    @scala.inline
    def setComplete(value: komplet): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setCritVarargs(value: String*): Self = this.set("crit", js.Array(value :_*))
    @scala.inline
    def setCrit(value: js.Array[String]): Self = this.set("crit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrit: Self = this.set("crit", js.undefined)
  }
  
}

