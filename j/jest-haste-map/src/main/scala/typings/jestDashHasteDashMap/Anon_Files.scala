package typings.jestDashHasteDashMap

import typings.atJestTypes.buildConfigMod.Path
import typings.jestDashHasteDashMap.buildTypesMod.FileData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Files extends js.Object {
  var files: FileData
  var rootDir: Path
}

object Anon_Files {
  @scala.inline
  def apply(files: FileData, rootDir: Path): Anon_Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Files]
  }
}

