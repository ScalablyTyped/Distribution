package typings.grunt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/marak/colors.js/}
  */
trait String extends js.Object {
  var blue: java.lang.String
  var cyan: java.lang.String
  var green: java.lang.String
  var grey: java.lang.String
  var magenta: java.lang.String
  var red: java.lang.String
  var white: java.lang.String
  var yellow: java.lang.String
}

object String {
  @scala.inline
  def apply(
    blue: java.lang.String,
    cyan: java.lang.String,
    green: java.lang.String,
    grey: java.lang.String,
    magenta: java.lang.String,
    red: java.lang.String,
    white: java.lang.String,
    yellow: java.lang.String
  ): String = {
    val __obj = js.Dynamic.literal(blue = blue, cyan = cyan, green = green, grey = grey, magenta = magenta, red = red, white = white, yellow = yellow)
  
    __obj.asInstanceOf[String]
  }
}

