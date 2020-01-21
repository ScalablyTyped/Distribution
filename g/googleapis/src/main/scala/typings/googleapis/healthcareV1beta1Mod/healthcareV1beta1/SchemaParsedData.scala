package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The content of a HL7v2 message in a structured format.
  */
@js.native
trait SchemaParsedData extends js.Object {
  var segments: js.UndefOr[js.Array[SchemaSegment]] = js.native
}

object SchemaParsedData {
  @scala.inline
  def apply(segments: js.Array[SchemaSegment] = null): SchemaParsedData = {
    val __obj = js.Dynamic.literal()
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParsedData]
  }
}

