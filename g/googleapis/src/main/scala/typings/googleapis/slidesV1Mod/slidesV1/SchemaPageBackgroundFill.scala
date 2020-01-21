package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The page background fill.
  */
@js.native
trait SchemaPageBackgroundFill extends js.Object {
  /**
    * The background fill property state.  Updating the fill on a page will
    * implicitly update this field to `RENDERED`, unless another value is
    * specified in the same request. To have no fill on a page, set this field
    * to `NOT_RENDERED`. In this case, any other fill fields set in the same
    * request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.native
  /**
    * Stretched picture fill.
    */
  var stretchedPictureFill: js.UndefOr[SchemaStretchedPictureFill] = js.native
}

object SchemaPageBackgroundFill {
  @scala.inline
  def apply(
    propertyState: String = null,
    solidFill: SchemaSolidFill = null,
    stretchedPictureFill: SchemaStretchedPictureFill = null
  ): SchemaPageBackgroundFill = {
    val __obj = js.Dynamic.literal()
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState.asInstanceOf[js.Any])
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill.asInstanceOf[js.Any])
    if (stretchedPictureFill != null) __obj.updateDynamic("stretchedPictureFill")(stretchedPictureFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPageBackgroundFill]
  }
}

