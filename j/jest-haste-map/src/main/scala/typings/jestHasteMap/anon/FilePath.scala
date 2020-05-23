package typings.jestHasteMap.anon

import typings.jestTypes.configMod.Path
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePath extends js.Object {
  var filePath: Path
  var stat: js.UndefOr[Stats] = js.undefined
  var `type`: String
}

object FilePath {
  @scala.inline
  def apply(filePath: Path, `type`: String, stat: Stats = null): FilePath = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (stat != null) __obj.updateDynamic("stat")(stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePath]
  }
}

