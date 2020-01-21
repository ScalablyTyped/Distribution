package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of object IDs.
  */
@js.native
trait SchemaObjectReferences extends js.Object {
  /**
    * The object IDs.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaObjectReferences {
  @scala.inline
  def apply(objectIds: js.Array[String] = null): SchemaObjectReferences = {
    val __obj = js.Dynamic.literal()
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObjectReferences]
  }
}

