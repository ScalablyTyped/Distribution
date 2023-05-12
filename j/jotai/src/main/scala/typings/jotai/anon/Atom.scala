package typings.jotai.anon

import typings.jotai.jotaiStrings.remove
import typings.jotai.vanillaAtomMod.PrimitiveAtom
import typings.jotai.vanillaUtilsSplitAtomMod.SplitAtomAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Atom[Item]
  extends StObject
     with SplitAtomAction[Item] {
  
  var atom: PrimitiveAtom[Item]
  
  var `type`: remove
}
object Atom {
  
  inline def apply[Item](atom: PrimitiveAtom[Item]): Atom[Item] = {
    val __obj = js.Dynamic.literal(atom = atom.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("remove")
    __obj.asInstanceOf[Atom[Item]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Atom[?], Item] (val x: Self & Atom[Item]) extends AnyVal {
    
    inline def setAtom(value: PrimitiveAtom[Item]): Self = StObject.set(x, "atom", value.asInstanceOf[js.Any])
    
    inline def setType(value: remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
