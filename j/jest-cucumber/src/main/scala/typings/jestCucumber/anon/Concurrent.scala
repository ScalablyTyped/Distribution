package typings.jestCucumber.anon

import typings.jestCucumber.featureDefinitionCreationMod.DefineScenarioFunction
import typings.jestCucumber.featureDefinitionCreationMod.StepsDefinitionCallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Concurrent extends js.Object {
  
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
  implicit class ConcurrentOps[Self <: Concurrent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConcurrent(
      value: (/* scenarioTitle */ String, /* stepsDefinitionCallback */ StepsDefinitionCallbackFunction, /* timeout */ js.UndefOr[Double]) => Unit
    ): Self = this.set("concurrent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnly(
      value: (/* scenarioTitle */ String, /* stepsDefinitionCallback */ StepsDefinitionCallbackFunction, /* timeout */ js.UndefOr[Double]) => Unit
    ): Self = this.set("only", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSkip(
      value: (/* scenarioTitle */ String, /* stepsDefinitionCallback */ StepsDefinitionCallbackFunction, /* timeout */ js.UndefOr[Double]) => Unit
    ): Self = this.set("skip", js.Any.fromFunction3(value))
  }
}
