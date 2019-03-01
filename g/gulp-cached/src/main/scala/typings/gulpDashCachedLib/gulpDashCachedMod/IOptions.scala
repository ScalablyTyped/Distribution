package typings
package gulpDashCachedLib.gulpDashCachedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /**
    * Uses md5 instead of storing the whole file contents.
    * @default false
    */
  var optimizeMemory: js.UndefOr[scala.Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(optimizeMemory: js.UndefOr[scala.Boolean] = js.undefined): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(optimizeMemory)) __obj.updateDynamic("optimizeMemory")(optimizeMemory)
    __obj.asInstanceOf[IOptions]
  }
}

