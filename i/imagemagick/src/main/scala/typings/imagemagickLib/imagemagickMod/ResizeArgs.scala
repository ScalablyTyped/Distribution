package typings
package imagemagickLib.imagemagickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeArgs extends js.Object {
  var args: js.Array[java.lang.String]
  var opt: Options
}

object ResizeArgs {
  @scala.inline
  def apply(args: js.Array[java.lang.String], opt: Options): ResizeArgs = {
    val __obj = js.Dynamic.literal(args = args, opt = opt)
  
    __obj.asInstanceOf[ResizeArgs]
  }
}

