package typings.jestDashConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildUtilsMod {
  import typings.atJestTypes.buildConfigMod.Path
  import typings.std.Record
  import typings.std.RegExp

  type JSONString = String with js.Object
  type OrArray[T] = T | js.Array[T]
  type ReplaceRootDirConfigObj = Record[String, Path]
  type ReplaceRootDirConfigValues = OrArray[Path | RegExp | ReplaceRootDirConfigObj]
}
