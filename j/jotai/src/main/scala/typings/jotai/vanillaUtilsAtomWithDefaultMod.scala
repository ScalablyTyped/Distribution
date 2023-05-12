package typings.jotai

import typings.jotai.vanillaAtomMod.SetAtom
import typings.jotai.vanillaAtomMod.WritableAtom
import typings.jotai.vanillaTypeUtilsMod.SetStateAction
import typings.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaUtilsAtomWithDefaultMod {
  
  @JSImport("jotai/vanilla/utils/atomWithDefault", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atomWithDefault[Value](
    getDefault: Read[
      js.Promise[Value] | Value, 
      js.Array[SetStateAction[Awaited[Value]] | js.Symbol], 
      Unit
    ]
  ): WritableAtom[
    js.Promise[Value] | Value, 
    js.Array[SetStateAction[Awaited[Value]] | js.Symbol], 
    Unit | js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("atomWithDefault")(getDefault.asInstanceOf[js.Any]).asInstanceOf[WritableAtom[
    js.Promise[Value] | Value, 
    js.Array[SetStateAction[Awaited[Value]] | js.Symbol], 
    Unit | js.Promise[Unit]
  ]]
  
  type Read[Value, Args /* <: js.Array[Any] */, Result] = typings.jotai.vanillaAtomMod.Read[Value, SetAtom[Args, Result]]
}
