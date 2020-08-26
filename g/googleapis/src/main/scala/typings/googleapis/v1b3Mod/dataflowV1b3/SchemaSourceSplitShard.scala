package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED in favor of DerivedSource.
  */
@js.native
trait SchemaSourceSplitShard extends js.Object {
  /**
    * DEPRECATED
    */
  var derivationMode: js.UndefOr[String] = js.native
  /**
    * DEPRECATED
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaSourceSplitShard {
  @scala.inline
  def apply(): SchemaSourceSplitShard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceSplitShard]
  }
  @scala.inline
  implicit class SchemaSourceSplitShardOps[Self <: SchemaSourceSplitShard] (val x: Self) extends AnyVal {
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
    def setDerivationMode(value: String): Self = this.set("derivationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDerivationMode: Self = this.set("derivationMode", js.undefined)
    @scala.inline
    def setSource(value: SchemaSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

