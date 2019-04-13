package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeedsConfig extends js.Object {
  var directory: js.UndefOr[java.lang.String] = js.undefined
}

object SeedsConfig {
  @scala.inline
  def apply(directory: java.lang.String = null): SeedsConfig = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory)
    __obj.asInstanceOf[SeedsConfig]
  }
}

