package typings.jestJasmine2.specMod

import typings.jestJasmine2.anon.Afters
import typings.jestJasmine2.anon.Cancel
import typings.jestJasmine2.queueRunnerMod.Options
import typings.jestJasmine2.queueRunnerMod.QueueableFn
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var description: String
  var id: String
  var queueRunnerFactory: js.Function1[/* options */ Options, Cancel]
  var queueableFn: QueueableFn
  var throwOnExpectationFailure: js.Any
  def beforeAndAfterFns(): Afters
  def getSpecName(spec: Spec): String
  def getTestPath(): Path
  def onStart(context: Spec): Unit
  def resultCallback(result: SpecResult): Unit
  def userContext(): js.Any
}

object Attributes {
  @scala.inline
  def apply(
    beforeAndAfterFns: () => Afters,
    description: String,
    getSpecName: Spec => String,
    getTestPath: () => Path,
    id: String,
    onStart: Spec => Unit,
    queueRunnerFactory: /* options */ Options => Cancel,
    queueableFn: QueueableFn,
    resultCallback: SpecResult => Unit,
    throwOnExpectationFailure: js.Any,
    userContext: () => js.Any
  ): Attributes = {
    val __obj = js.Dynamic.literal(beforeAndAfterFns = js.Any.fromFunction0(beforeAndAfterFns), description = description.asInstanceOf[js.Any], getSpecName = js.Any.fromFunction1(getSpecName), getTestPath = js.Any.fromFunction0(getTestPath), id = id.asInstanceOf[js.Any], onStart = js.Any.fromFunction1(onStart), queueRunnerFactory = js.Any.fromFunction1(queueRunnerFactory), queueableFn = queueableFn.asInstanceOf[js.Any], resultCallback = js.Any.fromFunction1(resultCallback), throwOnExpectationFailure = throwOnExpectationFailure.asInstanceOf[js.Any], userContext = js.Any.fromFunction0(userContext))
    __obj.asInstanceOf[Attributes]
  }
}

