package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeederConfig extends js.Object {
  var directory: js.UndefOr[java.lang.String] = js.undefined
  var extension: js.UndefOr[java.lang.String] = js.undefined
  var loadExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SeederConfig {
  @scala.inline
  def apply(
    directory: java.lang.String = null,
    extension: java.lang.String = null,
    loadExtensions: js.Array[java.lang.String] = null
  ): SeederConfig = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (loadExtensions != null) __obj.updateDynamic("loadExtensions")(loadExtensions)
    __obj.asInstanceOf[SeederConfig]
  }
}

