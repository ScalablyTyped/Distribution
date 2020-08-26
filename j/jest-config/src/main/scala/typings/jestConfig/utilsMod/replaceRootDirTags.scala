package typings.jestConfig.utilsMod

import org.scalablytyped.runtime.TopLevel
import typings.jestConfig.jestConfigStrings._replaceRootDirTags
import typings.jestTypes.configMod.Path
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-config/build/utils", "_replaceRootDirTags")
@js.native
object replaceRootDirTags extends js.Object {
  def apply(rootDir: Path, config: String): String = js.native
  def apply(rootDir: Path, config: js.Array[Path | RegExp | ReplaceRootDirConfigObj]): js.Array[ReplaceRootDirConfigObj] = js.native
  def apply(rootDir: Path, config: RegExp): RegExp = js.native
  def apply[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @jest/types.@jest/types/build/Config.Path}
    */ _replaceRootDirTags with TopLevel[js.Any] */](rootDir: Path, config: T): T = js.native
}

