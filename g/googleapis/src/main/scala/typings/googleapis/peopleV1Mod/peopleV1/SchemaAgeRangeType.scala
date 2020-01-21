package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s age range.
  */
@js.native
trait SchemaAgeRangeType extends js.Object {
  /**
    * The age range.
    */
  var ageRange: js.UndefOr[String] = js.native
  /**
    * Metadata about the age range.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
}

object SchemaAgeRangeType {
  @scala.inline
  def apply(ageRange: String = null, metadata: SchemaFieldMetadata = null): SchemaAgeRangeType = {
    val __obj = js.Dynamic.literal()
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAgeRangeType]
  }
}

