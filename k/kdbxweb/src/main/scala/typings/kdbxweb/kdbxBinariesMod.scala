package typings.kdbxweb

import typings.kdbxweb.protectedValueMod.ProtectedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kdbxBinariesMod {
  
  @JSImport("kdbxweb/dist/types/format/kdbx-binaries", "KdbxBinaries")
  @js.native
  open class KdbxBinaries () extends StObject {
    
    /* private */ val _idToHash: Any = js.native
    
    /* private */ val _mapByHash: Any = js.native
    
    /* private */ val _mapById: Any = js.native
    
    def add(value: KdbxBinaryIn): js.Promise[KdbxBinaryWithHash] = js.native
    
    def addWithHash(binary: KdbxBinaryWithHash): Unit = js.native
    
    def addWithId(id: String, value: KdbxBinaryIn): Unit = js.native
    
    def addWithNextId(value: KdbxBinaryIn): Unit = js.native
    
    def computeHashes(): js.Promise[Unit] = js.native
    
    def deleteWithHash(hash: String): Unit = js.native
    
    def getAll(): js.Array[KdbxBinaryRefWithValue] = js.native
    
    def getAllWithHashes(): js.Array[KdbxBinaryWithHash] = js.native
    
    def getByRef(binaryRef: KdbxBinaryRef): js.UndefOr[KdbxBinaryWithHash] = js.native
    
    def getRefByHash(hash: String): js.UndefOr[KdbxBinaryRef] = js.native
    
    def getValueByHash(hash: String): js.UndefOr[KdbxBinary] = js.native
  }
  /* static members */
  object KdbxBinaries {
    
    @JSImport("kdbxweb/dist/types/format/kdbx-binaries", "KdbxBinaries")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kdbxweb/dist/types/format/kdbx-binaries", "KdbxBinaries.getBinaryHash")
    @js.native
    def getBinaryHash: Any = js.native
    inline def getBinaryHash_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getBinaryHash")(x.asInstanceOf[js.Any])
    
    inline def isKdbxBinaryRef(): /* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryRef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKdbxBinaryRef")().asInstanceOf[/* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryRef */ Boolean]
    inline def isKdbxBinaryRef(binary: KdbxBinaryOrRef): /* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryRef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKdbxBinaryRef")(binary.asInstanceOf[js.Any]).asInstanceOf[/* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryRef */ Boolean]
    
    inline def isKdbxBinaryWithHash(): /* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryWithHash */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKdbxBinaryWithHash")().asInstanceOf[/* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryWithHash */ Boolean]
    inline def isKdbxBinaryWithHash(binary: KdbxBinaryOrRef): /* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryWithHash */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKdbxBinaryWithHash")(binary.asInstanceOf[js.Any]).asInstanceOf[/* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryWithHash */ Boolean]
    inline def isKdbxBinaryWithHash(binary: KdbxBinaryWithHash): /* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryWithHash */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKdbxBinaryWithHash")(binary.asInstanceOf[js.Any]).asInstanceOf[/* is kdbxweb.kdbxweb/dist/types/format/kdbx-binaries.KdbxBinaryWithHash */ Boolean]
  }
  
  type KdbxBinary = ProtectedValue | js.typedarray.ArrayBuffer
  
  type KdbxBinaryIn = KdbxBinary | js.typedarray.Uint8Array
  
  type KdbxBinaryOrRef = KdbxBinary | KdbxBinaryRef
  
  trait KdbxBinaryRef extends StObject {
    
    var ref: String
  }
  object KdbxBinaryRef {
    
    inline def apply(ref: String): KdbxBinaryRef = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[KdbxBinaryRef]
    }
    
    extension [Self <: KdbxBinaryRef](x: Self) {
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait KdbxBinaryRefWithValue extends StObject {
    
    var ref: String
    
    var value: KdbxBinary
  }
  object KdbxBinaryRefWithValue {
    
    inline def apply(ref: String, value: KdbxBinary): KdbxBinaryRefWithValue = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KdbxBinaryRefWithValue]
    }
    
    extension [Self <: KdbxBinaryRefWithValue](x: Self) {
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setValue(value: KdbxBinary): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait KdbxBinaryWithHash extends StObject {
    
    var hash: String
    
    var value: KdbxBinary
  }
  object KdbxBinaryWithHash {
    
    inline def apply(hash: String, value: KdbxBinary): KdbxBinaryWithHash = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KdbxBinaryWithHash]
    }
    
    extension [Self <: KdbxBinaryWithHash](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setValue(value: KdbxBinary): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
