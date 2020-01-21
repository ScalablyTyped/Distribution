package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The placeholder information that uniquely identifies a placeholder shape.
  */
@js.native
trait SchemaPlaceholder extends js.Object {
  /**
    * The index of the placeholder. If the same placeholder types are present
    * in the same page, they would have different index values.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The object ID of this shape&#39;s parent placeholder. If unset, the
    * parent placeholder shape does not exist, so the shape does not inherit
    * properties from any other shape.
    */
  var parentObjectId: js.UndefOr[String] = js.native
  /**
    * The type of the placeholder.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaPlaceholder {
  @scala.inline
  def apply(index: Int | Double = null, parentObjectId: String = null, `type`: String = null): SchemaPlaceholder = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (parentObjectId != null) __obj.updateDynamic("parentObjectId")(parentObjectId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlaceholder]
  }
}

