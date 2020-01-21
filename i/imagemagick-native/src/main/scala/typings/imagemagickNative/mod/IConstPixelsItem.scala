package typings.imagemagickNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstPixelsItem extends js.Object {
  var blue: Double
  var green: Double
  var opacity: Double
  var red: Double
}

object IConstPixelsItem {
  @scala.inline
  def apply(blue: Double, green: Double, opacity: Double, red: Double): IConstPixelsItem = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IConstPixelsItem]
  }
}

