package typings.jestCucumber

import typings.jestCucumber.anon.Concurrent
import typings.jestCucumber.modelsMod.ParsedFeature
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureDefinitionCreationMod {
  
  @JSImport("jest-cucumber/dist/src/feature-definition-creation", "defineFeature")
  @js.native
  def defineFeature(featureFromFile: ParsedFeature, scenariosDefinitionCallback: ScenariosDefinitionCallbackFunction): Unit = js.native
  
  type DefineScenarioFunction = js.Function3[
    /* scenarioTitle */ String, 
    /* stepsDefinitionCallback */ StepsDefinitionCallbackFunction, 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ]
  
  type DefineScenarioFunctionWithAliases = DefineScenarioFunction with Concurrent
  
  type DefineStepFunction = js.Function2[
    /* stepMatcher */ String | RegExp, 
    /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Any
  ]
  
  type ScenariosDefinitionCallbackFunction = js.Function1[/* defineScenario */ DefineScenarioFunctionWithAliases, Unit]
  
  type StepsDefinitionCallbackFunction = js.Function1[/* options */ StepsDefinitionCallbackOptions, Unit]
  
  @js.native
  trait StepsDefinitionCallbackOptions extends StObject {
    
    var and: DefineStepFunction = js.native
    
    var but: DefineStepFunction = js.native
    
    var defineStep: DefineStepFunction = js.native
    
    var given: DefineStepFunction = js.native
    
    def pending(): Unit = js.native
    
    var `then`: DefineStepFunction = js.native
    
    var when: DefineStepFunction = js.native
  }
  object StepsDefinitionCallbackOptions {
    
    @scala.inline
    def apply(
      and: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
      but: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
      defineStep: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
      given: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
      pending: () => Unit,
      `then`: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any,
      when: (/* stepMatcher */ String | RegExp, /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any]) => js.Any
    ): StepsDefinitionCallbackOptions = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction2(and), but = js.Any.fromFunction2(but), defineStep = js.Any.fromFunction2(defineStep), given = js.Any.fromFunction2(given), pending = js.Any.fromFunction0(pending), when = js.Any.fromFunction2(when))
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
