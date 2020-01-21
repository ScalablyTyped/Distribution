package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object was created by copying an existing object.
  */
@js.native
trait SchemaCopy extends js.Object {
  /**
    * The the original object.
    */
  var originalObject: js.UndefOr[SchemaTargetReference] = js.native
}

object SchemaCopy {
  @scala.inline
  def apply(originalObject: SchemaTargetReference = null): SchemaCopy = {
    val __obj = js.Dynamic.literal()
    if (originalObject != null) __obj.updateDynamic("originalObject")(originalObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCopy]
  }
}

