package typings.iron.mod

import typings.iron.anon.IvBits
import typings.iron.anon.KeyBits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithms_ extends js.Object {
  var `aes-128-ctr`: IvBits = js.native
  var `aes-256-cbc`: IvBits = js.native
  var sha256: KeyBits = js.native
}

object Algorithms_ {
  @scala.inline
  def apply(`aes-128-ctr`: IvBits, `aes-256-cbc`: IvBits, sha256: KeyBits): Algorithms_ = {
    val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
    __obj.updateDynamic("aes-128-ctr")(`aes-128-ctr`.asInstanceOf[js.Any])
    __obj.updateDynamic("aes-256-cbc")(`aes-256-cbc`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithms_]
  }
  @scala.inline
  implicit class Algorithms_Ops[Self <: Algorithms_] (val x: Self) extends AnyVal {
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
    def `setAes-128-ctr`(value: IvBits): Self = this.set("aes-128-ctr", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAes-256-cbc`(value: IvBits): Self = this.set("aes-256-cbc", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha256(value: KeyBits): Self = this.set("sha256", value.asInstanceOf[js.Any])
  }
  
}

