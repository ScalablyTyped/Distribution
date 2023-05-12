package typings.jotai

import typings.jotai.vanillaAtomMod.Atom_
import typings.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaUtilsLoadableMod {
  
  @JSImport("jotai/vanilla/utils/loadable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadable[Value](anAtom: Atom_[Value]): Atom_[Loadable_[Value]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadable")(anAtom.asInstanceOf[js.Any]).asInstanceOf[Atom_[Loadable_[Value]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jotai.anon.State
    - typings.jotai.anon.Error
    - typings.jotai.anon.Data[Value]
  */
  trait Loadable_[Value] extends StObject
  object Loadable_ {
    
    inline def Data[Value](data: Awaited[Value]): typings.jotai.anon.Data[Value] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], state = "hasData")
      __obj.asInstanceOf[typings.jotai.anon.Data[Value]]
    }
    
    inline def Error(error: Any): typings.jotai.anon.Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], state = "hasError")
      __obj.asInstanceOf[typings.jotai.anon.Error]
    }
    
    inline def State(): typings.jotai.anon.State = {
      val __obj = js.Dynamic.literal(state = "loading")
      __obj.asInstanceOf[typings.jotai.anon.State]
    }
  }
}
