package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Postal Code List Response
  */
@js.native
trait SchemaPostalCodesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#postalCodesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Postal code collection.
    */
  var postalCodes: js.UndefOr[js.Array[SchemaPostalCode]] = js.native
}

object SchemaPostalCodesListResponse {
  @scala.inline
  def apply(kind: String = null, postalCodes: js.Array[SchemaPostalCode] = null): SchemaPostalCodesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (postalCodes != null) __obj.updateDynamic("postalCodes")(postalCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPostalCodesListResponse]
  }
}

