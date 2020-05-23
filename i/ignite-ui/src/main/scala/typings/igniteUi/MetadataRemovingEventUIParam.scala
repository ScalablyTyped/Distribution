package typings.igniteUi

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
  var targetElement: js.UndefOr[String] = js.undefined
}

object MetadataRemovingEventUIParam {
  @scala.inline
  def apply(metadata: js.Any = null, targetElement: String = null): MetadataRemovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataRemovingEventUIParam]
  }
}

