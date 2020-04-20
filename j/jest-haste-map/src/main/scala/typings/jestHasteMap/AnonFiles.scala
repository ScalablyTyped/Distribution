package typings.jestHasteMap

import typings.jestHasteMap.typesMod.FileData
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFiles extends js.Object {
  var files: FileData
  var rootDir: Path
}

object AnonFiles {
  @scala.inline
  def apply(files: FileData, rootDir: Path): AnonFiles = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFiles]
  }
}

