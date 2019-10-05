package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.hexoDashFs.Anon_AutoClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "ensureWriteStream")
@js.native
object ensureWriteStream extends js.Object {
  def apply(path: String): ^[typings.gracefulDashFs.gracefulDashFsMod.WriteStream] = js.native
  def apply(
    path: String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typings.gracefulDashFs.gracefulDashFsMod.WriteStream], 
      Unit
    ]
  ): ^[typings.gracefulDashFs.gracefulDashFsMod.WriteStream] = js.native
  def apply(path: String, options: String): ^[typings.gracefulDashFs.gracefulDashFsMod.WriteStream] = js.native
  def apply(
    path: String,
    options: String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typings.gracefulDashFs.gracefulDashFsMod.WriteStream], 
      Unit
    ]
  ): ^[typings.gracefulDashFs.gracefulDashFsMod.WriteStream] = js.native
  def apply(path: String, options: Anon_AutoClose): ^[typings.gracefulDashFs.gracefulDashFsMod.WriteStream] = js.native
  def apply(
    path: String,
    options: Anon_AutoClose,
    callback: js.Function2[
      /* err */ js.Any, 
      /* value */ js.UndefOr[typings.gracefulDashFs.gracefulDashFsMod.WriteStream], 
      Unit
    ]
  ): ^[typings.gracefulDashFs.gracefulDashFsMod.WriteStream] = js.native
}

