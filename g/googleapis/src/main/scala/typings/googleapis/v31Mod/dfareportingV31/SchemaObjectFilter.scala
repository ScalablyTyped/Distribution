package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object Filter.
  */
@js.native
trait SchemaObjectFilter extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#objectFilter&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Applicable when status is ASSIGNED. The user has access to objects with
    * these object IDs.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Status of the filter. NONE means the user has access to none of the
    * objects. ALL means the user has access to all objects. ASSIGNED means the
    * user has access to the objects with IDs in the objectIds list.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaObjectFilter {
  @scala.inline
  def apply(kind: String = null, objectIds: js.Array[String] = null, status: String = null): SchemaObjectFilter = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObjectFilter]
  }
}

