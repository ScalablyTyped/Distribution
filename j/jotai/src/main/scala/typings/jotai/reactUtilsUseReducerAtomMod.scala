package typings.jotai

import typings.jotai.vanillaAtomMod.PrimitiveAtom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactUtilsUseReducerAtomMod {
  
  @JSImport("jotai/react/utils/useReducerAtom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useReducerAtom[Value, Action](
    anAtom: PrimitiveAtom[Value],
    reducer: js.Function2[/* v */ Value, js.UndefOr[/* a */ Action], Value]
  ): js.Tuple2[Value, js.Function1[/* action */ js.UndefOr[Action], Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducerAtom")(anAtom.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Value, js.Function1[/* action */ js.UndefOr[Action], Unit]]]
  inline def useReducerAtom[Value, Action](
    anAtom: PrimitiveAtom[Value],
    reducer: js.Function2[/* v */ Value, js.UndefOr[/* a */ Action], Value],
    options: Options
  ): js.Tuple2[Value, js.Function1[/* action */ js.UndefOr[Action], Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducerAtom")(anAtom.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Value, js.Function1[/* action */ js.UndefOr[Action], Unit]]]
  
  type Options = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jotai.anon.Fn0>[1] */ js.Any
}
