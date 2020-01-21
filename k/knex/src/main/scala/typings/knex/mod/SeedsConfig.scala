package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeedsConfig extends js.Object {
  var directory: js.UndefOr[String] = js.undefined
  var stub: js.UndefOr[String] = js.undefined
}

object SeedsConfig {
  @scala.inline
  def apply(directory: String = null, stub: String = null): SeedsConfig = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (stub != null) __obj.updateDynamic("stub")(stub.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeedsConfig]
  }
}

