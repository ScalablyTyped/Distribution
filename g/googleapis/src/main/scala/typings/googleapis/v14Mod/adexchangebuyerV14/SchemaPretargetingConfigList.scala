package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPretargetingConfigList extends js.Object {
  /**
    * A list of pretargeting configs
    */
  var items: js.UndefOr[js.Array[SchemaPretargetingConfig]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPretargetingConfigList {
  @scala.inline
  def apply(items: js.Array[SchemaPretargetingConfig] = null, kind: String = null): SchemaPretargetingConfigList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPretargetingConfigList]
  }
}

