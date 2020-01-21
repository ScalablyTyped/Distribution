package typings.loremIpsum.generatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMath extends js.Object {
  var seedrandom: ISeedRandom
}

object IMath {
  @scala.inline
  def apply(seedrandom: ISeedRandom): IMath = {
    val __obj = js.Dynamic.literal(seedrandom = seedrandom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMath]
  }
}

