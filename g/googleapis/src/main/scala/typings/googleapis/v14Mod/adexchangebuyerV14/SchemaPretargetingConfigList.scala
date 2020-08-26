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
  def apply(): SchemaPretargetingConfigList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPretargetingConfigList]
  }
  @scala.inline
  implicit class SchemaPretargetingConfigListOps[Self <: SchemaPretargetingConfigList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemsVarargs(value: SchemaPretargetingConfig*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaPretargetingConfig]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

