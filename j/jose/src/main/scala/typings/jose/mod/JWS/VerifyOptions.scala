package typings.jose.mod.JWS

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyOptions[komplet, parse] extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  var complete: js.UndefOr[komplet] = js.native
  var crit: js.UndefOr[js.Array[String]] = js.native
  var encoding: js.UndefOr[BufferEncoding] = js.native
  var parse: js.UndefOr[parse] = js.native
}

object VerifyOptions {
  @scala.inline
  def apply[komplet, parse](): VerifyOptions[komplet, parse] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyOptions[komplet, parse]]
  }
  @scala.inline
  implicit class VerifyOptionsOps[Self <: VerifyOptions[_, _], komplet, parse] (val x: Self with (VerifyOptions[komplet, parse])) extends AnyVal {
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
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setParse(value: parse): Self = this.set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
  }
  
}

