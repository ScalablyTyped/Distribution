package typings.jestCucumber

import typings.jestCucumber.modelsMod.ParsedFeature
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureDefinitionCreationMod {
  
  @JSImport("jest-cucumber/dist/src/feature-definition-creation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defineFeature(featureFromFile: ParsedFeature, scenariosDefinitionCallback: ScenariosDefinitionCallbackFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineFeature")(featureFromFile.asInstanceOf[js.Any], scenariosDefinitionCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type DefineScenarioFunction = js.Function3[
    /* scenarioTitle */ String, 
    /* stepsDefinitionCallback */ StepsDefinitionCallbackFunction, 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ]
  
  @js.native
  trait DefineScenarioFunctionWithAliases extends DefineScenarioFunction {
    
    var concurrent: DefineScenarioFunction = js.native
    
    var only: DefineScenarioFunction = js.native
    
    var skip: DefineScenarioFunction = js.native
  }
  
  type DefineStepFunction = js.Function2[
    /* stepMatcher */ String | RegExp, 
    /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Any
  ]
  
  type ScenariosDefinitionCallbackFunction = js.Function1[/* defineScenario */ DefineScenarioFunctionWithAliases, Unit]
  
  type StepsDefinitionCallbackFunction = js.Function1[/* options */ StepsDefinitionCallbackOptions, Unit]
  
  trait StepsDefinitionCallbackOptions extends StObject {
    
    var and: DefineStepFunction
    
    var but: DefineStepFunction
    
    var defineStep: DefineStepFunction
    
    var `given`: DefineStepFunction
    
    def pending(): Unit
    
    var `then`: DefineStepFunction
    
    var when: DefineStepFunction
  }
  object StepsDefinitionCallbackOptions {
    
    @scala.inline
    def apply(
      and: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
      but: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
      defineStep: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
      `given`: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
      pending: () => Unit,
      `then`: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
      when: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
    ): StepsDefinitionCallbackOptions = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction2(and), but = js.Any.fromFunction2(but), defineStep = js.Any.fromFunction2(defineStep), pending = js.Any.fromFunction0(pending), when = js.Any.fromFunction2(when))
      __obj.updateDynamic("given")(js.Any.fromFunction2(`given`))
      __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
      __obj.asInstanceOf[StepsDefinitionCallbackOptions]
    }
    
    @scala.inline
    implicit class StepsDefinitionCallbackOptionsMutableBuilder[Self <: StepsDefinitionCallbackOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnd(
        value: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "and", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBut(
        value: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "but", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDefineStep(
        value: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "defineStep", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGiven(
        value: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "given", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPending(value: () => Unit): Self = StObject.set(x, "pending", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThen(
        value: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWhen(
        value: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
      ): Self = StObject.set(x, "when", js.Any.fromFunction2(value))
    }
  }
}
