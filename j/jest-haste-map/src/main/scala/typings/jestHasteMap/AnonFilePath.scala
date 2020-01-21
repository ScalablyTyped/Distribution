package typings.jestHasteMap

import typings.jestTypes.configMod.Path
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilePath extends js.Object {
  var filePath: Path
  var stat: js.UndefOr[Stats] = js.undefined
  var `type`: String
}

object AnonFilePath {
  @scala.inline
  def apply(filePath: Path, `type`: String, stat: Stats = null): AnonFilePath = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (stat != null) __obj.updateDynamic("stat")(stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilePath]
  }
}

