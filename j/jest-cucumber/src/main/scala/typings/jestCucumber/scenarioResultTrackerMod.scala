package typings.jestCucumber

import typings.jestCucumber.modelsMod.ParsedFeature
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scenarioResultTrackerMod {
  
  @JSImport("jest-cucumber/dist/src/reporting/scenario-result-tracking/ScenarioResultTracker", "ScenarioResultTracker")
  @js.native
  class ScenarioResultTracker protected () extends StObject {
    def this(feature: ParsedFeature, scenarioTitle: String, lineNumber: Double) = this()
    
    def endScenario(): js.Promise[_] = js.native
    
    def endStep(): Unit = js.native
    
    var scenarioResult: js.Any = js.native
    
    def startStep(stepText: String, stepArguments: js.Array[String], lineNumber: Double): Unit = js.native
    
    def stepError(error: Error): Unit = js.native
  }
  
  @js.native
  trait IScenarioResult extends StObject {
    
    var featureFilePath: String = js.native
    
    var featureTitle: String = js.native
    
    var lineNumber: Double = js.native
    
    var scenarioTitle: String = js.native
    
    var stepResults: js.Array[IStepResult] = js.native
  }
  object IScenarioResult {
    
    @scala.inline
    def apply(
      featureFilePath: String,
      featureTitle: String,
      lineNumber: Double,
      scenarioTitle: String,
      stepResults: js.Array[IStepResult]
    ): IScenarioResult = {
      val __obj = js.Dynamic.literal(featureFilePath = featureFilePath.asInstanceOf[js.Any], featureTitle = featureTitle.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], scenarioTitle = scenarioTitle.asInstanceOf[js.Any], stepResults = stepResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScenarioResult]
    }
    
    @scala.inline
    implicit class IScenarioResultMutableBuilder[Self <: IScenarioResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureFilePath(value: String): Self = StObject.set(x, "featureFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureTitle(value: String): Self = StObject.set(x, "featureTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarioTitle(value: String): Self = StObject.set(x, "scenarioTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepResults(value: js.Array[IStepResult]): Self = StObject.set(x, "stepResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepResultsVarargs(value: IStepResult*): Self = StObject.set(x, "stepResults", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IStepResult extends StObject {
    
    var endTime: Double = js.native
    
    var error: Error | Null = js.native
    
    var lineNumber: Double = js.native
    
    var startTime: Double = js.native
    
    var stepArguments: js.Array[String] = js.native
    
    var stepText: String = js.native
  }
  object IStepResult {
    
    @scala.inline
    def apply(
      endTime: Double,
      lineNumber: Double,
      startTime: Double,
      stepArguments: js.Array[String],
      stepText: String
    ): IStepResult = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stepArguments = stepArguments.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStepResult]
    }
    
    @scala.inline
    implicit class IStepResultMutableBuilder[Self <: IStepResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepArguments(value: js.Array[String]): Self = StObject.set(x, "stepArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepArgumentsVarargs(value: String*): Self = StObject.set(x, "stepArguments", js.Array(value :_*))
      
      @scala.inline
      def setStepText(value: String): Self = StObject.set(x, "stepText", value.asInstanceOf[js.Any])
    }
  }
}
