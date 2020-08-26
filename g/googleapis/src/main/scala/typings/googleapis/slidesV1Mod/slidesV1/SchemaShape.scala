package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a generic shape that does not have a more
  * specific classification.
  */
@js.native
trait SchemaShape extends js.Object {
  /**
    * Placeholders are shapes that are inherit from corresponding placeholders
    * on layouts and masters.  If set, the shape is a placeholder shape and any
    * inherited properties can be resolved by looking at the parent placeholder
    * identified by the Placeholder.parent_object_id field.
    */
  var placeholder: js.UndefOr[SchemaPlaceholder] = js.native
  /**
    * The properties of the shape.
    */
  var shapeProperties: js.UndefOr[SchemaShapeProperties] = js.native
  /**
    * The type of the shape.
    */
  var shapeType: js.UndefOr[String] = js.native
  /**
    * The text content of the shape.
    */
  var text: js.UndefOr[SchemaTextContent] = js.native
}

object SchemaShape {
  @scala.inline
  def apply(): SchemaShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShape]
  }
  @scala.inline
  implicit class SchemaShapeOps[Self <: SchemaShape] (val x: Self) extends AnyVal {
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
    def setPlaceholder(value: SchemaPlaceholder): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setShapeProperties(value: SchemaShapeProperties): Self = this.set("shapeProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeProperties: Self = this.set("shapeProperties", js.undefined)
    @scala.inline
    def setShapeType(value: String): Self = this.set("shapeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeType: Self = this.set("shapeType", js.undefined)
    @scala.inline
    def setText(value: SchemaTextContent): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

