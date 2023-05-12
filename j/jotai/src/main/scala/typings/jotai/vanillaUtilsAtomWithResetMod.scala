package typings.jotai

import typings.jotai.vanillaAtomMod.WritableAtom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaUtilsAtomWithResetMod {
  
  @JSImport("jotai/vanilla/utils/atomWithReset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atomWithReset[Value](initialValue: Value): WritableAtom[Value, js.Array[SetStateActionWithReset[Value]], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("atomWithReset")(initialValue.asInstanceOf[js.Any]).asInstanceOf[WritableAtom[Value, js.Array[SetStateActionWithReset[Value]], Unit]]
  
  type SetStateActionWithReset[Value] = Value | js.Symbol | (js.Function1[/* prev */ Value, Value | js.Symbol])
}
