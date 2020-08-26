package typings.jasmine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Random extends js.Object {
  var random: Boolean = js.native
  var seed: String = js.native
}

object Random {
  @scala.inline
  def apply(random: Boolean, seed: String): Random = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Random]
  }
  @scala.inline
  implicit class RandomOps[Self <: Random] (val x: Self) extends AnyVal {
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
    def setRandom(value: Boolean): Self = this.set("random", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeed(value: String): Self = this.set("seed", value.asInstanceOf[js.Any])
  }
  
}

