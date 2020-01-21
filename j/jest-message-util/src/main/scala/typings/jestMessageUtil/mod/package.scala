package typings.jestMessageUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type StackTraceConfig = typings.std.Pick[
    typings.jestTypes.configMod.ProjectConfig, 
    typings.jestMessageUtil.jestMessageUtilStrings.rootDir | typings.jestMessageUtil.jestMessageUtilStrings.testMatch
  ]
}
