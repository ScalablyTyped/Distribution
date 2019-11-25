package typings.jestDashJasmine2.buildQueueRunnerMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clearTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['clearTimeout'] */ js.Any
  var queueableFns: js.Array[QueueableFn]
  var setTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['setTimeout'] */ js.Any
  var userContext: js.Any
  def fail(error: Error): Unit
  def onException(error: Error): Unit
}

object Options {
  @scala.inline
  def apply(
    clearTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['clearTimeout'] */ js.Any,
    fail: Error => Unit,
    onException: Error => Unit,
    queueableFns: js.Array[QueueableFn],
    setTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['setTimeout'] */ js.Any,
    userContext: js.Any
  ): Options = {
    val __obj = js.Dynamic.literal(clearTimeout = clearTimeout.asInstanceOf[js.Any], fail = js.Any.fromFunction1(fail), onException = js.Any.fromFunction1(onException), queueableFns = queueableFns.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any], userContext = userContext.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

