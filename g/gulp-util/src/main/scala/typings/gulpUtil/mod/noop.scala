package typings.gulpUtil.mod

import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Transform
import typings.through2.mod.FlushCallback
import typings.through2.mod.Through2Constructor
import typings.through2.mod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-util", "noop")
@js.native
object noop extends js.Object {
  def apply(): Transform = js.native
  def apply(opts: DuplexOptions): Transform = js.native
  def apply(opts: DuplexOptions, transform: TransformFunction): Transform = js.native
  def apply(opts: DuplexOptions, transform: TransformFunction, flush: FlushCallback): Transform = js.native
  def apply(transform: TransformFunction): Transform = js.native
  def apply(transform: TransformFunction, flush: FlushCallback): Transform = js.native
  /**
  	 * Creates a constructor for a custom Transform. This is useful when you
  	 * want to use the same transform logic in multiple instances.
  	 */
  def ctor(): Through2Constructor = js.native
  def ctor(opts: DuplexOptions): Through2Constructor = js.native
  def ctor(opts: DuplexOptions, transform: TransformFunction): Through2Constructor = js.native
  def ctor(opts: DuplexOptions, transform: TransformFunction, flush: FlushCallback): Through2Constructor = js.native
  def ctor(transform: TransformFunction): Through2Constructor = js.native
  def ctor(transform: TransformFunction, flush: FlushCallback): Through2Constructor = js.native
  /**
  	 * Convenvience method for creating object streams
  	 */
  def obj(): Transform = js.native
  def obj(transform: TransformFunction): Transform = js.native
  def obj(transform: TransformFunction, flush: FlushCallback): Transform = js.native
}

