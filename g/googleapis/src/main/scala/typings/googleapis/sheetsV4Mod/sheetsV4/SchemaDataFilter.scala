package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter that describes what data should be selected or returned from a
  * request.
  */
@js.native
trait SchemaDataFilter extends js.Object {
  /**
    * Selects data that matches the specified A1 range.
    */
  var a1Range: js.UndefOr[String] = js.native
  /**
    * Selects data associated with the developer metadata matching the criteria
    * described by this DeveloperMetadataLookup.
    */
  var developerMetadataLookup: js.UndefOr[SchemaDeveloperMetadataLookup] = js.native
  /**
    * Selects data that matches the range described by the GridRange.
    */
  var gridRange: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaDataFilter {
  @scala.inline
  def apply(
    a1Range: String = null,
    developerMetadataLookup: SchemaDeveloperMetadataLookup = null,
    gridRange: SchemaGridRange = null
  ): SchemaDataFilter = {
    val __obj = js.Dynamic.literal()
    if (a1Range != null) __obj.updateDynamic("a1Range")(a1Range.asInstanceOf[js.Any])
    if (developerMetadataLookup != null) __obj.updateDynamic("developerMetadataLookup")(developerMetadataLookup.asInstanceOf[js.Any])
    if (gridRange != null) __obj.updateDynamic("gridRange")(gridRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDataFilter]
  }
}

