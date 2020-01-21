package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Region List Response
  */
@js.native
trait SchemaRegionsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#regionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Region collection.
    */
  var regions: js.UndefOr[js.Array[SchemaRegion]] = js.native
}

object SchemaRegionsListResponse {
  @scala.inline
  def apply(kind: String = null, regions: js.Array[SchemaRegion] = null): SchemaRegionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionsListResponse]
  }
}

