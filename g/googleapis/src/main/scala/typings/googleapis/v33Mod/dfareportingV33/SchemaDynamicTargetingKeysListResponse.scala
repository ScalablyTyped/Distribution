package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamic Targeting Key List Response
  */
@js.native
trait SchemaDynamicTargetingKeysListResponse extends js.Object {
  /**
    * Dynamic targeting key collection.
    */
  var dynamicTargetingKeys: js.UndefOr[js.Array[SchemaDynamicTargetingKey]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#dynamicTargetingKeysListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDynamicTargetingKeysListResponse {
  @scala.inline
  def apply(dynamicTargetingKeys: js.Array[SchemaDynamicTargetingKey] = null, kind: String = null): SchemaDynamicTargetingKeysListResponse = {
    val __obj = js.Dynamic.literal()
    if (dynamicTargetingKeys != null) __obj.updateDynamic("dynamicTargetingKeys")(dynamicTargetingKeys.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDynamicTargetingKeysListResponse]
  }
}

