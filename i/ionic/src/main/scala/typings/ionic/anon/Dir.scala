package typings.ionic.anon

import typings.ionic.definitionsMod.ProjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dir extends js.Object {
  var dir: String
  var srcDir: String
  var `type`: ProjectType
}

object Dir {
  @scala.inline
  def apply(dir: String, srcDir: String, `type`: ProjectType): Dir = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], srcDir = srcDir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dir]
  }
}

