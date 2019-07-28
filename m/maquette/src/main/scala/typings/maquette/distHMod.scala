package typings.maquette

import typings.maquette.distInterfacesMod.VNode
import typings.maquette.distInterfacesMod.VNodeChild
import typings.maquette.distInterfacesMod.VNodeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maquette/dist/h", JSImport.Namespace)
@js.native
object distHMod extends js.Object {
  def h(selector: String): VNode = js.native
  def h(selector: String, children: js.Array[VNodeChild]): VNode = js.native
  def h(selector: String, properties: VNodeProperties): VNode = js.native
  def h(selector: String, properties: VNodeProperties, children: js.Array[VNodeChild]): VNode = js.native
}

