package typings.jasmine.mod

import typings.jasmine.jasmine.CustomMatcherFactories
import typings.jasmine.jasmine.CustomReporter
import typings.jasmine.jasmine.Env
import typings.jasmine.jasmine.Jasmine
import typings.jasmine.jasmine.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jasmine extends js.Object {
  var completionReporter: CustomReporter = js.native
  var env: Env = js.native
  var helperFiles: js.Array[String] = js.native
  var jasmine: Jasmine = js.native
  var projectBaseDir: String = js.native
  var reporter: CustomReporter = js.native
  var reportersCount: Double = js.native
  var showingColors: Boolean = js.native
  var specFiles: js.Array[String] = js.native
  def addMatchers(matchers: CustomMatcherFactories): Unit = js.native
  def addReporter(reporter: Reporter): Unit = js.native
  def addSpecFile(filePath: String): Unit = js.native
  def addSpecFiles(files: js.Array[String]): Unit = js.native
  def configureDefaultReporter(options: js.Any, args: js.Any*): Unit = js.native
  def coreVersion(): String = js.native
  def execute(): js.Any = js.native
  def execute(files: js.UndefOr[scala.Nothing], filterString: String): js.Any = js.native
  def execute(files: js.Array[String]): js.Any = js.native
  def execute(files: js.Array[String], filterString: String): js.Any = js.native
  def exitCodeCompletion(passed: js.Any): Unit = js.native
  def loadConfig(config: js.Any): Unit = js.native
  def loadConfigFile(configFilePath: js.Any): Unit = js.native
  def loadHelpers(): Unit = js.native
  def loadSpecs(): Unit = js.native
  def onComplete(onCompleteCallback: js.Function1[/* passed */ Boolean, Unit]): Unit = js.native
  def printDeprecation(): Unit = js.native
  def provideFallbackReporter(reporter: Reporter): Unit = js.native
  def randomizeTests(): Boolean = js.native
  def randomizeTests(value: js.Any): Boolean = js.native
  def seed(value: js.Any): Unit = js.native
  def showColors(value: js.Any): Unit = js.native
  def stopSpecOnExpectationFailure(value: js.Any): Unit = js.native
}

