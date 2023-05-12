package typings.jotai

import typings.jotai.vanillaAtomMod.WritableAtom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaUtilsAtomWithReducerMod {
  
  @JSImport("jotai/vanilla/utils/atomWithReducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atomWithReducer[Value, Action](
    initialValue: Value,
    reducer: js.Function2[/* value */ Value, js.UndefOr[/* action */ Action], Value]
  ): WritableAtom[Value, js.Array[js.UndefOr[Action]], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithReducer")(initialValue.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[Value, js.Array[js.UndefOr[Action]], Unit]]
}
