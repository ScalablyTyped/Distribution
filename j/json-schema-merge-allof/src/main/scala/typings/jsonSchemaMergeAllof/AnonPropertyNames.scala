package typings.jsonSchemaMergeAllof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropertyNames extends js.Object {
  var propertyNames: js.UndefOr[js.Any] = js.undefined
}

object AnonPropertyNames {
  @scala.inline
  def apply(propertyNames: js.Any = null): AnonPropertyNames = {
    val __obj = js.Dynamic.literal()
    if (propertyNames != null) __obj.updateDynamic("propertyNames")(propertyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPropertyNames]
  }
}

