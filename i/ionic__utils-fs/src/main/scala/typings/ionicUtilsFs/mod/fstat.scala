package typings.ionicUtilsFs.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "fstat")
@js.native
object fstat extends js.Object {
  def apply(fd: Double): js.Promise[typings.node.fsMod.Stats] = js.native
  def apply(
    fd: Double,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typings.node.fsMod.Stats, _]
  ): Unit = js.native
}

