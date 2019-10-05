package typings.ink.inkMod

import typings.node.processMod.Global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink", "render")
@js.native
object render extends js.Object {
  def apply(tree: InkElement): js.Function0[Unit] = js.native
  def apply(tree: InkElement, stream: WriteStream): js.Function0[Unit] = js.native
}

