package typings.ionicCore.stencilPublicRuntimeMod.h

import typings.ionicCore.stencilPublicRuntimeMod.VNode
import typings.ionicCore.stencilPublicRuntimeMod.VNodeData
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/stencil-public-runtime", "h.h")
@js.native
object h extends js.Object {
  def apply(sel: js.Any): VNode = js.native
  def apply(sel: js.Any, children: js.Array[js.UndefOr[VNode | Null]]): VNode = js.native
  def apply(sel: js.Any, data: VNodeData): VNode = js.native
  def apply(sel: js.Any, data: VNodeData, children: js.Array[js.UndefOr[VNode | Null]]): VNode = js.native
  def apply(sel: js.Any, data: VNodeData, children: VNode): VNode = js.native
  def apply(sel: js.Any, data: VNodeData, text: String): VNode = js.native
  def apply(sel: js.Any, text: String): VNode = js.native
  def apply(sel: Node, data: VNodeData): VNode = js.native
}

