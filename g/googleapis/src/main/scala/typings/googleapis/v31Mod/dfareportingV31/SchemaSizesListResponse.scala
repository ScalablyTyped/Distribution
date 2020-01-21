package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Size List Response
  */
@js.native
trait SchemaSizesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#sizesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Size collection.
    */
  var sizes: js.UndefOr[js.Array[SchemaSize]] = js.native
}

object SchemaSizesListResponse {
  @scala.inline
  def apply(kind: String = null, sizes: js.Array[SchemaSize] = null): SchemaSizesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSizesListResponse]
  }
}

