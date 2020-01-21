package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter.
  */
@js.native
trait SchemaFilter extends js.Object {
  /**
    * A composite filter.
    */
  var compositeFilter: js.UndefOr[SchemaCompositeFilter] = js.native
  /**
    * A filter on a document field.
    */
  var fieldFilter: js.UndefOr[SchemaFieldFilter] = js.native
  /**
    * A filter that takes exactly one argument.
    */
  var unaryFilter: js.UndefOr[SchemaUnaryFilter] = js.native
}

object SchemaFilter {
  @scala.inline
  def apply(
    compositeFilter: SchemaCompositeFilter = null,
    fieldFilter: SchemaFieldFilter = null,
    unaryFilter: SchemaUnaryFilter = null
  ): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    if (compositeFilter != null) __obj.updateDynamic("compositeFilter")(compositeFilter.asInstanceOf[js.Any])
    if (fieldFilter != null) __obj.updateDynamic("fieldFilter")(fieldFilter.asInstanceOf[js.Any])
    if (unaryFilter != null) __obj.updateDynamic("unaryFilter")(unaryFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFilter]
  }
}

