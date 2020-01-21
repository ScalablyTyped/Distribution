package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Connection Type List Response
  */
@js.native
trait SchemaConnectionTypesListResponse extends js.Object {
  /**
    * Collection of connection types such as broadband and mobile.
    */
  var connectionTypes: js.UndefOr[js.Array[SchemaConnectionType]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#connectionTypesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaConnectionTypesListResponse {
  @scala.inline
  def apply(connectionTypes: js.Array[SchemaConnectionType] = null, kind: String = null): SchemaConnectionTypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (connectionTypes != null) __obj.updateDynamic("connectionTypes")(connectionTypes.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConnectionTypesListResponse]
  }
}

