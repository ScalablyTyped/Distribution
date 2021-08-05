package typings.jestCucumber

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsMod {
  
  trait ErrorOptions extends StObject {
    
    var missingScenarioInFeature: Boolean
    
    var missingScenarioInStepDefinitions: Boolean
    
    var missingStepInFeature: Boolean
    
    var missingStepInStepDefinitions: Boolean
  }
  object ErrorOptions {
    
    inline def apply(
      missingScenarioInFeature: Boolean,
      missingScenarioInStepDefinitions: Boolean,
      missingStepInFeature: Boolean,
      missingStepInStepDefinitions: Boolean
    ): ErrorOptions = {
      val __obj = js.Dynamic.literal(missingScenarioInFeature = missingScenarioInFeature.asInstanceOf[js.Any], missingScenarioInStepDefinitions = missingScenarioInStepDefinitions.asInstanceOf[js.Any], missingStepInFeature = missingStepInFeature.asInstanceOf[js.Any], missingStepInStepDefinitions = missingStepInStepDefinitions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorOptions]
    }
    
    extension [Self <: ErrorOptions](x: Self) {
      
      inline def setMissingScenarioInFeature(value: Boolean): Self = StObject.set(x, "missingScenarioInFeature", value.asInstanceOf[js.Any])
      
      inline def setMissingScenarioInStepDefinitions(value: Boolean): Self = StObject.set(x, "missingScenarioInStepDefinitions", value.asInstanceOf[js.Any])
      
      inline def setMissingStepInFeature(value: Boolean): Self = StObject.set(x, "missingStepInFeature", value.asInstanceOf[js.Any])
      
      inline def setMissingStepInStepDefinitions(value: Boolean): Self = StObject.set(x, "missingStepInStepDefinitions", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeatureFromStepDefinitions extends StObject {
    
    var scenarios: js.Array[ScenarioFromStepDefinitions]
    
    var title: String
  }
  object FeatureFromStepDefinitions {
    
    inline def apply(scenarios: js.Array[ScenarioFromStepDefinitions], title: String): FeatureFromStepDefinitions = {
      val __obj = js.Dynamic.literal(scenarios = scenarios.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureFromStepDefinitions]
    }
    
    extension [Self <: FeatureFromStepDefinitions](x: Self) {
      
      inline def setScenarios(value: js.Array[ScenarioFromStepDefinitions]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      inline def setScenariosVarargs(value: ScenarioFromStepDefinitions*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var errors: js.UndefOr[ErrorOptions | Boolean] = js.undefined
    
    var loadRelativePath: js.UndefOr[Boolean] = js.undefined
    
    var scenarioNameTemplate: js.UndefOr[js.Function1[/* vars */ ScenarioNameTemplateVars, String]] = js.undefined
    
    var tagFilter: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setErrors(value: ErrorOptions | Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setLoadRelativePath(value: Boolean): Self = StObject.set(x, "loadRelativePath", value.asInstanceOf[js.Any])
      
      inline def setLoadRelativePathUndefined: Self = StObject.set(x, "loadRelativePath", js.undefined)
      
      inline def setScenarioNameTemplate(value: /* vars */ ScenarioNameTemplateVars => String): Self = StObject.set(x, "scenarioNameTemplate", js.Any.fromFunction1(value))
      
      inline def setScenarioNameTemplateUndefined: Self = StObject.set(x, "scenarioNameTemplate", js.undefined)
      
      inline def setTagFilter(value: String): Self = StObject.set(x, "tagFilter", value.asInstanceOf[js.Any])
      
      inline def setTagFilterUndefined: Self = StObject.set(x, "tagFilter", js.undefined)
    }
  }
  
  trait ParsedFeature extends StObject {
    
    var options: Options
    
    var scenarioOutlines: js.Array[ParsedScenarioOutline]
    
    var scenarios: js.Array[ParsedScenario]
    
    var tags: js.Array[String]
    
    var title: String
  }
  object ParsedFeature {
    
    inline def apply(
      options: Options,
      scenarioOutlines: js.Array[ParsedScenarioOutline],
      scenarios: js.Array[ParsedScenario],
      tags: js.Array[String],
      title: String
    ): ParsedFeature = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], scenarioOutlines = scenarioOutlines.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedFeature]
    }
    
    extension [Self <: ParsedFeature](x: Self) {
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setScenarioOutlines(value: js.Array[ParsedScenarioOutline]): Self = StObject.set(x, "scenarioOutlines", value.asInstanceOf[js.Any])
      
      inline def setScenarioOutlinesVarargs(value: ParsedScenarioOutline*): Self = StObject.set(x, "scenarioOutlines", js.Array(value :_*))
      
      inline def setScenarios(value: js.Array[ParsedScenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      inline def setScenariosVarargs(value: ParsedScenario*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedScenario extends StObject {
    
    var lineNumber: Double
    
    var skippedViaTagFilter: Boolean
    
    var steps: js.Array[ParsedStep]
    
    var tags: js.Array[String]
    
    var title: String
  }
  object ParsedScenario {
    
    inline def apply(
      lineNumber: Double,
      skippedViaTagFilter: Boolean,
      steps: js.Array[ParsedStep],
      tags: js.Array[String],
      title: String
    ): ParsedScenario = {
      val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], skippedViaTagFilter = skippedViaTagFilter.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedScenario]
    }
    
    extension [Self <: ParsedScenario](x: Self) {
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setSkippedViaTagFilter(value: Boolean): Self = StObject.set(x, "skippedViaTagFilter", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[ParsedStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: ParsedStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedScenarioOutline extends StObject {
    
    var lineNumber: Double
    
    var scenarios: js.Array[ParsedScenario]
    
    var skippedViaTagFilter: Boolean
    
    var steps: js.Array[ParsedStep]
    
    var tags: js.Array[String]
    
    var title: String
  }
  object ParsedScenarioOutline {
    
    inline def apply(
      lineNumber: Double,
      scenarios: js.Array[ParsedScenario],
      skippedViaTagFilter: Boolean,
      steps: js.Array[ParsedStep],
      tags: js.Array[String],
      title: String
    ): ParsedScenarioOutline = {
      val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], skippedViaTagFilter = skippedViaTagFilter.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedScenarioOutline]
    }
    
    extension [Self <: ParsedScenarioOutline](x: Self) {
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setScenarios(value: js.Array[ParsedScenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      inline def setScenariosVarargs(value: ParsedScenario*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
      
      inline def setSkippedViaTagFilter(value: Boolean): Self = StObject.set(x, "skippedViaTagFilter", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[ParsedStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: ParsedStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedStep extends StObject {
    
    var keyword: String
    
    var lineNumber: Double
    
    var stepArgument: String | js.Object
    
    var stepText: String
  }
  object ParsedStep {
    
    inline def apply(keyword: String, lineNumber: Double, stepArgument: String | js.Object, stepText: String): ParsedStep = {
      val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], stepArgument = stepArgument.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedStep]
    }
    
    extension [Self <: ParsedStep](x: Self) {
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setStepArgument(value: String | js.Object): Self = StObject.set(x, "stepArgument", value.asInstanceOf[js.Any])
      
      inline def setStepText(value: String): Self = StObject.set(x, "stepText", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScenarioFromStepDefinitions extends StObject {
    
    var steps: js.Array[StepFromStepDefinitions]
    
    var title: String
  }
  object ScenarioFromStepDefinitions {
    
    inline def apply(steps: js.Array[StepFromStepDefinitions], title: String): ScenarioFromStepDefinitions = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScenarioFromStepDefinitions]
    }
    
    extension [Self <: ScenarioFromStepDefinitions](x: Self) {
      
      inline def setSteps(value: js.Array[StepFromStepDefinitions]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: StepFromStepDefinitions*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScenarioNameTemplateVars extends StObject {
    
    var featureTags: js.Array[String]
    
    var featureTitle: String
    
    var scenarioTags: js.Array[String]
    
    var scenarioTitle: String
  }
  object ScenarioNameTemplateVars {
    
    inline def apply(
      featureTags: js.Array[String],
      featureTitle: String,
      scenarioTags: js.Array[String],
      scenarioTitle: String
    ): ScenarioNameTemplateVars = {
      val __obj = js.Dynamic.literal(featureTags = featureTags.asInstanceOf[js.Any], featureTitle = featureTitle.asInstanceOf[js.Any], scenarioTags = scenarioTags.asInstanceOf[js.Any], scenarioTitle = scenarioTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScenarioNameTemplateVars]
    }
    
    extension [Self <: ScenarioNameTemplateVars](x: Self) {
      
      inline def setFeatureTags(value: js.Array[String]): Self = StObject.set(x, "featureTags", value.asInstanceOf[js.Any])
      
      inline def setFeatureTagsVarargs(value: String*): Self = StObject.set(x, "featureTags", js.Array(value :_*))
      
      inline def setFeatureTitle(value: String): Self = StObject.set(x, "featureTitle", value.asInstanceOf[js.Any])
      
      inline def setScenarioTags(value: js.Array[String]): Self = StObject.set(x, "scenarioTags", value.asInstanceOf[js.Any])
      
      inline def setScenarioTagsVarargs(value: String*): Self = StObject.set(x, "scenarioTags", js.Array(value :_*))
      
      inline def setScenarioTitle(value: String): Self = StObject.set(x, "scenarioTitle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StepFromStepDefinitions extends StObject {
    
    def stepFunction(): Unit | js.Thenable[js.Any] = js.native
    def stepFunction(stepArguments: js.Any): Unit | js.Thenable[js.Any] = js.native
    
    var stepMatcher: String | RegExp = js.native
  }
}
