package typings.jestDashConfig.buildUtilsMod

import typings.atJestTypes.buildConfigMod.Path
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-config/build/utils", "_replaceRootDirTags")
@js.native
object _replaceRootDirTags extends js.Object {
  def apply(rootDir: String, config: String): String = js.native
  def apply(rootDir: String, config: js.Array[Path | RegExp | ReplaceRootDirConfigObj]): js.Array[ReplaceRootDirConfigObj] = js.native
  def apply(rootDir: String, config: RegExp): RegExp = js.native
  def apply[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in string ]: @jest/types.@jest/types/build/Config.Path}
    */ typings.jestDashConfig.jestDashConfigStrings._replaceRootDirTags with js.Any */](rootDir: String, config: T): T = js.native
}

