package typings.loremIpsum.generatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMath extends js.Object {
  var seedrandom: ISeedRandom = js.native
}

object IMath {
  @scala.inline
  def apply(seedrandom: ISeedRandom): IMath = {
    val __obj = js.Dynamic.literal(seedrandom = seedrandom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMath]
  }
  @scala.inline
  implicit class IMathOps[Self <: IMath] (val x: Self) extends AnyVal {
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
    def setSeedrandom(value: ISeedRandom): Self = this.set("seedrandom", value.asInstanceOf[js.Any])
  }
  
}

