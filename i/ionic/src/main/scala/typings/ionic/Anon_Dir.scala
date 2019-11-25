package typings.ionic

import typings.ionic.definitionsMod.ProjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dir extends js.Object {
  var dir: String
  var srcDir: String
  var `type`: ProjectType
}

object Anon_Dir {
  @scala.inline
  def apply(dir: String, srcDir: String, `type`: ProjectType): Anon_Dir = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], srcDir = srcDir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dir]
  }
}

