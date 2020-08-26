package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of a PositionedObject.
  */
@js.native
trait SchemaPositionedObjectProperties extends js.Object {
  /**
    * The embedded object of this positioned object.
    */
  var embeddedObject: js.UndefOr[SchemaEmbeddedObject] = js.native
  /**
    * The positioning of this positioned object relative to the newline of the
    * Paragraph that references this positioned object.
    */
  var positioning: js.UndefOr[SchemaPositionedObjectPositioning] = js.native
}

object SchemaPositionedObjectProperties {
  @scala.inline
  def apply(): SchemaPositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObjectProperties]
  }
  @scala.inline
  implicit class SchemaPositionedObjectPropertiesOps[Self <: SchemaPositionedObjectProperties] (val x: Self) extends AnyVal {
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
    def setEmbeddedObject(value: SchemaEmbeddedObject): Self = this.set("embeddedObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbeddedObject: Self = this.set("embeddedObject", js.undefined)
    @scala.inline
    def setPositioning(value: SchemaPositionedObjectPositioning): Self = this.set("positioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositioning: Self = this.set("positioning", js.undefined)
  }
  
}

