package typings.jsonSchemaMergeAllof.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyNames extends js.Object {
  var propertyNames: js.UndefOr[js.Any] = js.undefined
}

object PropertyNames {
  @scala.inline
  def apply(propertyNames: js.Any = null): PropertyNames = {
    val __obj = js.Dynamic.literal()
    if (propertyNames != null) __obj.updateDynamic("propertyNames")(propertyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyNames]
  }
}

