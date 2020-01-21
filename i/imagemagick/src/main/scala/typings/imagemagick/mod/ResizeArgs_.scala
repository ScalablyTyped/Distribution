package typings.imagemagick.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeArgs_ extends js.Object {
  var args: js.Array[String]
  var opt: Options
}

object ResizeArgs_ {
  @scala.inline
  def apply(args: js.Array[String], opt: Options): ResizeArgs_ = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], opt = opt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResizeArgs_]
  }
}

