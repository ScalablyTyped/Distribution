package typings.jotai.anon

import typings.jotai.jotaiStrings.move
import typings.jotai.vanillaAtomMod.PrimitiveAtom
import typings.jotai.vanillaUtilsSplitAtomMod.SplitAtomAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[Item]
  extends StObject
     with SplitAtomAction[Item] {
  
  var atom: PrimitiveAtom[Item]
  
  var before: js.UndefOr[PrimitiveAtom[Item]] = js.undefined
  
  var `type`: move
}
object Type {
  
  inline def apply[Item](atom: PrimitiveAtom[Item]): Type[Item] = {
    val __obj = js.Dynamic.literal(atom = atom.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("move")
    __obj.asInstanceOf[Type[Item]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type[?], Item] (val x: Self & Type[Item]) extends AnyVal {
    
    inline def setAtom(value: PrimitiveAtom[Item]): Self = StObject.set(x, "atom", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: PrimitiveAtom[Item]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setType(value: move): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
