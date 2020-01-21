package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default filter associated with a sheet.
  */
@js.native
trait SchemaBasicFilter extends js.Object {
  /**
    * The criteria for showing/hiding values per column. The map&#39;s key is
    * the column index, and the value is the criteria for that column.
    */
  var criteria: js.UndefOr[StringDictionary[SchemaFilterCriteria]] = js.native
  /**
    * The range the filter covers.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SchemaSortSpec]] = js.native
}

object SchemaBasicFilter {
  @scala.inline
  def apply(
    criteria: StringDictionary[SchemaFilterCriteria] = null,
    range: SchemaGridRange = null,
    sortSpecs: js.Array[SchemaSortSpec] = null
  ): SchemaBasicFilter = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (sortSpecs != null) __obj.updateDynamic("sortSpecs")(sortSpecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBasicFilter]
  }
}

