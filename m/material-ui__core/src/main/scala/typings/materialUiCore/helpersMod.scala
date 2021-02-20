package typings.materialUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@material-ui/core/utils/helpers", "capitalize")
  @js.native
  def capitalize(str: String): String = js.native
  
  @JSImport("@material-ui/core/utils/helpers", "contains")
  @js.native
  def contains[O1 /* <: O2 */, O2](obj: O1, pred: O2): Boolean = js.native
  
  @JSImport("@material-ui/core/utils/helpers", "createChainedFunction")
  @js.native
  def createChainedFunction(funcs: ChainedFunction*): js.Function1[/* repeated */ js.Any, scala.Nothing] = js.native
  
  @JSImport("@material-ui/core/utils/helpers", "find")
  @js.native
  def find[T](arr: js.Array[T], pred: js.Any): T = js.native
  
  @JSImport("@material-ui/core/utils/helpers", "findIndex")
  @js.native
  def findIndex(arr: js.Array[_], pred: js.Any): Double = js.native
  
  type ChainedFunction = js.UndefOr[(js.Function1[/* repeated */ js.Any, Unit]) | Null]
}
