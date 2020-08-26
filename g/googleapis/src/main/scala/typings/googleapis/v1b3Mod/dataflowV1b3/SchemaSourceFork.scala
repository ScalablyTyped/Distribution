package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED in favor of DynamicSourceSplit.
  */
@js.native
trait SchemaSourceFork extends js.Object {
  /**
    * DEPRECATED
    */
  var primary: js.UndefOr[SchemaSourceSplitShard] = js.native
  /**
    * DEPRECATED
    */
  var primarySource: js.UndefOr[SchemaDerivedSource] = js.native
  /**
    * DEPRECATED
    */
  var residual: js.UndefOr[SchemaSourceSplitShard] = js.native
  /**
    * DEPRECATED
    */
  var residualSource: js.UndefOr[SchemaDerivedSource] = js.native
}

object SchemaSourceFork {
  @scala.inline
  def apply(): SchemaSourceFork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceFork]
  }
  @scala.inline
  implicit class SchemaSourceForkOps[Self <: SchemaSourceFork] (val x: Self) extends AnyVal {
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
    def setPrimary(value: SchemaSourceSplitShard): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setPrimarySource(value: SchemaDerivedSource): Self = this.set("primarySource", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimarySource: Self = this.set("primarySource", js.undefined)
    @scala.inline
    def setResidual(value: SchemaSourceSplitShard): Self = this.set("residual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResidual: Self = this.set("residual", js.undefined)
    @scala.inline
    def setResidualSource(value: SchemaDerivedSource): Self = this.set("residualSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResidualSource: Self = this.set("residualSource", js.undefined)
  }
  
}

