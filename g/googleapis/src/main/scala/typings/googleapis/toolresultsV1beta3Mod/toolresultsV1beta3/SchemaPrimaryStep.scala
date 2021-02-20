package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores rollup test status of multiple steps that were run as a group and
  * outcome of each individual step.
  */
@js.native
trait SchemaPrimaryStep extends StObject {
  
  /**
    * Step Id and outcome of each individual step.
    */
  var individualOutcome: js.UndefOr[js.Array[SchemaIndividualOutcome]] = js.native
  
  /**
    * Rollup test status of multiple steps that were run with the same
    * configuration as a group.
    */
  var rollUp: js.UndefOr[String] = js.native
}
object SchemaPrimaryStep {
  
  @scala.inline
  def apply(): SchemaPrimaryStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrimaryStep]
  }
  
  @scala.inline
  implicit class SchemaPrimaryStepMutableBuilder[Self <: SchemaPrimaryStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndividualOutcome(value: js.Array[SchemaIndividualOutcome]): Self = StObject.set(x, "individualOutcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividualOutcomeUndefined: Self = StObject.set(x, "individualOutcome", js.undefined)
    
    @scala.inline
    def setIndividualOutcomeVarargs(value: SchemaIndividualOutcome*): Self = StObject.set(x, "individualOutcome", js.Array(value :_*))
    
    @scala.inline
    def setRollUp(value: String): Self = StObject.set(x, "rollUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollUpUndefined: Self = StObject.set(x, "rollUp", js.undefined)
  }
}
