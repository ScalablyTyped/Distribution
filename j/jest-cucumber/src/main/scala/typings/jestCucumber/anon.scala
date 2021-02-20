package typings.jestCucumber

import typings.jestCucumber.featureDefinitionCreationMod.DefineScenarioFunction
import typings.jestCucumber.featureDefinitionCreationMod.StepsDefinitionCallbackFunction
import typings.jestCucumber.modelsMod.ErrorOptions
import typings.jestCucumber.modelsMod.ScenarioNameTemplateVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Concurrent extends StObject {
    
    var concurrent: DefineScenarioFunction = js.native
    
    var only: DefineScenarioFunction = js.native
    
    var skip: DefineScenarioFunction = js.native
  }
  object Concurrent {
    
    @scala.inline
    def apply(
      concurrent: (/* scenarioTitle */ String, /* stepsDefinitionCallback */ StepsDefinitionCallbackFunction, /* timeout */ js.UndefOr[Double]) => Unit,
      only: (/* scenarioTitle */ String, /* stepsDefinitionCallback */ StepsDefinitionCallbackFunction, /* timeout */ js.UndefOr[Double]) => Unit,
      skip: (/* scenarioTitle */ String, /* stepsDefinitionCallback */ StepsDefinitionCallbackFunction, /* timeout */ js.UndefOr[Double]) => Unit
    ): Concurrent = {
      val __obj = js.Dynamic.literal(concurrent = js.Any.fromFunction3(concurrent), only = js.Any.fromFunction3(only), skip = js.Any.fromFunction3(skip))
      __obj.asInstanceOf[Concurrent]
    }
    
    @scala.inline
    implicit class ConcurrentMutableBuilder[Self <: Concurrent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrent(
        value: (/* scenarioTitle */ String, /* stepsDefinitionCallback */ StepsDefinitionCallbackFunction, /* timeout */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "concurrent", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnly(
        value: (/* scenarioTitle */ String, /* stepsDefinitionCallback */ StepsDefinitionCallbackFunction, /* timeout */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "only", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSkip(
        value: (/* scenarioTitle */ String, /* stepsDefinitionCallback */ StepsDefinitionCallbackFunction, /* timeout */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "skip", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait Errors extends StObject {
    
    var errors: js.UndefOr[Boolean | ErrorOptions] = js.native
    
    var loadRelativePath: js.UndefOr[Boolean] = js.native
    
    var scenarioNameTemplate: js.UndefOr[js.Function1[/* vars */ ScenarioNameTemplateVars, String]] = js.native
    
    var tagFilter: js.UndefOr[String] = js.native
  }
  object Errors {
    
    @scala.inline
    def apply(): Errors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: Boolean | ErrorOptions): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait Path extends StObject {
    
    var path: String = js.native
  }
  object Path {
    
    @scala.inline
    def apply(path: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
