package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeederConfig extends js.Object {
  var directory: js.UndefOr[String] = js.undefined
  var extension: js.UndefOr[String] = js.undefined
  var loadExtensions: js.UndefOr[js.Array[String]] = js.undefined
}

object SeederConfig {
  @scala.inline
  def apply(directory: String = null, extension: String = null, loadExtensions: js.Array[String] = null): SeederConfig = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (loadExtensions != null) __obj.updateDynamic("loadExtensions")(loadExtensions)
    __obj.asInstanceOf[SeederConfig]
  }
}

