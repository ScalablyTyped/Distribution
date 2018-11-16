package typings
package k6Lib.k6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6", JSImport.Namespace)
@js.native
object k6ModMembers extends js.Object {
  def check[T](`val`: T, sets: ScalablyTyped.runtime.StringDictionary[js.Function1[/* val */ T, scala.Boolean]]): scala.Boolean = js.native
  def check[T](
    `val`: T,
    sets: ScalablyTyped.runtime.StringDictionary[js.Function1[/* val */ T, scala.Boolean]],
    tags: js.Object
  ): scala.Boolean = js.native
  def fail(): js.UndefOr[scala.Nothing] = js.native
  def fail(err: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def group[T](name: java.lang.String, fn: js.Function0[T]): T = js.native
  def sleep(t: scala.Double): scala.Unit = js.native
}

