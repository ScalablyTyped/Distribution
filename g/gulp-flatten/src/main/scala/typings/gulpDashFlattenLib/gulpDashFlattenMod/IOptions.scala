package typings
package gulpDashFlattenLib.gulpDashFlattenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var newPath: java.lang.String
}

object IOptions {
  @scala.inline
  def apply(newPath: java.lang.String): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newPath")(newPath)
    __obj.asInstanceOf[IOptions]
  }
}

