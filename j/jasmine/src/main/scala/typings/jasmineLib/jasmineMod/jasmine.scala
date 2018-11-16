package typings
package jasmineLib.jasmineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jasmine extends js.Object {
  var completionReporter: jasmineLib.jasmineNs.CustomReporter = js.native
  var env: jasmineLib.jasmineNs.Env = js.native
  var helperFiles: js.Array[java.lang.String] = js.native
  var jasmine: jasmineLib.jasmineNs.Jasmine = js.native
  var projectBaseDir: java.lang.String = js.native
  var reporter: jasmineLib.jasmineNs.CustomReporter = js.native
  var reportersCount: scala.Double = js.native
  var showingColors: scala.Boolean = js.native
  var specFiles: js.Array[java.lang.String] = js.native
  def addMatchers(matchers: jasmineLib.jasmineNs.CustomMatcherFactories): scala.Unit = js.native
  def addReporter(reporter: jasmineLib.jasmineNs.Reporter): scala.Unit = js.native
  def addSpecFile(filePath: java.lang.String): scala.Unit = js.native
  def addSpecFiles(files: js.Array[java.lang.String]): scala.Unit = js.native
  def configureDefaultReporter(options: js.Any, args: js.Any*): scala.Unit = js.native
  def coreVersion(): java.lang.String = js.native
  def execute(): js.Any = js.native
  def execute(files: js.Array[java.lang.String]): js.Any = js.native
  def execute(files: js.Array[java.lang.String], filterString: java.lang.String): js.Any = js.native
  def exitCodeCompletion(passed: js.Any): scala.Unit = js.native
  def loadConfig(config: js.Any): scala.Unit = js.native
  def loadConfigFile(configFilePath: js.Any): scala.Unit = js.native
  def loadHelpers(): scala.Unit = js.native
  def loadSpecs(): scala.Unit = js.native
  def onComplete(onCompleteCallback: js.Function1[/* passed */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def printDeprecation(): scala.Unit = js.native
  def provideFallbackReporter(reporter: jasmineLib.jasmineNs.Reporter): scala.Unit = js.native
  def randomizeTests(): scala.Boolean = js.native
  def randomizeTests(value: js.Any): scala.Boolean = js.native
  def seed(value: js.Any): scala.Unit = js.native
  def showColors(value: js.Any): scala.Unit = js.native
  def stopSpecOnExpectationFailure(value: js.Any): scala.Unit = js.native
}

