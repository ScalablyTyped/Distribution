package typings.jestDashJasmine2.buildTypesMod

import typings.jestDashJasmine2.buildJasmineSpecMod.SpecResult
import typings.jestDashJasmine2.buildJasmineSuiteMod.SuiteResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  def jasmineDone(runDetails: RunDetails): Unit
  def jasmineStarted(runDetails: RunDetails): Unit
  def specDone(result: SpecResult): Unit
  def specStarted(spec: SpecResult): Unit
  def suiteDone(result: SuiteResult): Unit
  def suiteStarted(result: SuiteResult): Unit
}

object Reporter {
  @scala.inline
  def apply(
    jasmineDone: RunDetails => Unit,
    jasmineStarted: RunDetails => Unit,
    specDone: SpecResult => Unit,
    specStarted: SpecResult => Unit,
    suiteDone: SuiteResult => Unit,
    suiteStarted: SuiteResult => Unit
  ): Reporter = {
    val __obj = js.Dynamic.literal(jasmineDone = js.Any.fromFunction1(jasmineDone), jasmineStarted = js.Any.fromFunction1(jasmineStarted), specDone = js.Any.fromFunction1(specDone), specStarted = js.Any.fromFunction1(specStarted), suiteDone = js.Any.fromFunction1(suiteDone), suiteStarted = js.Any.fromFunction1(suiteStarted))
  
    __obj.asInstanceOf[Reporter]
  }
}

