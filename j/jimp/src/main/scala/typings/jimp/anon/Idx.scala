package typings.jimp.anon

import typings.jimp.mod.DepreciatedJimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Idx extends js.Object {
  var idx: Double
  var image: DepreciatedJimp
  var x: Double
  var y: Double
}

object Idx {
  @scala.inline
  def apply(idx: Double, image: DepreciatedJimp, x: Double, y: Double): Idx = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idx]
  }
}

