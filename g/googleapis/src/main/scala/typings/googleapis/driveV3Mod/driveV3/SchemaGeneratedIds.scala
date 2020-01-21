package typings.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of generated file IDs which can be provided in create requests.
  */
@js.native
trait SchemaGeneratedIds extends js.Object {
  /**
    * The IDs generated for the requesting user in the specified space.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#generatedIds&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The type of file that can be created with these IDs.
    */
  var space: js.UndefOr[String] = js.native
}

object SchemaGeneratedIds {
  @scala.inline
  def apply(ids: js.Array[String] = null, kind: String = null, space: String = null): SchemaGeneratedIds = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGeneratedIds]
  }
}

