package typings.jotai.anon

import typings.jotai.vanillaAtomMod.Atom_
import typings.jotai.vanillaAtomMod.WritableAtom
import typings.jotai.vanillaStoreMod.AnyAtom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Devgetmounted extends StObject {
  
  var dev_get_atom_state: js.UndefOr[scala.Nothing] = js.undefined
  
  var dev_get_mounted: js.UndefOr[scala.Nothing] = js.undefined
  
  var dev_get_mounted_atoms: js.UndefOr[scala.Nothing] = js.undefined
  
  var dev_restore_atoms: js.UndefOr[scala.Nothing] = js.undefined
  
  var dev_subscribe_store: js.UndefOr[scala.Nothing] = js.undefined
  
  def get[Value](atom: Atom_[Value]): Value
  
  def set[Value_1, Args /* <: js.Array[Any] */, Result](
    atom: WritableAtom[Value_1, Args, Result],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): Result
  
  def sub(atom: AnyAtom, listener: js.Function0[Unit]): js.Function0[Unit]
}
object Devgetmounted {
  
  inline def apply(
    get: Atom_[Any] => Any,
    set: (WritableAtom[Any, Any, Any], Any) => Any,
    sub: (AnyAtom, js.Function0[Unit]) => js.Function0[Unit]
  ): Devgetmounted = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), sub = js.Any.fromFunction2(sub))
    __obj.asInstanceOf[Devgetmounted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Devgetmounted] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Atom_[Any] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (WritableAtom[Any, Any, Any], Any) => Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSub(value: (AnyAtom, js.Function0[Unit]) => js.Function0[Unit]): Self = StObject.set(x, "sub", js.Any.fromFunction2(value))
  }
}
