package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metric value representing a list of integers.
  */
@js.native
trait SchemaIntegerList extends js.Object {
  /**
    * Elements of the list.
    */
  var elements: js.UndefOr[js.Array[SchemaSplitInt64]] = js.native
}

object SchemaIntegerList {
  @scala.inline
  def apply(elements: js.Array[SchemaSplitInt64] = null): SchemaIntegerList = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIntegerList]
  }
}

