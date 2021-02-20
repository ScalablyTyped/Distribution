package typings.jsmediatags

import typings.jsmediatags.typesMod.ByteArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mp4tagcontentsMod {
  
  @JSImport("jsmediatags/build2/MP4TagContents", JSImport.Default)
  @js.native
  class default protected () extends MP4TagContents {
    def this(ftyp: String) = this()
    def this(ftyp: String, atoms: js.Array[Atom]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/MP4TagContents", "default.createAtom")
    @js.native
    def createAtom(atomName: String): Atom = js.native
    
    @JSImport("jsmediatags/build2/MP4TagContents", "default.createContainerAtom")
    @js.native
    def createContainerAtom(atomName: String, atoms: js.Array[Atom]): Atom = js.native
    @JSImport("jsmediatags/build2/MP4TagContents", "default.createContainerAtom")
    @js.native
    def createContainerAtom(atomName: String, atoms: js.Array[Atom], data: ByteArray): Atom = js.native
    
    @JSImport("jsmediatags/build2/MP4TagContents", "default.createMetadataAtom")
    @js.native
    def createMetadataAtom(atomName: String, `type`: String, data: ByteArray): Atom = js.native
  }
  
  @JSImport("jsmediatags/build2/MP4TagContents", "Atom")
  @js.native
  class Atom protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, data: ByteArray) = this()
    def this(name: String, data: js.UndefOr[scala.Nothing], atoms: js.Array[Atom]) = this()
    def this(name: String, data: ByteArray, atoms: js.Array[Atom]) = this()
    
    var _atoms: js.Array[Atom] = js.native
    
    var _data: js.Array[Double] = js.native
    
    var _name: String = js.native
    
    def toArray(): ByteArray = js.native
  }
  
  @js.native
  trait MP4TagContents extends StObject {
    
    var _atoms: js.Array[Atom] = js.native
    
    def toArray(): ByteArray = js.native
  }
  object MP4TagContents {
    
    @scala.inline
    def apply(_atoms: js.Array[Atom], toArray: () => ByteArray): MP4TagContents = {
      val __obj = js.Dynamic.literal(_atoms = _atoms.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[MP4TagContents]
    }
    
    @scala.inline
    implicit class MP4TagContentsMutableBuilder[Self <: MP4TagContents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToArray(value: () => ByteArray): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_atoms(value: js.Array[Atom]): Self = StObject.set(x, "_atoms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_atomsVarargs(value: Atom*): Self = StObject.set(x, "_atoms", js.Array(value :_*))
    }
  }
}
