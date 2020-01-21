package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that is tethered to a Paragraph and positioned relative to the
  * beginning of the paragraph. A PositionedObject contains an EmbeddedObject
  * such as an image.
  */
@js.native
trait SchemaPositionedObject extends js.Object {
  /**
    * The ID of this positioned object.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The properties of this positioned object.
    */
  var positionedObjectProperties: js.UndefOr[SchemaPositionedObjectProperties] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion ID. If empty, then this is not a suggested
    * insertion.
    */
  var suggestedInsertionId: js.UndefOr[String] = js.native
  /**
    * The suggested changes to the positioned object properties, keyed by
    * suggestion ID.
    */
  var suggestedPositionedObjectPropertiesChanges: js.UndefOr[StringDictionary[SchemaSuggestedPositionedObjectProperties]] = js.native
}

object SchemaPositionedObject {
  @scala.inline
  def apply(
    objectId: String = null,
    positionedObjectProperties: SchemaPositionedObjectProperties = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionId: String = null,
    suggestedPositionedObjectPropertiesChanges: StringDictionary[SchemaSuggestedPositionedObjectProperties] = null
  ): SchemaPositionedObject = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (positionedObjectProperties != null) __obj.updateDynamic("positionedObjectProperties")(positionedObjectProperties.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionId != null) __obj.updateDynamic("suggestedInsertionId")(suggestedInsertionId.asInstanceOf[js.Any])
    if (suggestedPositionedObjectPropertiesChanges != null) __obj.updateDynamic("suggestedPositionedObjectPropertiesChanges")(suggestedPositionedObjectPropertiesChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPositionedObject]
  }
}

