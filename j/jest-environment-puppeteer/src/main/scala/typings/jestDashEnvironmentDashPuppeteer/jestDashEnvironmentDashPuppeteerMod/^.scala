package typings.jestDashEnvironmentDashPuppeteer.jestDashEnvironmentDashPuppeteerMod

import typings.node.vmMod.Context
import typings.node.vmMod.Script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
@JSImport("jest-environment-puppeteer", JSImport.Namespace)
@js.native
class ^ protected () extends PuppeteerEnvironment {
  def this(config: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Config.ProjectConfig */ js.Any) = this()
  /* CompleteClass */
  override var context: Context | Null = js.native
  /* CompleteClass */
  override var fakeTimers: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FakeTimers<Timer> */ js.Any) | Null = js.native
  /* CompleteClass */
  override var global: Global = js.native
  /* CompleteClass */
  override var moduleMocker: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModuleMocker */ js.Any) | Null = js.native
  /* CompleteClass */
  override def runScript(script: Script): js.Any = js.native
  /**
    * Setup runs when the environment is being spun up, generally before each test suite
    * You should always call `await super.setup()` in here
    */
  /* CompleteClass */
  override def setup(): js.Promise[Unit] = js.native
  /**
    * Teardowns runs as the environment is being torn down, generally after each test suite.
    * You should always call `await super.tearDown()` in here
    */
  /* CompleteClass */
  override def teardown(): js.Promise[Unit] = js.native
}

