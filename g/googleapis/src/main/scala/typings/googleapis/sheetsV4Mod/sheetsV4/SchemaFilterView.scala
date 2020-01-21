package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter view.
  */
@js.native
trait SchemaFilterView extends js.Object {
  /**
    * The criteria for showing/hiding values per column. The map&#39;s key is
    * the column index, and the value is the criteria for that column.
    */
  var criteria: js.UndefOr[StringDictionary[SchemaFilterCriteria]] = js.native
  /**
    * The ID of the filter view.
    */
  var filterViewId: js.UndefOr[Double] = js.native
  /**
    * The named range this filter view is backed by, if any.  When writing,
    * only one of range or named_range_id may be set.
    */
  var namedRangeId: js.UndefOr[String] = js.native
  /**
    * The range this filter view covers.  When writing, only one of range or
    * named_range_id may be set.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SchemaSortSpec]] = js.native
  /**
    * The name of the filter view.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaFilterView {
  @scala.inline
  def apply(
    criteria: StringDictionary[SchemaFilterCriteria] = null,
    filterViewId: Int | Double = null,
    namedRangeId: String = null,
    range: SchemaGridRange = null,
    sortSpecs: js.Array[SchemaSortSpec] = null,
    title: String = null
  ): SchemaFilterView = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (filterViewId != null) __obj.updateDynamic("filterViewId")(filterViewId.asInstanceOf[js.Any])
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (sortSpecs != null) __obj.updateDynamic("sortSpecs")(sortSpecs.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFilterView]
  }
}

