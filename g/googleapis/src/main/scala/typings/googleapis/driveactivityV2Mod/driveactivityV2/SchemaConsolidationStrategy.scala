package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * How the individual activities are consolidated. A set of activities may be
  * consolidated into one combined activity if they are related in some way,
  * such as one actor performing the same action on multiple targets, or
  * multiple actors performing the same action on a single target. The strategy
  * defines the rules for which activities are related.
  */
@js.native
trait SchemaConsolidationStrategy extends js.Object {
  /**
    * The individual activities are consolidated using the legacy strategy.
    */
  var legacy: js.UndefOr[SchemaLegacy] = js.native
  /**
    * The individual activities are not consolidated.
    */
  var none: js.UndefOr[SchemaNoConsolidation] = js.native
}

object SchemaConsolidationStrategy {
  @scala.inline
  def apply(legacy: SchemaLegacy = null, none: SchemaNoConsolidation = null): SchemaConsolidationStrategy = {
    val __obj = js.Dynamic.literal()
    if (legacy != null) __obj.updateDynamic("legacy")(legacy.asInstanceOf[js.Any])
    if (none != null) __obj.updateDynamic("none")(none.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConsolidationStrategy]
  }
}

