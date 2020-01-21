package typings.jestJasmine2

import typings.jestJasmine2.jestJasmine2Strings.configurable
import typings.jestJasmine2.jestJasmine2Strings.enumerable
import typings.jestJasmine2.jestJasmine2Strings.get
import typings.jestJasmine2.jestJasmine2Strings.set
import typings.jestJasmine2.jestJasmine2Strings.value
import typings.jestJasmine2.jestJasmine2Strings.writable
import typings.jestJasmine2.suiteMod.default
import typings.jestJasmine2.typesMod.AssertionErrorWithStack
import typings.jestJasmine2.typesMod.Reporter
import typings.jestJasmine2.typesMod.Spy
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccessType extends js.Object {
  def addReporter(reporterToAdd: Reporter): Unit = js.native
  def afterAll(
    afterAllFunction: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit]
  ): Unit = js.native
  def afterAll(
    afterAllFunction: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit],
    timeout: Double
  ): Unit = js.native
  def afterEach(
    afterEachFunction: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit]
  ): Unit = js.native
  def afterEach(
    afterEachFunction: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit],
    timeout: Double
  ): Unit = js.native
  def allowRespy(allow: Boolean): Unit = js.native
  def beforeAll(
    beforeAllFunction: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit]
  ): Unit = js.native
  def beforeAll(
    beforeAllFunction: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit],
    timeout: Double
  ): Unit = js.native
  def beforeEach(
    beforeEachFunction: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit]
  ): Unit = js.native
  def beforeEach(
    beforeEachFunction: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit],
    timeout: Double
  ): Unit = js.native
  def catchExceptions(value: js.Any): Boolean = js.native
  def catchingExceptions(): Boolean = js.native
  def clearReporters(): Unit = js.native
  def describe(description: String, specDefinitions: js.Function): default = js.native
  def execute(runnablesToRun: js.Array[String]): js.Promise[Unit] = js.native
  def execute(runnablesToRun: js.Array[String], suiteTree: default): js.Promise[Unit] = js.native
  def fail(error: AssertionErrorWithStack): Unit = js.native
  def fail(error: Error): Unit = js.native
  def fdescribe(description: String, specDefinitions: js.Function): default = js.native
  def fit(
    description: String,
    fn: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit]
  ): Unit = js.native
  def fit(
    description: String,
    fn: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit],
    timeout: Double
  ): Unit = js.native
  def it(
    description: String,
    fn: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit]
  ): typings.jestJasmine2.specMod.default = js.native
  def it(
    description: String,
    fn: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit],
    timeout: Double
  ): typings.jestJasmine2.specMod.default = js.native
  def pending(message: String): Unit = js.native
  def provideFallbackReporter(reporterToAdd: Reporter): Unit = js.native
  def randomTests(): Boolean = js.native
  def randomizeTests(value: js.Any): Unit = js.native
  def seed(value: js.Any): js.Any = js.native
  def specFilter(spec: typings.jestJasmine2.specMod.default): Boolean = js.native
  def spyOn(obj: Record[String, _], methodName: String): Spy = js.native
  @JSName("spyOn")
  def spyOn_configurable(obj: Record[String, _], methodName: String, accessType: configurable): Spy = js.native
  @JSName("spyOn")
  def spyOn_enumerable(obj: Record[String, _], methodName: String, accessType: enumerable): Spy = js.native
  @JSName("spyOn")
  def spyOn_get(obj: Record[String, _], methodName: String, accessType: get): Spy = js.native
  @JSName("spyOn")
  def spyOn_set(obj: Record[String, _], methodName: String, accessType: set): Spy = js.native
  @JSName("spyOn")
  def spyOn_value(obj: Record[String, _], methodName: String, accessType: value): Spy = js.native
  @JSName("spyOn")
  def spyOn_writable(obj: Record[String, _], methodName: String, accessType: writable): Spy = js.native
  def throwOnExpectationFailure(value: js.Any): Unit = js.native
  def throwingExpectationFailures(): Boolean = js.native
  def todo(): typings.jestJasmine2.specMod.default = js.native
  def topSuite(): default = js.native
  def xdescribe(description: String, specDefinitions: js.Function): default = js.native
  def xit(
    description: String,
    fn: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit]
  ): js.Any = js.native
  def xit(
    description: String,
    fn: js.Function1[/* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], Unit],
    timeout: Double
  ): js.Any = js.native
}

