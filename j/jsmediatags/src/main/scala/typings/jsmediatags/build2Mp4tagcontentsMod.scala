package typings.jsmediatags

import typings.jsmediatags.typesMod.ByteArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object build2Mp4tagcontentsMod {
  
  @JSImport("jsmediatags/build2/MP4TagContents", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MP4TagContents {
    def this(ftyp: String) = this()
    def this(ftyp: String, atoms: js.Array[Atom]) = this()
    
    /* CompleteClass */
    var _atoms: js.Array[Atom] = js.native
    
    /* CompleteClass */
    override def toArray(): ByteArray = js.native
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/MP4TagContents", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createAtom(atomName: String): Atom = ^.asInstanceOf[js.Dynamic].applyDynamic("createAtom")(atomName.asInstanceOf[js.Any]).asInstanceOf[Atom]
    
    inline def createContainerAtom(atomName: String, atoms: js.Array[Atom]): Atom = (^.asInstanceOf[js.Dynamic].applyDynamic("createContainerAtom")(atomName.asInstanceOf[js.Any], atoms.asInstanceOf[js.Any])).asInstanceOf[Atom]
    inline def createContainerAtom(atomName: String, atoms: js.Array[Atom], data: ByteArray): Atom = (^.asInstanceOf[js.Dynamic].applyDynamic("createContainerAtom")(atomName.asInstanceOf[js.Any], atoms.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Atom]
    
    inline def createMetadataAtom(atomName: String, `type`: String, data: ByteArray): Atom = (^.asInstanceOf[js.Dynamic].applyDynamic("createMetadataAtom")(atomName.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Atom]
  }
  
  @JSImport("jsmediatags/build2/MP4TagContents", "Atom")
  @js.native
  open class Atom protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, data: ByteArray) = this()
    def this(name: String, data: Unit, atoms: js.Array[Atom]) = this()
    def this(name: String, data: ByteArray, atoms: js.Array[Atom]) = this()
    
    var _atoms: js.Array[Atom] = js.native
    
    var _data: js.Array[Double] = js.native
    
    var _name: String = js.native
    
    def toArray(): ByteArray = js.native
  }
  
  trait MP4TagContents extends StObject {
    
    var _atoms: js.Array[Atom]
    
    def toArray(): ByteArray
  }
  object MP4TagContents {
    
    inline def apply(_atoms: js.Array[Atom], toArray: () => ByteArray): MP4TagContents = {
      val __obj = js.Dynamic.literal(_atoms = _atoms.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[MP4TagContents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MP4TagContents] (val x: Self) extends AnyVal {
      
      inline def setToArray(value: () => ByteArray): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      inline def set_atoms(value: js.Array[Atom]): Self = StObject.set(x, "_atoms", value.asInstanceOf[js.Any])
      
      inline def set_atomsVarargs(value: Atom*): Self = StObject.set(x, "_atoms", js.Array(value*))
    }
  }
}
