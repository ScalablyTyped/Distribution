package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Operating System List Response
  */
@js.native
trait SchemaOperatingSystemsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#operatingSystemsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Operating system collection.
    */
  var operatingSystems: js.UndefOr[js.Array[SchemaOperatingSystem]] = js.native
}

object SchemaOperatingSystemsListResponse {
  @scala.inline
  def apply(kind: String = null, operatingSystems: js.Array[SchemaOperatingSystem] = null): SchemaOperatingSystemsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (operatingSystems != null) __obj.updateDynamic("operatingSystems")(operatingSystems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperatingSystemsListResponse]
  }
}

