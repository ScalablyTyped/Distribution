package typings.jestDashHasteDashMap

import typings.atJestTypes.buildConfigMod.Path
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilePath extends js.Object {
  var filePath: Path
  var stat: js.UndefOr[Stats] = js.undefined
  var `type`: String
}

object Anon_FilePath {
  @scala.inline
  def apply(filePath: Path, `type`: String, stat: Stats = null): Anon_FilePath = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (stat != null) __obj.updateDynamic("stat")(stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FilePath]
  }
}

