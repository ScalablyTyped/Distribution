package typings.ink.mod

import typings.node.processMod.global.NodeJS.WriteStream
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink", "render")
@js.native
object render extends js.Object {
  def apply[Props](tree: ReactElement): Instance = js.native
  def apply[Props](tree: ReactElement, options: RenderOptions): Instance = js.native
  def apply[Props](tree: ReactElement, options: WriteStream): Instance = js.native
}

