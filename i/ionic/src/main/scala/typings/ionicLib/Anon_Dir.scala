package typings
package ionicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dir extends js.Object {
  var dir: java.lang.String
  var srcDir: java.lang.String
  var `type`: ionicLib.definitionsMod.ProjectType
}

object Anon_Dir {
  @scala.inline
  def apply(dir: java.lang.String, srcDir: java.lang.String, `type`: ionicLib.definitionsMod.ProjectType): Anon_Dir = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("dir")(dir)
    __obj.updateDynamic("srcDir")(srcDir)
    __obj.asInstanceOf[Anon_Dir]
  }
}

