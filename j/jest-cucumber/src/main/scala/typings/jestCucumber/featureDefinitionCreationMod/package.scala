package typings.jestCucumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object featureDefinitionCreationMod {
  
  type DefineScenarioFunction = js.Function3[
    /* scenarioTitle */ java.lang.String, 
    /* stepsDefinitionCallback */ typings.jestCucumber.featureDefinitionCreationMod.StepsDefinitionCallbackFunction, 
    /* timeout */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  
  type DefineScenarioFunctionWithAliases = typings.jestCucumber.featureDefinitionCreationMod.DefineScenarioFunction with typings.jestCucumber.anon.Concurrent
  
  type DefineStepFunction = js.Function2[
    /* stepMatcher */ java.lang.String | typings.std.RegExp, 
    /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Any
  ]
  
  type ScenariosDefinitionCallbackFunction = js.Function1[
    /* defineScenario */ typings.jestCucumber.featureDefinitionCreationMod.DefineScenarioFunctionWithAliases, 
    scala.Unit
  ]
  
  type StepsDefinitionCallbackFunction = js.Function1[
    /* options */ typings.jestCucumber.featureDefinitionCreationMod.StepsDefinitionCallbackOptions, 
    scala.Unit
  ]
}
