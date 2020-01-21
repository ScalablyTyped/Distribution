package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A holder for any type of filter.
  */
@js.native
trait SchemaFilter extends js.Object {
  /**
    * A composite filter.
    */
  var compositeFilter: js.UndefOr[SchemaCompositeFilter] = js.native
  /**
    * A filter on a property.
    */
  var propertyFilter: js.UndefOr[SchemaPropertyFilter] = js.native
}

object SchemaFilter {
  @scala.inline
  def apply(compositeFilter: SchemaCompositeFilter = null, propertyFilter: SchemaPropertyFilter = null): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    if (compositeFilter != null) __obj.updateDynamic("compositeFilter")(compositeFilter.asInstanceOf[js.Any])
    if (propertyFilter != null) __obj.updateDynamic("propertyFilter")(propertyFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFilter]
  }
}

