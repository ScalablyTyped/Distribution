package typings.jotai

import typings.jotai.vanillaAtomMod.Atom_
import typings.jotai.vanillaAtomMod.PrimitiveAtom
import typings.jotai.vanillaAtomMod.WritableAtom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaUtilsSplitAtomMod {
  
  @JSImport("jotai/vanilla/utils/splitAtom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def splitAtom[Item, Key](arrAtom: Atom_[js.Array[Item]]): Atom_[js.Array[Atom_[Item]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAtom")(arrAtom.asInstanceOf[js.Any]).asInstanceOf[Atom_[js.Array[Atom_[Item]]]]
  inline def splitAtom[Item, Key](arrAtom: Atom_[js.Array[Item]], keyExtractor: js.Function1[/* item */ Item, Key]): Atom_[js.Array[Atom_[Item]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitAtom")(arrAtom.asInstanceOf[js.Any], keyExtractor.asInstanceOf[js.Any])).asInstanceOf[Atom_[js.Array[Atom_[Item]]]]
  inline def splitAtom[Item, Key](arrAtom: WritableAtom[js.Array[Item], js.Array[js.Array[Item]], Unit]): WritableAtom[js.Array[PrimitiveAtom[Item]], js.Array[SplitAtomAction[Item]], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAtom")(arrAtom.asInstanceOf[js.Any]).asInstanceOf[WritableAtom[js.Array[PrimitiveAtom[Item]], js.Array[SplitAtomAction[Item]], Unit]]
  inline def splitAtom[Item, Key](
    arrAtom: WritableAtom[js.Array[Item], js.Array[js.Array[Item]], Unit],
    keyExtractor: js.Function1[/* item */ Item, Key]
  ): WritableAtom[js.Array[PrimitiveAtom[Item]], js.Array[SplitAtomAction[Item]], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitAtom")(arrAtom.asInstanceOf[js.Any], keyExtractor.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[js.Array[PrimitiveAtom[Item]], js.Array[SplitAtomAction[Item]], Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jotai.anon.Atom[Item]
    - typings.jotai.anon.Before[Item]
    - typings.jotai.anon.Type[Item]
  */
  trait SplitAtomAction[Item] extends StObject
  object SplitAtomAction {
    
    inline def Atom[Item](atom: PrimitiveAtom[Item]): typings.jotai.anon.Atom[Item] = {
      val __obj = js.Dynamic.literal(atom = atom.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("remove")
      __obj.asInstanceOf[typings.jotai.anon.Atom[Item]]
    }
    
    inline def Before[Item](value: Item): typings.jotai.anon.Before[Item] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("insert")
      __obj.asInstanceOf[typings.jotai.anon.Before[Item]]
    }
    
    inline def Type[Item](atom: PrimitiveAtom[Item]): typings.jotai.anon.Type[Item] = {
      val __obj = js.Dynamic.literal(atom = atom.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("move")
      __obj.asInstanceOf[typings.jotai.anon.Type[Item]]
    }
  }
}
