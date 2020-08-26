package typings.jestCore.testSchedulerMod

import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/TestScheduler", JSImport.Default)
@js.native
class default protected () extends TestScheduler {
  def this(globalConfig: GlobalConfig, options: TestSchedulerOptions, context: TestSchedulerContext) = this()
}

