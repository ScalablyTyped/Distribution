package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * How the individual activities are consolidated. A set of activities may be
  * consolidated into one combined activity if they are related in some way,
  * such as one actor performing the same action on multiple targets, or
  * multiple actors performing the same action on a single target. The strategy
  * defines the rules for which activities are related.
  */
@js.native
trait SchemaConsolidationStrategy extends StObject {
  
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
  implicit class SchemaConsolidationStrategyMutableBuilder[Self <: SchemaConsolidationStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegacy(value: SchemaLegacy): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
    
    @scala.inline
    def setNone(value: SchemaNoConsolidation): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
  }
}
