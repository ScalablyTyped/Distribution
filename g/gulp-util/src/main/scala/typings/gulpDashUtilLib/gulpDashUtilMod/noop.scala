package typings
package gulpDashUtilLib.gulpDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-util", "noop")
@js.native
object noop extends js.Object {
  def apply(): nodeLib.streamMod.Transform = js.native
  def apply(opts: nodeLib.streamMod.DuplexOptions): nodeLib.streamMod.Transform = js.native
  def apply(opts: nodeLib.streamMod.DuplexOptions, transform: through2Lib.through2Mod.TransformFunction): nodeLib.streamMod.Transform = js.native
  def apply(
    opts: nodeLib.streamMod.DuplexOptions,
    transform: through2Lib.through2Mod.TransformFunction,
    flush: through2Lib.through2Mod.FlushCallback
  ): nodeLib.streamMod.Transform = js.native
  def apply(transform: through2Lib.through2Mod.TransformFunction): nodeLib.streamMod.Transform = js.native
  def apply(transform: through2Lib.through2Mod.TransformFunction, flush: through2Lib.through2Mod.FlushCallback): nodeLib.streamMod.Transform = js.native
  /**
  	 * Creates a constructor for a custom Transform. This is useful when you
  	 * want to use the same transform logic in multiple instances.
  	 */
  def ctor(): through2Lib.through2Mod.Through2Constructor = js.native
  def ctor(opts: nodeLib.streamMod.DuplexOptions): through2Lib.through2Mod.Through2Constructor = js.native
  def ctor(opts: nodeLib.streamMod.DuplexOptions, transform: through2Lib.through2Mod.TransformFunction): through2Lib.through2Mod.Through2Constructor = js.native
  def ctor(
    opts: nodeLib.streamMod.DuplexOptions,
    transform: through2Lib.through2Mod.TransformFunction,
    flush: through2Lib.through2Mod.FlushCallback
  ): through2Lib.through2Mod.Through2Constructor = js.native
  def ctor(transform: through2Lib.through2Mod.TransformFunction): through2Lib.through2Mod.Through2Constructor = js.native
  def ctor(transform: through2Lib.through2Mod.TransformFunction, flush: through2Lib.through2Mod.FlushCallback): through2Lib.through2Mod.Through2Constructor = js.native
  /**
  	 * Convenvience method for creating object streams
  	 */
  def obj(): nodeLib.streamMod.Transform = js.native
  def obj(transform: through2Lib.through2Mod.TransformFunction): nodeLib.streamMod.Transform = js.native
  def obj(transform: through2Lib.through2Mod.TransformFunction, flush: through2Lib.through2Mod.FlushCallback): nodeLib.streamMod.Transform = js.native
}

