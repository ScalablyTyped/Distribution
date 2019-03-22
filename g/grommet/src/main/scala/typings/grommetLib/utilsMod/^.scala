package typings
package grommetLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val deepFreeze: DeepFreeze = js.native
  val deepMerge: DeepMerge = js.native
  def isObject(item: js.Any): scala.Boolean = js.native
  def normalizeColor(color: grommetLib.Anon_Dark, theme: js.Object): java.lang.String = js.native
  def normalizeColor(color: grommetLib.Anon_Dark, theme: js.Object, required: scala.Boolean): java.lang.String = js.native
  def normalizeColor(color: java.lang.String, theme: js.Object): java.lang.String = js.native
  def normalizeColor(color: java.lang.String, theme: js.Object, required: scala.Boolean): java.lang.String = js.native
  def removeUndefined[T /* <: js.Object */](obj: T): NonUndefinedProps[T] = js.native
}

