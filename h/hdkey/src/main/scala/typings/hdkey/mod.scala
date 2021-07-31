package typings.hdkey

import typings.hdkey.anon.Xpriv
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hdkey", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with HDNode {
    
    /* CompleteClass */
    var chainCode: Buffer = js.native
    
    /* CompleteClass */
    override def derive(path: String): HDNode = js.native
    
    /* CompleteClass */
    var privateKey: Buffer = js.native
    
    /* CompleteClass */
    var publicKey: Buffer = js.native
    
    /* CompleteClass */
    override def toJSON(): Xpriv = js.native
  }
  @JSImport("hdkey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def fromJSON(obj: Xpriv): HDNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(obj.asInstanceOf[js.Any]).asInstanceOf[HDNode]
  
  /* static member */
  @scala.inline
  def fromMasterSeed(seed: Buffer): HDNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[HDNode]
  
  trait HDNode extends StObject {
    
    var chainCode: Buffer
    
    def derive(path: String): HDNode
    
    var privateKey: Buffer
    
    var publicKey: Buffer
    
    def toJSON(): Xpriv
  }
  object HDNode {
    
    @scala.inline
    def apply(
      chainCode: Buffer,
      derive: String => HDNode,
      privateKey: Buffer,
      publicKey: Buffer,
      toJSON: () => Xpriv
    ): HDNode = {
      val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], derive = js.Any.fromFunction1(derive), privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[HDNode]
    }
    
    @scala.inline
    implicit class HDNodeMutableBuilder[Self <: HDNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChainCode(value: Buffer): Self = StObject.set(x, "chainCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDerive(value: String => HDNode): Self = StObject.set(x, "derive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrivateKey(value: Buffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: Buffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => Xpriv): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
