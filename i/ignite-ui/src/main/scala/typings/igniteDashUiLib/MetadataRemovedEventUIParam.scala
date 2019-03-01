package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataRemovedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the data.
  	 */
  var metadata: js.UndefOr[js.Any] = js.undefined
}

object MetadataRemovedEventUIParam {
  @scala.inline
  def apply(metadata: js.Any = null): MetadataRemovedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[MetadataRemovedEventUIParam]
  }
}

