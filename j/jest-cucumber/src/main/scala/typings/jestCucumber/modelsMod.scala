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
    
    @scala.inline
    def apply(
      missingScenarioInFeature: Boolean,
      missingScenarioInStepDefinitions: Boolean,
      missingStepInFeature: Boolean,
      missingStepInStepDefinitions: Boolean
    ): ErrorOptions = {
      val __obj = js.Dynamic.literal(missingScenarioInFeature = missingScenarioInFeature.asInstanceOf[js.Any], missingScenarioInStepDefinitions = missingScenarioInStepDefinitions.asInstanceOf[js.Any], missingStepInFeature = missingStepInFeature.asInstanceOf[js.Any], missingStepInStepDefinitions = missingStepInStepDefinitions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorOptions]
    }
    
    @scala.inline
    implicit class ErrorOptionsMutableBuilder[Self <: ErrorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMissingScenarioInFeature(value: Boolean): Self = StObject.set(x, "missingScenarioInFeature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingScenarioInStepDefinitions(value: Boolean): Self = StObject.set(x, "missingScenarioInStepDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingStepInFeature(value: Boolean): Self = StObject.set(x, "missingStepInFeature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingStepInStepDefinitions(value: Boolean): Self = StObject.set(x, "missingStepInStepDefinitions", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeatureFromStepDefinitions extends StObject {
    
    var scenarios: js.Array[ScenarioFromStepDefinitions]
    
    var title: String
  }
  object FeatureFromStepDefinitions {
    
    @scala.inline
    def apply(scenarios: js.Array[ScenarioFromStepDefinitions], title: String): FeatureFromStepDefinitions = {
      val __obj = js.Dynamic.literal(scenarios = scenarios.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureFromStepDefinitions]
    }
    
    @scala.inline
    implicit class FeatureFromStepDefinitionsMutableBuilder[Self <: FeatureFromStepDefinitions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScenarios(value: js.Array[ScenarioFromStepDefinitions]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenariosVarargs(value: ScenarioFromStepDefinitions*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var errors: js.UndefOr[ErrorOptions | Boolean] = js.undefined
    
    var loadRelativePath: js.UndefOr[Boolean] = js.undefined
    
    var scenarioNameTemplate: js.UndefOr[js.Function1[/* vars */ ScenarioNameTemplateVars, String]] = js.undefined
    
    var tagFilter: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: ErrorOptions | Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setLoadRelativePath(value: Boolean): Self = StObject.set(x, "loadRelativePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadRelativePathUndefined: Self = StObject.set(x, "loadRelativePath", js.undefined)
      
      @scala.inline
      def setScenarioNameTemplate(value: /* vars */ ScenarioNameTemplateVars => String): Self = StObject.set(x, "scenarioNameTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScenarioNameTemplateUndefined: Self = StObject.set(x, "scenarioNameTemplate", js.undefined)
      
      @scala.inline
      def setTagFilter(value: String): Self = StObject.set(x, "tagFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFilterUndefined: Self = StObject.set(x, "tagFilter", js.undefined)
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
    
    @scala.inline
    def apply(
      options: Options,
      scenarioOutlines: js.Array[ParsedScenarioOutline],
      scenarios: js.Array[ParsedScenario],
      tags: js.Array[String],
      title: String
    ): ParsedFeature = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], scenarioOutlines = scenarioOutlines.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedFeature]
    }
    
    @scala.inline
    implicit class ParsedFeatureMutableBuilder[Self <: ParsedFeature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarioOutlines(value: js.Array[ParsedScenarioOutline]): Self = StObject.set(x, "scenarioOutlines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarioOutlinesVarargs(value: ParsedScenarioOutline*): Self = StObject.set(x, "scenarioOutlines", js.Array(value :_*))
      
      @scala.inline
      def setScenarios(value: js.Array[ParsedScenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenariosVarargs(value: ParsedScenario*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
      lineNumber: Double,
      skippedViaTagFilter: Boolean,
      steps: js.Array[ParsedStep],
      tags: js.Array[String],
      title: String
    ): ParsedScenario = {
      val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], skippedViaTagFilter = skippedViaTagFilter.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedScenario]
    }
    
    @scala.inline
    implicit class ParsedScenarioMutableBuilder[Self <: ParsedScenario] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkippedViaTagFilter(value: Boolean): Self = StObject.set(x, "skippedViaTagFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteps(value: js.Array[ParsedStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: ParsedStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ParsedScenarioOutlineMutableBuilder[Self <: ParsedScenarioOutline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarios(value: js.Array[ParsedScenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenariosVarargs(value: ParsedScenario*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
      
      @scala.inline
      def setSkippedViaTagFilter(value: Boolean): Self = StObject.set(x, "skippedViaTagFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteps(value: js.Array[ParsedStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: ParsedStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedStep extends StObject {
    
    var keyword: String
    
    var lineNumber: Double
    
    var stepArgument: String | js.Object
    
    var stepText: String
  }
  object ParsedStep {
    
    @scala.inline
    def apply(keyword: String, lineNumber: Double, stepArgument: String | js.Object, stepText: String): ParsedStep = {
      val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], stepArgument = stepArgument.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedStep]
    }
    
    @scala.inline
    implicit class ParsedStepMutableBuilder[Self <: ParsedStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepArgument(value: String | js.Object): Self = StObject.set(x, "stepArgument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepText(value: String): Self = StObject.set(x, "stepText", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScenarioFromStepDefinitions extends StObject {
    
    var steps: js.Array[StepFromStepDefinitions]
    
    var title: String
  }
  object ScenarioFromStepDefinitions {
    
    @scala.inline
    def apply(steps: js.Array[StepFromStepDefinitions], title: String): ScenarioFromStepDefinitions = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScenarioFromStepDefinitions]
    }
    
    @scala.inline
    implicit class ScenarioFromStepDefinitionsMutableBuilder[Self <: ScenarioFromStepDefinitions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSteps(value: js.Array[StepFromStepDefinitions]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: StepFromStepDefinitions*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScenarioNameTemplateVars extends StObject {
    
    var featureTags: js.Array[String]
    
    var featureTitle: String
    
    var scenarioTags: js.Array[String]
    
    var scenarioTitle: String
  }
  object ScenarioNameTemplateVars {
    
    @scala.inline
    def apply(
      featureTags: js.Array[String],
      featureTitle: String,
      scenarioTags: js.Array[String],
      scenarioTitle: String
    ): ScenarioNameTemplateVars = {
      val __obj = js.Dynamic.literal(featureTags = featureTags.asInstanceOf[js.Any], featureTitle = featureTitle.asInstanceOf[js.Any], scenarioTags = scenarioTags.asInstanceOf[js.Any], scenarioTitle = scenarioTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScenarioNameTemplateVars]
    }
    
    @scala.inline
    implicit class ScenarioNameTemplateVarsMutableBuilder[Self <: ScenarioNameTemplateVars] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureTags(value: js.Array[String]): Self = StObject.set(x, "featureTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureTagsVarargs(value: String*): Self = StObject.set(x, "featureTags", js.Array(value :_*))
      
      @scala.inline
      def setFeatureTitle(value: String): Self = StObject.set(x, "featureTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarioTags(value: js.Array[String]): Self = StObject.set(x, "scenarioTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarioTagsVarargs(value: String*): Self = StObject.set(x, "scenarioTags", js.Array(value :_*))
      
      @scala.inline
      def setScenarioTitle(value: String): Self = StObject.set(x, "scenarioTitle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StepFromStepDefinitions extends StObject {
    
    def stepFunction(): Unit | js.Thenable[js.Any] = js.native
    def stepFunction(stepArguments: js.Any): Unit | js.Thenable[js.Any] = js.native
    
    var stepMatcher: String | RegExp = js.native
  }
}
