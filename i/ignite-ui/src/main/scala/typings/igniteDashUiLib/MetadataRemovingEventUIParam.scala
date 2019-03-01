package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataRemovingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the data.
  	 */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /**
  	 * A reference to the dragged element.
  	 */
  var targetElement: js.UndefOr[java.lang.String] = js.undefined
}

object MetadataRemovingEventUIParam {
  @scala.inline
  def apply(metadata: js.Any = null, targetElement: java.lang.String = null): MetadataRemovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement)
    __obj.asInstanceOf[MetadataRemovingEventUIParam]
  }
}

