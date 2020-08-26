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
  def apply(): SchemaConsolidationStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsolidationStrategy]
  }
  @scala.inline
  implicit class SchemaConsolidationStrategyOps[Self <: SchemaConsolidationStrategy] (val x: Self) extends AnyVal {
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
    def setLegacy(value: SchemaLegacy): Self = this.set("legacy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacy: Self = this.set("legacy", js.undefined)
    @scala.inline
    def setNone(value: SchemaNoConsolidation): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNone: Self = this.set("none", js.undefined)
  }
  
}

