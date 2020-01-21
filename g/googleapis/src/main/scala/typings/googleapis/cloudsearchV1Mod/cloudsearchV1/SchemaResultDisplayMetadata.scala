package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResultDisplayMetadata extends js.Object {
  /**
    * The metalines content to be displayed with the result.
    */
  var metalines: js.UndefOr[js.Array[SchemaResultDisplayLine]] = js.native
  /**
    * The display label for the object.
    */
  var objectTypeLabel: js.UndefOr[String] = js.native
}

object SchemaResultDisplayMetadata {
  @scala.inline
  def apply(metalines: js.Array[SchemaResultDisplayLine] = null, objectTypeLabel: String = null): SchemaResultDisplayMetadata = {
    val __obj = js.Dynamic.literal()
    if (metalines != null) __obj.updateDynamic("metalines")(metalines.asInstanceOf[js.Any])
    if (objectTypeLabel != null) __obj.updateDynamic("objectTypeLabel")(objectTypeLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResultDisplayMetadata]
  }
}

