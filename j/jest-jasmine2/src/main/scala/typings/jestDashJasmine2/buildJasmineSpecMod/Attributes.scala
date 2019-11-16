package typings.jestDashJasmine2.buildJasmineSpecMod

import typings.atJestTypes.buildConfigMod.Path
import typings.jestDashJasmine2.Anon_Afters
import typings.jestDashJasmine2.Anon_Cancel
import typings.jestDashJasmine2.buildQueueRunnerMod.Options
import typings.jestDashJasmine2.buildQueueRunnerMod.QueueableFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var description: String
  var id: String
  var queueRunnerFactory: js.Function1[/* options */ Options, Anon_Cancel]
  var queueableFn: QueueableFn
  var throwOnExpectationFailure: js.Any
  def beforeAndAfterFns(): Anon_Afters
  def getSpecName(spec: Spec): String
  def getTestPath(): Path
  def onStart(context: Spec): Unit
  def resultCallback(result: SpecResult): Unit
  def userContext(): js.Any
}

object Attributes {
  @scala.inline
  def apply(
    beforeAndAfterFns: () => Anon_Afters,
    description: String,
    getSpecName: Spec => String,
    getTestPath: () => Path,
    id: String,
    onStart: Spec => Unit,
    queueRunnerFactory: /* options */ Options => Anon_Cancel,
    queueableFn: QueueableFn,
    resultCallback: SpecResult => Unit,
    throwOnExpectationFailure: js.Any,
    userContext: () => js.Any
  ): Attributes = {
    val __obj = js.Dynamic.literal(beforeAndAfterFns = js.Any.fromFunction0(beforeAndAfterFns), description = description, getSpecName = js.Any.fromFunction1(getSpecName), getTestPath = js.Any.fromFunction0(getTestPath), id = id, onStart = js.Any.fromFunction1(onStart), queueRunnerFactory = js.Any.fromFunction1(queueRunnerFactory), queueableFn = queueableFn, resultCallback = js.Any.fromFunction1(resultCallback), throwOnExpectationFailure = throwOnExpectationFailure, userContext = js.Any.fromFunction0(userContext))
  
    __obj.asInstanceOf[Attributes]
  }
}

