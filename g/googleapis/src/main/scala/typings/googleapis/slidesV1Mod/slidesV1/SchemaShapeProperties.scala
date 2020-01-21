package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of a Shape.  If the shape is a placeholder shape as
  * determined by the placeholder field, then these properties may be inherited
  * from a parent placeholder shape. Determining the rendered value of the
  * property depends on the corresponding property_state field value.
  */
@js.native
trait SchemaShapeProperties extends js.Object {
  /**
    * The alignment of the content in the shape. If unspecified, the alignment
    * is inherited from a parent placeholder if it exists. If the shape has no
    * parent, the default alignment matches the alignment for new shapes
    * created in the Slides editor.
    */
  var contentAlignment: js.UndefOr[String] = js.native
  /**
    * The hyperlink destination of the shape. If unset, there is no link. Links
    * are not inherited from parent placeholders.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  /**
    * The outline of the shape. If unset, the outline is inherited from a
    * parent placeholder if it exists. If the shape has no parent, then the
    * default outline depends on the shape type, matching the defaults for new
    * shapes created in the Slides editor.
    */
  var outline: js.UndefOr[SchemaOutline] = js.native
  /**
    * The shadow properties of the shape. If unset, the shadow is inherited
    * from a parent placeholder if it exists. If the shape has no parent, then
    * the default shadow matches the defaults for new shapes created in the
    * Slides editor. This property is read-only.
    */
  var shadow: js.UndefOr[SchemaShadow] = js.native
  /**
    * The background fill of the shape. If unset, the background fill is
    * inherited from a parent placeholder if it exists. If the shape has no
    * parent, then the default background fill depends on the shape type,
    * matching the defaults for new shapes created in the Slides editor.
    */
  var shapeBackgroundFill: js.UndefOr[SchemaShapeBackgroundFill] = js.native
}

object SchemaShapeProperties {
  @scala.inline
  def apply(
    contentAlignment: String = null,
    link: SchemaLink = null,
    outline: SchemaOutline = null,
    shadow: SchemaShadow = null,
    shapeBackgroundFill: SchemaShapeBackgroundFill = null
  ): SchemaShapeProperties = {
    val __obj = js.Dynamic.literal()
    if (contentAlignment != null) __obj.updateDynamic("contentAlignment")(contentAlignment.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shapeBackgroundFill != null) __obj.updateDynamic("shapeBackgroundFill")(shapeBackgroundFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShapeProperties]
  }
}

