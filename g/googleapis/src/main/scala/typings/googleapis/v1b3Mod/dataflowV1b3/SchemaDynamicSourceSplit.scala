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
  def apply(primary: SchemaDerivedSource = null, residual: SchemaDerivedSource = null): SchemaDynamicSourceSplit = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (residual != null) __obj.updateDynamic("residual")(residual.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDynamicSourceSplit]
  }
}

