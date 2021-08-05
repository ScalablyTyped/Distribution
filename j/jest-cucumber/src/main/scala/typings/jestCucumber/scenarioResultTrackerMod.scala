package typings.jestCucumber

import typings.jestCucumber.modelsMod.ParsedFeature
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scenarioResultTrackerMod {
  
  @JSImport("jest-cucumber/dist/src/reporting/scenario-result-tracking/ScenarioResultTracker", "ScenarioResultTracker")
  @js.native
  class ScenarioResultTracker protected () extends StObject {
    def this(feature: ParsedFeature, scenarioTitle: String, lineNumber: Double) = this()
    
    def endScenario(): js.Promise[js.Any] = js.native
    
    def endStep(): Unit = js.native
    
    /* private */ var scenarioResult: js.Any = js.native
    
    def startStep(stepText: String, stepArguments: js.Array[String], lineNumber: Double): Unit = js.native
    
    def stepError(error: Error): Unit = js.native
  }
  
  trait IScenarioResult extends StObject {
    
    var featureFilePath: String
    
    var featureTitle: String
    
    var lineNumber: Double
    
    var scenarioTitle: String
    
    var stepResults: js.Array[IStepResult]
  }
  object IScenarioResult {
    
    inline def apply(
      featureFilePath: String,
      featureTitle: String,
      lineNumber: Double,
      scenarioTitle: String,
      stepResults: js.Array[IStepResult]
    ): IScenarioResult = {
      val __obj = js.Dynamic.literal(featureFilePath = featureFilePath.asInstanceOf[js.Any], featureTitle = featureTitle.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], scenarioTitle = scenarioTitle.asInstanceOf[js.Any], stepResults = stepResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScenarioResult]
    }
    
    extension [Self <: IScenarioResult](x: Self) {
      
      inline def setFeatureFilePath(value: String): Self = StObject.set(x, "featureFilePath", value.asInstanceOf[js.Any])
      
      inline def setFeatureTitle(value: String): Self = StObject.set(x, "featureTitle", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setScenarioTitle(value: String): Self = StObject.set(x, "scenarioTitle", value.asInstanceOf[js.Any])
      
      inline def setStepResults(value: js.Array[IStepResult]): Self = StObject.set(x, "stepResults", value.asInstanceOf[js.Any])
      
      inline def setStepResultsVarargs(value: IStepResult*): Self = StObject.set(x, "stepResults", js.Array(value :_*))
    }
  }
  
  trait IStepResult extends StObject {
    
    var endTime: Double
    
    var error: Error | Null
    
    var lineNumber: Double
    
    var startTime: Double
    
    var stepArguments: js.Array[String]
    
    var stepText: String
  }
  object IStepResult {
    
    inline def apply(
      endTime: Double,
      lineNumber: Double,
      startTime: Double,
      stepArguments: js.Array[String],
      stepText: String
    ): IStepResult = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stepArguments = stepArguments.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any], error = null)
      __obj.asInstanceOf[IStepResult]
    }
    
    extension [Self <: IStepResult](x: Self) {
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStepArguments(value: js.Array[String]): Self = StObject.set(x, "stepArguments", value.asInstanceOf[js.Any])
      
      inline def setStepArgumentsVarargs(value: String*): Self = StObject.set(x, "stepArguments", js.Array(value :_*))
      
      inline def setStepText(value: String): Self = StObject.set(x, "stepText", value.asInstanceOf[js.Any])
    }
  }
}
