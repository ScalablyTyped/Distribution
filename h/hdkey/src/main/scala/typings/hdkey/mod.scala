package typings.hdkey

import typings.hdkey.anon.Private
import typings.hdkey.anon.Xpriv
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hdkey", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with HDNode {
    
    /* CompleteClass */
    var chainCode: Buffer = js.native
    
    /* CompleteClass */
    override def derive(path: String): HDNode = js.native
    
    /* CompleteClass */
    var privateExtendedKey: String = js.native
    
    /* CompleteClass */
    var privateKey: Buffer = js.native
    
    /* CompleteClass */
    var publicExtendedKey: String = js.native
    
    /* CompleteClass */
    var publicKey: Buffer = js.native
    
    /* CompleteClass */
    override def sign(hash: Buffer): Buffer = js.native
    
    /* CompleteClass */
    override def toJSON(): Xpriv = js.native
    
    /* CompleteClass */
    override def verify(hash: Buffer, signature: Buffer): Boolean = js.native
    
    /* CompleteClass */
    override def wipePrivateData(): HDNode = js.native
  }
  @JSImport("hdkey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromExtendedKey(xpriv: String): HDNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(xpriv.asInstanceOf[js.Any]).asInstanceOf[HDNode]
  
  /* static member */
  inline def fromJSON(obj: Xpriv): HDNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(obj.asInstanceOf[js.Any]).asInstanceOf[HDNode]
  
  /* static member */
  inline def fromMasterSeed(seed: Buffer): HDNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[HDNode]
  inline def fromMasterSeed(seed: Buffer, versions: Private): HDNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seed.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[HDNode]
  
  trait HDNode extends StObject {
    
    var chainCode: Buffer
    
    def derive(path: String): HDNode
    
    var privateExtendedKey: String
    
    var privateKey: Buffer
    
    var publicExtendedKey: String
    
    var publicKey: Buffer
    
    def sign(hash: Buffer): Buffer
    
    def toJSON(): Xpriv
    
    def verify(hash: Buffer, signature: Buffer): Boolean
    
    def wipePrivateData(): HDNode
  }
  object HDNode {
    
    inline def apply(
      chainCode: Buffer,
      derive: String => HDNode,
      privateExtendedKey: String,
      privateKey: Buffer,
      publicExtendedKey: String,
      publicKey: Buffer,
      sign: Buffer => Buffer,
      toJSON: () => Xpriv,
      verify: (Buffer, Buffer) => Boolean,
      wipePrivateData: () => HDNode
    ): HDNode = {
      val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], derive = js.Any.fromFunction1(derive), privateExtendedKey = privateExtendedKey.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicExtendedKey = publicExtendedKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign), toJSON = js.Any.fromFunction0(toJSON), verify = js.Any.fromFunction2(verify), wipePrivateData = js.Any.fromFunction0(wipePrivateData))
      __obj.asInstanceOf[HDNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HDNode] (val x: Self) extends AnyVal {
      
      inline def setChainCode(value: Buffer): Self = StObject.set(x, "chainCode", value.asInstanceOf[js.Any])
      
      inline def setDerive(value: String => HDNode): Self = StObject.set(x, "derive", js.Any.fromFunction1(value))
      
      inline def setPrivateExtendedKey(value: String): Self = StObject.set(x, "privateExtendedKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKey(value: Buffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicExtendedKey(value: String): Self = StObject.set(x, "publicExtendedKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: Buffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSign(value: Buffer => Buffer): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: () => Xpriv): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setVerify(value: (Buffer, Buffer) => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
      
      inline def setWipePrivateData(value: () => HDNode): Self = StObject.set(x, "wipePrivateData", js.Any.fromFunction0(value))
    }
  }
}
