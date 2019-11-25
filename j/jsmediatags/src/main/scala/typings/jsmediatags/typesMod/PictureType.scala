package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureType extends js.Object {
  var data: js.Array[Double]
  var format: String
}

object PictureType {
  @scala.inline
  def apply(data: js.Array[Double], format: String): PictureType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PictureType]
  }
}

