package typings.jestCucumber.modelsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepFromStepDefinitions extends js.Object {
  
  def stepFunction(): Unit | js.Thenable[_] = js.native
  def stepFunction(stepArguments: js.Any): Unit | js.Thenable[_] = js.native
  
  var stepMatcher: String | RegExp = js.native
}
