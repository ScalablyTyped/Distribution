package typings.jestEnvironmentPuppeteer.mod

import typings.jestFakeTimers.mod.JestFakeTimers
import typings.jestMock.mod.ModuleMocker
import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.State
import typings.node.vmMod.Context
import typings.node.vmMod.Script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestEnvironment * / any */ trait PuppeteerEnvironment extends js.Object {
  var context: Context | Null
  var fakeTimers: JestFakeTimers[Timer] | Null
  var global: Global_
  var handleTestEvent: js.UndefOr[js.Function2[/* event */ Event, /* state */ State, Unit]] = js.undefined
  var moduleMocker: ModuleMocker | Null
  def runScript(script: Script): js.Any
  /**
    * Setup runs when the environment is being spun up, generally before each test suite
    * You should always call `await super.setup()` in here
    */
  def setup(): js.Promise[Unit]
  /**
    * Teardowns runs as the environment is being torn down, generally after each test suite.
    * You should always call `await super.tearDown()` in here
    */
  def teardown(): js.Promise[Unit]
}

object PuppeteerEnvironment {
  @scala.inline
  def apply(
    global: Global_,
    runScript: Script => js.Any,
    setup: () => js.Promise[Unit],
    teardown: () => js.Promise[Unit],
    context: Context = null,
    fakeTimers: JestFakeTimers[Timer] = null,
    handleTestEvent: (/* event */ Event, /* state */ State) => Unit = null,
    moduleMocker: ModuleMocker = null
  ): PuppeteerEnvironment = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], runScript = js.Any.fromFunction1(runScript), setup = js.Any.fromFunction0(setup), teardown = js.Any.fromFunction0(teardown), context = context.asInstanceOf[js.Any], fakeTimers = fakeTimers.asInstanceOf[js.Any], moduleMocker = moduleMocker.asInstanceOf[js.Any])
    if (handleTestEvent != null) __obj.updateDynamic("handleTestEvent")(js.Any.fromFunction2(handleTestEvent))
    __obj.asInstanceOf[PuppeteerEnvironment]
  }
}

