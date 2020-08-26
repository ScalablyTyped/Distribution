package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When a task splits using WorkItemStatus.dynamic_source_split, this message
  * describes the two parts of the split relative to the description of the
  * current task&#39;s input.
  */
@js.native
trait SchemaDynamicSourceSplit extends js.Object {
  /**
    * Primary part (continued to be processed by worker). Specified relative to
    * the previously-current source. Becomes current.
    */
  var primary: js.UndefOr[SchemaDerivedSource] = js.native
  /**
    * Residual part (returned to the pool of work). Specified relative to the
    * previously-current source.
    */
  var residual: js.UndefOr[SchemaDerivedSource] = js.native
}

object SchemaDynamicSourceSplit {
  @scala.inline
  def apply(): SchemaDynamicSourceSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicSourceSplit]
  }
  @scala.inline
  implicit class SchemaDynamicSourceSplitOps[Self <: SchemaDynamicSourceSplit] (val x: Self) extends AnyVal {
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
    def setPrimary(value: SchemaDerivedSource): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setResidual(value: SchemaDerivedSource): Self = this.set("residual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResidual: Self = this.set("residual", js.undefined)
  }
  
}

