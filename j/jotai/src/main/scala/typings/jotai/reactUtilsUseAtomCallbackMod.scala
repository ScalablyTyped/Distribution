package typings.jotai

import typings.jotai.vanillaTypeUtilsMod.Getter
import typings.jotai.vanillaTypeUtilsMod.Setter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactUtilsUseAtomCallbackMod {
  
  @JSImport("jotai/react/utils/useAtomCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAtomCallback[Result, Args /* <: js.Array[Any] */](callback: js.Function3[/* get */ Getter, /* set */ Setter, /* arg */ Args, Result]): js.Function1[/* args */ Args, Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtomCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, Result]]
  inline def useAtomCallback[Result, Args /* <: js.Array[Any] */](
    callback: js.Function3[/* get */ Getter, /* set */ Setter, /* arg */ Args, Result],
    options: Options
  ): js.Function1[/* args */ Args, Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtomCallback")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Args, Result]]
  
  type Options = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jotai.anon.FnCallAtomOptions>[1] */ js.Any
}
