package typings.jestDashMessageDashUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jestDashMessageDashUtilMod {
  import typings.atJestTypes.buildConfigMod.ProjectConfig
  import typings.jestDashMessageDashUtil.jestDashMessageDashUtilStrings.rootDir
  import typings.jestDashMessageDashUtil.jestDashMessageDashUtilStrings.testMatch
  import typings.std.Pick

  type StackTraceConfig = Pick[ProjectConfig, rootDir | testMatch]
}
