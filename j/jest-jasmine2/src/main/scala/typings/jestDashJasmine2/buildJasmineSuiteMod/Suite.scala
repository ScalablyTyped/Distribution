package typings.jestDashJasmine2.buildJasmineSuiteMod

import typings.jestDashJasmine2.buildExpectationResultFactoryMod.Options
import typings.jestDashJasmine2.buildQueueRunnerMod.QueueableFn
import typings.jestDashJasmine2.buildTypesMod.AssertionErrorWithStack
import typings.jestDashJasmine2.jestDashJasmine2Strings.disabled
import typings.jestDashJasmine2.jestDashJasmine2Strings.failed
import typings.jestDashJasmine2.jestDashJasmine2Strings.finished
import typings.jestDashJasmine2.jestDashJasmine2Strings.pending
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suite extends js.Object {
  var afterAllFns: js.Array[QueueableFn] = js.native
  var afterFns: js.Array[QueueableFn] = js.native
  var beforeAllFns: js.Array[QueueableFn] = js.native
  var beforeFns: js.Array[QueueableFn] = js.native
  var children: js.Array[Suite | typings.jestDashJasmine2.buildJasmineSpecMod.default] = js.native
  var description: String = js.native
  var disabled: Boolean = js.native
  var id: String = js.native
  var isFocused: Boolean = js.native
  var markedPending: Boolean = js.native
  var markedTodo: Boolean = js.native
  var parentSuite: js.UndefOr[Suite] = js.native
  var result: SuiteResult = js.native
  var sharedContext: js.UndefOr[js.Object] = js.native
  var throwOnExpectationFailure: Boolean = js.native
  def addChild(child: typings.jestDashJasmine2.buildJasmineSpecMod.default): Unit = js.native
  def addChild(child: Suite): Unit = js.native
  def addExpectationResult(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Spec['addExpectationResult']> is not an array type */ args: Parameters[
      js.Function3[/* passed */ Boolean, /* data */ Options, /* isError */ js.UndefOr[Boolean], Unit]
    ]
  ): Unit = js.native
  def afterAll(fn: QueueableFn): Unit = js.native
  def afterEach(fn: QueueableFn): Unit = js.native
  def beforeAll(fn: QueueableFn): Unit = js.native
  def beforeEach(fn: QueueableFn): Unit = js.native
  def canBeReentered(): Boolean = js.native
  def clonedSharedUserContext(): js.Object = js.native
  def disable(): Unit = js.native
  def execute(_args: js.Any*): Unit = js.native
  def getFullName(): String = js.native
  def getResult(): SuiteResult = js.native
  def isExecutable(): Boolean = js.native
  def onException(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<Spec['onException']> is not an array type */ args: Parameters[
      js.Function1[
        /* error */ typings.jestDashJasmine2.buildExpectationFailedMod.default | AssertionErrorWithStack, 
        Unit
      ]
    ]
  ): Unit = js.native
  def pend(): Unit = js.native
  def pend(_message: String): Unit = js.native
  def sharedUserContext(): js.Object = js.native
  def status(): disabled | pending | failed | finished = js.native
}

