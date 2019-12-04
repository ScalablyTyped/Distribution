package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.utilsHelpersMod.ChainedFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/utils/helpers", JSImport.Namespace)
@js.native
object utilsHelpersMod extends js.Object {
  def capitalize(str: String): String = js.native
  def contains[O1 /* <: O2 */, O2](obj: O1, pred: O2): Boolean = js.native
  def createChainedFunction(funcs: ChainedFunction*): js.Function1[/* repeated */ js.Any, scala.Nothing] = js.native
  def find[T](arr: js.Array[T], pred: js.Any): T = js.native
  def findIndex(arr: js.Array[_], pred: js.Any): Double = js.native
  type ChainedFunction = js.UndefOr[(js.Function1[/* repeated */ js.Any, Unit]) | Null]
}

