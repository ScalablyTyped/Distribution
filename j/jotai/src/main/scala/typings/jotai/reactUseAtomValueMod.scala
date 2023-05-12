package typings.jotai

import typings.jotai.vanillaAtomMod.Atom_
import typings.jotai.vanillaTypeUtilsMod.ExtractAtomValue
import typings.std.Awaited
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactUseAtomValueMod {
  
  @JSImport("jotai/react/useAtomValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAtomValue[AtomType /* <: Atom_[Any] */](atom: AtomType): Awaited[ExtractAtomValue[AtomType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtomValue")(atom.asInstanceOf[js.Any]).asInstanceOf[Awaited[ExtractAtomValue[AtomType]]]
  inline def useAtomValue[AtomType /* <: Atom_[Any] */](atom: AtomType, options: Options): Awaited[ExtractAtomValue[AtomType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtomValue")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Awaited[ExtractAtomValue[AtomType]]]
  inline def useAtomValue[Value](atom: Atom_[Value]): Awaited[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtomValue")(atom.asInstanceOf[js.Any]).asInstanceOf[Awaited[Value]]
  inline def useAtomValue[Value](atom: Atom_[Value], options: Options): Awaited[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtomValue")(atom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Awaited[Value]]
  
  trait Options extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var store: js.UndefOr[Store] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  type Store = ReturnType[
    js.Function1[
      /* options */ js.UndefOr[typings.jotai.reactProviderMod.Options], 
      typings.jotai.reactProviderMod.Store
    ]
  ]
}
