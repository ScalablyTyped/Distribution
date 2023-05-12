package typings.jotai

import typings.jotai.vanillaAtomMod.Atom_
import typings.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaUtilsUnwrapMod {
  
  @JSImport("jotai/vanilla/utils/unwrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unwrap[Value](anAtom: Atom_[js.Promise[Value]]): Atom_[js.UndefOr[Awaited[Value]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(anAtom.asInstanceOf[js.Any]).asInstanceOf[Atom_[js.UndefOr[Awaited[Value]]]]
  inline def unwrap[Value, PendingValue](
    anAtom: Atom_[js.Promise[Value]],
    fallback: js.Function1[/* prev */ js.UndefOr[Value], PendingValue]
  ): Atom_[Awaited[Value] | PendingValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(anAtom.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Atom_[Awaited[Value] | PendingValue]]
}
