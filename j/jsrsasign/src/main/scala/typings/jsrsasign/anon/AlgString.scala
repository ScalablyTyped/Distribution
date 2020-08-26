package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgString extends js.Object {
  var alg: String = js.native
}

object AlgString {
  @scala.inline
  def apply(alg: String): AlgString = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgString]
  }
  @scala.inline
  implicit class AlgStringOps[Self <: AlgString] (val x: Self) extends AnyVal {
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
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
  }
  
}

