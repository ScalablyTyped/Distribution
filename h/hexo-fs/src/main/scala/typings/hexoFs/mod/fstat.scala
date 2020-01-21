package typings.hexoFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "fstat")
@js.native
object fstat extends js.Object {
  def apply(fd: Double): typings.bluebird.mod.^[typings.gracefulFs.mod.Stats] = js.native
}

