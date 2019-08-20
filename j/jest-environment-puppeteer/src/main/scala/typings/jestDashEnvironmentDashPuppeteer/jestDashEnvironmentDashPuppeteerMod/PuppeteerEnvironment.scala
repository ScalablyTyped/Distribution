package typings.jestDashEnvironmentDashPuppeteer.jestDashEnvironmentDashPuppeteerMod

import typings.node.vmMod.Context
import typings.node.vmMod.Script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JestEnvironment * / any */ trait PuppeteerEnvironment extends js.Object {
  var context: Context | Null
  var fakeTimers: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FakeTimers<Timer> */ js.Any) | Null
  var global: Global
  var handleTestEvent: js.UndefOr[
    js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Circus.Event */ /* event */ js.Any, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Circus.State */ /* state */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var moduleMocker: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModuleMocker */ js.Any) | Null
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
    global: Global,
    runScript: Script => js.Any,
    setup: () => js.Promise[Unit],
    teardown: () => js.Promise[Unit],
    context: Context = null,
    fakeTimers: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FakeTimers<Timer> */ js.Any = null,
    handleTestEvent: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Circus.Event */ /* event */ js.Any, /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Circus.State */ /* state */ js.Any) => Unit = null,
    moduleMocker: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModuleMocker */ js.Any = null
  ): PuppeteerEnvironment = {
    val __obj = js.Dynamic.literal(global = global, runScript = js.Any.fromFunction1(runScript), setup = js.Any.fromFunction0(setup), teardown = js.Any.fromFunction0(teardown))
    if (context != null) __obj.updateDynamic("context")(context)
    if (fakeTimers != null) __obj.updateDynamic("fakeTimers")(fakeTimers)
    if (handleTestEvent != null) __obj.updateDynamic("handleTestEvent")(js.Any.fromFunction2(handleTestEvent))
    if (moduleMocker != null) __obj.updateDynamic("moduleMocker")(moduleMocker)
    __obj.asInstanceOf[PuppeteerEnvironment]
  }
}

