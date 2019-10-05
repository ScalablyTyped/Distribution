package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "fstat")
@js.native
object fstat extends js.Object {
  def apply(fd: Double): ^[typings.gracefulDashFs.gracefulDashFsMod.Stats] = js.native
}

