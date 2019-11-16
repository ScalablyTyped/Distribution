package typings.jestDashJasmine2.buildJasmineSpecMod

import typings.jestDashJasmine2.Anon_Afters
import typings.jestDashJasmine2.Anon_Cancel
import typings.jestDashJasmine2.buildQueueRunnerMod.Options
import typings.jestDashJasmine2.buildQueueRunnerMod.QueueableFn
import typings.jestDashJasmine2.buildTypesMod.AssertionErrorWithStack
import typings.jestDashJasmine2.jestDashJasmine2Strings.disabled
import typings.jestDashJasmine2.jestDashJasmine2Strings.failed
import typings.jestDashJasmine2.jestDashJasmine2Strings.passed
import typings.jestDashJasmine2.jestDashJasmine2Strings.pending
import typings.jestDashJasmine2.jestDashJasmine2Strings.todo
import typings.std.Error
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spec extends js.Object {
  var currentRun: js.UndefOr[ReturnType[js.Function1[/* options */ Options, Anon_Cancel]]] = js.native
  var description: String = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var expand: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var initError: Error = js.native
  var markedPending: js.UndefOr[Boolean] = js.native
  var markedTodo: js.UndefOr[Boolean] = js.native
  var queueRunnerFactory: js.Function1[/* options */ Options, Anon_Cancel] = js.native
  var queueableFn: QueueableFn = js.native
  var result: SpecResult = js.native
  var throwOnExpectationFailure: Boolean = js.native
  def addExpectationResult(passed: Boolean, data: typings.jestDashJasmine2.buildExpectationResultFactoryMod.Options): Unit = js.native
  def addExpectationResult(
    passed: Boolean,
    data: typings.jestDashJasmine2.buildExpectationResultFactoryMod.Options,
    isError: Boolean
  ): Unit = js.native
  def beforeAndAfterFns(): Anon_Afters = js.native
  def cancel(): Unit = js.native
  def disable(): Unit = js.native
  def execute(onComplete: js.Function, enabled: Boolean): Unit = js.native
  def getFullName(): String = js.native
  def getResult(): SpecResult = js.native
  def getSpecName(spec: Spec): String = js.native
  def isAssertionError(error: Error): Boolean = js.native
  def isExecutable(): Boolean = js.native
  def onException(error: typings.jestDashJasmine2.buildExpectationFailedMod.default): Unit = js.native
  def onException(error: AssertionErrorWithStack): Unit = js.native
  def onStart(spec: Spec): Unit = js.native
  def pend(): Unit = js.native
  def pend(message: String): Unit = js.native
  def resultCallback(result: SpecResult): Unit = js.native
  def status(): disabled | pending | failed | passed | todo = js.native
  def status(enabled: Boolean): disabled | pending | failed | passed | todo = js.native
  def todo(): Unit = js.native
  def userContext(): js.Any = js.native
}

