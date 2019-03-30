package typings
package immerLib.immerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: IProduce = js.native
  val immerable: js.Symbol = js.native
  val nothing: Nothing = js.native
  val produce: IProduce = js.native
  def applyPatches[S](base: S, patches: js.Array[Patch]): S = js.native
  def isDraft(value: js.Any): scala.Boolean = js.native
  def isDraftable(value: js.Any): scala.Boolean = js.native
  def original[T](value: T): T | scala.Unit = js.native
  def setAutoFreeze(autoFreeze: scala.Boolean): scala.Unit = js.native
  def setUseProxies(useProxies: scala.Boolean): scala.Unit = js.native
}

