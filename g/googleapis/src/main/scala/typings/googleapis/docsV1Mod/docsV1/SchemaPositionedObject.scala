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
  def apply(): SchemaPositionedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObject]
  }
  @scala.inline
  implicit class SchemaPositionedObjectOps[Self <: SchemaPositionedObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setPositionedObjectProperties(value: SchemaPositionedObjectProperties): Self = this.set("positionedObjectProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionedObjectProperties: Self = this.set("positionedObjectProperties", js.undefined)
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = this.set("suggestedDeletionIds", js.Array(value :_*))
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = this.set("suggestedDeletionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedDeletionIds: Self = this.set("suggestedDeletionIds", js.undefined)
    @scala.inline
    def setSuggestedInsertionId(value: String): Self = this.set("suggestedInsertionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedInsertionId: Self = this.set("suggestedInsertionId", js.undefined)
    @scala.inline
    def setSuggestedPositionedObjectPropertiesChanges(value: StringDictionary[SchemaSuggestedPositionedObjectProperties]): Self = this.set("suggestedPositionedObjectPropertiesChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedPositionedObjectPropertiesChanges: Self = this.set("suggestedPositionedObjectPropertiesChanges", js.undefined)
  }
  
}

