package typings.maquette

import typings.maquette.interfacesMod.VNode
import typings.maquette.interfacesMod.VNodeChild
import typings.maquette.interfacesMod.VNodeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maquette/dist/h", JSImport.Namespace)
@js.native
object hMod extends js.Object {
  def h(selector: String): VNode = js.native
  def h(selector: String, children: js.Array[VNodeChild]): VNode = js.native
  def h(selector: String, properties: VNodeProperties): VNode = js.native
  def h(selector: String, properties: VNodeProperties, children: js.Array[VNodeChild]): VNode = js.native
}

