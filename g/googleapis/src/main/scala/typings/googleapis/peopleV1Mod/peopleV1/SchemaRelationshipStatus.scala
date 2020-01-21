package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s read-only relationship status.
  */
@js.native
trait SchemaRelationshipStatus extends js.Object {
  /**
    * The read-only value of the relationship status translated and formatted
    * in the viewer&#39;s account locale or the `Accept-Language` HTTP header
    * locale.
    */
  var formattedValue: js.UndefOr[String] = js.native
  /**
    * Metadata about the relationship status.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The relationship status. The value can be custom or one of these
    * predefined values:  * `single` * `inARelationship` * `engaged` *
    * `married` * `itsComplicated` * `openRelationship` * `widowed` *
    * `inDomesticPartnership` * `inCivilUnion`
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaRelationshipStatus {
  @scala.inline
  def apply(formattedValue: String = null, metadata: SchemaFieldMetadata = null, value: String = null): SchemaRelationshipStatus = {
    val __obj = js.Dynamic.literal()
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRelationshipStatus]
  }
}

