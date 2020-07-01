package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The shadow properties of a page element.  If these fields are unset, they
  * may be inherited from a parent placeholder if it exists. If there is no
  * parent, the fields will default to the value used for new page elements
  * created in the Slides editor, which may depend on the page element kind.
  */
@js.native
trait SchemaShadow extends js.Object {
  /**
    * The alignment point of the shadow, that sets the origin for translate,
    * scale and skew of the shadow. This property is read-only.
    */
  var alignment: js.UndefOr[String] = js.native
  /**
    * The alpha of the shadow&#39;s color, from 0.0 to 1.0.
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * The radius of the shadow blur. The larger the radius, the more diffuse
    * the shadow becomes.
    */
  var blurRadius: js.UndefOr[SchemaDimension] = js.native
  /**
    * The shadow color value.
    */
  var color: js.UndefOr[SchemaOpaqueColor] = js.native
  /**
    * The shadow property state.  Updating the shadow on a page element will
    * implicitly update this field to `RENDERED`, unless another value is
    * specified in the same request. To have no shadow on a page element, set
    * this field to `NOT_RENDERED`. In this case, any other shadow fields set
    * in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  /**
    * Whether the shadow should rotate with the shape. This property is
    * read-only.
    */
  var rotateWithShape: js.UndefOr[Boolean] = js.native
  /**
    * Transform that encodes the translate, scale, and skew of the shadow,
    * relative to the alignment position.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.native
  /**
    * The type of the shadow. This property is read-only.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaShadow {
  @scala.inline
  def apply(
    alignment: String = null,
    alpha: js.UndefOr[Double] = js.undefined,
    blurRadius: SchemaDimension = null,
    color: SchemaOpaqueColor = null,
    propertyState: String = null,
    rotateWithShape: js.UndefOr[Boolean] = js.undefined,
    transform: SchemaAffineTransform = null,
    `type`: String = null
  ): SchemaShadow = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateWithShape)) __obj.updateDynamic("rotateWithShape")(rotateWithShape.get.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShadow]
  }
}

