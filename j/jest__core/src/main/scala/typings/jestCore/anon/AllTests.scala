package typings.jestCore.anon

import typings.jestCore.jestCoreStrings.globalSetup
import typings.jestCore.jestCoreStrings.globalTeardown
import typings.jestRunner.typesMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllTests extends js.Object {
  var allTests: js.Array[Test]
  var globalConfig: typings.jestTypes.configMod.GlobalConfig
  var moduleName: globalSetup | globalTeardown
}

object AllTests {
  @scala.inline
  def apply(
    allTests: js.Array[Test],
    globalConfig: typings.jestTypes.configMod.GlobalConfig,
    moduleName: globalSetup | globalTeardown
  ): AllTests = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllTests]
  }
}

