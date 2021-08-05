package typings.materialUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@material-ui/core/utils/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def contains[O1 /* <: O2 */, O2](obj: O1, pred: O2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(obj.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createChainedFunction(funcs: ChainedFunction*): js.Function1[/* repeated */ js.Any, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("createChainedFunction")(funcs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Nothing]]
  
  inline def find[T](arr: js.Array[T], pred: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(arr.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def findIndex(arr: js.Array[js.Any], pred: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(arr.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type ChainedFunction = js.UndefOr[(js.Function1[/* repeated */ js.Any, Unit]) | Null]
}
