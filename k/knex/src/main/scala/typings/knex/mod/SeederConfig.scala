package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeederConfig extends js.Object {
  var directory: js.UndefOr[String] = js.undefined
  var extension: js.UndefOr[String] = js.undefined
  var loadExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var specific: js.UndefOr[String] = js.undefined
}

object SeederConfig {
  @scala.inline
  def apply(
    directory: String = null,
    extension: String = null,
    loadExtensions: js.Array[String] = null,
    specific: String = null
  ): SeederConfig = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (loadExtensions != null) __obj.updateDynamic("loadExtensions")(loadExtensions.asInstanceOf[js.Any])
    if (specific != null) __obj.updateDynamic("specific")(specific.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeederConfig]
  }
}

