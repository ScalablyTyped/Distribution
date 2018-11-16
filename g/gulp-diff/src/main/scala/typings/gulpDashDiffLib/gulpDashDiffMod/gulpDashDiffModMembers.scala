package typings
package gulpDashDiffLib.gulpDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-diff", JSImport.Namespace)
@js.native
object gulpDashDiffModMembers extends js.Object {
  val diff: gulpDashDiffLib.Anon_Diff = js.native
  /**
   * Gulp task to diff files in the stream against a destination.
   * @param dest target directory to diff against, defaults to diff against original source file
   */
  def apply(): nodeLib.streamMod.Transform = js.native
  /**
   * Gulp task to diff files in the stream against a destination.
   * @param dest target directory to diff against, defaults to diff against original source file
   */
  def apply(dest: java.lang.String): nodeLib.streamMod.Transform = js.native
  def reporter(): nodeLib.streamMod.Transform = js.native
  def reporter(opts: gulpDashDiffLib.gulpDashDiffMod.gulpUnderscoreDiffNs.ReporterOptions): nodeLib.streamMod.Transform = js.native
}

