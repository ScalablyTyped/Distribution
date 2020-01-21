package typings.jestJasmine2.reporterMod

import typings.jestJasmine2.specMod.SpecResult
import typings.jestJasmine2.suiteMod.SuiteResult
import typings.jestJasmine2.typesMod.Reporter
import typings.jestJasmine2.typesMod.RunDetails
import typings.jestTestResult.typesMod.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jasmine2Reporter extends Reporter {
  var _addMissingMessageToStack: js.Any
  var _config: js.Any
  var _currentSuites: js.Any
  var _extractSpecResults: js.Any
  var _globalConfig: js.Any
  var _resolve: js.Any
  var _resultsPromise: js.Any
  var _startTimes: js.Any
  var _testPath: js.Any
  var _testResults: js.Any
  def getResults(): js.Promise[TestResult]
}

object Jasmine2Reporter {
  @scala.inline
  def apply(
    _addMissingMessageToStack: js.Any,
    _config: js.Any,
    _currentSuites: js.Any,
    _extractSpecResults: js.Any,
    _globalConfig: js.Any,
    _resolve: js.Any,
    _resultsPromise: js.Any,
    _startTimes: js.Any,
    _testPath: js.Any,
    _testResults: js.Any,
    getResults: () => js.Promise[TestResult],
    jasmineDone: RunDetails => Unit,
    jasmineStarted: RunDetails => Unit,
    specDone: SpecResult => Unit,
    specStarted: SpecResult => Unit,
    suiteDone: SuiteResult => Unit,
    suiteStarted: SuiteResult => Unit
  ): Jasmine2Reporter = {
    val __obj = js.Dynamic.literal(_addMissingMessageToStack = _addMissingMessageToStack.asInstanceOf[js.Any], _config = _config.asInstanceOf[js.Any], _currentSuites = _currentSuites.asInstanceOf[js.Any], _extractSpecResults = _extractSpecResults.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _resolve = _resolve.asInstanceOf[js.Any], _resultsPromise = _resultsPromise.asInstanceOf[js.Any], _startTimes = _startTimes.asInstanceOf[js.Any], _testPath = _testPath.asInstanceOf[js.Any], _testResults = _testResults.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), jasmineDone = js.Any.fromFunction1(jasmineDone), jasmineStarted = js.Any.fromFunction1(jasmineStarted), specDone = js.Any.fromFunction1(specDone), specStarted = js.Any.fromFunction1(specStarted), suiteDone = js.Any.fromFunction1(suiteDone), suiteStarted = js.Any.fromFunction1(suiteStarted))
  
    __obj.asInstanceOf[Jasmine2Reporter]
  }
}

