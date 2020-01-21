package typings.gulpDiff.mod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Gulp task to diff files in the stream against a destination.
    * @param dest target directory to diff against, defaults to diff against original source file
    */
  def apply(): Transform = js.native
  def apply(dest: String): Transform = js.native
}

