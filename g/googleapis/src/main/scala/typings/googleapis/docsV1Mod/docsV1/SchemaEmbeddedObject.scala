package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An embedded object in the document.
  */
@js.native
trait SchemaEmbeddedObject extends js.Object {
  /**
    * The description of the embedded object. The `title` and `description` are
    * both combined to display alt text.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The properties of an embedded drawing.
    */
  var embeddedDrawingProperties: js.UndefOr[SchemaEmbeddedDrawingProperties] = js.native
  /**
    * The border of the embedded object.
    */
  var embeddedObjectBorder: js.UndefOr[SchemaEmbeddedObjectBorder] = js.native
  /**
    * The properties of an image.
    */
  var imageProperties: js.UndefOr[SchemaImageProperties] = js.native
  /**
    * A reference to the external linked source content. For example, it
    * contains a reference to the source Sheets chart when the embedded object
    * is a linked chart.  If unset, then the embedded object is not linked.
    */
  var linkedContentReference: js.UndefOr[SchemaLinkedContentReference] = js.native
  /**
    * The bottom margin of the embedded object.
    */
  var marginBottom: js.UndefOr[SchemaDimension] = js.native
  /**
    * The left margin of the embedded object.
    */
  var marginLeft: js.UndefOr[SchemaDimension] = js.native
  /**
    * The right margin of the embedded object.
    */
  var marginRight: js.UndefOr[SchemaDimension] = js.native
  /**
    * The top margin of the embedded object.
    */
  var marginTop: js.UndefOr[SchemaDimension] = js.native
  /**
    * The size of the embedded object.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  /**
    * The title of the embedded object. The `title` and `description` are both
    * combined to display alt text.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaEmbeddedObject {
  @scala.inline
  def apply(
    description: String = null,
    embeddedDrawingProperties: SchemaEmbeddedDrawingProperties = null,
    embeddedObjectBorder: SchemaEmbeddedObjectBorder = null,
    imageProperties: SchemaImageProperties = null,
    linkedContentReference: SchemaLinkedContentReference = null,
    marginBottom: SchemaDimension = null,
    marginLeft: SchemaDimension = null,
    marginRight: SchemaDimension = null,
    marginTop: SchemaDimension = null,
    size: SchemaSize = null,
    title: String = null
  ): SchemaEmbeddedObject = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (embeddedDrawingProperties != null) __obj.updateDynamic("embeddedDrawingProperties")(embeddedDrawingProperties.asInstanceOf[js.Any])
    if (embeddedObjectBorder != null) __obj.updateDynamic("embeddedObjectBorder")(embeddedObjectBorder.asInstanceOf[js.Any])
    if (imageProperties != null) __obj.updateDynamic("imageProperties")(imageProperties.asInstanceOf[js.Any])
    if (linkedContentReference != null) __obj.updateDynamic("linkedContentReference")(linkedContentReference.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEmbeddedObject]
  }
}

