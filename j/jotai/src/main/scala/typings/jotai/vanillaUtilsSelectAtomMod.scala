package typings.jotai

import typings.jotai.vanillaAtomMod.Atom_
import typings.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaUtilsSelectAtomMod {
  
  @JSImport("jotai/vanilla/utils/selectAtom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def selectAtom[Value, Slice](
    anAtom: Atom_[js.Promise[Value] | Value],
    selector: js.Function2[/* v */ Awaited[Value], js.UndefOr[Slice], Slice]
  ): Atom_[js.Promise[Slice]] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAtom")(anAtom.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Atom_[js.Promise[Slice]]]
  inline def selectAtom[Value, Slice](
    anAtom: Atom_[js.Promise[Value] | Value],
    selector: js.Function2[/* v */ Awaited[Value], js.UndefOr[Slice], Slice],
    equalityFn: js.Function2[/* a */ Slice, /* b */ Slice, Boolean]
  ): Atom_[js.Promise[Slice]] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAtom")(anAtom.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[Atom_[js.Promise[Slice]]]
}
