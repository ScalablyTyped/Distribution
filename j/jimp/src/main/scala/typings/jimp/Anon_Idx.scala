package typings.jimp

import typings.jimp.jimpMod.DepreciatedJimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Idx extends js.Object {
  var idx: Double
  var image: DepreciatedJimp
  var x: Double
  var y: Double
}

object Anon_Idx {
  @scala.inline
  def apply(idx: Double, image: DepreciatedJimp, x: Double, y: Double): Anon_Idx = {
    val __obj = js.Dynamic.literal(idx = idx, image = image, x = x, y = y)
  
    __obj.asInstanceOf[Anon_Idx]
  }
}

