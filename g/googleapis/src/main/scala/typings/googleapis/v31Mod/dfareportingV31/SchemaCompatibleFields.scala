package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a response to the queryCompatibleFields method.
  */
@js.native
trait SchemaCompatibleFields extends js.Object {
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;CROSS_DIMENSION_REACH&quot;.
    */
  var crossDimensionReachReportCompatibleFields: js.UndefOr[SchemaCrossDimensionReachReportCompatibleFields] = js.native
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;FLOODLIGHT&quot;.
    */
  var floodlightReportCompatibleFields: js.UndefOr[SchemaFloodlightReportCompatibleFields] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#compatibleFields.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;PATH_TO_CONVERSION&quot;.
    */
  var pathToConversionReportCompatibleFields: js.UndefOr[SchemaPathToConversionReportCompatibleFields] = js.native
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;REACH&quot;.
    */
  var reachReportCompatibleFields: js.UndefOr[SchemaReachReportCompatibleFields] = js.native
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;STANDARD&quot;.
    */
  var reportCompatibleFields: js.UndefOr[SchemaReportCompatibleFields] = js.native
}

object SchemaCompatibleFields {
  @scala.inline
  def apply(
    crossDimensionReachReportCompatibleFields: SchemaCrossDimensionReachReportCompatibleFields = null,
    floodlightReportCompatibleFields: SchemaFloodlightReportCompatibleFields = null,
    kind: String = null,
    pathToConversionReportCompatibleFields: SchemaPathToConversionReportCompatibleFields = null,
    reachReportCompatibleFields: SchemaReachReportCompatibleFields = null,
    reportCompatibleFields: SchemaReportCompatibleFields = null
  ): SchemaCompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (crossDimensionReachReportCompatibleFields != null) __obj.updateDynamic("crossDimensionReachReportCompatibleFields")(crossDimensionReachReportCompatibleFields.asInstanceOf[js.Any])
    if (floodlightReportCompatibleFields != null) __obj.updateDynamic("floodlightReportCompatibleFields")(floodlightReportCompatibleFields.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pathToConversionReportCompatibleFields != null) __obj.updateDynamic("pathToConversionReportCompatibleFields")(pathToConversionReportCompatibleFields.asInstanceOf[js.Any])
    if (reachReportCompatibleFields != null) __obj.updateDynamic("reachReportCompatibleFields")(reachReportCompatibleFields.asInstanceOf[js.Any])
    if (reportCompatibleFields != null) __obj.updateDynamic("reportCompatibleFields")(reportCompatibleFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompatibleFields]
  }
}

