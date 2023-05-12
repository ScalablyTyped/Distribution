package typings.jotai

import typings.jotai.anon.D
import typings.jotai.anon.Devgetatomstate
import typings.jotai.anon.Devgetmounted
import typings.jotai.anon.V
import typings.jotai.anon.eAnyErrordDependencies
import typings.jotai.jotaiStrings.state
import typings.jotai.jotaiStrings.sub
import typings.jotai.jotaiStrings.unsub
import typings.jotai.vanillaAtomMod.Atom_
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaStoreMod {
  
  @JSImport("jotai/vanilla/store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStore(): Devgetatomstate | Devgetmounted = ^.asInstanceOf[js.Dynamic].applyDynamic("createStore")().asInstanceOf[Devgetatomstate | Devgetmounted]
  
  inline def getDefaultStore(): Devgetatomstate | Devgetmounted = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultStore")().asInstanceOf[Devgetatomstate | Devgetmounted]
  
  type AnyAtom = Atom_[AnyValue]
  
  type AnyError = Any
  
  type AnyValue = Any
  
  /**
    * Immutable atom state,
    * tracked for both mounted and unmounted atoms in a store.
    */
  type AtomState[Value] = eAnyErrordDependencies | (V[Value] & D)
  
  /**
    * Immutable map from a dependency to the dependency's atom state
    * when it was last read.
    * We can skip recomputation of an atom by comparing the atom state
    * of each dependency to that dependencies's current revision.
    */
  type Dependencies = Map[AnyAtom, AtomState[AnyValue]]
  
  type Dependents = Set[AnyAtom]
  
  type Listeners = Set[js.Function0[Unit]]
  
  /**
    * State tracked for mounted atoms. An atom is considered "mounted" if it has a
    * subscriber, or is a transitive dependency of another atom that has a
    * subscriber.
    *
    * The mounted state of an atom is freed once it is no longer mounted.
    */
  trait Mounted extends StObject {
    
    /** The list of subscriber functions. */
    var l: Listeners
    
    /** Atoms that depend on *this* atom. Used to fan out invalidation. */
    var t: Dependents
    
    /** Function to run when the atom is unmounted. */
    var u: js.UndefOr[OnUnmount] = js.undefined
  }
  object Mounted {
    
    inline def apply(l: Listeners, t: Dependents): Mounted = {
      val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mounted]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mounted] (val x: Self) extends AnyVal {
      
      inline def setL(value: Listeners): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setT(value: Dependents): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def setU(value: () => Unit): Self = StObject.set(x, "u", js.Any.fromFunction0(value))
      
      inline def setUUndefined: Self = StObject.set(x, "u", js.undefined)
    }
  }
  
  type OnUnmount = js.Function0[Unit]
  
  type StoreListener = js.Function1[/* type */ state | sub | unsub, Unit]
}
