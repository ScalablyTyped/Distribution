package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeParam extends js.Object {
  var height: Double
  var width: Double
}

object ResizeParam {
  @scala.inline
  def apply(height: Double, width: Double): ResizeParam = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[ResizeParam]
  }
}

