package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event related to the person.
  */
@js.native
trait SchemaEvent extends js.Object {
  /**
    * The date of the event.
    */
  var date: js.UndefOr[SchemaDate] = js.native
  /**
    * The read-only type of the event translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  /**
    * Metadata about the event.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The type of the event. The type can be custom or one of these predefined
    * values:  * `anniversary` * `other`
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaEvent {
  @scala.inline
  def apply(
    date: SchemaDate = null,
    formattedType: String = null,
    metadata: SchemaFieldMetadata = null,
    `type`: String = null
  ): SchemaEvent = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEvent]
  }
}

