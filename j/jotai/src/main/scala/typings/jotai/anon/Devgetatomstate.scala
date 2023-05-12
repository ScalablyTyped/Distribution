package typings.jotai.anon

import typings.jotai.vanillaAtomMod.Atom_
import typings.jotai.vanillaAtomMod.WritableAtom
import typings.jotai.vanillaStoreMod.AnyAtom
import typings.jotai.vanillaStoreMod.AnyValue
import typings.jotai.vanillaStoreMod.AtomState
import typings.jotai.vanillaStoreMod.Mounted
import typings.jotai.vanillaStoreMod.StoreListener
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Devgetatomstate extends StObject {
  
  def dev_get_atom_state(a: AnyAtom): js.UndefOr[AtomState[Any]]
  
  def dev_get_mounted(a: AnyAtom): js.UndefOr[Mounted]
  
  def dev_get_mounted_atoms(): IterableIterator[AnyAtom]
  
  def dev_restore_atoms(values: js.Iterable[js.Tuple2[AnyAtom, AnyValue]]): Unit
  
  def dev_subscribe_store(l: StoreListener): js.Function0[Unit]
  
  def get[Value](atom: Atom_[Value]): Value
  
  def set[Value_1, Args /* <: js.Array[Any] */, Result](
    atom: WritableAtom[Value_1, Args, Result],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): Result
  
  def sub(atom: AnyAtom, listener: js.Function0[Unit]): js.Function0[Unit]
}
object Devgetatomstate {
  
  inline def apply(
    dev_get_atom_state: AnyAtom => js.UndefOr[AtomState[Any]],
    dev_get_mounted: AnyAtom => js.UndefOr[Mounted],
    dev_get_mounted_atoms: () => IterableIterator[AnyAtom],
    dev_restore_atoms: js.Iterable[js.Tuple2[AnyAtom, AnyValue]] => Unit,
    dev_subscribe_store: StoreListener => js.Function0[Unit],
    get: Atom_[Any] => Any,
    set: (WritableAtom[Any, Any, Any], Any) => Any,
    sub: (AnyAtom, js.Function0[Unit]) => js.Function0[Unit]
  ): Devgetatomstate = {
    val __obj = js.Dynamic.literal(dev_get_atom_state = js.Any.fromFunction1(dev_get_atom_state), dev_get_mounted = js.Any.fromFunction1(dev_get_mounted), dev_get_mounted_atoms = js.Any.fromFunction0(dev_get_mounted_atoms), dev_restore_atoms = js.Any.fromFunction1(dev_restore_atoms), dev_subscribe_store = js.Any.fromFunction1(dev_subscribe_store), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), sub = js.Any.fromFunction2(sub))
    __obj.asInstanceOf[Devgetatomstate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Devgetatomstate] (val x: Self) extends AnyVal {
    
    inline def setDev_get_atom_state(value: AnyAtom => js.UndefOr[AtomState[Any]]): Self = StObject.set(x, "dev_get_atom_state", js.Any.fromFunction1(value))
    
    inline def setDev_get_mounted(value: AnyAtom => js.UndefOr[Mounted]): Self = StObject.set(x, "dev_get_mounted", js.Any.fromFunction1(value))
    
    inline def setDev_get_mounted_atoms(value: () => IterableIterator[AnyAtom]): Self = StObject.set(x, "dev_get_mounted_atoms", js.Any.fromFunction0(value))
    
    inline def setDev_restore_atoms(value: js.Iterable[js.Tuple2[AnyAtom, AnyValue]] => Unit): Self = StObject.set(x, "dev_restore_atoms", js.Any.fromFunction1(value))
    
    inline def setDev_subscribe_store(value: StoreListener => js.Function0[Unit]): Self = StObject.set(x, "dev_subscribe_store", js.Any.fromFunction1(value))
    
    inline def setGet(value: Atom_[Any] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (WritableAtom[Any, Any, Any], Any) => Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSub(value: (AnyAtom, js.Function0[Unit]) => js.Function0[Unit]): Self = StObject.set(x, "sub", js.Any.fromFunction2(value))
  }
}
