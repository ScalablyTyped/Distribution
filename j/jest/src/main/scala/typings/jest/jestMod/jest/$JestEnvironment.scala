package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait $JestEnvironment extends js.Object {
  var fakeTimers: FakeTimers
  var global: Global
  var moduleMocker: ModuleMocker
  var testFilePath: String
  def dispose(): Unit
  def runScript(script: Script): js.Any
}

object $JestEnvironment {
  @scala.inline
  def apply(
    dispose: () => Unit,
    fakeTimers: FakeTimers,
    global: Global,
    moduleMocker: ModuleMocker,
    runScript: Script => js.Any,
    testFilePath: String
  ): $JestEnvironment = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), fakeTimers = fakeTimers.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], moduleMocker = moduleMocker.asInstanceOf[js.Any], runScript = js.Any.fromFunction1(runScript), testFilePath = testFilePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[$JestEnvironment]
  }
}

