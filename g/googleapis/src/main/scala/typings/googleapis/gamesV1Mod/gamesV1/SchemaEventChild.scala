package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event child relationship resource.
  */
@js.native
trait SchemaEventChild extends js.Object {
  /**
    * The ID of the child event.
    */
  var childId: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventChild.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaEventChild {
  @scala.inline
  def apply(childId: String = null, kind: String = null): SchemaEventChild = {
    val __obj = js.Dynamic.literal()
    if (childId != null) __obj.updateDynamic("childId")(childId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEventChild]
  }
}

