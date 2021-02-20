package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Step Id and outcome of each individual step that was run as a group with
  * other steps with the same configuration.
  */
@js.native
trait SchemaIndividualOutcome extends StObject {
  
  var outcomeSummary: js.UndefOr[String] = js.native
  
  var stepId: js.UndefOr[String] = js.native
}
object SchemaIndividualOutcome {
  
  @scala.inline
  def apply(): SchemaIndividualOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndividualOutcome]
  }
  
  @scala.inline
  implicit class SchemaIndividualOutcomeMutableBuilder[Self <: SchemaIndividualOutcome] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutcomeSummary(value: String): Self = StObject.set(x, "outcomeSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeSummaryUndefined: Self = StObject.set(x, "outcomeSummary", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
