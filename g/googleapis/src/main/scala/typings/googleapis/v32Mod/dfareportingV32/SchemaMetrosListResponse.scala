package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metro List Response
  */
@js.native
trait SchemaMetrosListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#metrosListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metro collection.
    */
  var metros: js.UndefOr[js.Array[SchemaMetro]] = js.native
}

object SchemaMetrosListResponse {
  @scala.inline
  def apply(kind: String = null, metros: js.Array[SchemaMetro] = null): SchemaMetrosListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metros != null) __obj.updateDynamic("metros")(metros.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetrosListResponse]
  }
}

