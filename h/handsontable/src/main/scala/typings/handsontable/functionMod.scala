package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionMod {
  
  @JSImport("handsontable/helpers/function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def curry(func: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("curry")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def curryRight(func: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("curryRight")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def debounce(func: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def debounce(func: js.Function0[Unit], wait: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def fastCall(
    func: js.Function0[Unit],
    context: Any,
    arg1: js.UndefOr[Any],
    arg2: js.UndefOr[Any],
    arg3: js.UndefOr[Any],
    arg4: js.UndefOr[Any],
    arg5: js.UndefOr[Any],
    arg6: js.UndefOr[Any]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fastCall")(func.asInstanceOf[js.Any], context.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any], arg6.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isFunction(func: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(func.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def partial(func: js.Function0[Unit], params: Any*): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(List(func.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function0[Unit]]
  
  inline def pipe(functions: js.Function0[Unit]*): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(functions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function0[Unit]]
  
  inline def throttle(func: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def throttle(func: js.Function0[Unit], wait: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def throttleAfterHits(func: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleAfterHits")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def throttleAfterHits(func: js.Function0[Unit], wait: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAfterHits")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def throttleAfterHits(func: js.Function0[Unit], wait: Double, hits: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAfterHits")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], hits.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def throttleAfterHits(func: js.Function0[Unit], wait: Unit, hits: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleAfterHits")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], hits.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
